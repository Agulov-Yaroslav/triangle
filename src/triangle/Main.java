package triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] arg) {

		System.out.println("Введите длину первой стороны: ");
		int a = lang();
		System.out.println("Введите длину второй стороны: ");
		int b = lang();
		System.out.println("Введите длину третьей стороны: ");
		int c = lang();
		System.out.println(result(a, b, c));

	}

	public static int lang() {
		int lang = 0;
		String fail = "Введите целое положительное число";
		boolean loop = true;
		while (loop) {
			try {
				lang = scanner.nextInt();
				if (lang < 1)
					System.out.println(fail);
				else
					loop = false;

			} catch (InputMismatchException e) {
				System.out.println(fail);
				scanner.next();
			}
		}
		return lang;
	}

	static String result(int a, int b, int c) {
		String result = null;
		if (a == b && a == c)
			result = "Треугольник равносторонний";
		else if (a == b || a == c || c == b)
			result = "Треугольник равнобедренный";
		else 
			result = "Треугольник разносторонний";
			return result;
	}
}
