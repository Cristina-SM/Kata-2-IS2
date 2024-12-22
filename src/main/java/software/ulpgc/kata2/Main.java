package software.ulpgc.kata2;

import java.io.File;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TsvTitleDeserializer deserializer = new TsvTitleDeserializer();
        TsvTitleReader file = new TsvTitleReader(new File("C:\\Users\\Cristina\\IdeaProjects\\Kata2\\title.basics.tsv"), deserializer);
        List<Title> titles = file.read();
        HashMap<String, String> map = new HashMap<>();
        for (Title title: titles){
            map.put(title.getOriginalTitle(), title.getGenres());
        }

        for(String key: map.keySet()){
            System.out.println(key +"\t"+ map.get(key));
        }
    }
}
