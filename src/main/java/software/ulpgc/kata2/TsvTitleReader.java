package software.ulpgc.kata2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TsvTitleReader implements TitleReader{
    private final File file;
    private final TsvTitleDeserializer deserializer;

    public TsvTitleReader(File file, TsvTitleDeserializer deserializer) {
        this.file = file;
        this.deserializer = deserializer;
    }

    @Override
    public List<Title> read() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            reader.readLine();
            return readWith(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Title> readWith(BufferedReader reader) throws IOException {
        List<Title> results = new ArrayList<>();
        while (true){
            String line = reader.readLine();
            if (line == null) break;
            results.add(deserializer.deserializer(line));
        }
        return results;
    }
}
