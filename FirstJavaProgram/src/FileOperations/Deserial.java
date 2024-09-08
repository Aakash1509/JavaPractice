package FileOperations;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserial {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("ob.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        SerializationPractice student = (SerializationPractice) ois.readObject();
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getEmail());
        System.out.println(student.getAddress());
    }
}
