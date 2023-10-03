package tp4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Punto3 {

	public static void main(String[] args) {
		Path archEntrada = Paths.get("./src/entrada.txt");
		Path archSalida = Paths.get("./src/salida.txt");

		decodificandoCodificando(false, 1, archEntrada, archSalida);
	}

	public static void decodificandoCodificando(boolean codificar, int desplazamiento, Path entrada, Path salida) {

		try {
			for (String texto : Files.readAllLines(entrada)) {
				byte[] decode = texto.getBytes();

				for (int i = 0; i < decode.length; i++) {
					if (codificar) {
						decode[i] += desplazamiento;
					} else {
						decode[i] -= desplazamiento;
					}
				}

				String encode = new String(decode);

				Files.write(salida, encode.getBytes());
			}

			if (codificar) {
				System.out.println("Codificación exitosa!");
			} else {
				System.out.println("Decodificación exitosa!");
			}
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error");
			e.printStackTrace();
		}

	}

}
