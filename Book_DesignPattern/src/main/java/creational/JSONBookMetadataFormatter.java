package creational;

import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    JSONObject jObj;
    JSONArray blistObj;

    public JSONBookMetadataFormatter() throws IOException {
        reset();
    }

    public BookMetadataFormatter reset() {
        jObj = new JSONObject();
        blistObj = new JSONArray();
        jObj.put("Books", blistObj); //add 'Book' Text to header of Json array object
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {

        JSONArray jAuthorsList = new JSONArray();
        for(String author : b.getAuthors()){ //push many data from author to array
            jAuthorsList.add(author);
        }

        JSONObject jObj = new JSONObject();
        //add data to json object
        jObj.put("ISBN", b.getISBN());
        jObj.put("Title", b.getTitle());
        jObj.put("Publisher", b.getPublisher());
        jObj.put("Authors", jAuthorsList);

        blistObj.add(jObj);
        return this;

    }

    @Override
    public String getMetadataString() {

        return jObj.toString();
    }
}