package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public String export() throws ParserConfigurationException, IOException {
        BookMetadataFormatter formatter = createBookExport();
        for(Book pushtoObj : books){
            formatter.append(pushtoObj);
        }
        return formatter.getMetadataString();
    }

    public abstract BookMetadataFormatter createBookExport() throws ParserConfigurationException, IOException;

}