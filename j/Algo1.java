package j;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Algo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_number = sc.nextInt();
		String[] s = new String[input_number];
		for (int i = 0; i < input_number; i++) {
			s[i] = sc.next();
		}
		System.out.print("Hello ");
		for (int i = 0; i < s.length; i++) {
			if (i == s.length - 1) {
				System.out.print(s[i] + ".");
			} else {
				System.out.print(s[i] + ",");
			}
		}
	}