import java.util.*; 
import java.io.*; 

public class Funcion { 
    Character epsilon = "e"; 
    Character axioma; 
    Set<Character> terminales = new HashSet<Character>(); 
    Set<Character> NoT = new HashSet<Character>(); 
    ArrayList<Produccion> reglasdeP = new ArrayList<Produccion>();
    Map<Character, Set<Character>> Primeros = new HashMap<Character, Set<Character>>();
    Scanner scanner = new Scanner(System.in); 

    void ReglasProduccion() { 
        int i = 0; 
        List<String> lineas; 
        Produccion produccion;
        System.out.println("Nombre del archivo: "); 
        String linea; 
        axioma = lineas.get(0).charAt(0);
        linea = lineas.get(1);  
        for (i = 0; i < linea.length(); i+=2 ) { 
            
        }
    }
}