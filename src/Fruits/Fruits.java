package Fruits;
//Common class for all Types
import javax.swing.ImageIcon;

public class Fruits {
	private String name;
	private ImageIcon image;
	private double odd;
	
	public Fruits (String name, double odd, ImageIcon image)
	{
		this.name = name;
		this.odd = odd;
		this.setImage(image);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOdd(double odd) {
		this.odd = odd;
	}
	
	public double getOdd()
	{
		return odd;
	}

	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
	}
}
