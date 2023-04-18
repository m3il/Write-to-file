import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOpener{
    public static void main(String[] args) throws IOException{

        File nameFile = new File("MyName.txt");
        PrintWriter outputFile = new PrintWriter(nameFile);
        Scanner in = new Scanner(System.in);
        
        System.out.println("What is your first name? ");
        String name = in.nextLine();

        outputFile.write(name);
        outputFile.close();
    }
}