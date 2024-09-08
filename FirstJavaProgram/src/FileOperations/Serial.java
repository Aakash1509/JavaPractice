package FileOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) throws Exception {
        SerializationPractice student = new SerializationPractice("Aakash Saraiya",20,"sky@gmail.com","Vadodara");

        //write object to file
        FileOutputStream fos = new FileOutputStream("ob.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //serialize

        oos.writeObject(student);
        oos.close();
        fos.close();
        System.out.println("Object transferred to file ob");
    }
}
