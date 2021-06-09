import java.util.ArrayList;
import java.util.List; 
import java.util.function.Predicate;
import java.util.Scanner;

public class Lista {
    List<String> lista = new ArrayList<String>(); 

  

public void agregar() { 
    Scanner teclado = new Scanner(System.in);
    String valor = ""; 
    System.out.println("Ingresar: ");
    valor = teclado.nextLine();
    lista.add(valor);
}

public void  buscar() { 
    Scanner teclado = new Scanner(System.in);
    String valor = ""; 
    int indice = 0; 
    System.out.println("Buscar el valor: "); 
    valor = teclado.nextLine();
    indice = lista.indexOf(valor);
    if(indice != -1) { 
        System.out.println("Se encuentra en: " + indice); 
    
    } 
    else { 
        System.out.println("No se encuentra"); 
    }

}
public void limpiar() { 
    lista.clear();
}
public void Vacia() {
    if(lista.isEmpty()) {  
        System.out.println("Esta vacia");
    }else { 
        System.out.println("Tiene elementos");
    }
}
public void primerElemento() {
   System.out.println(lista.get(0));
}

public void RestoElementos() { 
    for (String entero: lista) {
        System.out.println(entero);
    }  
    }
    public void tamLista() { 
        System.out.println("Total de elementos: " + lista.size());
    }
    public String toString(){
        return ("Lista" + lista);
    }

}

