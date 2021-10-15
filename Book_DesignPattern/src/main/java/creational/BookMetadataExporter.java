package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public abstract class BookMetadataExporter extends BookCollection {

    public void export() throws ParserConfigurationException, IOException {
        BookMetadataFormatter formatter = createBookExport();
        for(Book pushtoObj : books){
            formatter.append(pushtoObj);
        }
        System.out.println(formatter.getMetadataString());
    }

    public abstract BookMetadataFormatter createBookExport() throws ParserConfigurationException, IOException;

}