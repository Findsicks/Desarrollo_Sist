package Archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ficheros {
	private File archivo;
	private PrintStream ps;

	public Ficheros()
	{
		String ruta ="";
		String nombre ="mario";
		String extension = ".txt";
		archivo = new File(ruta.concat(nombre.concat(extension)));
	}
	public void createFilePrintStream(File a) 
	{
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(archivo);
			ps = new PrintStream(fos, true); // mode append
			
			ps.println("Hola soy una linea");
			ps.println("CHAU MUNDO");
			
			ps.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
