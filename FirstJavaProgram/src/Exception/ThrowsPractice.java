import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
class ReadAndWrite{
    void readFile() throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("abc.txt");
    }
    void saveFile() throws FileNotFoundException
    {
        String text = "This is demo";
        FileOutputStream fos = new FileOutputStream("xyz.txt");
    }
}
public class ThrowsPractice {
    public static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();
        try{
            rw.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            rw.saveFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
