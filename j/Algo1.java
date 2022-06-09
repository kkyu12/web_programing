package j;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Algo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		String a = "Hello ";
		for (int i = 0; i < inputNumber; i++) {
			if (i < inputNumber - 1) {
				a += sc.next() + ",";
			} else {
				a += sc.next() + ".";
			}
		}
		System.out.println(a);
	}
}