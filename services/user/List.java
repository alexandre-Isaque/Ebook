package services.user;
import java.io.FileWriter;
import java.io.IOException;

public class List {
    private static final String path = "../../user.json";

    // add Ebook
    public void add(ebook user){

        try{
            // add in user.json
            FileWriter writer = new FileWriter(path);
            String userJson = "test";

            // write in file
            writer.write(userJson);

            // close write
            writer.close();

        } catch (IOException error){
            error.getMessage();
        }
    }

    // remove Ebook
    public void remove(ebook user){

    }
}
