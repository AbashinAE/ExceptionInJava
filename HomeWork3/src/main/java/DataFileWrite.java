import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataFileWrite implements IFileWrite {
    @Override
    public void write(String fileName, String info) {
        try {
            FileWriter fileWriter = new FileWriter(new File(fileName), true);
            fileWriter.write(info);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
