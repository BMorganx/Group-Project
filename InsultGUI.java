import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class InsultGUI {
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton YOMAMAButton;
    private JButton YODADButton;
    private JButton iNSUButton;
    private JButton listOfFoodsButton;
    private JButton RANDOMButton;

    Main main = new Main();

    public InsultGUI() {
        $$$setupUI$$$();
        YOMAMAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textArea1.setText(main.outputMama());
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });

        iNSUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textArea1.setText(main.outputSelf());
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });

        YODADButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textArea1.setText(main.outputDad());
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });
        
        //Outputs list of food
        listOfFoodsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    main.outputListOfFoods();
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });
        RANDOMButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textArea1.setText(main.outputRandom());
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                    ;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Insult Generator");
        frame.setContentPane(new InsultGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 450);
        frame.setVisible(true);

    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setBackground(new Color(-1978671));
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$("Century Gothic", -1, 14, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-1));
        label1.setText("Insult yourself, yo mama, or yo dad.");
        GridBagConstraints gbc;
        
        menuBar = new JMenuBar();
        GridBagConstraints gbc_menuBar = new GridBagConstraints();
        gbc_menuBar.insets = new Insets(0, 0, 5, 0);
        gbc_menuBar.gridx = 2;
        gbc_menuBar.gridy = 0;
        panel1.add(menuBar, gbc_menuBar);
        
        mnNewMenu = new JMenu(". . .");
        menuBar.add(mnNewMenu);
        
        mntmNewMenuItem = new JMenuItem("Add Word");
        mnNewMenu.add(mntmNewMenuItem);
        
        mntmNewMenuItem_1 = new JMenuItem("Remove Word");
        mnNewMenu.add(mntmNewMenuItem_1);
        
        mntmNewMenuItem_2 = new JMenuItem("Exit");
        mnNewMenu.add(mntmNewMenuItem_2);
        
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel1.add(label1, gbc);
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$("Century Gothic", Font.BOLD, 24, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-1));
        label2.setText("      i n s u l t g e n e r a t o r      ");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        panel1.add(label2, gbc);
        iNSUButton = new JButton();
        iNSUButton.setBackground(new Color(-2563620));
        Font iNSUButtonFont = this.$$$getFont$$$("Century Gothic", Font.BOLD, -1, iNSUButton.getFont());
        if (iNSUButtonFont != null) iNSUButton.setFont(iNSUButtonFont);
        iNSUButton.setForeground(new Color(-1));
        iNSUButton.setText("I N S U L T  Y O U R S E L F !");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel1.add(iNSUButton, gbc);
        YOMAMAButton = new JButton();
        YOMAMAButton.setBackground(new Color(-1975357));
        Font YOMAMAButtonFont = this.$$$getFont$$$("Century Gothic", Font.BOLD, -1, YOMAMAButton.getFont());
        if (YOMAMAButtonFont != null) YOMAMAButton.setFont(YOMAMAButtonFont);
        YOMAMAButton.setForeground(new Color(-1));
        YOMAMAButton.setText("YO MAMA");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(YOMAMAButton, gbc);
        YODADButton = new JButton();
        YODADButton.setBackground(new Color(-1975357));
        Font YODADButtonFont = this.$$$getFont$$$("Century Gothic", Font.BOLD, -1, YODADButton.getFont());
        if (YODADButtonFont != null) YODADButton.setFont(YODADButtonFont);
        YODADButton.setForeground(new Color(-1));
        YODADButton.setText("YO DAD");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(YODADButton, gbc);
        textArea1 = new JTextArea();
        textArea1.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(textArea1, gbc);
        listOfFoodsButton = new JButton();
        listOfFoodsButton.setBackground(new Color(-7194));
        Font listOfFoodsButtonFont = this.$$$getFont$$$("Century Gothic", Font.BOLD, -1, listOfFoodsButton.getFont());
        if (listOfFoodsButtonFont != null) listOfFoodsButton.setFont(listOfFoodsButtonFont);
        listOfFoodsButton.setForeground(new Color(-1));
        listOfFoodsButton.setText("F O O D  L I S T");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel1.add(listOfFoodsButton, gbc);
        RANDOMButton = new JButton();
        RANDOMButton.setBackground(new Color(-3349533));
        Font RANDOMButtonFont = this.$$$getFont$$$("Century Gothic", Font.BOLD, -1, RANDOMButton.getFont());
        if (RANDOMButtonFont != null) RANDOMButton.setFont(RANDOMButtonFont);
        RANDOMButton.setForeground(new Color(-1));
        RANDOMButton.setHorizontalTextPosition(11);
        RANDOMButton.setText("RANDOM");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(RANDOMButton, gbc);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
