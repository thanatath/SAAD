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
    JSONObject jObj;
    JSONArray jList;


    public JSONBookMetadataFormatter() throws IOException {
        reset();
    }

    public BookMetadataFormatter reset() {
        writer = new StringWriter();
        jObj = new JSONObject();
        jList = new JSONArray();
            //csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            //Stream<String> headers = Arrays.stream(Book.Metadata.values()).map(Book.Metadata::getValue);
            //csvPrinter.printRecord(headers.toList());

        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        String authors = String.join("|", b.getAuthors());
        JSONArray jAuthorsList = new JSONArray();
        for(String author : b.getAuthors()){ //push many data from author to array
            jAuthorsList.add(author);
        }
            //csvPrinter.printRecord(b.getISBN(), b.getTitle(), b.getPublisher(), authors);

        jObj.put("ISBN", b.getISBN());
        jObj.put("Title", b.getTitle());
        jObj.put("Publisher", b.getPublisher());
        jObj.put("Authors", jAuthorsList);
            System.out.println(jObj.toJSONString());
        jList.add(jObj);

        return this;
    }

    @Override
    public String getMetadataString() {
        return writer.toString();
    }
}