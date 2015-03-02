package edu.upc.eetac.dsa.rlorenzo.ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FicheroTexto {
	
	 public final static double average(String file) throws FileParsingException, BigNumberException {
	        double counter = 0d;
	        double sum = 0d;
	        BufferedReader reader = null;
	        try {
	            reader = new BufferedReader(new FileReader(file));
	            String line = null;

	            while ((line = reader.readLine()) != null) {
	                try {
	                    int number = Integer.parseInt(line);
	                    if (number > 1000)
	                        throw new BigNumberException("Número mayor de 1000 en la linea " + (int) (++counter));
	                    sum += number;
	                    counter++;
	                } catch (NumberFormatException e) {
	                    throw new FileParsingException(e.getMessage());
	                }
	            }
	        } catch (java.io.IOException e) {
	            throw new FileParsingException(e.getMessage());
	        } finally {
	            try {
	                reader.close();
	            } catch (IOException e) {
	                System.err.println("warning: can not close file.");
	            }
	        }

	        return sum / counter;
	    }

}
