import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        //Åbn fil og hent al tekst fra filen in i vores Scanner
        Scanner in = new Scanner(new FileReader("C:\\Users\\Rasmus laptop\\Documents\\IntelliJ\\Streams\\src\\Tekst Eksempel.txt"));

        //Så længe der er linier, fortsæt
        while (in.hasNext()) {
            //Udskriv linien
            System.out.println(in.nextLine());
        }

        in.close();
    }
}
