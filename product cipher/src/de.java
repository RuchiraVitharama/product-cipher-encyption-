import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class de {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton decryptButton;
    public JPanel depane;

    public de() {
        decryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filereader a=new filereader();
                String rpath=textField2.getText();
                ArrayList<String> tobedec=a.readfile(rpath);
                ArrayList<String> decrypted=new ArrayList<String>();
                String key1=textField1.getText();
                encrypt e1=new encrypt(key1);
                decrypt d1=new decrypt(key1);
                for(String line:tobedec){
                    String deced=e1.Substitute(line);


                    deced=d1.swapb(deced,e1.getorder());
                    decrypted.add(deced);

                }
                String destring="";
                for(String dline:decrypted){
                    destring=destring+dline;
                }
                filewriter b=new filewriter();
                String fpath=textField3.getText();
                b.writefile(fpath,destring);
            }
        });
    }
}
