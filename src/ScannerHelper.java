import java.util.Scanner;

public class ScannerHelper {


    /**
     * Second this class
     *
     * Create Three methods which will take String question
     * it will print the question, and it will take
     * String, int, double
     *
     * getString(String question)
     * getInt(String question)
     * getDouble(String question)
     */

    public static String getString(String question){
        System.out.println(question);
        return scan().nextLine();
    }

    public static Scanner scan(){
        return new Scanner(System.in);
    }
}
