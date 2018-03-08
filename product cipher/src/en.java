import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class en {
    public JPanel epane;
    private JTextField textField1;
    private JTextField textField2;
    private JButton encryptButton;
    private JTextField textField3;

    public en() {
        encryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filereader a=new filereader();
                String filepath1=textField1.getText();
                ArrayList<String> tobeenc=a.readfile(filepath1);
                ArrayList<String> encrypted=new ArrayList<String>();
                String key1=textField3.getText();
                encrypt e1=new encrypt(key1);
                for(String line:tobeenc){
                    String enced=e1.swap(line);
                    enced=e1.Substitute(enced);
                    encrypted.add(enced);

                }
                String enstring="";
                for(String eline:encrypted){
                    enstring=enstring+eline;
                }
                filewriter b=new filewriter();
                String filepath2=textField2.getText();
                b.writefile(filepath2,enstring);
            }
        });
    }
}
