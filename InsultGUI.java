import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsultGUI{
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton YOMAMAButton;
    private JButton YODADButton;
    private JButton iNSUButton;
    private JButton listOfFoodsButton;
    private JButton RANDOMButton;
    private JMenuBar menuBar;
    private JMenu mnNewMenu;
    private JMenuItem mntmNewMenuItem;
    private JMenuItem mntmNewMenuItem_1;
    private JMenuItem mntmNewMenuItem_2;

    Main main = new Main();
    private GridBagConstraints gbc_1;
    private JSeparator separator;
    private GridBagConstraints gbc_2;
    private GridBagConstraints gbc_3;
    private GridBagConstraints gbc_4;
    private GridBagConstraints gbc_5;
    private GridBagConstraints gbc_6;
    private GridBagConstraints gbc_7;
    private JSeparator separator_1;
    
    private JLabel addlbl = new JLabel("Add a word:");        		
	private JTextField addtxt = new JTextField("",10);
	private JButton add = new JButton("Add");
	private JTextArea wordArea = new JTextArea(10, 20);
	private JLabel wordListlbl = new JLabel("Word List:");
    
    private JTextField removetxt = new JTextField("",10);
	private JLabel removelbl = new JLabel("Remove a word:");
	private JButton removebtn = new JButton("Remove");
	private JTextArea wordListArea = new JTextArea(10,20);


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
        frame.getContentPane().setBackground(new Color(240, 255, 240));
        frame.setContentPane(new InsultGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 450);
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
        menuBar.setBackground(new Color(255, 255, 224));
        GridBagConstraints gbc_menuBar = new GridBagConstraints();
        gbc_menuBar.insets = new Insets(0, 0, 5, 0);
        gbc_menuBar.gridx = 2;
        gbc_menuBar.gridy = 0;
        panel1.add(menuBar, gbc_menuBar);
        
        mnNewMenu = new JMenu(". . .");
        mnNewMenu.setForeground(new Color(216, 191, 216));
        menuBar.add(mnNewMenu);
        
        mntmNewMenuItem = new JMenuItem("Add Word");
        mntmNewMenuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		JDialog no = new JDialog();
        		no.setVisible(true);
        		no.setBackground(new Color(240, 255, 240));
        		no.getContentPane().setBackground(new Color(216, 191, 216));
        		no.getContentPane().setForeground(new Color(255, 255, 240));
        		no.setLayout(new FlowLayout());
        		
        		no.setSize(290,275);
        		no.add(addlbl);
        		no.add(addtxt);
        		no.add(add);
        		no.add(wordListlbl);
        		no.add(wordArea);
        		JScrollPane scroll = new JScrollPane (wordArea, 
        				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        		no.add(scroll);
        		add.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						String fileContent = "\n" + (addtxt.getText());
						main.add(addtxt.getText());
       			     
        			    BufferedWriter writer;
        			    
						try {
							writer = new BufferedWriter(new FileWriter("Food.txt", true));
							writer.write(fileContent);
							writer.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
        		});
        		no.setTitle("Add word");
        		wordArea.setEditable(false);
        		
        		try {
                    // Read some text from the resource file to display in
                    // the JTextArea.
                    wordArea.read(new InputStreamReader(
                            getClass().getResourceAsStream("/Food.txt")),
                        null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
        	}
        	
        });
        
        mntmNewMenuItem.setForeground(new Color(216, 191, 216));
        mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        mntmNewMenuItem.setBackground(new Color(255, 255, 240));
        mnNewMenu.add(mntmNewMenuItem);
        
        mntmNewMenuItem_1 = new JMenuItem("Remove Word");
        mntmNewMenuItem_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		JDialog remove = new JDialog();
        		remove.setVisible(true);
        		remove.setLayout(new FlowLayout());
        		remove.getContentPane().setBackground(new Color(216, 191, 216));
        		remove.getContentPane().setForeground(new Color(255, 255, 240));
        		remove.setTitle("Remove word");
        		remove.setSize(340,260);
        		remove.setBackground(new Color(240, 255, 240));
        		remove.add(removelbl);
        		remove.add(removetxt);
        		remove.add(removebtn);
        		remove.add(wordListlbl);
        		remove.add(wordListArea);
        		JScrollPane scroll = new JScrollPane (wordListArea, 
     				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        		
        		remove.add(scroll);
        		removebtn.addActionListener(new ActionListener() {
        			@Override
        			public void actionPerformed(ActionEvent evt) {
        			    
        			}
        			
        		});
        		
        		
        		try {
                    // Read some text from the resource file to display in
                    // the JTextArea.
                    wordListArea.read(new InputStreamReader(
                            getClass().getResourceAsStream("/Food.txt")),
                        null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
        		wordListArea.setEditable(false);
        		
        	}
        });
        mntmNewMenuItem_1.setForeground(new Color(216, 191, 216));
        mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        mntmNewMenuItem_1.setBackground(new Color(255, 255, 240));
        mnNewMenu.add(mntmNewMenuItem_1);
        
        mntmNewMenuItem_2 = new JMenuItem("Exit");
        mntmNewMenuItem_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		System.exit(0);
        	}
        });
        mntmNewMenuItem_2.setForeground(new Color(216, 191, 216));
        mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        mntmNewMenuItem_2.setBackground(new Color(255, 255, 240));
        mnNewMenu.add(mntmNewMenuItem_2);
        
        separator = new JSeparator();
        GridBagConstraints gbc_separator = new GridBagConstraints();
        gbc_separator.insets = new Insets(0, 0, 5, 5);
        gbc_separator.gridx = 1;
        gbc_separator.gridy = 1;
        panel1.add(separator, gbc_separator);
        
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 0, 5, 5);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel1.add(label1, gbc);
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$("Century Gothic", Font.BOLD, 24, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-1));
        label2.setText("      I n s u l t  G e n e r a t o r      ");
        gbc_1 = new GridBagConstraints();
        gbc_1.insets = new Insets(0, 0, 5, 5);
        gbc_1.fill = GridBagConstraints.BOTH;
        gbc_1.gridx = 1;
        gbc_1.gridy = 0;
        panel1.add(label2, gbc_1);
        iNSUButton = new JButton();
        iNSUButton.setBackground(new Color(-2563620));
        Font iNSUButtonFont = this.$$$getFont$$$("Century Gothic", Font.BOLD, -1, iNSUButton.getFont());
        if (iNSUButtonFont != null) iNSUButton.setFont(iNSUButtonFont);
        
        separator_1 = new JSeparator();
        GridBagConstraints gbc_separator_1 = new GridBagConstraints();
        gbc_separator_1.insets = new Insets(0, 0, 5, 5);
        gbc_separator_1.gridx = 1;
        gbc_separator_1.gridy = 3;
        panel1.add(separator_1, gbc_separator_1);
        iNSUButton.setForeground(new Color(-1));
        iNSUButton.setText("I N S U L T  Y O U R S E L F !");
        gbc_2 = new GridBagConstraints();
        gbc_2.insets = new Insets(0, 0, 5, 5);
        gbc_2.gridx = 1;
        gbc_2.gridy = 4;
        panel1.add(iNSUButton, gbc_2);
        YOMAMAButton = new JButton();
        YOMAMAButton.setBackground(new Color(-1975357));
        Font YOMAMAButtonFont = this.$$$getFont$$$("Century Gothic", Font.BOLD, -1, YOMAMAButton.getFont());
        if (YOMAMAButtonFont != null) YOMAMAButton.setFont(YOMAMAButtonFont);
        YOMAMAButton.setForeground(new Color(-1));
        YOMAMAButton.setText("YO MAMA");
        gbc_3 = new GridBagConstraints();
        gbc_3.insets = new Insets(0, 0, 5, 5);
        gbc_3.gridx = 0;
        gbc_3.gridy = 4;
        gbc_3.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(YOMAMAButton, gbc_3);
        YODADButton = new JButton();
        YODADButton.setBackground(new Color(-1975357));
        Font YODADButtonFont = this.$$$getFont$$$("Century Gothic", Font.BOLD, -1, YODADButton.getFont());
        if (YODADButtonFont != null) YODADButton.setFont(YODADButtonFont);
        YODADButton.setForeground(new Color(-1));
        YODADButton.setText("YO DAD");
        gbc_4 = new GridBagConstraints();
        gbc_4.insets = new Insets(0, 0, 5, 0);
        gbc_4.gridx = 2;
        gbc_4.gridy = 4;
        gbc_4.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(YODADButton, gbc_4);
        textArea1 = new JTextArea();
        textArea1.setText("");
        gbc_5 = new GridBagConstraints();
        gbc_5.insets = new Insets(0, 0, 5, 5);
        gbc_5.gridx = 1;
        gbc_5.gridy = 6;
        gbc_5.fill = GridBagConstraints.BOTH;
        panel1.add(textArea1, gbc_5);
        listOfFoodsButton = new JButton();
        listOfFoodsButton.setBackground(new Color(-7194));
        Font listOfFoodsButtonFont = this.$$$getFont$$$("Century Gothic", Font.BOLD, -1, listOfFoodsButton.getFont());
        if (listOfFoodsButtonFont != null) listOfFoodsButton.setFont(listOfFoodsButtonFont);
        listOfFoodsButton.setForeground(new Color(-1));
        listOfFoodsButton.setText("F O O D  L I S T");
        
        add.setBackground(new Color(-7194));
        Font addBtnFont = this.$$$getFont$$$("Century Gothic", Font.BOLD, -1, add.getFont());
        if (addBtnFont != null) removebtn.setFont(addBtnFont);
        add.setForeground(new Color(-1));
        add.setText("A D D");
        
        removebtn.setBackground(new Color(-7194));
        Font removeBtnFont = this.$$$getFont$$$("Century Gothic", Font.BOLD, -1, removebtn.getFont());
        if (removeBtnFont != null) removebtn.setFont(removeBtnFont);
        removebtn.setForeground(new Color(-1));
        removebtn.setText("R E M O V E");
        
        gbc_6 = new GridBagConstraints();
        gbc_6.insets = new Insets(0, 0, 0, 5);
        gbc_6.gridx = 1;
        gbc_6.gridy = 7;
        panel1.add(listOfFoodsButton, gbc_6);
        RANDOMButton = new JButton();
        RANDOMButton.setBackground(new Color(-3349533));
        Font RANDOMButtonFont = this.$$$getFont$$$("Century Gothic", Font.BOLD, -1, RANDOMButton.getFont());
        if (RANDOMButtonFont != null) RANDOMButton.setFont(RANDOMButtonFont);
        RANDOMButton.setForeground(new Color(-1));
        RANDOMButton.setHorizontalTextPosition(11);
        RANDOMButton.setText("RANDOM");
        gbc_7 = new GridBagConstraints();
        gbc_7.insets = new Insets(0, 0, 5, 5);
        gbc_7.gridx = 1;
        gbc_7.gridy = 5;
        gbc_7.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(RANDOMButton, gbc_7);
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
