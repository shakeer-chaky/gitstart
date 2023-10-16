package pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling
{

    public static void main(String[] args) {
        try {

            File file = new File("C:\\Users\\Rasheed\\Documents\\Downloads\\TestFilee.txt");
            Scanner scan = new Scanner(file);
            System.out.println(file.getParent());
            System.out.println("Inside try block");
        }

        catch (FileNotFoundException ex){
            System.out.println("Inside FileNotFoundException block:\n"+ex.getMessage() );
        }
        catch (Exception ex){
            System.out.println("Inside Exception block:\n"+ex.getMessage() );
        }
        finally {
            System.out.println("Inside finally");
        }
    }
}
