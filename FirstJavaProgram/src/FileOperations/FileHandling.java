import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException { //or by using try-catch
        // /home/aakash/Java/FirstJavaProgram
        //File f = new File("src/demo.txt");
        /*
        if(f.createNewFile()){
            System.out.println("File created succesfully!");
        }
        else{
            System.out.println("File already exists!");
        }

         */
        /* // To get file information
        if(f.exists()){
            System.out.println("File name : "+f.getName());
            System.out.println("File location : "+f.getAbsolutePath());
            System.out.println("File writable : "+f.canWrite());
            System.out.println("File readable : "+f.canRead());
            System.out.println("File size : "+f.length());
            //System.out.println("File removed : "+f.delete());
        }
        else{
            System.out.println("File doesn't exist");
        }

         */
        //File Reading
        /*
        FileReader f = new FileReader("src/demo.txt");
        try{
            int i;
            while((i=f.read())!=-1){
                System.out.print((char)i);
            }
        }
        finally {
            f.close();
        }

         */
        //File Renaming
        /*
        File f = new File("src/demo.txt");
        File r = new File("src/demorenamed.txt");
        if(f.exists()){
            System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("File doesn't exist");
        }

         */
        //Copy content from one file to another
        FileInputStream r = new FileInputStream("src/demorenamed.txt");
        FileOutputStream w = new FileOutputStream("src/copied.txt");
        int i;
        try{
            while((i=r.read())!=-1){
                w.write((char)i);
            }
            System.out.println("File copied successfully");
        }
        finally {
            w.close();
        }



    }
}
