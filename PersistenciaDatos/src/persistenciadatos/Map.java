
package persistenciadatos;

import java.util.*;

public class Map {
    
    public static void main(String[] args) {
        
        HashMap numeros = new HashMap();
        
        numeros.put(1,"UNO");
        numeros.put(2,"DOS");
        numeros.put(3,"TRES");
        numeros.put(4,"CUATRO");
        numeros.put(5,"CINCO");
        
        System.out.println(numeros);
        System.out.println(numeros.get(5));
        
        
         for (Object valores : numeros.keySet()) {
             System.out.println(valores);
            
        }
       
        }
        
        
        
        
        
    }

