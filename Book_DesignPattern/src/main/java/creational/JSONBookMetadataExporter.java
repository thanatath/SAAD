package creational;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class JSONBookMetadataExporter extends BookMetadataExporter {


    @Override
    public BookMetadataFormatter createBookExport() throws ParserConfigurationException, IOException {
        return new JSONBookMetadataFormatter();
    }
}
