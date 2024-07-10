package examen_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;

public class Main {

	public static void main(String[] args) {
		PrintStream ps;
		
		File archivo = new File("tuti-fruti.csv");
		
		try {
			ps = new PrintStream(new FileOutputStream(archivo , true));
			ps.println("modelo tuti fruti :\r\n "
					+ " .amarillo.araña.arpa.atun\r\n"
					+ ".blanco.burro.billete.banana\r\n"
					+ ".celeste.caballo.canasta.ciruela\r\n"
					+ ".dorado.delfin.dado.cereza\r\n"
					+ ".esmeralda.elefante.espejo.espinaca\r\n"
					+ ".fucsia.foca.flauta.frambuesas\r\n"
					+ ".gris.gallo.globo.granada\r\n"
					+ ".hueso.hiena.horno.huevo\r\n"
					+ ".indigo.iguana.iman.icaco\r\n"
					+ ".jade.jirafa.jaula.jamon\r\n"
					+ ".kraft.koala.kimono.kiwi\r\n"
					+ ".ocre.oso.orilla.oliva\r\n"
					+ ".Plata.Perro.Pluma.Papa\r\n"
					+ ".Rojo.Rana.Ropa.Rúcula\r\n"
					+ ".Salmón.Sapo.Soga.Sopa\r\n"
					+ ".Ultravioleta.Unicornio.Uniforme.Uva\r\n"
					+ ".Wenge.Walabí.Whisky.Waffles\r\n");
			
			ps.flush();
			ps.close();
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
