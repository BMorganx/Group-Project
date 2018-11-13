import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InsultGUI extends Main {
    private JPanel panel1;
    private JCheckBox ALLFOODSCheckBox;
    private JCheckBox VEGETABLESCheckBox;
    private JCheckBox FRUITSCheckBox;
    private JTextArea textArea1;
    private JButton YOMAMAButton;
    private JButton YODADButton;
    private JButton iNSUButton;
    Main main = new Main();
    private GridBagConstraints gbc_1;
    private GridBagConstraints gbc_2;
    private GridBagConstraints gbc_3;
    private GridBagConstraints gbc_4;
    private GridBagConstraints gbc_5;
    private GridBagConstraints gbc_6;
    private GridBagConstraints gbc_7;
    private GridBagConstraints gbc_8;
    private GridBagConstraints gbc_9;
    private JButton btnRandom;
    private JButton btnClear;

    public InsultGUI() {
        YOMAMAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textArea1.setText(outputMama());
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });

        iNSUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textArea1.setText(outputSelf());
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });

        YODADButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textArea1.setText(outputDad());
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });
        
        btnRandom.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		try {
                    textArea1.setText(outputAny());
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
        		
        	}
        });
        
        btnClear.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		textArea1.setText("");
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


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
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
        panel1.setBackground(new Color(-1985624));
        textArea1 = new JTextArea();
        textArea1.setText("");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 0, 5, 0);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(textArea1, gbc);
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$("Century Gothic", -1, 12, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-1));
        label1.setText("Insult yourself, yo mama, or yo dada.");
        gbc_1 = new GridBagConstraints();
        gbc_1.insets = new Insets(0, 0, 5, 5);
        gbc_1.gridx = 1;
        gbc_1.gridy = 1;
        panel1.add(label1, gbc_1);
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$("Century Gothic", -1, 12, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-1));
        label2.setText("You can also check what insult category you want.");
        gbc_2 = new GridBagConstraints();
        gbc_2.insets = new Insets(0, 0, 5, 5);
        gbc_2.gridx = 1;
        gbc_2.gridy = 2;
        panel1.add(label2, gbc_2);
        ALLFOODSCheckBox = new JCheckBox();
        ALLFOODSCheckBox.setBackground(new Color(-400419));
        ALLFOODSCheckBox.setForeground(new Color(-822925));
        ALLFOODSCheckBox.setText("ALL FOODS");
        gbc_3 = new GridBagConstraints();
        gbc_3.insets = new Insets(0, 0, 5, 5);
        gbc_3.gridx = 1;
        gbc_3.gridy = 3;
        panel1.add(ALLFOODSCheckBox, gbc_3);
        VEGETABLESCheckBox = new JCheckBox();
        VEGETABLESCheckBox.setBackground(new Color(-400419));
        VEGETABLESCheckBox.setForeground(new Color(-822925));
        VEGETABLESCheckBox.setText("VEGETABLES");
        gbc_4 = new GridBagConstraints();
        gbc_4.insets = new Insets(0, 0, 5, 0);
        gbc_4.gridx = 2;
        gbc_4.gridy = 3;
        gbc_4.anchor = GridBagConstraints.WEST;
        panel1.add(VEGETABLESCheckBox, gbc_4);
        FRUITSCheckBox = new JCheckBox();
        FRUITSCheckBox.setBackground(new Color(-400419));
        FRUITSCheckBox.setForeground(new Color(-822925));
        FRUITSCheckBox.setText("FRUITS");
        gbc_5 = new GridBagConstraints();
        gbc_5.insets = new Insets(0, 0, 5, 5);
        gbc_5.gridx = 0;
        gbc_5.gridy = 3;
        gbc_5.anchor = GridBagConstraints.WEST;
        panel1.add(FRUITSCheckBox, gbc_5);
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$("Century Gothic", Font.BOLD, 20, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-1));
        label3.setText("\u2665 I N S U L T  G E N E R A T O R \u2665");
        gbc_6 = new GridBagConstraints();
        gbc_6.insets = new Insets(0, 0, 5, 5);
        gbc_6.gridx = 1;
        gbc_6.gridy = 0;
        gbc_6.anchor = GridBagConstraints.NORTH;
        panel1.add(label3, gbc_6);
        YODADButton = new JButton();
        YODADButton.setBackground(new Color(-822925));
        Font YODADButtonFont = this.$$$getFont$$$("Century Gothic", -1, -1, YODADButton.getFont());
        if (YODADButtonFont != null) YODADButton.setFont(YODADButtonFont);
        iNSUButton = new JButton();
        iNSUButton.setBackground(new Color(-822925));
        Font iNSUButtonFont = this.$$$getFont$$$("Century Gothic", -1, -1, iNSUButton.getFont());
        iNSUButton.setForeground(new Color(-1));
        iNSUButton.setText("I N S U L T  Y O U R S E L F !");
        gbc_9 = new GridBagConstraints();
        gbc_9.insets = new Insets(0, 0, 5, 5);
        gbc_9.gridx = 1;
        gbc_9.gridy = 5;
        gbc_9.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(iNSUButton, gbc_9);
        YODADButton.setForeground(new Color(-1));
        YODADButton.setText("YO DAD");
        gbc_7 = new GridBagConstraints();
        gbc_7.insets = new Insets(0, 0, 5, 0);
        gbc_7.gridx = 2;
        gbc_7.gridy = 5;
        gbc_7.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(YODADButton, gbc_7);
        YOMAMAButton = new JButton();
        YOMAMAButton.setBackground(new Color(-822925));
        Font YOMAMAButtonFont = this.$$$getFont$$$("Century Gothic", -1, -1, YOMAMAButton.getFont());
        if (YOMAMAButtonFont != null) YOMAMAButton.setFont(YOMAMAButtonFont);
        YOMAMAButton.setForeground(new Color(-1));
        YOMAMAButton.setText("YO MAMA");
        gbc_8 = new GridBagConstraints();
        gbc_8.insets = new Insets(0, 0, 5, 5);
        gbc_8.gridx = 0;
        gbc_8.gridy = 5;
        gbc_8.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(YOMAMAButton, gbc_8);
        if (iNSUButtonFont != null) iNSUButton.setFont(iNSUButtonFont);
        
        btnRandom = new JButton();
        btnRandom.setText("Random");
        btnRandom.setForeground(Color.WHITE);
        btnRandom.setBackground(new Color(243, 113, 115));
        GridBagConstraints gbc_btnRandom = new GridBagConstraints();
        gbc_btnRandom.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnRandom.insets = new Insets(0, 0, 0, 5);
        gbc_btnRandom.gridx = 0;
        gbc_btnRandom.gridy = 6;
        panel1.add(btnRandom, gbc_btnRandom);
        
        btnClear = new JButton();
        btnClear.setText("Clear");
        btnClear.setForeground(Color.WHITE);
        btnClear.setBackground(new Color(243, 113, 115));
        GridBagConstraints gbc_btnClear = new GridBagConstraints();
        gbc_btnClear.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnClear.gridx = 2;
        gbc_btnClear.gridy = 6;
        panel1.add(btnClear, gbc_btnClear);
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
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
