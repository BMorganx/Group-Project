import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class GeneratorGUI {
    private JPanel panel1;
    private JLabel iNSULabel;
    private JButton GENERATEButton;
    private JLabel clickTheGELabel;

    public static void main(String[] args){
        JFrame frame = new JFrame("Insult Generator");
        frame.setContentPane(new GeneratorGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(425,350);
        frame.setVisible(true);
    }

    public GeneratorGUI() {
        GENERATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
