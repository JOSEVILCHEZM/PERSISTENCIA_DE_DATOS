//ORDEN ALEATORIO
package persistenciadatos;

import java.util.*;

public class Set {
    
    public static void main(String[] args) {
        
    
     HashSet dias = new HashSet();
     
     
     dias.add("LUNES");
     dias.add("MARTES");
     dias.add("MIERCOLES");
     dias.add("JUEVES");
     dias.add("VIERNES");
     
        for (Object dia : dias) {
            System.out.println(dia);
            
        }
        
        dias.remove("Lunes");
        System.err.println("dias");
        
        dias.clear();
        System.out.println(dias);
    
    }
}
