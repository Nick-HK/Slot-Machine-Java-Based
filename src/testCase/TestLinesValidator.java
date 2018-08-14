package testCase;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import GameData.GameData;
import GameData.OddsCal;
import GameData.Results;
import GameTheoryAndMain.GameTools;
import GameTheoryAndMain.LinesValidator;

import java.util.ArrayList;

public class TestLinesValidator {
	/*
	 * Part 1: Test method "oneLine". It will mainly check the elements in line 1,
	 * which are 5, 6, 7, 8, 9
	 */

	// check 5 elements are same in line 1
	@Test
	public void testOneLine_5_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(0); // 1st element of line 1
		R.get(6).setResultsToFruits(0); // 2nd element of line 1
		R.get(7).setResultsToFruits(0); // 3rd element of line 1
		R.get(8).setResultsToFruits(0); // 4th element of line 1
		R.get(9).setResultsToFruits(0); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testOneLine_5_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(1);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(3); // 1st element of line 1
		R.get(6).setResultsToFruits(3); // 2nd element of line 1
		R.get(7).setResultsToFruits(3); // 3rd element of line 1
		R.get(8).setResultsToFruits(3); // 4th element of line 1
		R.get(9).setResultsToFruits(3); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(5);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(2);
		R.get(14).setResultsToFruits(1);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testOneLine_5_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(2);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6); // 1st element of line 1
		R.get(6).setResultsToFruits(6); // 2nd element of line 1
		R.get(7).setResultsToFruits(6); // 3rd element of line 1
		R.get(8).setResultsToFruits(6); // 4th element of line 1
		R.get(9).setResultsToFruits(6); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(4);
		R.get(12).setResultsToFruits(5);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	// check only 4 elements are same in line 1
	@Test
	public void testOneLine_4_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(2); // 1st element of line 1
		R.get(6).setResultsToFruits(1); // 2nd element of line 1
		R.get(7).setResultsToFruits(1); // 3rd element of line 1
		R.get(8).setResultsToFruits(1); // 4th element of line 1
		R.get(9).setResultsToFruits(1); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testOneLine_4_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(1);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(3); // 1st element of line 1
		R.get(6).setResultsToFruits(0); // 2nd element of line 1
		R.get(7).setResultsToFruits(3); // 3rd element of line 1
		R.get(8).setResultsToFruits(3); // 4th element of line 1
		R.get(9).setResultsToFruits(3); // 5th element of line 1
		R.get(10).setResultsToFruits(6);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(3);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testOneLine_4_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(1);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(5); // 1st element of line 1
		R.get(6).setResultsToFruits(5); // 2nd element of line 1
		R.get(7).setResultsToFruits(2); // 3rd element of line 1
		R.get(8).setResultsToFruits(5); // 4th element of line 1
		R.get(9).setResultsToFruits(5); // 5th element of line 1
		R.get(10).setResultsToFruits(6);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(3);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testOneLine_4_04() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(1);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(0); // 1st element of line 1
		R.get(6).setResultsToFruits(0); // 2nd element of line 1
		R.get(7).setResultsToFruits(0); // 3rd element of line 1
		R.get(8).setResultsToFruits(6); // 4th element of line 1
		R.get(9).setResultsToFruits(0); // 5th element of line 1
		R.get(10).setResultsToFruits(6);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(3);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testOneLine_4_05() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(1);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(4); // 1st element of line 1
		R.get(6).setResultsToFruits(4); // 2nd element of line 1
		R.get(7).setResultsToFruits(4); // 3rd element of line 1
		R.get(8).setResultsToFruits(4); // 4th element of line 1
		R.get(9).setResultsToFruits(1); // 5th element of line 1
		R.get(10).setResultsToFruits(6);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(3);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	// check only 3 elements are same in line 1
	@Test
	public void testOneLine_3_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(1); // 1st element of line 1
		R.get(6).setResultsToFruits(1); // 2nd element of line 1
		R.get(7).setResultsToFruits(1); // 3rd element of line 1
		R.get(8).setResultsToFruits(2); // 4th element of line 1
		R.get(9).setResultsToFruits(3); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testOneLine_3_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(5); // 1st element of line 1
		R.get(6).setResultsToFruits(5); // 2nd element of line 1
		R.get(7).setResultsToFruits(3); // 3rd element of line 1
		R.get(8).setResultsToFruits(5); // 4th element of line 1
		R.get(9).setResultsToFruits(3); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testOneLine_3_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(2); // 1st element of line 1
		R.get(6).setResultsToFruits(2); // 2nd element of line 1
		R.get(7).setResultsToFruits(1); // 3rd element of line 1
		R.get(8).setResultsToFruits(5); // 4th element of line 1
		R.get(9).setResultsToFruits(2); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testOneLine_3_04() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(6); // 1st element of line 1
		R.get(6).setResultsToFruits(2); // 2nd element of line 1
		R.get(7).setResultsToFruits(6); // 3rd element of line 1
		R.get(8).setResultsToFruits(6); // 4th element of line 1
		R.get(9).setResultsToFruits(0); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testOneLine_3_05() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(1); // 1st element of line 1
		R.get(6).setResultsToFruits(3); // 2nd element of line 1
		R.get(7).setResultsToFruits(1); // 3rd element of line 1
		R.get(8).setResultsToFruits(2); // 4th element of line 1
		R.get(9).setResultsToFruits(1); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testOneLine_3_06() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(4); // 1st element of line 1
		R.get(6).setResultsToFruits(5); // 2nd element of line 1
		R.get(7).setResultsToFruits(6); // 3rd element of line 1
		R.get(8).setResultsToFruits(4); // 4th element of line 1
		R.get(9).setResultsToFruits(4); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testOneLine_3_07() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(2); // 1st element of line 1
		R.get(6).setResultsToFruits(1); // 2nd element of line 1
		R.get(7).setResultsToFruits(1); // 3rd element of line 1
		R.get(8).setResultsToFruits(1); // 4th element of line 1
		R.get(9).setResultsToFruits(3); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testOneLine_3_08() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(4); // 1st element of line 1
		R.get(6).setResultsToFruits(6); // 2nd element of line 1
		R.get(7).setResultsToFruits(6); // 3rd element of line 1
		R.get(8).setResultsToFruits(2); // 4th element of line 1
		R.get(9).setResultsToFruits(6); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testOneLine_3_09() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(1); // 1st element of line 1
		R.get(6).setResultsToFruits(2); // 2nd element of line 1
		R.get(7).setResultsToFruits(3); // 3rd element of line 1
		R.get(8).setResultsToFruits(2); // 4th element of line 1
		R.get(9).setResultsToFruits(2); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testOneLine_3_10() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(2); // 1st element of line 1
		R.get(6).setResultsToFruits(3); // 2nd element of line 1
		R.get(7).setResultsToFruits(5); // 3rd element of line 1
		R.get(8).setResultsToFruits(5); // 4th element of line 1
		R.get(9).setResultsToFruits(5); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(true, result);
	}

	// check only 2 elements are same in line 1
	@Test
	public void testOneLine_2_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(1); // 1st element of line 1
		R.get(6).setResultsToFruits(1); // 2nd element of line 1
		R.get(7).setResultsToFruits(0); // 3rd element of line 1
		R.get(8).setResultsToFruits(2); // 4th element of line 1
		R.get(9).setResultsToFruits(3); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testOneLine_2_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(3); // 1st element of line 1
		R.get(6).setResultsToFruits(1); // 2nd element of line 1
		R.get(7).setResultsToFruits(3); // 3rd element of line 1
		R.get(8).setResultsToFruits(4); // 4th element of line 1
		R.get(9).setResultsToFruits(2); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testOneLine_2_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(4); // 1st element of line 1
		R.get(6).setResultsToFruits(1); // 2nd element of line 1
		R.get(7).setResultsToFruits(2); // 3rd element of line 1
		R.get(8).setResultsToFruits(4); // 4th element of line 1
		R.get(9).setResultsToFruits(3); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testOneLine_2_04() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(6); // 1st element of line 1
		R.get(6).setResultsToFruits(1); // 2nd element of line 1
		R.get(7).setResultsToFruits(2); // 3rd element of line 1
		R.get(8).setResultsToFruits(4); // 4th element of line 1
		R.get(9).setResultsToFruits(6); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testOneLine_2_05() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(6); // 1st element of line 1
		R.get(6).setResultsToFruits(3); // 2nd element of line 1
		R.get(7).setResultsToFruits(3); // 3rd element of line 1
		R.get(8).setResultsToFruits(4); // 4th element of line 1
		R.get(9).setResultsToFruits(1); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testOneLine_2_06() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(2); // 1st element of line 1
		R.get(6).setResultsToFruits(5); // 2nd element of line 1
		R.get(7).setResultsToFruits(3); // 3rd element of line 1
		R.get(8).setResultsToFruits(5); // 4th element of line 1
		R.get(9).setResultsToFruits(1); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testOneLine_2_07() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(2); // 1st element of line 1
		R.get(6).setResultsToFruits(4); // 2nd element of line 1
		R.get(7).setResultsToFruits(3); // 3rd element of line 1
		R.get(8).setResultsToFruits(0); // 4th element of line 1
		R.get(9).setResultsToFruits(4); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testOneLine_2_08() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(2); // 1st element of line 1
		R.get(6).setResultsToFruits(4); // 2nd element of line 1
		R.get(7).setResultsToFruits(3); // 3rd element of line 1
		R.get(8).setResultsToFruits(1); // 4th element of line 1
		R.get(9).setResultsToFruits(1); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testOneLine_2_09() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(6); // 1st element of line 1
		R.get(6).setResultsToFruits(2); // 2nd element of line 1
		R.get(7).setResultsToFruits(3); // 3rd element of line 1
		R.get(8).setResultsToFruits(5); // 4th element of line 1
		R.get(9).setResultsToFruits(3); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testOneLine_2_10() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(1); // 1st element of line 1
		R.get(6).setResultsToFruits(4); // 2nd element of line 1
		R.get(7).setResultsToFruits(2); // 3rd element of line 1
		R.get(8).setResultsToFruits(0); // 4th element of line 1
		R.get(9).setResultsToFruits(0); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	// check no elements are same in line 1
	@Test
	public void testOneLine_0_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(1); // 1st element of line 1
		R.get(6).setResultsToFruits(2); // 2nd element of line 1
		R.get(7).setResultsToFruits(0); // 3rd element of line 1
		R.get(8).setResultsToFruits(4); // 4th element of line 1
		R.get(9).setResultsToFruits(3); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testOneLine_0_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(5); // 1st element of line 1
		R.get(6).setResultsToFruits(2); // 2nd element of line 1
		R.get(7).setResultsToFruits(3); // 3rd element of line 1
		R.get(8).setResultsToFruits(4); // 4th element of line 1
		R.get(9).setResultsToFruits(6); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testOneLine_0_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(6); // 1st element of line 1
		R.get(6).setResultsToFruits(3); // 2nd element of line 1
		R.get(7).setResultsToFruits(1); // 3rd element of line 1
		R.get(8).setResultsToFruits(5); // 4th element of line 1
		R.get(9).setResultsToFruits(4); // 5th element of line 1
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	/*
	 * Part 2: Create stub class and Test line 2. It will mainly check the elements
	 * in line 2, which are 0, 1, 2, 3, 4
	 */

	public static class StubLineValidator2 extends LinesValidator {
		public static boolean lineTwo(ArrayList<Results> R, int bet) {
			GameData.payout = new OddsCal();
			double currentPayout = 0;
			double linePayout = 0;
			boolean flag = false;
			// Line 2 : 0,1,2,3,4
			linePayout = lineCal(R, bet, 0, 1, 2, 3, 4);
			if (linePayout > currentPayout) {
				currentPayout = linePayout;
				GameData.payout.setPayout(currentPayout);
				GameData.payout.setLine("Line 2");
				flag = true;

			}
			return flag;
		}
	}

	// check 5 elements are same in line 2
	@Test
	public void testLineTwo_5_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1); // 1st element of line 2
		R.get(1).setResultsToFruits(1); // 2nd element of line 2
		R.get(2).setResultsToFruits(1); // 3rd element of line 2
		R.get(3).setResultsToFruits(1); // 4th element of line 2
		R.get(4).setResultsToFruits(1); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineTwo_5_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(5); // 1st element of line 2
		R.get(1).setResultsToFruits(5); // 2nd element of line 2
		R.get(2).setResultsToFruits(5); // 3rd element of line 2
		R.get(3).setResultsToFruits(5); // 4th element of line 2
		R.get(4).setResultsToFruits(5); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineTwo_5_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 2
		R.get(1).setResultsToFruits(0); // 2nd element of line 2
		R.get(2).setResultsToFruits(0); // 3rd element of line 2
		R.get(3).setResultsToFruits(0); // 4th element of line 2
		R.get(4).setResultsToFruits(0); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	// check only 4 elements are same in line 2
	@Test
	public void testLineTwo_4_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(2); // 1st element of line 2
		R.get(1).setResultsToFruits(0); // 2nd element of line 2
		R.get(2).setResultsToFruits(0); // 3rd element of line 2
		R.get(3).setResultsToFruits(0); // 4th element of line 2
		R.get(4).setResultsToFruits(0); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineTwo_4_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1); // 1st element of line 2
		R.get(1).setResultsToFruits(5); // 2nd element of line 2
		R.get(2).setResultsToFruits(1); // 3rd element of line 2
		R.get(3).setResultsToFruits(1); // 4th element of line 2
		R.get(4).setResultsToFruits(1); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineTwo_4_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3); // 1st element of line 2
		R.get(1).setResultsToFruits(3); // 2nd element of line 2
		R.get(2).setResultsToFruits(0); // 3rd element of line 2
		R.get(3).setResultsToFruits(3); // 4th element of line 2
		R.get(4).setResultsToFruits(3); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineTwo_4_04() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 2
		R.get(1).setResultsToFruits(6); // 2nd element of line 2
		R.get(2).setResultsToFruits(6); // 3rd element of line 2
		R.get(3).setResultsToFruits(2); // 4th element of line 2
		R.get(4).setResultsToFruits(6); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineTwo_4_05() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 2
		R.get(1).setResultsToFruits(0); // 2nd element of line 2
		R.get(2).setResultsToFruits(0); // 3rd element of line 2
		R.get(3).setResultsToFruits(0); // 4th element of line 2
		R.get(4).setResultsToFruits(3); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	// check only 3 elements are same in line 2
	@Test
	public void testLineTwo_3_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(2); // 1st element of line 2
		R.get(1).setResultsToFruits(2); // 2nd element of line 2
		R.get(2).setResultsToFruits(2); // 3rd element of line 2
		R.get(3).setResultsToFruits(4); // 4th element of line 2
		R.get(4).setResultsToFruits(5); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineTwo_3_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1); // 1st element of line 2
		R.get(1).setResultsToFruits(1); // 2nd element of line 2
		R.get(2).setResultsToFruits(6); // 3rd element of line 2
		R.get(3).setResultsToFruits(1); // 4th element of line 2
		R.get(4).setResultsToFruits(5); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineTwo_3_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3); // 1st element of line 2
		R.get(1).setResultsToFruits(3); // 2nd element of line 2
		R.get(2).setResultsToFruits(6); // 3rd element of line 2
		R.get(3).setResultsToFruits(0); // 4th element of line 2
		R.get(4).setResultsToFruits(3); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineTwo_3_04() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3); // 1st element of line 2
		R.get(1).setResultsToFruits(0); // 2nd element of line 2
		R.get(2).setResultsToFruits(3); // 3rd element of line 2
		R.get(3).setResultsToFruits(3); // 4th element of line 2
		R.get(4).setResultsToFruits(1); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineTwo_3_05() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(2); // 1st element of line 2
		R.get(1).setResultsToFruits(4); // 2nd element of line 2
		R.get(2).setResultsToFruits(2); // 3rd element of line 2
		R.get(3).setResultsToFruits(6); // 4th element of line 2
		R.get(4).setResultsToFruits(2); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineTwo_3_06() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 2
		R.get(1).setResultsToFruits(0); // 2nd element of line 2
		R.get(2).setResultsToFruits(5); // 3rd element of line 2
		R.get(3).setResultsToFruits(6); // 4th element of line 2
		R.get(4).setResultsToFruits(6); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineTwo_3_07() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1); // 1st element of line 2
		R.get(1).setResultsToFruits(2); // 2nd element of line 2
		R.get(2).setResultsToFruits(2); // 3rd element of line 2
		R.get(3).setResultsToFruits(2); // 4th element of line 2
		R.get(4).setResultsToFruits(4); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineTwo_3_08() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1); // 1st element of line 2
		R.get(1).setResultsToFruits(2); // 2nd element of line 2
		R.get(2).setResultsToFruits(2); // 3rd element of line 2
		R.get(3).setResultsToFruits(3); // 4th element of line 2
		R.get(4).setResultsToFruits(2); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineTwo_3_09() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1); // 1st element of line 2
		R.get(1).setResultsToFruits(5); // 2nd element of line 2
		R.get(2).setResultsToFruits(2); // 3rd element of line 2
		R.get(3).setResultsToFruits(5); // 4th element of line 2
		R.get(4).setResultsToFruits(5); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineTwo_3_10() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1); // 1st element of line 2
		R.get(1).setResultsToFruits(5); // 2nd element of line 2
		R.get(2).setResultsToFruits(0); // 3rd element of line 2
		R.get(3).setResultsToFruits(0); // 4th element of line 2
		R.get(4).setResultsToFruits(0); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = StubLineValidator2.lineTwo(R, bet);
		assertEquals(true, result);
	}

	// check only 2 elements are same in line 2
	@Test
	public void testLineTwo_2_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1); // 1st element of line 2
		R.get(1).setResultsToFruits(1); // 2nd element of line 2
		R.get(2).setResultsToFruits(2); // 3rd element of line 2
		R.get(3).setResultsToFruits(2); // 4th element of line 2
		R.get(4).setResultsToFruits(0); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineTwo_2_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3); // 1st element of line 2
		R.get(1).setResultsToFruits(1); // 2nd element of line 2
		R.get(2).setResultsToFruits(3); // 3rd element of line 2
		R.get(3).setResultsToFruits(2); // 4th element of line 2
		R.get(4).setResultsToFruits(0); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineTwo_2_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(5); // 1st element of line 2
		R.get(1).setResultsToFruits(1); // 2nd element of line 2
		R.get(2).setResultsToFruits(3); // 3rd element of line 2
		R.get(3).setResultsToFruits(5); // 4th element of line 2
		R.get(4).setResultsToFruits(0); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineTwo_2_04() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 2
		R.get(1).setResultsToFruits(1); // 2nd element of line 2
		R.get(2).setResultsToFruits(3); // 3rd element of line 2
		R.get(3).setResultsToFruits(5); // 4th element of line 2
		R.get(4).setResultsToFruits(6); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineTwo_2_05() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 2
		R.get(1).setResultsToFruits(4); // 2nd element of line 2
		R.get(2).setResultsToFruits(4); // 3rd element of line 2
		R.get(3).setResultsToFruits(5); // 4th element of line 2
		R.get(4).setResultsToFruits(1); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineTwo_2_06() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 2
		R.get(1).setResultsToFruits(3); // 2nd element of line 2
		R.get(2).setResultsToFruits(4); // 3rd element of line 2
		R.get(3).setResultsToFruits(3); // 4th element of line 2
		R.get(4).setResultsToFruits(1); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineTwo_2_07() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 2
		R.get(1).setResultsToFruits(2); // 2nd element of line 2
		R.get(2).setResultsToFruits(4); // 3rd element of line 2
		R.get(3).setResultsToFruits(3); // 4th element of line 2
		R.get(4).setResultsToFruits(2); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineTwo_2_08() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 2
		R.get(1).setResultsToFruits(2); // 2nd element of line 2
		R.get(2).setResultsToFruits(5); // 3rd element of line 2
		R.get(3).setResultsToFruits(5); // 4th element of line 2
		R.get(4).setResultsToFruits(2); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineTwo_2_09() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 2
		R.get(1).setResultsToFruits(2); // 2nd element of line 2
		R.get(2).setResultsToFruits(0); // 3rd element of line 2
		R.get(3).setResultsToFruits(5); // 4th element of line 2
		R.get(4).setResultsToFruits(0); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineTwo_2_10() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 2
		R.get(1).setResultsToFruits(2); // 2nd element of line 2
		R.get(2).setResultsToFruits(0); // 3rd element of line 2
		R.get(3).setResultsToFruits(5); // 4th element of line 2
		R.get(4).setResultsToFruits(0); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	// check no elements are same in line 2
	@Test
	public void testLineTwo_0_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1); // 1st element of line 2
		R.get(1).setResultsToFruits(2); // 2nd element of line 2
		R.get(2).setResultsToFruits(0); // 3rd element of line 2
		R.get(3).setResultsToFruits(5); // 4th element of line 2
		R.get(4).setResultsToFruits(4); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineTwo_0_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3); // 1st element of line 2
		R.get(1).setResultsToFruits(0); // 2nd element of line 2
		R.get(2).setResultsToFruits(1); // 3rd element of line 2
		R.get(3).setResultsToFruits(2); // 4th element of line 2
		R.get(4).setResultsToFruits(5); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineTwo_0_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 2
		R.get(1).setResultsToFruits(5); // 2nd element of line 2
		R.get(2).setResultsToFruits(4); // 3rd element of line 2
		R.get(3).setResultsToFruits(3); // 4th element of line 2
		R.get(4).setResultsToFruits(2); // 5th element of line 2
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneLine(R, bet);
		assertEquals(false, result);
	}

	/*
	 * Part 3: Create stub class and Test line 3. It will mainly check the elements
	 * in line 3, which are 10, 11, 12, 13, 14
	 */

	public static class StubLineValidator3 extends LinesValidator {
		public static boolean lineThree(ArrayList<Results> R, int bet) {
			GameData.payout = new OddsCal();
			double currentPayout = 0;
			double linePayout = 0;
			boolean flag = false;
			// Line 3: 10, 11, 12, 13, 14
			linePayout = lineCal(R, bet, 10, 11, 12, 13, 14);
			if (linePayout > currentPayout) {
				currentPayout = linePayout;
				GameData.payout.setPayout(currentPayout);
				GameData.payout.setLine("Line 3");
				flag = true;

			}
			return flag;
		}
	}

	// check 5 elements are same in line 3
	@Test
	public void testLineThree_5_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0); // 1st element of line 3
		R.get(11).setResultsToFruits(0); // 2nd element of line 3
		R.get(12).setResultsToFruits(0); // 3rd element of line 3
		R.get(13).setResultsToFruits(0); // 4th element of line 3
		R.get(14).setResultsToFruits(0); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineThree_5_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2); // 1st element of line 3
		R.get(11).setResultsToFruits(2); // 2nd element of line 3
		R.get(12).setResultsToFruits(2); // 3rd element of line 3
		R.get(13).setResultsToFruits(2); // 4th element of line 3
		R.get(14).setResultsToFruits(2); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineThree_5_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(5); // 1st element of line 3
		R.get(11).setResultsToFruits(5); // 2nd element of line 3
		R.get(12).setResultsToFruits(5); // 3rd element of line 3
		R.get(13).setResultsToFruits(5); // 4th element of line 3
		R.get(14).setResultsToFruits(5); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	// check only 4 elements are same in line 3
	@Test
	public void testLineThree_4_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 3
		R.get(11).setResultsToFruits(4); // 2nd element of line 3
		R.get(12).setResultsToFruits(4); // 3rd element of line 3
		R.get(13).setResultsToFruits(4); // 4th element of line 3
		R.get(14).setResultsToFruits(4); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineThree_4_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2); // 1st element of line 3
		R.get(11).setResultsToFruits(3); // 2nd element of line 3
		R.get(12).setResultsToFruits(3); // 3rd element of line 3
		R.get(13).setResultsToFruits(3); // 4th element of line 3
		R.get(14).setResultsToFruits(3); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineThree_4_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 3
		R.get(11).setResultsToFruits(1); // 2nd element of line 3
		R.get(12).setResultsToFruits(4); // 3rd element of line 3
		R.get(13).setResultsToFruits(1); // 4th element of line 3
		R.get(14).setResultsToFruits(1); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineThree_4_04() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(5); // 1st element of line 3
		R.get(11).setResultsToFruits(5); // 2nd element of line 3
		R.get(12).setResultsToFruits(5); // 3rd element of line 3
		R.get(13).setResultsToFruits(0); // 4th element of line 3
		R.get(14).setResultsToFruits(5); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineThree_4_05() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0); // 1st element of line 3
		R.get(11).setResultsToFruits(0); // 2nd element of line 3
		R.get(12).setResultsToFruits(0); // 3rd element of line 3
		R.get(13).setResultsToFruits(0); // 4th element of line 3
		R.get(14).setResultsToFruits(6); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	// check only 3 elements are same in line 3
	@Test
	public void testLineThree_3_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0); // 1st element of line 3
		R.get(11).setResultsToFruits(0); // 2nd element of line 3
		R.get(12).setResultsToFruits(0); // 3rd element of line 3
		R.get(13).setResultsToFruits(6); // 4th element of line 3
		R.get(14).setResultsToFruits(6); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineThree_3_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 3
		R.get(11).setResultsToFruits(1); // 2nd element of line 3
		R.get(12).setResultsToFruits(4); // 3rd element of line 3
		R.get(13).setResultsToFruits(1); // 4th element of line 3
		R.get(14).setResultsToFruits(4); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineThree_3_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(5); // 1st element of line 3
		R.get(11).setResultsToFruits(5); // 2nd element of line 3
		R.get(12).setResultsToFruits(4); // 3rd element of line 3
		R.get(13).setResultsToFruits(1); // 4th element of line 3
		R.get(14).setResultsToFruits(5); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineThree_3_04() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(6); // 1st element of line 3
		R.get(11).setResultsToFruits(5); // 2nd element of line 3
		R.get(12).setResultsToFruits(6); // 3rd element of line 3
		R.get(13).setResultsToFruits(6); // 4th element of line 3
		R.get(14).setResultsToFruits(5); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineThree_3_05() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2); // 1st element of line 3
		R.get(11).setResultsToFruits(5); // 2nd element of line 3
		R.get(12).setResultsToFruits(2); // 3rd element of line 3
		R.get(13).setResultsToFruits(6); // 4th element of line 3
		R.get(14).setResultsToFruits(2); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineThree_3_06() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(4); // 1st element of line 3
		R.get(11).setResultsToFruits(5); // 2nd element of line 3
		R.get(12).setResultsToFruits(2); // 3rd element of line 3
		R.get(13).setResultsToFruits(4); // 4th element of line 3
		R.get(14).setResultsToFruits(4); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineThree_3_07() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(4); // 1st element of line 3
		R.get(11).setResultsToFruits(0); // 2nd element of line 3
		R.get(12).setResultsToFruits(0); // 3rd element of line 3
		R.get(13).setResultsToFruits(0); // 4th element of line 3
		R.get(14).setResultsToFruits(1); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineThree_3_08() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(4); // 1st element of line 3
		R.get(11).setResultsToFruits(3); // 2nd element of line 3
		R.get(12).setResultsToFruits(3); // 3rd element of line 3
		R.get(13).setResultsToFruits(0); // 4th element of line 3
		R.get(14).setResultsToFruits(3); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineThree_3_09() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(4); // 1st element of line 3
		R.get(11).setResultsToFruits(1); // 2nd element of line 3
		R.get(12).setResultsToFruits(3); // 3rd element of line 3
		R.get(13).setResultsToFruits(1); // 4th element of line 3
		R.get(14).setResultsToFruits(1); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineThree_3_10() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(4); // 1st element of line 3
		R.get(11).setResultsToFruits(1); // 2nd element of line 3
		R.get(12).setResultsToFruits(2); // 3rd element of line 3
		R.get(13).setResultsToFruits(2); // 4th element of line 3
		R.get(14).setResultsToFruits(2); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(true, result);
	}

	// check only 2 elements are same in line 3
	@Test
	public void testLineThree_2_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(4); // 1st element of line 3
		R.get(11).setResultsToFruits(4); // 2nd element of line 3
		R.get(12).setResultsToFruits(3); // 3rd element of line 3
		R.get(13).setResultsToFruits(1); // 4th element of line 3
		R.get(14).setResultsToFruits(2); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineThree_2_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(6); // 1st element of line 3
		R.get(11).setResultsToFruits(4); // 2nd element of line 3
		R.get(12).setResultsToFruits(6); // 3rd element of line 3
		R.get(13).setResultsToFruits(1); // 4th element of line 3
		R.get(14).setResultsToFruits(2); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineThree_2_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0); // 1st element of line 3
		R.get(11).setResultsToFruits(4); // 2nd element of line 3
		R.get(12).setResultsToFruits(6); // 3rd element of line 3
		R.get(13).setResultsToFruits(0); // 4th element of line 3
		R.get(14).setResultsToFruits(2); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineThree_2_04() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 3
		R.get(11).setResultsToFruits(4); // 2nd element of line 3
		R.get(12).setResultsToFruits(6); // 3rd element of line 3
		R.get(13).setResultsToFruits(0); // 4th element of line 3
		R.get(14).setResultsToFruits(1); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineThree_2_05() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 3
		R.get(11).setResultsToFruits(3); // 2nd element of line 3
		R.get(12).setResultsToFruits(3); // 3rd element of line 3
		R.get(13).setResultsToFruits(0); // 4th element of line 3
		R.get(14).setResultsToFruits(2); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineThree_2_06() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 3
		R.get(11).setResultsToFruits(5); // 2nd element of line 3
		R.get(12).setResultsToFruits(3); // 3rd element of line 3
		R.get(13).setResultsToFruits(5); // 4th element of line 3
		R.get(14).setResultsToFruits(2); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineThree_2_07() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 3
		R.get(11).setResultsToFruits(4); // 2nd element of line 3
		R.get(12).setResultsToFruits(3); // 3rd element of line 3
		R.get(13).setResultsToFruits(5); // 4th element of line 3
		R.get(14).setResultsToFruits(4); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineThree_2_08() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 3
		R.get(11).setResultsToFruits(4); // 2nd element of line 3
		R.get(12).setResultsToFruits(6); // 3rd element of line 3
		R.get(13).setResultsToFruits(6); // 4th element of line 3
		R.get(14).setResultsToFruits(0); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineThree_2_09() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 3
		R.get(11).setResultsToFruits(4); // 2nd element of line 3
		R.get(12).setResultsToFruits(5); // 3rd element of line 3
		R.get(13).setResultsToFruits(6); // 4th element of line 3
		R.get(14).setResultsToFruits(5); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineThree_2_10() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 3
		R.get(11).setResultsToFruits(4); // 2nd element of line 3
		R.get(12).setResultsToFruits(5); // 3rd element of line 3
		R.get(13).setResultsToFruits(2); // 4th element of line 3
		R.get(14).setResultsToFruits(2); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(false, result);
	}

	// check no elements are same in line 3
	@Test
	public void testLineThree_0_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 3
		R.get(11).setResultsToFruits(6); // 2nd element of line 3
		R.get(12).setResultsToFruits(5); // 3rd element of line 3
		R.get(13).setResultsToFruits(3); // 4th element of line 3
		R.get(14).setResultsToFruits(2); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineThree_0_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0); // 1st element of line 3
		R.get(11).setResultsToFruits(1); // 2nd element of line 3
		R.get(12).setResultsToFruits(2); // 3rd element of line 3
		R.get(13).setResultsToFruits(3); // 4th element of line 3
		R.get(14).setResultsToFruits(4); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineThree_0_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(6); // 1st element of line 3
		R.get(11).setResultsToFruits(5); // 2nd element of line 3
		R.get(12).setResultsToFruits(4); // 3rd element of line 3
		R.get(13).setResultsToFruits(3); // 4th element of line 3
		R.get(14).setResultsToFruits(2); // 5th element of line 3

		int bet = 100;
		boolean result = StubLineValidator3.lineThree(R, bet);
		assertEquals(false, result);
	}

	/*
	 * Part 4: Test the method "oneToThreeline" This will check the return value
	 * with different flag of line 1, 2 and 3
	 */

	// check if all flag of line 1, 2 and 3 are true
	@Test
	public void testOneToThreeLine_1() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 2
		R.get(1).setResultsToFruits(0); // 2nd element of line 2
		R.get(2).setResultsToFruits(0); // 3rd element of line 2
		R.get(3).setResultsToFruits(0); // 4th element of line 2
		R.get(4).setResultsToFruits(0); // 5th element of line 2
		R.get(5).setResultsToFruits(1); // 1st element of line 1
		R.get(6).setResultsToFruits(1); // 2nd element of line 1
		R.get(7).setResultsToFruits(1); // 3rd element of line 1
		R.get(8).setResultsToFruits(1); // 4th element of line 1
		R.get(9).setResultsToFruits(1); // 5th element of line 1
		R.get(10).setResultsToFruits(2); // 1st element of line 3
		R.get(11).setResultsToFruits(2); // 2nd element of line 3
		R.get(12).setResultsToFruits(2); // 3rd element of line 3
		R.get(13).setResultsToFruits(2); // 4th element of line 3
		R.get(14).setResultsToFruits(2); // 5th element of line 3

		int bet = 100;
		boolean result = LinesValidator.oneToThreeline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1 and 2 are true
	@Test
	public void testOneToThreeLine_2() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3); // 1st element of line 2
		R.get(1).setResultsToFruits(3); // 2nd element of line 2
		R.get(2).setResultsToFruits(3); // 3rd element of line 2
		R.get(3).setResultsToFruits(3); // 4th element of line 2
		R.get(4).setResultsToFruits(3); // 5th element of line 2
		R.get(5).setResultsToFruits(4); // 1st element of line 1
		R.get(6).setResultsToFruits(4); // 2nd element of line 1
		R.get(7).setResultsToFruits(4); // 3rd element of line 1
		R.get(8).setResultsToFruits(4); // 4th element of line 1
		R.get(9).setResultsToFruits(4); // 5th element of line 1
		R.get(10).setResultsToFruits(1); // 1st element of line 3
		R.get(11).setResultsToFruits(1); // 2nd element of line 3
		R.get(12).setResultsToFruits(2); // 3rd element of line 3
		R.get(13).setResultsToFruits(2); // 4th element of line 3
		R.get(14).setResultsToFruits(3); // 5th element of line 3

		int bet = 100;
		boolean result = LinesValidator.oneToThreeline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1 and 3 are true
	@Test
	public void testOneToThreeLine_3() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 2
		R.get(1).setResultsToFruits(1); // 2nd element of line 2
		R.get(2).setResultsToFruits(2); // 3rd element of line 2
		R.get(3).setResultsToFruits(3); // 4th element of line 2
		R.get(4).setResultsToFruits(4); // 5th element of line 2
		R.get(5).setResultsToFruits(5); // 1st element of line 1
		R.get(6).setResultsToFruits(5); // 2nd element of line 1
		R.get(7).setResultsToFruits(5); // 3rd element of line 1
		R.get(8).setResultsToFruits(5); // 4th element of line 1
		R.get(9).setResultsToFruits(5); // 5th element of line 1
		R.get(10).setResultsToFruits(6); // 1st element of line 3
		R.get(11).setResultsToFruits(6); // 2nd element of line 3
		R.get(12).setResultsToFruits(6); // 3rd element of line 3
		R.get(13).setResultsToFruits(6); // 4th element of line 3
		R.get(14).setResultsToFruits(6); // 5th element of line 3

		int bet = 100;
		boolean result = LinesValidator.oneToThreeline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 2 and 3 are true
	@Test
	public void testOneToThreeLine_4() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 2
		R.get(1).setResultsToFruits(0); // 2nd element of line 2
		R.get(2).setResultsToFruits(0); // 3rd element of line 2
		R.get(3).setResultsToFruits(1); // 4th element of line 2
		R.get(4).setResultsToFruits(1); // 5th element of line 2
		R.get(5).setResultsToFruits(5); // 1st element of line 1
		R.get(6).setResultsToFruits(4); // 2nd element of line 1
		R.get(7).setResultsToFruits(5); // 3rd element of line 1
		R.get(8).setResultsToFruits(4); // 4th element of line 1
		R.get(9).setResultsToFruits(3); // 5th element of line 1
		R.get(10).setResultsToFruits(2); // 1st element of line 3
		R.get(11).setResultsToFruits(2); // 2nd element of line 3
		R.get(12).setResultsToFruits(2); // 3rd element of line 3
		R.get(13).setResultsToFruits(2); // 4th element of line 3
		R.get(14).setResultsToFruits(2); // 5th element of line 3

		int bet = 100;
		boolean result = LinesValidator.oneToThreeline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1 is true
	@Test
	public void testOneToThreeLine_5() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 2
		R.get(1).setResultsToFruits(6); // 2nd element of line 2
		R.get(2).setResultsToFruits(2); // 3rd element of line 2
		R.get(3).setResultsToFruits(6); // 4th element of line 2
		R.get(4).setResultsToFruits(1); // 5th element of line 2
		R.get(5).setResultsToFruits(2); // 1st element of line 1
		R.get(6).setResultsToFruits(2); // 2nd element of line 1
		R.get(7).setResultsToFruits(2); // 3rd element of line 1
		R.get(8).setResultsToFruits(2); // 4th element of line 1
		R.get(9).setResultsToFruits(2); // 5th element of line 1
		R.get(10).setResultsToFruits(4); // 1st element of line 3
		R.get(11).setResultsToFruits(3); // 2nd element of line 3
		R.get(12).setResultsToFruits(2); // 3rd element of line 3
		R.get(13).setResultsToFruits(1); // 4th element of line 3
		R.get(14).setResultsToFruits(0); // 5th element of line 3

		int bet = 100;
		boolean result = LinesValidator.oneToThreeline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 2 is true
	@Test
	public void testOneToThreeLine_6() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(4); // 1st element of line 2
		R.get(1).setResultsToFruits(4); // 2nd element of line 2
		R.get(2).setResultsToFruits(4); // 3rd element of line 2
		R.get(3).setResultsToFruits(4); // 4th element of line 2
		R.get(4).setResultsToFruits(1); // 5th element of line 2
		R.get(5).setResultsToFruits(2); // 1st element of line 1
		R.get(6).setResultsToFruits(2); // 2nd element of line 1
		R.get(7).setResultsToFruits(3); // 3rd element of line 1
		R.get(8).setResultsToFruits(4); // 4th element of line 1
		R.get(9).setResultsToFruits(5); // 5th element of line 1
		R.get(10).setResultsToFruits(4); // 1st element of line 3
		R.get(11).setResultsToFruits(3); // 2nd element of line 3
		R.get(12).setResultsToFruits(2); // 3rd element of line 3
		R.get(13).setResultsToFruits(1); // 4th element of line 3
		R.get(14).setResultsToFruits(0); // 5th element of line 3

		int bet = 100;
		boolean result = LinesValidator.oneToThreeline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 3 is true
	@Test
	public void testOneToThreeLine_7() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(4); // 1st element of line 2
		R.get(1).setResultsToFruits(5); // 2nd element of line 2
		R.get(2).setResultsToFruits(4); // 3rd element of line 2
		R.get(3).setResultsToFruits(3); // 4th element of line 2
		R.get(4).setResultsToFruits(1); // 5th element of line 2
		R.get(5).setResultsToFruits(2); // 1st element of line 1
		R.get(6).setResultsToFruits(2); // 2nd element of line 1
		R.get(7).setResultsToFruits(3); // 3rd element of line 1
		R.get(8).setResultsToFruits(4); // 4th element of line 1
		R.get(9).setResultsToFruits(5); // 5th element of line 1
		R.get(10).setResultsToFruits(3); // 1st element of line 3
		R.get(11).setResultsToFruits(3); // 2nd element of line 3
		R.get(12).setResultsToFruits(3); // 3rd element of line 3
		R.get(13).setResultsToFruits(3); // 4th element of line 3
		R.get(14).setResultsToFruits(3); // 5th element of line 3

		int bet = 100;
		boolean result = LinesValidator.oneToThreeline(R, bet);
		assertEquals(true, result);
	}

	// check if all flag of line 1, 2, 3 are false
	@Test
	public void testOneToThreeLine_8() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(4); // 1st element of line 2
		R.get(1).setResultsToFruits(5); // 2nd element of line 2
		R.get(2).setResultsToFruits(4); // 3rd element of line 2
		R.get(3).setResultsToFruits(3); // 4th element of line 2
		R.get(4).setResultsToFruits(1); // 5th element of line 2
		R.get(5).setResultsToFruits(2); // 1st element of line 1
		R.get(6).setResultsToFruits(2); // 2nd element of line 1
		R.get(7).setResultsToFruits(3); // 3rd element of line 1
		R.get(8).setResultsToFruits(4); // 4th element of line 1
		R.get(9).setResultsToFruits(5); // 5th element of line 1
		R.get(10).setResultsToFruits(3); // 1st element of line 3
		R.get(11).setResultsToFruits(1); // 2nd element of line 3
		R.get(12).setResultsToFruits(2); // 3rd element of line 3
		R.get(13).setResultsToFruits(5); // 4th element of line 3
		R.get(14).setResultsToFruits(6); // 5th element of line 3

		int bet = 100;
		boolean result = LinesValidator.oneToThreeline(R, bet);
		assertEquals(false, result);
	}

	/*
	 * Part 5: Create stub class and Test line 4. It will mainly check the elements
	 * in line 4, which are 0, 6, 12, 8, 4
	 */

	public static class StubLineValidator4 extends LinesValidator {
		public static boolean lineFour(ArrayList<Results> R, int bet) {
			GameData.payout = new OddsCal();
			double currentPayout = 0;
			double linePayout = 0;
			boolean flag = false;
			// Line 4: 0, 6, 12, 8, 4
			linePayout = lineCal(R, bet, 0, 6, 12, 8, 4);
			if (linePayout > currentPayout) {
				currentPayout = linePayout;
				GameData.payout.setPayout(currentPayout);
				GameData.payout.setLine("Line 4");
				flag = true;

			}
			return flag;
		}
	}

	// check 5 elements are same in line 4
	@Test
	public void testLineFour_5_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(1); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(1); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFour_5_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(0); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(0); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(0); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(0); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFour_5_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(4); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(4); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(4); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	// check only 4 elements are same in line 4
	@Test
	public void testLineFour_4_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(4); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(6); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(6); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(6); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(6); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFour_4_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(4); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(2); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(4); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(4); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFour_4_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(5); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(5); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(4); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(5); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFour_4_04() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(0); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(0); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(0); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFour_4_05() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(6); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(6); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(6); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(0); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	// check only 3 elements are same in line 4
	@Test
	public void testLineFour_3_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(6); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(6); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(2); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(0); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFour_3_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(4); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(6); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(0); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFour_3_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(2); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(2); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(6); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(2); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFour_3_04() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(5); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(2); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(5); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFour_3_05() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(5); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(2); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(5); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(0); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(5); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFour_3_06() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(2); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(5); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(6); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(6); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFour_3_07() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(3); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(4); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(4); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFour_3_08() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(2); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(2); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(2); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFour_3_09() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(1); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(1); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(5); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFour_3_10() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(2); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(1); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(2); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(2); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(true, result);
	}

	// check only 2 elements are same in line 4
	@Test
	public void testLineFour_2_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(6); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(1); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(2); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(3); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFour_2_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(0); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(6); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(2); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(3); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFour_2_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(5); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(0); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(6); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(3); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFour_2_04() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(2); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(6); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(0); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFour_2_05() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(4); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(0); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFour_2_06() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(5); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(0); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFour_2_07() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(3); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(5); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(3); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFour_2_08() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(3); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(6); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(6); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(3); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFour_2_09() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(3); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(5); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(6); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(5); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFour_2_10() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(3); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(5); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(1); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(false, result);
	}

	// check no elements are same in line 4
	@Test
	public void testLineFour_0_1() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(2); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(3); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(4); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFour_0_2() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(5); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(4); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(3); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(2); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFour_0_3() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(2); // 1st element of line 4
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4); // 5th element of line 4
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(6); // 2nd element of line 4
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(8); // 4th element of line 4
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(0); // 3rd element of line 4
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = StubLineValidator4.lineFour(R, bet);
		assertEquals(false, result);
	}

	/*
	 * Part 6: Create stub class and Test line 5. It will mainly check the elements
	 * in line 5, which are 10, 6, 2, 8, 14
	 */

	public static class StubLineValidator5 extends LinesValidator {
		public static boolean lineFive(ArrayList<Results> R, int bet) {
			GameData.payout = new OddsCal();
			double currentPayout = 0;
			double linePayout = 0;
			boolean flag = false;
			// Line 5: 10, 6, 2, 8, 14
			linePayout = lineCal(R, bet, 10, 6, 2, 8, 14);
			if (linePayout > currentPayout) {
				currentPayout = linePayout;
				GameData.payout.setPayout(currentPayout);
				GameData.payout.setLine("Line 5");
				flag = true;
			}
			return flag;
		}
	}

	// check 5 elements are same in line 4
	@Test
	public void testLineFive_5_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(1); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(1); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(1); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(1); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFive_5_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(3); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(3); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(3); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFive_5_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(6); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(6); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(6); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(6); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(6); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	// check only 4 elements are same in line 4
	@Test
	public void testLineFive_4_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(6); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(1); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(1); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(1); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFive_4_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(2); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(1); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(2); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(2); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFive_4_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(4); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(4); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(2); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(4); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(4); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFive_4_04() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(6); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(6); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(6); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(4); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(6); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFive_4_05() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(0); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(0); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(0); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(1); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	// check only 3 elements are same in line 5
	@Test
	public void testLineFive_3_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(4); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(4); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(1); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFive_3_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(5); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(5); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(5); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(1); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFive_3_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(0); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(5); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(1); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(5); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(5); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFive_3_04() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(2); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(0); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(2); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(6); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFive_3_05() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(1); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(0); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(2); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(1); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFive_3_06() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(2); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(1); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(3); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(2); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFive_3_07() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(2); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(4); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(4); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(5); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFive_3_08() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(2); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(2); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(6); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(4); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(2); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFive_3_09() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(2); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(5); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(5); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	@Test
	public void testLineFive_3_10() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(5); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(1); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(5); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(true, result);
	}

	// check only 2 elements are same in line 5
	@Test
	public void testLineFive_2_01() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(2); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(2); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(0); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(5); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFive_2_02() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(4); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(2); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(5); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFive_2_03() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(6); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(2); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(6); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(5); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFive_2_04() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(5); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(2); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(6); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(5); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFive_2_05() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(5); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(2); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(2); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(6); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(4); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFive_2_06() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(5); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(0); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(2); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(4); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFive_2_07() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(5); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(2); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(0); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(3); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFive_2_08() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(0); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(4); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(1); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFive_2_09() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(0); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(4); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(5); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFive_2_10() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(0); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(6); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(6); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(false, result);
	}

	// check no elements are same in line 5
	@Test
	public void testLineFive_0_1() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(0); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(1); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(2); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(3); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(4); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFive_0_2() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(4); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(2); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(1); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(0); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(false, result);
	}

	@Test
	public void testLineFive_0_3() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(1); // 3rd element of line 5
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(3); // 2nd element of line 5
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(5); // 4th element of line 5
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(2); // 1st element of line 5
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(0);
		R.get(14).setResultsToFruits(4); // 5th element of line 5

		int bet = 100;
		boolean result = StubLineValidator5.lineFive(R, bet);
		assertEquals(false, result);
	}

	/*
	 * Part 7: Test the method "oneToFiveline" This will check the return value with
	 * different flag of line 1, 2, 3, 4 and 5
	 */

	// check if all flag of line 1, 2, 3, 4 and 5 are true
	@Test
	public void testOneToFiveLine_1() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(4);
		R.get(3).setResultsToFruits(4);
		R.get(4).setResultsToFruits(3);
		R.get(5).setResultsToFruits(2);
		R.get(6).setResultsToFruits(5);
		R.get(7).setResultsToFruits(5);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(2);
		R.get(10).setResultsToFruits(4);
		R.get(11).setResultsToFruits(3);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(3);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1, 2, 3 and 4 are true
	@Test
	public void testOneToFiveLine_2() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(2);
		R.get(1).setResultsToFruits(5);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(5);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(3);
		R.get(6).setResultsToFruits(2);
		R.get(7).setResultsToFruits(3);
		R.get(8).setResultsToFruits(2);
		R.get(9).setResultsToFruits(3);
		R.get(10).setResultsToFruits(1);
		R.get(11).setResultsToFruits(1);
		R.get(12).setResultsToFruits(2);
		R.get(13).setResultsToFruits(1);
		R.get(14).setResultsToFruits(1);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1, 2, 3 and 5 are true
	@Test
	public void testOneToFiveLine_3() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(0);
		R.get(2).setResultsToFruits(6);
		R.get(3).setResultsToFruits(0);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(1);
		R.get(6).setResultsToFruits(6);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(6);
		R.get(9).setResultsToFruits(1);
		R.get(10).setResultsToFruits(6);
		R.get(11).setResultsToFruits(4);
		R.get(12).setResultsToFruits(4);
		R.get(13).setResultsToFruits(4);
		R.get(14).setResultsToFruits(6);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1, 2, 4 and 5 are true
	@Test
	public void testOneToFiveLine_4() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(3);
		R.get(2).setResultsToFruits(0);
		R.get(3).setResultsToFruits(3);
		R.get(4).setResultsToFruits(3);
		R.get(5).setResultsToFruits(2);
		R.get(6).setResultsToFruits(0);
		R.get(7).setResultsToFruits(2);
		R.get(8).setResultsToFruits(0);
		R.get(9).setResultsToFruits(2);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(1);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(1);
		R.get(14).setResultsToFruits(0);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1, 3, 4 and 5 are true
	@Test
	public void testOneToFiveLine_5() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(4);
		R.get(1).setResultsToFruits(5);
		R.get(2).setResultsToFruits(6);
		R.get(3).setResultsToFruits(5);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(3);
		R.get(6).setResultsToFruits(4);
		R.get(7).setResultsToFruits(3);
		R.get(8).setResultsToFruits(4);
		R.get(9).setResultsToFruits(3);
		R.get(10).setResultsToFruits(6);
		R.get(11).setResultsToFruits(6);
		R.get(12).setResultsToFruits(4);
		R.get(13).setResultsToFruits(6);
		R.get(14).setResultsToFruits(6);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 2, 3, 4 and 5 are true
	@Test
	public void testOneToFiveLine_6() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(2);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(6);
		R.get(3).setResultsToFruits(4);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(0);
		R.get(6).setResultsToFruits(2);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(3);
		R.get(9).setResultsToFruits(5);
		R.get(10).setResultsToFruits(3);
		R.get(11).setResultsToFruits(3);
		R.get(12).setResultsToFruits(2);
		R.get(13).setResultsToFruits(2);
		R.get(14).setResultsToFruits(2);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1, 2 and 3 are true
	@Test
	public void testOneToFiveLine_7() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(1);
		R.get(2).setResultsToFruits(1);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(2);
		R.get(6).setResultsToFruits(2);
		R.get(7).setResultsToFruits(2);
		R.get(8).setResultsToFruits(2);
		R.get(9).setResultsToFruits(2);
		R.get(10).setResultsToFruits(3);
		R.get(11).setResultsToFruits(3);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(3);
		R.get(14).setResultsToFruits(3);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1, 2 and 4 are true
	@Test
	public void testOneToFiveLine_8() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(0);
		R.get(2).setResultsToFruits(2);
		R.get(3).setResultsToFruits(0);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(1);
		R.get(6).setResultsToFruits(1);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(1);
		R.get(9).setResultsToFruits(1);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(3);
		R.get(12).setResultsToFruits(0);
		R.get(13).setResultsToFruits(4);
		R.get(14).setResultsToFruits(5);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1, 2 and 5 are true
	@Test
	public void testOneToFiveLine_9() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6);
		R.get(1).setResultsToFruits(6);
		R.get(2).setResultsToFruits(6);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(6);
		R.get(5).setResultsToFruits(2);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(3);
		R.get(8).setResultsToFruits(3);
		R.get(9).setResultsToFruits(2);
		R.get(10).setResultsToFruits(3);
		R.get(11).setResultsToFruits(5);
		R.get(12).setResultsToFruits(4);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(3);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1, 3 and 4 are true
	@Test
	public void testOneToFiveLine_10() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(2);
		R.get(1).setResultsToFruits(1);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(5);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(0);
		R.get(6).setResultsToFruits(2);
		R.get(7).setResultsToFruits(0);
		R.get(8).setResultsToFruits(2);
		R.get(9).setResultsToFruits(0);
		R.get(10).setResultsToFruits(4);
		R.get(11).setResultsToFruits(4);
		R.get(12).setResultsToFruits(2);
		R.get(13).setResultsToFruits(4);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1, 3 and 5 are true
	@Test
	public void testOneToFiveLine_11() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(4);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(2);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(1);
		R.get(6).setResultsToFruits(4);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(4);
		R.get(9).setResultsToFruits(1);
		R.get(10).setResultsToFruits(3);
		R.get(11).setResultsToFruits(3);
		R.get(12).setResultsToFruits(4);
		R.get(13).setResultsToFruits(3);
		R.get(14).setResultsToFruits(3);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1, 4 and 5 are true
	@Test
	public void testOneToFiveLine_12() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(5);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(4);
		R.get(3).setResultsToFruits(2);
		R.get(4).setResultsToFruits(5);
		R.get(5).setResultsToFruits(3);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(3);
		R.get(8).setResultsToFruits(3);
		R.get(9).setResultsToFruits(3);
		R.get(10).setResultsToFruits(4);
		R.get(11).setResultsToFruits(1);
		R.get(12).setResultsToFruits(5);
		R.get(13).setResultsToFruits(1);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 2, 3 and 4 are true
	@Test
	public void testOneToFiveLine_13() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(4);
		R.get(3).setResultsToFruits(4);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(1);
		R.get(6).setResultsToFruits(0);
		R.get(7).setResultsToFruits(3);
		R.get(8).setResultsToFruits(0);
		R.get(9).setResultsToFruits(5);
		R.get(10).setResultsToFruits(4);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(0);
		R.get(13).setResultsToFruits(2);
		R.get(14).setResultsToFruits(2);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 2, 3 and 5 are true
	@Test
	public void testOneToFiveLine_14() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(2);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(6);
		R.get(3).setResultsToFruits(2);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(1);
		R.get(6).setResultsToFruits(6);
		R.get(7).setResultsToFruits(3);
		R.get(8).setResultsToFruits(6);
		R.get(9).setResultsToFruits(5);
		R.get(10).setResultsToFruits(6);
		R.get(11).setResultsToFruits(4);
		R.get(12).setResultsToFruits(4);
		R.get(13).setResultsToFruits(4);
		R.get(14).setResultsToFruits(6);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 2, 4 and 5 are true
	@Test
	public void testOneToFiveLine_15() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(5);
		R.get(1).setResultsToFruits(5);
		R.get(2).setResultsToFruits(6);
		R.get(3).setResultsToFruits(5);
		R.get(4).setResultsToFruits(5);
		R.get(5).setResultsToFruits(1);
		R.get(6).setResultsToFruits(6);
		R.get(7).setResultsToFruits(2);
		R.get(8).setResultsToFruits(6);
		R.get(9).setResultsToFruits(3);
		R.get(10).setResultsToFruits(6);
		R.get(11).setResultsToFruits(1);
		R.get(12).setResultsToFruits(5);
		R.get(13).setResultsToFruits(6);
		R.get(14).setResultsToFruits(3);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 3, 4 and 5 are true
	@Test
	public void testOneToFiveLine_16() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(1);
		R.get(2).setResultsToFruits(2);
		R.get(3).setResultsToFruits(4);
		R.get(4).setResultsToFruits(3);
		R.get(5).setResultsToFruits(1);
		R.get(6).setResultsToFruits(4);
		R.get(7).setResultsToFruits(5);
		R.get(8).setResultsToFruits(4);
		R.get(9).setResultsToFruits(6);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(2);
		R.get(14).setResultsToFruits(2);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1 and 2 are true
	@Test
	public void testOneToFiveLine_17() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(0);
		R.get(2).setResultsToFruits(0);
		R.get(3).setResultsToFruits(0);
		R.get(4).setResultsToFruits(0);
		R.get(5).setResultsToFruits(1);
		R.get(6).setResultsToFruits(1);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(1);
		R.get(9).setResultsToFruits(1);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(3);
		R.get(12).setResultsToFruits(4);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(6);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1 and 3 are true
	@Test
	public void testOneToFiveLine_18() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(1);
		R.get(2).setResultsToFruits(2);
		R.get(3).setResultsToFruits(3);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(6);
		R.get(7).setResultsToFruits(6);
		R.get(8).setResultsToFruits(6);
		R.get(9).setResultsToFruits(6);
		R.get(10).setResultsToFruits(5);
		R.get(11).setResultsToFruits(5);
		R.get(12).setResultsToFruits(5);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(5);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1 and 4 are true
	@Test
	public void testOneToFiveLine_19() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(4);
		R.get(1).setResultsToFruits(1);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(2);
		R.get(6).setResultsToFruits(4);
		R.get(7).setResultsToFruits(2);
		R.get(8).setResultsToFruits(4);
		R.get(9).setResultsToFruits(2);
		R.get(10).setResultsToFruits(1);
		R.get(11).setResultsToFruits(3);
		R.get(12).setResultsToFruits(4);
		R.get(13).setResultsToFruits(3);
		R.get(14).setResultsToFruits(1);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1 and 5 are true
	@Test
	public void testOneToFiveLine_20() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(5);
		R.get(1).setResultsToFruits(3);
		R.get(2).setResultsToFruits(2);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(5);
		R.get(5).setResultsToFruits(0);
		R.get(6).setResultsToFruits(5);
		R.get(7).setResultsToFruits(0);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(0);
		R.get(10).setResultsToFruits(1);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(5);
		R.get(13).setResultsToFruits(3);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 2 and 3 are true
	@Test
	public void testOneToFiveLine_21() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(5);
		R.get(1).setResultsToFruits(5);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(5);
		R.get(4).setResultsToFruits(5);
		R.get(5).setResultsToFruits(0);
		R.get(6).setResultsToFruits(1);
		R.get(7).setResultsToFruits(2);
		R.get(8).setResultsToFruits(3);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(6);
		R.get(11).setResultsToFruits(6);
		R.get(12).setResultsToFruits(6);
		R.get(13).setResultsToFruits(6);
		R.get(14).setResultsToFruits(6);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 2 and 4 are true
	@Test
	public void testOneToFiveLine_22() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(2);
		R.get(3).setResultsToFruits(2);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(2);
		R.get(6).setResultsToFruits(1);
		R.get(7).setResultsToFruits(3);
		R.get(8).setResultsToFruits(1);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(3);
		R.get(11).setResultsToFruits(4);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(5);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 2 and 5 are true
	@Test
	public void testOneToFiveLine_23() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(2);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(2);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(1);
		R.get(6).setResultsToFruits(5);
		R.get(7).setResultsToFruits(4);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(6);
		R.get(10).setResultsToFruits(5);
		R.get(11).setResultsToFruits(4);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(6);
		R.get(14).setResultsToFruits(5);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 3 and 4 are true
	@Test
	public void testOneToFiveLine_24() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(6);
		R.get(1).setResultsToFruits(1);
		R.get(2).setResultsToFruits(2);
		R.get(3).setResultsToFruits(3);
		R.get(4).setResultsToFruits(6);
		R.get(5).setResultsToFruits(1);
		R.get(6).setResultsToFruits(6);
		R.get(7).setResultsToFruits(3);
		R.get(8).setResultsToFruits(6);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(5);
		R.get(11).setResultsToFruits(5);
		R.get(12).setResultsToFruits(6);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(5);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 3 and 5 are true
	@Test
	public void testOneToFiveLine_25() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(5);
		R.get(4).setResultsToFruits(6);
		R.get(5).setResultsToFruits(2);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(5);
		R.get(8).setResultsToFruits(3);
		R.get(9).setResultsToFruits(4);
		R.get(10).setResultsToFruits(3);
		R.get(11).setResultsToFruits(4);
		R.get(12).setResultsToFruits(4);
		R.get(13).setResultsToFruits(4);
		R.get(14).setResultsToFruits(3);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 4 and 5 are true
	@Test
	public void testOneToFiveLine_26() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(5);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(4);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(5);
		R.get(8).setResultsToFruits(3);
		R.get(9).setResultsToFruits(6);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(5);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(4);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 1 is true
	@Test
	public void testOneToFiveLine_27() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(2);
		R.get(1).setResultsToFruits(3);
		R.get(2).setResultsToFruits(4);
		R.get(3).setResultsToFruits(5);
		R.get(4).setResultsToFruits(6);
		R.get(5).setResultsToFruits(1);
		R.get(6).setResultsToFruits(1);
		R.get(7).setResultsToFruits(1);
		R.get(8).setResultsToFruits(1);
		R.get(9).setResultsToFruits(1);
		R.get(10).setResultsToFruits(6);
		R.get(11).setResultsToFruits(5);
		R.get(12).setResultsToFruits(4);
		R.get(13).setResultsToFruits(3);
		R.get(14).setResultsToFruits(2);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 2 is true
	@Test
	public void testOneToFiveLine_28() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(2);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(2);
		R.get(3).setResultsToFruits(2);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(1);
		R.get(6).setResultsToFruits(3);
		R.get(7).setResultsToFruits(4);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(6);
		R.get(10).setResultsToFruits(5);
		R.get(11).setResultsToFruits(1);
		R.get(12).setResultsToFruits(0);
		R.get(13).setResultsToFruits(2);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 3 is true
	@Test
	public void testOneToFiveLine_29() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(6);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(1);
		R.get(6).setResultsToFruits(2);
		R.get(7).setResultsToFruits(4);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(6);
		R.get(10).setResultsToFruits(3);
		R.get(11).setResultsToFruits(3);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(3);
		R.get(14).setResultsToFruits(3);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 4 is true
	@Test
	public void testOneToFiveLine_30() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(4);
		R.get(1).setResultsToFruits(0);
		R.get(2).setResultsToFruits(1);
		R.get(3).setResultsToFruits(2);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(3);
		R.get(6).setResultsToFruits(4);
		R.get(7).setResultsToFruits(5);
		R.get(8).setResultsToFruits(4);
		R.get(9).setResultsToFruits(6);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(1);
		R.get(12).setResultsToFruits(4);
		R.get(13).setResultsToFruits(2);
		R.get(14).setResultsToFruits(3);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 5 is true
	@Test
	public void testOneToFiveLine_31() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(3);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(0);
		R.get(6).setResultsToFruits(5);
		R.get(7).setResultsToFruits(6);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(2);
		R.get(10).setResultsToFruits(5);
		R.get(11).setResultsToFruits(1);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(4);
		R.get(14).setResultsToFruits(5);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	// check if all flag of line 1, 2, 3, 4 and 5 are false
	@Test
	public void testOneToFiveLine_32() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(3);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(0);
		R.get(6).setResultsToFruits(5);
		R.get(7).setResultsToFruits(6);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(2);
		R.get(10).setResultsToFruits(5);
		R.get(11).setResultsToFruits(1);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(4);
		R.get(14).setResultsToFruits(5);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(true, result);
	}

	/*
	 * Part 8: Test the method "oneTo13line" This will check the return value with
	 * different flag of line 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 and 13
	 */

	// check if only flag of line 1 is true
	@Test
	public void testOneTo13Line_1() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(4);
		R.get(4).setResultsToFruits(5);
		R.get(5).setResultsToFruits(0);
		R.get(6).setResultsToFruits(0);
		R.get(7).setResultsToFruits(0);
		R.get(8).setResultsToFruits(6);
		R.get(9).setResultsToFruits(1);
		R.get(10).setResultsToFruits(6);
		R.get(11).setResultsToFruits(5);
		R.get(12).setResultsToFruits(4);
		R.get(13).setResultsToFruits(3);
		R.get(14).setResultsToFruits(2);

		int bet = 100;
		boolean result = LinesValidator.oneTo13line(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 2 is true
	@Test
	public void testOneTo13Line_2() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(0);
		R.get(2).setResultsToFruits(0);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(3);
		R.get(6).setResultsToFruits(4);
		R.get(7).setResultsToFruits(5);
		R.get(8).setResultsToFruits(6);
		R.get(9).setResultsToFruits(0);
		R.get(10).setResultsToFruits(1);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(4);
		R.get(14).setResultsToFruits(5);

		int bet = 100;
		boolean result = LinesValidator.oneTo13line(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 3 is true
	@Test
	public void testOneTo13Line_3() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(3);
		R.get(1).setResultsToFruits(4);
		R.get(2).setResultsToFruits(5);
		R.get(3).setResultsToFruits(6);
		R.get(4).setResultsToFruits(1);
		R.get(5).setResultsToFruits(1);
		R.get(6).setResultsToFruits(2);
		R.get(7).setResultsToFruits(3);
		R.get(8).setResultsToFruits(4);
		R.get(9).setResultsToFruits(5);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(0);
		R.get(13).setResultsToFruits(1);
		R.get(14).setResultsToFruits(2);

		int bet = 100;
		boolean result = LinesValidator.oneTo13line(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 4 is true
	@Test
	public void testOneTo13Line_4() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(1);
		R.get(2).setResultsToFruits(2);
		R.get(3).setResultsToFruits(3);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(3);
		R.get(6).setResultsToFruits(0);
		R.get(7).setResultsToFruits(4);
		R.get(8).setResultsToFruits(1);
		R.get(9).setResultsToFruits(5);
		R.get(10).setResultsToFruits(6);
		R.get(11).setResultsToFruits(1);
		R.get(12).setResultsToFruits(0);
		R.get(13).setResultsToFruits(2);
		R.get(14).setResultsToFruits(3);

		int bet = 100;
		boolean result = LinesValidator.oneTo13line(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 5 is true
	@Test
	public void testOneTo13Line_5() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(0);
		R.get(3).setResultsToFruits(3);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(5);
		R.get(6).setResultsToFruits(0);
		R.get(7).setResultsToFruits(6);
		R.get(8).setResultsToFruits(1);
		R.get(9).setResultsToFruits(2);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(3);
		R.get(12).setResultsToFruits(4);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(2);

		int bet = 100;
		boolean result = LinesValidator.oneTo13line(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 6 is true
	@Test
	public void testOneTo13Line_6() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(0);
		R.get(2).setResultsToFruits(1);
		R.get(3).setResultsToFruits(2);
		R.get(4).setResultsToFruits(3);
		R.get(5).setResultsToFruits(4);
		R.get(6).setResultsToFruits(5);
		R.get(7).setResultsToFruits(0);
		R.get(8).setResultsToFruits(6);
		R.get(9).setResultsToFruits(1);
		R.get(10).setResultsToFruits(2);
		R.get(11).setResultsToFruits(3);
		R.get(12).setResultsToFruits(4);
		R.get(13).setResultsToFruits(1);
		R.get(14).setResultsToFruits(2);

		int bet = 100;
		boolean result = LinesValidator.oneTo13line(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 7 is true
	@Test
	public void testOneTo13Line_7() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(0);
		R.get(2).setResultsToFruits(2);
		R.get(3).setResultsToFruits(3);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(0);
		R.get(6).setResultsToFruits(5);
		R.get(7).setResultsToFruits(0);
		R.get(8).setResultsToFruits(6);
		R.get(9).setResultsToFruits(2);
		R.get(10).setResultsToFruits(1);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(1);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneTo13line(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 8 is true
	@Test
	public void testOneTo13Line_8() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(1);
		R.get(2).setResultsToFruits(2);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(3);
		R.get(6).setResultsToFruits(4);
		R.get(7).setResultsToFruits(0);
		R.get(8).setResultsToFruits(5);
		R.get(9).setResultsToFruits(6);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(1);
		R.get(13).setResultsToFruits(2);
		R.get(14).setResultsToFruits(3);

		int bet = 100;
		boolean result = LinesValidator.oneTo13line(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 9 is true
	@Test
	public void testOneTo13Line_9() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(1);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(0);
		R.get(6).setResultsToFruits(5);
		R.get(7).setResultsToFruits(0);
		R.get(8).setResultsToFruits(6);
		R.get(9).setResultsToFruits(2);
		R.get(10).setResultsToFruits(1);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(2);
		R.get(13).setResultsToFruits(3);
		R.get(14).setResultsToFruits(4);

		int bet = 100;
		boolean result = LinesValidator.oneTo13line(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 10 is true
	@Test
	public void testOneTo13Line_10() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(1);
		R.get(2).setResultsToFruits(2);
		R.get(3).setResultsToFruits(3);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(5);
		R.get(6).setResultsToFruits(0);
		R.get(7).setResultsToFruits(0);
		R.get(8).setResultsToFruits(1);
		R.get(9).setResultsToFruits(6);
		R.get(10).setResultsToFruits(1);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(4);
		R.get(14).setResultsToFruits(2);

		int bet = 100;
		boolean result = LinesValidator.oneTo13line(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 11 is true
	@Test
	public void testOneTo13Line_11() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(4);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(3);
		R.get(6).setResultsToFruits(0);
		R.get(7).setResultsToFruits(0);
		R.get(8).setResultsToFruits(1);
		R.get(9).setResultsToFruits(2);
		R.get(10).setResultsToFruits(0);
		R.get(11).setResultsToFruits(3);
		R.get(12).setResultsToFruits(4);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(6);

		int bet = 100;
		boolean result = LinesValidator.oneTo13line(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 12 is true
	@Test
	public void testOneTo13Line_12() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(0);
		R.get(2).setResultsToFruits(0);
		R.get(3).setResultsToFruits(2);
		R.get(4).setResultsToFruits(3);
		R.get(5).setResultsToFruits(0);
		R.get(6).setResultsToFruits(4);
		R.get(7).setResultsToFruits(5);
		R.get(8).setResultsToFruits(1);
		R.get(9).setResultsToFruits(6);
		R.get(10).setResultsToFruits(1);
		R.get(11).setResultsToFruits(2);
		R.get(12).setResultsToFruits(3);
		R.get(13).setResultsToFruits(4);
		R.get(14).setResultsToFruits(2);

		int bet = 100;
		boolean result = LinesValidator.oneTo13line(R, bet);
		assertEquals(true, result);
	}

	// check if only flag of line 13 is true
	@Test
	public void testOneTo13Line_13() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(1);
		R.get(1).setResultsToFruits(2);
		R.get(2).setResultsToFruits(3);
		R.get(3).setResultsToFruits(4);
		R.get(4).setResultsToFruits(2);
		R.get(5).setResultsToFruits(0);
		R.get(6).setResultsToFruits(5);
		R.get(7).setResultsToFruits(6);
		R.get(8).setResultsToFruits(1);
		R.get(9).setResultsToFruits(3);
		R.get(10).setResultsToFruits(4);
		R.get(11).setResultsToFruits(0);
		R.get(12).setResultsToFruits(0);
		R.get(13).setResultsToFruits(5);
		R.get(14).setResultsToFruits(6);

		int bet = 100;
		boolean result = LinesValidator.oneTo13line(R, bet);
		assertEquals(true, result);
	}

	// check if all flag of line 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 and 13 are
	// false
	@Test
	public void testOneTo13Line_14() {
		ArrayList<Results> R = new ArrayList<Results>();
		for (int i = 0; i < 15; i++) {
			R.add(new Results(i));
		}

		GameTools.FlistInitialize();

		R.get(0).setResultsToFruits(0);
		R.get(1).setResultsToFruits(1);
		R.get(2).setResultsToFruits(2);
		R.get(3).setResultsToFruits(3);
		R.get(4).setResultsToFruits(4);
		R.get(5).setResultsToFruits(6);
		R.get(6).setResultsToFruits(6);
		R.get(7).setResultsToFruits(0);
		R.get(8).setResultsToFruits(1);
		R.get(9).setResultsToFruits(2);
		R.get(10).setResultsToFruits(3);
		R.get(11).setResultsToFruits(4);
		R.get(12).setResultsToFruits(5);
		R.get(13).setResultsToFruits(6);
		R.get(14).setResultsToFruits(2);

		int bet = 100;
		boolean result = LinesValidator.oneToFiveline(R, bet);
		assertEquals(false, result);
	}
}
