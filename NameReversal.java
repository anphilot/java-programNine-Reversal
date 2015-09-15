/*
 * Project: NameReversal.java
 * Description: An investigation into "for" loops.
 * Author: Seunghoon Park
 * Date: 14 September, 2015
 */
// public class - the class name MUST match the file name
// class - it can be any name (needs confirmation)
import java.util.Scanner;
public class NameReversal {
	public static void main(String args[]) {
		// number 1
		int j = 0;
		// we could declare:
		// int g = 0;
		// then you must get rid of 'int' in the for loop
		for (int g = 0; g < 5; g++) {
			j++;
			System.out.println("g = " + g); // g prints fine, since g is declared WITHIN the loop
		}
		System.out.println("j = " + "\n");
		// System.out.println(g); // scope = when int is made within loop, you cannot use it OUT of the loop
		// number 2
		int s = 1;
		for (int i = 3; i>=0; i--) 
			s = s + i; // 1+3 / 4+2 / 6+1
		System.out.println("s = " + s + "\n");
		// number 3
		int p = 6, m = 20, k;
		for (k = 1; k < p; k++)
			m = m + k * k;
		System.out.println("m = " + m + "\n"); 
		// number 4
		double a = 1.0;
		for (int i = 0; i < 9; i++)
			a *= 3;
		System.out.println("a = " + a + "\n");
		//number 6
		double d = 100.01;
		int b = 0;
		for (int yellow = 0; yellow < 50; yellow +=5) {
			b = 19 + yellow;
			d++;
		}
		System.out.println("d = " + d);
		System.out.println("b = " + b + "\n");
		// number 7
		int num;
		final int asdf = 3;
		for (int i = 1; i < 9; i *= 2) {
			num = asdf * i;
			System.out.println("num = " + num);
		}
		System.out.println();
		// number 8
		int num2;
		final int asdf2 = 3;
		for (int i = 8; i > 0; i /= 2) {
			num2 = asdf2 * i;
			System.out.println("num2 = " + num2);
		}
		/*
		 * Project: Name Reversal
		 * Description: Enter your name. Using a for loop, reverse your name and print
		 * E.g. Simon Park -> kraP nomiS
		 * Date: 15 September, 2015
		 */
		String name;
		String revName = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\nEnter your name: ");
		name = scan.nextLine();
		System.out.println("Your name is: " + name);
		for (int i = name.length()-1; i >= 0; i--) { // start at 5
			revName = revName + name.charAt(i);
			// revName = revName + name.substring (i, i+1);
		}
		System.out.println("Your reversed name is: " + revName);
	}
}