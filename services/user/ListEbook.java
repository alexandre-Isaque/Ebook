package services.user;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ListEbook {
    private List<ebook> saveEbook = new ArrayList<>();

    void add(ebook Ebook){
        try{

            File fileEbook = new File("./" + Ebook.name + ".json");
            boolean isCreate = fileEbook.createNewFile();

            if(isCreate) {
                saveEbook.add(Ebook);
                System.out.println("Arquivo criado com sucesso.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
