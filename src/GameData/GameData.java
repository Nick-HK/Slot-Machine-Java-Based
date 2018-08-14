package GameData;

import java.util.ArrayList;

import Fruits.Fruits;
import GameTheoryAndMain.UI;

public class GameData {
	//UI
	public static UI windows;
	//Games
	public static Games games;
	//Results
	public static ArrayList<Results> RList = new ArrayList<Results>();
	public static ArrayList<Fruits> FList = new ArrayList<Fruits>();
	
	//Preseted Reel Roll
	public static int[] col0 = {1,4,2,3,5,0,4,1,0,5,2,0,6,4,0,1,0,6,3,0,5,1,2,3,0,3,5,6,1,0,1,3};
	public static int[] col1 = {6,0,3,1,2,5,2,3,1,5,2,1,4,5,4,2,0,1,2,3,1,5,4};
	public static int[] col2 = {1,0,2,5,0,4,1,2,0,3,4,1,6,3,0,5,2,3,1,0,2,1,0,3};
	public static int[] col3 = {0,2,3,0,2,1,5,2,4,0,3,1,3,0,5,4,1,0,5,1,3,2,4,0,3,2,1,4,0,1,0,4,1};
	public static int[] col4 = {2,0,1,3,6,0,1,2,1,0,2,1,0,4,5,4,2,0,1,3,1,5,0,4};

	public static OddsCal payout = null;
}
