import java.util.*;
import java.io.*;
import java.lang.Math;


public class BirthdayGenerator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = new String(""), option = new String("");
		int min = 1, maxMonth = 12, maxDay = 31, maxDayFeb = 29;
		
		int randomMonth;
		int randomDay;
		
		System.out.println("========================================");
		System.out.println("\t  Birthday Generator");
		System.out.println("========================================");
		System.out.println("Who's birthday are you trying to guess?");
		System.out.print("[ENTER NAME]: ");
		name = scan.nextLine();
		
		do {
			randomMonth = (int) (Math.random() * (maxMonth - min + 1) + min);
			
			if (randomMonth == 2) {
				randomDay = (int) (Math.random() * (maxDayFeb - min + 1) + min);
			}
			else if (randomMonth == 8 || randomMonth % 2 == 1) {
				randomDay = (int) (Math.random() * (maxDay - min + 1) + min);
			} else {
				randomDay = (int) (Math.random() * ((maxDay - 1) - min + 1) + min);
			}
			
			System.out.println("\nIs " + name + "'s birthday " + randomMonth + "/" + randomDay + " ?");
			System.out.print("[Y/N]: ");
			option = scan.next();
			
		} while (option.equals("N") || option.equals("n"));
		
		System.out.println("\nYAY YOU FOUND " + name + "'s BIRTHDAY!");	
	}
}
