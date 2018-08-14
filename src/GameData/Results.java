package GameData;

import javax.swing.ImageIcon;

import Fruits.Fruits;
import GameTheoryAndMain.ImagesSetting;
//Class store Each itmes results
public class Results {
	private int id;
	private ImageIcon image;
	private int resultsToFruits;
	private String lableid;
	private Fruits fruits;

	public Results (int id)
	{
		this.id = id;
		this.image = null;
		this.resultsToFruits = 0;
		this.lableid = "icon" + id;
		this.fruits = null;
	}
	
	public Fruits getFruits() {
		return fruits;
	}

	public void setFruits(Fruits fruits) {
		this.fruits = fruits;
	}

	public String getLableid() {
		return lableid;
	}

	public void setLableid(String lableid) {
		this.lableid = lableid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
		ImagesSetting.changeLabelIcon(this.lableid,this.image);
	}

	public int getResultsToFruits() {
		return resultsToFruits;
	}
	
	public void setResultsToFruits(int resultsToFruits) {
		this.resultsToFruits = resultsToFruits;
		this.fruits = GameData.FList.get(resultsToFruits);
	}
	
	public void genResults()
	{
		setImage(fruits.getImage());
		ImagesSetting.changeLabelIcon(this.lableid,this.image);
	}
	
}
