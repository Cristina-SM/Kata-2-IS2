package software.ulpgc;

public class TsvTitleDeserializer implements TitleDeserializer{
    @Override
    public Title deserializer(String line) {
        return deserializer(line.split("\t"));
    }

    private Title deserializer(String[] split){
        return new Title(
                toRefactor(split[0]),
                toRefactor(split[1]),
                toRefactor(split[2]),
                toRefactor(split[3]),
                toBoolean(split[4]),
                toInteger(split[5]),
                toInteger(split[6]),
                toInteger(split[7]),
                toRefactor(split[8])
        );
    }

    private boolean toBoolean(String line) {
        return Boolean.parseBoolean(line);
    }

    private int toInteger(String line) {
        if(line.equals("\\N")) return 0;
        return Integer.parseInt(line);
    }

    private String toRefactor(String line) {
        if(line.equals("\\N")) return "";
        return line;
    }
}
