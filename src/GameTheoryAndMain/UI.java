package GameTheoryAndMain;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import GameData.GameData;
import GameData.Games;
import bugReport.bugReport;

public class UI {
	public JFrame frame;
	public JFrame frame2;
	public JFrame bugReportFrame;
	static JLabel icon0 = new JLabel(ImagesSetting.setInitailImage());
	static JLabel icon1 = new JLabel(ImagesSetting.setInitailImage());
	static JLabel icon2 = new JLabel(ImagesSetting.setInitailImage());
	static JLabel icon3 = new JLabel(ImagesSetting.setInitailImage());
	static JLabel icon4 = new JLabel(ImagesSetting.setInitailImage());
	static JLabel icon5 = new JLabel(ImagesSetting.setInitailImage());
	static JLabel icon6 = new JLabel(ImagesSetting.setInitailImage());
	static JLabel icon7 = new JLabel(ImagesSetting.setInitailImage());
	static JLabel icon8 = new JLabel(ImagesSetting.setInitailImage());
	static JLabel icon9 = new JLabel(ImagesSetting.setInitailImage());
	static JLabel icon10 = new JLabel(ImagesSetting.setInitailImage());
	static JLabel icon11 = new JLabel(ImagesSetting.setInitailImage());
	static JLabel icon12 = new JLabel(ImagesSetting.setInitailImage());
	static JLabel icon13 = new JLabel(ImagesSetting.setInitailImage());
	static JLabel icon14 = new JLabel(ImagesSetting.setInitailImage());
	static JLabel infoImage = new JLabel(ImagesSetting.setInfoImage());
	JTextPane infoPane = new JTextPane();
	JButton infoBtn = new JButton("More Info");
	JButton reportBtn = new JButton("Bug Report");
	JButton btnStartGame = new JButton("Start Game");
	JButton btnOneGameMore = new JButton("Once More");
	JLabel lblBetAmount = new JLabel("Bet Amount :");
	JLabel lblWallet = new JLabel("Wallet :");
	
	//Bug Report
	public JLabel lblReportID = new JLabel("ID :");public JTextField reportID = new JTextField();
	public JLabel lblReportTitle = new JLabel("Title :");public JTextField reportTitle = new JTextField();
	public JLabel lblType = new JLabel("Type :");public JComboBox<String> bugTypes = null;
	public JLabel lblOS = new JLabel("Enviorment :");public JTextField oS = new JTextField();
	public JLabel lblVersion = new JLabel("Version :");public JTextField version = new JTextField();
	public JLabel lblComponent = new JLabel("Component :");public JTextField component = new JTextField();
	public JLabel lblReporter = new JLabel("Contact Name :");public JTextField reporter = new JTextField();
	public JLabel lblContactEmail = new JLabel("Contact Email :");public JTextField ContactEmail = new JTextField();
	public JLabel lblAttachment = new JLabel("Attachments :");public JButton browser = new JButton("Browser");public JTextField attachPath = new JTextField();
	public JLabel lblDetails = new JLabel("Details :"); public JTextArea details = new JTextArea("Please Input Your Bugs Details",20,20);
	JButton btnSubmit = new JButton("Submit");
	
	
	public JTextPane walletAmount = new JTextPane();
	public JTextField inputOdd = new JTextField();
	public JRadioButton Bet1Lines = new JRadioButton("Bet 1 Lines (At Least $10)",true);
	public JRadioButton Bet3Lines = new JRadioButton("Bet 3 Lines (At Least $30)");
	public JRadioButton Bet5Lines = new JRadioButton("Bet 5 Lines (At Least $50)");
	public JRadioButton Bet13Lines = new JRadioButton("Bet 13 Lines (At Least $100)");
	public ButtonGroup group = new ButtonGroup();
	JTextPane console = new JTextPane();

	public void initialize(){
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Slot Machine");
		frame.setBounds(500, 500, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		frame2 = new JFrame();
		frame2.setResizable(false);
		frame2.setVisible(false);
		frame2.setTitle("Info");
		frame2.setBounds(500, 500, 600, 500);
		
	
		icon0.setBounds(6, 55, 75, 75);
		frame.getContentPane().add(icon0);
		
		icon1.setBounds(93, 55, 75, 75);
		frame.getContentPane().add(icon1);
		
		icon2.setBounds(178, 55, 75, 75);
		frame.getContentPane().add(icon2);
		
		icon3.setBounds(265, 55, 75, 75);
		frame.getContentPane().add(icon3);
		
		icon4.setBounds(352, 55, 75, 75);
		frame.getContentPane().add(icon4);
		
		icon5.setBounds(6, 141, 75, 75);
		frame.getContentPane().add(icon5);
		
		icon6.setBounds(91, 141, 75, 75);
		frame.getContentPane().add(icon6);
		
		icon7.setBounds(178, 142, 75, 75);
		frame.getContentPane().add(icon7);
		
		icon8.setBounds(265, 142, 75, 75);
		frame.getContentPane().add(icon8);
		
		icon9.setBounds(352, 142, 75, 75);
		frame.getContentPane().add(icon9);
		
		icon10.setBounds(6, 228, 75, 75);
		frame.getContentPane().add(icon10);
		
		icon11.setBounds(93, 228, 75, 75);
		frame.getContentPane().add(icon11);
		
		icon12.setBounds(178, 228, 75, 75);
		frame.getContentPane().add(icon12);
		
		icon13.setBounds(265, 228, 75, 75);
		frame.getContentPane().add(icon13);
		
		icon14.setBounds(352, 228, 75, 75);
		frame.getContentPane().add(icon14);
	
		btnStartGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnStartGame.setVisible(false);
				btnOneGameMore.setVisible(true);
			}
		});
		btnStartGame.setBounds(477, 79, 117, 29);
		frame.getContentPane().add(btnStartGame);
		
		btnOneGameMore.setBounds(477, 79, 117, 29);
		frame.getContentPane().add(btnOneGameMore);
		btnOneGameMore.setVisible(false);
		
		GameData.windows.btnOneGameMore.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try
				{
				Games.newGames(Integer.parseInt(inputOdd.getText()));
				}
				catch (Exception e1)
				{
				JOptionPane.showMessageDialog(null, "Input cannot be empty!");
				}
			}
		});
		GameData.windows.btnStartGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try
				{
				Games.newGames(Integer.parseInt(inputOdd.getText()));
				}
				catch (Exception e1)
				{
				JOptionPane.showMessageDialog(null, "Input cannot be empty!");
				}
			}
		});
		
		lblWallet.setBounds(467, 168, 92, 16);
		frame.getContentPane().add(lblWallet);
		
		lblBetAmount.setBounds(467, 228, 92, 16);
		frame.getContentPane().add(lblBetAmount);
		
		walletAmount.setBounds(467, 193, 124, 23);
		frame.getContentPane().add(walletAmount);
		walletAmount.setEditable(false);
		
		inputOdd.setBounds(464, 244, 130, 23);
		frame.getContentPane().add(inputOdd);
		inputOdd.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int keyChar=e.getKeyChar();
				if (keyChar>=KeyEvent.VK_0 && keyChar<=KeyEvent.VK_9 && inputOdd.getText().length()<=4) {
				} else {
					e.consume();  
				}
			}
		});
		
		Bet1Lines.setBounds(16, 370, 250, 23);
		frame.getContentPane().add(Bet1Lines);
		
		Bet3Lines.setBounds(16, 390, 250, 23);
		frame.getContentPane().add(Bet3Lines);
		
		Bet5Lines.setBounds(16, 410, 250, 23);
		frame.getContentPane().add(Bet5Lines);
		
		Bet13Lines.setBounds(16, 430, 250, 23);
		frame.getContentPane().add(Bet13Lines);
		
		group = new ButtonGroup();
        group.add(Bet1Lines);
        group.add(Bet3Lines);
        group.add(Bet5Lines);
        group.add(Bet13Lines);
      
		console.setForeground(new Color(255, 0, 0));
		console.setBounds(16, 333, 411, 23);
		console.setBackground(frame.getBackground());
		console.setEditable(false);
		frame.getContentPane().add(console);
		
	    infoBtn.setBounds(488, 430, 84, 27);
	    frame.add(infoBtn);
	    infoBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame2.setVisible(true);
			}
		});
	    
	    reportBtn.setBounds(400, 430, 84, 27);
	    frame.add(reportBtn);
	    reportBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "It's Just Loading!");
				try {
					bugReportFrame.setVisible(true);
					reportID.setText(bugReport.getReportID());
					oS.setText(System.getProperty("os.name").toUpperCase());
					version.setText(bugReport.getVer());
					component.setText("Optional");
				} catch (MessagingException e2) {
					JOptionPane.showMessageDialog(null, "Internet Error, Please Contact Admin");
					bugReportFrame.setVisible(false);
				}
			}
		});
	    
	    
		infoPane.setEditable(false);
		infoPane.setBounds(0, 0, 600, 150);
	    frame2.add(infoPane);
	    infoPane.setText("3 in a line --> Win with odds times bet.\n"
	    		+ "4 in a line -->bonus with multiple of 5\n"
	    		+ "5 in a line -->bonus with multiple of 10!!!\n"
	    		+ "Monkey  X2			Duck  X3\n"
	    		+ "Snake   X5				Tiger X3\n"
	    		+ "Tresure X20			Bonus X50\n"
	    		+ "		Super Monkey X100!!!\n"
	    		);
	    
	    infoImage.setBounds(178, 350, 75, 75);
		frame2.getContentPane().add(infoImage);
		
		
		//Bug Report
		bugReportFrame = new JFrame();
		bugReportFrame.setResizable(false);
		bugReportFrame.setVisible(false);
		bugReportFrame.setTitle("Bug Report");
		bugReportFrame.setBounds(0, 0, 1024, 550);
		
		lblReportID.setBounds(10, 10, 100, 16);
		bugReportFrame.getContentPane().add(lblReportID);
		lblReportTitle.setBounds(10, 60, 100, 16);
		bugReportFrame.getContentPane().add(lblReportTitle);
		lblType.setBounds(10, 110, 100, 16);
		bugReportFrame.getContentPane().add(lblType);
		lblOS.setBounds(10, 160, 100, 16);
		bugReportFrame.getContentPane().add(lblOS);
		lblVersion.setBounds(10, 210, 100, 16);
		bugReportFrame.getContentPane().add(lblVersion);
		lblComponent.setBounds(10, 260, 100, 16);
		bugReportFrame.getContentPane().add(lblComponent);
		lblReporter.setBounds(10, 310, 100, 16);
		bugReportFrame.getContentPane().add(lblReporter);
		lblContactEmail.setBounds(10, 360, 100, 16);
		bugReportFrame.getContentPane().add(lblContactEmail);
		lblAttachment.setBounds(10, 410, 100, 16);
		bugReportFrame.getContentPane().add(lblAttachment);
		lblDetails.setBounds(300, 10, 100, 16);
		bugReportFrame.getContentPane().add(lblDetails);
		
		reportID.setBounds(120, 10, 150, 23);
		bugReportFrame.getContentPane().add(reportID);
		reportID.setEditable(false);
		reportTitle.setBounds(120, 60, 150, 23);
		bugReportFrame.getContentPane().add(reportTitle);
		bugTypes = new JComboBox<String>();
		bugTypes.setBounds(120, 110, 150, 23);
		bugTypes.addItem("Imporvements");
		bugTypes.addItem("Bugs");
		bugTypes.addItem("Failure");
		bugReportFrame.getContentPane().add(bugTypes);
		oS.setBounds(120, 160, 150, 23);
		bugReportFrame.getContentPane().add(oS);
		oS.setEditable(false);
		version.setBounds(120, 210, 150, 23);
		bugReportFrame.getContentPane().add(version);
		version.setEditable(false);
		component.setBounds(120, 260, 150, 23);
		bugReportFrame.getContentPane().add(component);
		reporter.setBounds(120, 310, 150, 23);
		bugReportFrame.getContentPane().add(reporter);
		ContactEmail.setBounds(120, 360, 150, 23);
		bugReportFrame.getContentPane().add(ContactEmail);
		browser.setBounds(120, 410, 150, 23);
		bugReportFrame.getContentPane().add(browser);
		attachPath.setBounds(120, 410, 150, 23);
		bugReportFrame.getContentPane().add(attachPath);
		attachPath.setVisible(false);
		browser.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  JFileChooser fileChooser = new JFileChooser(); 
		    	  int returnValue = fileChooser.showOpenDialog(null); 
		    	  if (returnValue == JFileChooser.APPROVE_OPTION)
		    	  	{ 
		    		  File selectedFile = fileChooser.getSelectedFile();
		    		  attachPath.setText(selectedFile.getAbsolutePath());
		    		  attachPath.setEditable(false);
		    		  attachPath.setVisible(true);
		    		  browser.setBounds(280, 410, 70, 23);
		    	  	}
		    	  }
		    });
		
		details.setLineWrap(true);
		details.setRows(20);
		JScrollPane scrollPane = new JScrollPane(details);
		scrollPane.setBounds(380, 10, 500, 500);
		bugReportFrame.getContentPane().add(scrollPane);
		
		btnSubmit.setBounds(900, 450, 117, 29);
		bugReportFrame.getContentPane().add(btnSubmit);
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					bugReport.sendReportText();
					JOptionPane.showMessageDialog(null, "Bug Report Sent, Thank you!");
					bugReportFrame.setVisible(false);
				} catch (AddressException e1) {
					JOptionPane.showMessageDialog(null, "Internet Error, Please Contact Admin");
					bugReportFrame.setVisible(false);
				} catch (MessagingException e1) {
					JOptionPane.showMessageDialog(null, "Internet Error, Please Contact Admin");
					bugReportFrame.setVisible(false);
				}
			}
		});
		
		bugReportFrame.getContentPane().setLayout(null);
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
