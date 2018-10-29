import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.JPanel;

public class GeneratorGUI extends Main{
    private JPanel panel1;
    private JLabel iNSULabel;
    private JButton GENERATEButton;
    private JLabel clickTheGELabel;
    private JTextArea textArea1;

    public static void main(String[] args){
        JFrame frame = new JFrame("Insult Generator");
        frame.setContentPane(new GeneratorGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(425,350);
        frame.setVisible(true);
    }

    /*
    Desc: ActionListener for the generate button. When clicked
    Precondition:
    Postcondition: Outputs the insult string.
    Throws: FileNotFoundException if file is not found.
     */
    public GeneratorGUI() {
        GENERATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textArea1.setText(output());
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

}
