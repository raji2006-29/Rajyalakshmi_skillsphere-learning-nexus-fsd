import java.io.*;

public class WriteFile {

    public static void main(String[] args){

        try{

            FileWriter fw=new FileWriter("sample.txt");

            fw.write("Hello Java");

            fw.close();

            System.out.println("Written Successfully");

        }

        catch(IOException e){

            System.out.println(e);

        }

    }

}
