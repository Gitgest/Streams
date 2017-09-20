import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String args[]) throws FileNotFoundException, IOException {

        PrintWriter pw = new PrintWriter(new FileWriter("Example.txt"),true);

        for (i = 0;<100, i++) {
            pw.println(String.format("Detter er en fil(linie %d)",i+1));
        }
        pw.close();
    }
}
