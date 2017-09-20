import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        // Åbn fil og hent al tekst fra filen ind i vores BufferedReader
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Rasmus laptop\\Documents\\IntelliJ\\Streams\\src\\Tekst Eksempel.txt"));

        //Hent første linie
        String line = in.readLine();

        //Så længe linie ikke er null, forstæt
        while(line != null)
        {
        //Udskriv linie
            System.out.println(line);
            // Hent næste linie
            line = in.readLine();
        }

        if(in != null) {
            in.close();
        }
    }
}
