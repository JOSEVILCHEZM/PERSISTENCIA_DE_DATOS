
package persistenciadatos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CrearArchivo {
    
    
    
    public static void crearArchivo(String nombreArchivo) {
         File archivo = new File(nombreArchivo);
         
         
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("SE CREO EL ARCHIVO");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            
        }
        
    }
}
