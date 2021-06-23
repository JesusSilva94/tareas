package com.proyecto.imagen;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DescargarImagen {

	public static void main(String[] args) {

		try (InputStream in = new URL(
				"https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg/1024px-FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg.png")
						.openStream()) {
			//Modificar esta linea para guardar en la ruta que desee
			Files.copy(in, Paths.get("C:\\Users\\jerry\\OneDrive\\Imágenes\\Saved Pictures\\bayern.jpg"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
