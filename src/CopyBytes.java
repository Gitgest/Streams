import java.io.*;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        // in and out objects
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            //Recieve information from xanadu.txt
            //Recieve information from outagain.txt
            in = new FileInputStream("xanadu.txt");
            //Adding true avoid deleting the old outagain.txt and instead adds the information to the .txt file
            out = new FileOutputStream("outagain.txt",true);
            int c;

            //While whatever is containted in the inputStream is not -1
            //Write out c, aka the content of FileInputStream "xanadu.txt"
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }


}
