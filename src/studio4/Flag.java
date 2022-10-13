package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);

		StdDraw.clear();
		StdDraw.setPenColor(255, 109, 182);
		StdDraw.filledRectangle(11, 4, 11, 4);
		StdDraw.setPenColor(36, 255, 36);
		StdDraw.filledRectangle(11, 12, 11, 4);
		
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.setPenRadius(0.1);
		StdDraw.rectangle(22, 16, 22, 16);
		StdDraw.rectangle(0, 0, 22, 16);
	}
}