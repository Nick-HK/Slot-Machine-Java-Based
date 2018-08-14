package GameData;

public class OddsCal {
	 double odds;
	 double payout;
	 String line;
	public OddsCal() {
		this.odds = 0;
		this.payout = 0;
		this.line = null;
	}
	


	public double calPayout(int multiples , int bet)
	{
		//If hitted 3 --> Get odds times bet
		if (multiples==3)
		{
			this.payout = odds * bet;
		}
		//If hitted 4 --> Get odds times bet times 5
		else if (multiples == 4)
		{
			this.payout = odds * bet * 5;
		}
		//If hitted 4 --> Get odds times bet times 6
		else if (multiples == 5)
		{
			this.payout = odds * bet * 10;
		}
		else
		{
			this.payout = 0;
		}
		return payout;
	}
	
	public double getPayout() {
		return payout;
	}
	
	public void setPayout(double payout) {
		this.payout = payout;
	}
	
	public double getOdds() {
		return odds;
	}

	public void setOdds(double odds) {
		this.odds = odds;
	}
	
	public void setLine (String line){
		this.line = line;
	}
	public String getLine (){
		return line;
	}
}
