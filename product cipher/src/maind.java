import java.util.ArrayList;


    import java.util.ArrayList;

    public class maind {
        public static void main(String args[]){
            filereader a=new filereader();
            ArrayList<String> tobedec=a.readfile("C:\\Users\\ruchira\\Desktop\\New folder (5)\\text2.txt");
            ArrayList<String> decrypted=new ArrayList<String>();
            encrypt e1=new encrypt("sdvdfv");
            for(String line:tobedec){
                String deced=e1.Substitute(line);
                decrypted.add(deced);

            }
            String destring="";
            for(String dline:decrypted){
                destring=destring+dline;
            }
            filewriter b=new filewriter();
            b.writefile("C:\\Users\\ruchira\\Desktop\\New folder (5)\\text3.txt",destring);

        }
    }


