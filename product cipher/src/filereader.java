import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class filereader {
    public ArrayList<String> readfile(String FILENAME){
        ArrayList<String> enc=new ArrayList<String>();
        try {
           FileReader fr = new FileReader(FILENAME);
           BufferedReader br = new BufferedReader(fr);


           String sCurrentLine;

           while ((sCurrentLine = br.readLine()) != null) {
               System.out.println(sCurrentLine);
               enc.add(sCurrentLine);
           }
       }
       catch(Exception e){e.printStackTrace();}
        return enc;

    }
}
