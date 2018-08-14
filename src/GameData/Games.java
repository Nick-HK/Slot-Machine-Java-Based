package GameData;

import javax.swing.JOptionPane;

import GameTheoryAndMain.GameTools;

public class Games {

	private static Token t = new Token(1000);
	public Games() {// TODO Auto-generated constructor stub
		GameTools.RlistInitialize();
		GameTools.FlistInitialize();
		GameData.windows.initialize();
		GameData.windows.frame.setVisible(true);
		GameData.windows.walletAmount.setText(t.toString());
	}
	
	public static void newGames(int bet){
		if (GameTools.checkBetAmount(bet,t.getToken())==false)
		{
			JOptionPane.showMessageDialog(null, "Please input Correct Amount!");
		}
		else
		{
		int lines = GameTools.checkBetLines();
		if (lines == 0)
		{
			JOptionPane.showMessageDialog(null, "Please input Correct Amount!");
		}
		else{
		t.setToken(t.getToken()-bet);
		GameTools.genRandomNo();
		t.setToken(t.getToken()+GameTools.CalProfit(bet,lines));
		GameData.windows.walletAmount.setText(t.toString());
		if (GameTools.accountBalanceSuffient(t.getToken())==false){
			JOptionPane.showMessageDialog(null, "You do not have sufficient amount to play, Games Over, Thank you!");
			System.exit(1);
				}
			}
		}
	}
}
