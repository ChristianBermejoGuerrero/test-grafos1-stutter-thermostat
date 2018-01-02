package thermostat;

import java.io.*;

public class Thermostat {

	public static String partOfDay;
	public static String temp;
	
	public static void advance() {
		if (partOfDay == "Sleep") {
			partOfDay = "Wake";
		} else if (partOfDay == "Wake") {
			partOfDay = "Sleep";
		}
	}

	public static void down() {
		if (temp == "High") {
			temp = "Low";
		}
	}
	
	public static void up() {
		if (temp == "Low") {
			temp = "High";
		}
	}

}
