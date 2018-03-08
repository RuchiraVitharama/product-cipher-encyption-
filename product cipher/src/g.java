import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class g {
    private JButton encryptButton;
    private JButton decryptButton;
    private JPanel panel1;

    public static void main(String[] args) throws Exception{
        JFrame frame = new JFrame("g");
        frame.setContentPane(new g().panel1);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }





    public g() {


        encryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                en en1 = new en();
                JFrame frame1 = new JFrame();

                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.setContentPane(en1.epane);
                //frame.setSize(1000,1000);
                frame1.setLocationRelativeTo(null);
                frame1.pack();
                frame1.setVisible(true);
            }
        });

        decryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                de de1= new de();
                JFrame frame1 = new JFrame();

                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.setContentPane(de1.depane);
                //frame.setSize(1000,1000);
                frame1.setLocationRelativeTo(null);
                frame1.pack();
                frame1.setVisible(true);
            }
        });
    }
}
