/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author DAM
 */
public class EjemploFileReaderFileWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre = "prueba.xml";
        
        escribirFileWriter(nombre);        
        leerFileReader(nombre);
        
        
        
    }

    private static void escribirFileWriter(String nombre) {
        String cadena = ""
                + "<alumnos>" + "\n"
                + "<alumno>" + "\n"
                + "<nombre>Juan</nombre>" + "\n"
                + "<apellido>Pascual</apellido>" + "\n"
                + "</alumno>" + "\n"
                + "</alumnos>" + "\n";
        
        
        try {
            FileWriter fw = new FileWriter(nombre);
            
            fw.write(cadena);
            
            fw.close();
        } catch (IOException ex) {
            System.out.println("Error en la escritura del fichero.");
        }
        
    }

    private static void leerFileReader(String nombre) {
        
        try {
            FileReader fr = new FileReader(nombre);
            
            int valor = fr.read();
            while (valor != -1) {                
                System.out.print((char)valor);
                valor = fr.read();
            }
            
            fr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error en la lectura del fichero.");
        }
    }
    
}
