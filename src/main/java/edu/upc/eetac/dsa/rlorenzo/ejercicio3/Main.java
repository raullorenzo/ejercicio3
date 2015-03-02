package edu.upc.eetac.dsa.rlorenzo.ejercicio3;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
            System.err.println("El programa necesita la ruta donde se encuentra el archivo");
            System.exit(-1);
        }

        try {
            double average = FicheroTexto.average(args[0]);
            System.out.println("Average = " + average);
        } catch (FileParsingException e) {
            e.printStackTrace();
        } catch (BigNumberException e) {
            e.printStackTrace();
        }

	}

}
