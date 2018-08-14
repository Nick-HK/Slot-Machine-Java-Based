package GameTheoryAndMain;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.ImageIcon;

public class ImagesSetting {
	
	public static ImageIcon setInitailImage()
	{
	ImageIcon ImageIcon =null;
	try {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 5 + 1);
		String path = "../images/Running"+Integer.toString(randomNum)+".gif";
	java.net.URL imgURL = ImagesSetting.class.getResource(path);
	ImageIcon = new ImageIcon(imgURL);
	}catch (Exception e) {
		e.printStackTrace();
	}
	return ImageIcon;
	}
	
	public static ImageIcon setInfoImage()
	{
	ImageIcon ImageIcon =null;
	try {
	java.net.URL imgURL = ImagesSetting.class.getResource("../images/infoImage.jpg");
	ImageIcon = new ImageIcon(imgURL);
	}catch (Exception e) {
		e.printStackTrace();
	}
	return ImageIcon;
	}
	
	
	public static void changeLabelIcon(String s , ImageIcon image)
	{
		if (s.equals("icon0"))
		{
			UI.icon0.setIcon(image);
		}
		else if (s.equals("icon1"))
		{
			UI.icon1.setIcon(image);
		}
		else if (s.equals("icon2"))
		{
			UI.icon2.setIcon(image);
		}
		else if (s.equals("icon3"))
		{
			UI.icon3.setIcon(image);
		}
		else if (s.equals("icon4"))
		{
			UI.icon4.setIcon(image);
		}
		else if (s.equals("icon5"))
		{
			UI.icon5.setIcon(image);
		}
		else if (s.equals("icon6"))
		{
			UI.icon6.setIcon(image);
		}
		else if (s.equals("icon7"))
		{
			UI.icon7.setIcon(image);
		}
		else if (s.equals("icon8"))
		{
			UI.icon8.setIcon(image);
		}
		else if (s.equals("icon9"))
		{
			UI.icon9.setIcon(image);
		}
		else if (s.equals("icon10"))
		{
			UI.icon10.setIcon(image);
		}
		else if (s.equals("icon11"))
		{
			UI.icon11.setIcon(image);
		}
		else if (s.equals("icon12"))
		{
			UI.icon12.setIcon(image);
		}
		else if (s.equals("icon13"))
		{
			UI.icon13.setIcon(image);
		}
		else if (s.equals("icon14"))
		{
			UI.icon14.setIcon(image);
		}
	}
}
