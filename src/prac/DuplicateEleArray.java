package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateEleArray {

	public static void main(String[] args) {

		// String [] str = {"Java", "C#","Python","Java","Ruby"};

		int[] num = { 2, 4, 7, 2, 11, 5, 7, 14, 22, 11, 49, 58, 14, 101, 1, 3, 205, 49, 101, 12 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == (num[j])) {
					System.out.println(num[i]);
					
					

				}
			}
		}

	}

}
