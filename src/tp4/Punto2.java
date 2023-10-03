package tp4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Punto2 {

	public static void main(String[] args) {
		Path unArchivo = Paths.get("./src/unArchivo.txt");

		if (Files.exists(unArchivo)) {
			System.out.println("Existe el archivo");
		} else {
			System.out.println("NO Existe el archivo");
		}

		operarEnArchivo(unArchivo, true);

	}

	public static void operarEnArchivo(Path archivo, boolean sumar) {
		int suma = 0;
		int multiplicacion = 1;
		try {
			for (String linea : Files.readAllLines(archivo)) {
				if (sumar) {
					suma += Integer.parseInt(linea);
				} else {
					multiplicacion *= Integer.parseInt(linea);
				}

				System.out.println(linea);
			}

			if (sumar) {
				System.out.println("Total de la suma: " + suma);
			} else {
				System.out.println("Total de la multiplicacion: " + multiplicacion);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
