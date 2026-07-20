import java.io.*;
public class CreateFile {
    public static void main(String[] args){
        try{
            File file=new File("sample1.txt");
            if(file.createNewFile())
               System.out.println("File Created");
            else
                System.out.println("Already Exists");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
