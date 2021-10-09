package creational;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.stream.Stream;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private StringWriter writer;
    private CSVPrinter csvPrinter;
    private JSONObject jsonPrinter;

    public JSONBookMetadataFormatter() throws IOException {
        reset();
    }

    public BookMetadataFormatter reset() {
        writer = new StringWriter();

            //csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            Stream<String> headers = Arrays.stream(Book.Metadata.values()).map(Book.Metadata::getValue);
            //csvPrinter.printRecord(headers.toList());

        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        String authors = String.join("|", b.getAuthors());

            //csvPrinter.printRecord(b.getISBN(), b.getTitle(), b.getPublisher(), authors);
            JSONObject obj = new JSONObject();
            obj.put("ISBN", b.getISBN());
            obj.put("Title", b.getTitle());
            obj.put("Publisher", b.getPublisher());
            obj.put("authors", authors);
            System.out.println(obj.toJSONString());

        return this;
    }

    @Override
    public String getMetadataString() {
        return writer.toString();
    }
}