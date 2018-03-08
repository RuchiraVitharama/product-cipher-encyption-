import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class filewriter {
    public void writefile(String FILENAME,String content){
        try {
            FileWriter fw = new FileWriter(FILENAME);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        }
        catch (Exception e){e.printStackTrace();}

    }

}
