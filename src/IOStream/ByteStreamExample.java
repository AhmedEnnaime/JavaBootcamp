package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream inStream = null;
        FileOutputStream outStream = null;

        try {
            // Location to read the file from
            inStream = new FileInputStream("");
            // Location to write to a file
            outStream = new FileOutputStream("");

            // reads byte by byte, if it reaches the end of the file it returns -1
            int content;

            while ((content = inStream.read()) != -1){
                outStream.write((byte) content);
            }

        }finally {
            if(inStream != null){
                inStream.close();
            }

            if(outStream != null){
                outStream.close();
            }
        }
    }
}
