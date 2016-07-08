
package progarmaconjuntos;

import java.util.*;


public class ProgarmaConjuntos {
    
    
    

    
    public static void main(String[] args) {
        
        Set a = new TreeSet();
        Set b = new TreeSet();
        
        //elementos a conjuntos a
        
        a.add(6);
        a.add(5);
        a.add(3);
        a.add(3);
        a.add(5);
        
        //elemetos a conjuntos b
        
        b.add(2);
        b.add(0);
        b.add(5);
        b.add(2);
        b.add(10);
        
            System.out.println("numeros de elementos del conjunto A: " + "son: " + a.size());
            System.out.println("elementos del conjunto A"+a);

            System.out.println("numeros de elementos del conjunto B: "+ "son: "+ b.size());
            System.out.println("elementos del conjunto B"+ b);
            
            

            //union 
            
    a.addAll(b);
        System.out.println("A union B: "+a);
    
        
        //interseccion 
    a.retainAll(b);
        System.out.println("A interseccion B: "+a);
        
        a.add(3);
        a.add(5);
        
     //diferencia 
        
     a.removeAll(b);
        System.out.println("A diferencia de B: "+ a);
        
        
    
          
                                  

            
        
        
       
    }
    
}
