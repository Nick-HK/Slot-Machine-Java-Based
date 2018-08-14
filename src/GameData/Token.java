package GameData;

public class Token {
	private double token;
	
	public Token (int token)
	{
		this.token = token;
	}
	public void rechargeToken (int amount)
	{
		token += amount;
	}
	public double getToken() {
		return token;
	}
	public void setToken(double d) {
		this.token = d;
	}
	@Override
	public String toString()
	{
		int i = (int) token;
		return Integer.toString(i);
	}
}
