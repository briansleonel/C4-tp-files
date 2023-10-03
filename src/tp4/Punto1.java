package tp4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Punto1 {

	public static void main(String[] args) {

		Integer[] nums = { 3, 7, 1 };
		
		if (args.length > 1) {
			Integer[] numeros = ordenarNumeros(nums, 'a');

			for (int num : numeros) {
				System.out.println(num);
			}
		} else {
			List<Integer> numsIngresados = solicitarNumerosConsola();

			for (int num : numsIngresados) {
				System.out.println(num);
			}
		}

	}

	public static void punto1(Integer args[]) {
		if (args.length > 1) {
			Integer[] numeros = ordenarNumeros(args, 'a');

			for (int num : numeros) {
				System.out.println(num);
			}
		} else {
			List<Integer> numsIngresados = solicitarNumerosConsola();

			for (int num : numsIngresados) {
				System.out.println(num);
			}
		}
	}

	public static Integer[] ordenarNumeros(Integer[] numeros, char orden) {

		if (orden == 'a') {
			Arrays.sort(numeros);
		} else {
			Arrays.sort(numeros, Collections.reverseOrder());
		}

		return numeros;
	}

	public static List<Integer> solicitarNumerosConsola() {
		List<Integer> numeros = new ArrayList<Integer>();
		boolean noMasNumeros = false;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Ingrese un número '0: finish': ");
			Integer newNum = sc.nextInt();

			if (newNum == 0) {
				noMasNumeros = true;
			} else {
				numeros.add(newNum);
			}

		} while (!noMasNumeros);

		sc.close();

		return numeros;
	}

}
