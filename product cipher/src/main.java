import java.util.ArrayList;

public class main {
    public static void main(String args[]){
        filereader a=new filereader();
        ArrayList<String> tobeenc=a.readfile("C:\\Users\\ruchira\\Desktop\\New folder (5)\\text1.txt");
        ArrayList<String> encrypted=new ArrayList<String>();
        encrypt e1=new encrypt("sdvdfv");
        for(String line:tobeenc){
            String enced=e1.Substitute(line);
            encrypted.add(enced);

        }
        String enstring="";
        for(String eline:encrypted){
            enstring=enstring+eline;
        }
        filewriter b=new filewriter();
        b.writefile("C:\\Users\\ruchira\\Desktop\\New folder (5)\\text2.txt",enstring);

    }
}
