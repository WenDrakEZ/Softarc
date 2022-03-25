package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {


    public JSONBookMetadataFormatter(){
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        JSON = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject object = new JSONObject();
        object.put("ISBN",b.getISBN());
        object.put("Title",b.getTitle());
        object.put("Publisher",b.getPublisher());
        String[] author = b.getAuthors();
        String AllAuthor = "";
        for (int i = 0;i<author.length;i++){
            if (i != (author.length-1)){
                AllAuthor+=author[i] + " | ";
            }else{
                AllAuthor+=author[i];
            }
        }
        object.put("Author",AllAuthor);
        JSON.add(obj);
        return this;
    }

      @Override
    public String getMetadataString() {
        return JSON.toString();
    }

    public JSONArray getJsonArray(){
        return JSON;
    }
}
