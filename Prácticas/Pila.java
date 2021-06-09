public class Pila{ 

    class Nodo { 
        private ImplementacionElementos elem; 
        Nodo siguiente; 
        public Nodo getSiguiente() {
            return siguiente;
        }
        public ImplementacionElementos getElem() { 
            return elem;
        }
    }
    private int tamanio = 0;
    private Nodo raiz; 

    public Pila (){
        raiz = null; 
    }
    public boolean Vacia() { 
        return raiz == null;
    }
    public void insertar(ImplementacionElementos elem){
        Nodo nuevo; 
        nuevo = new Nodo();
        nuevo.elem = elem; 
        if (raiz == null){
            nuevo.siguiente = null; 
            raiz = nuevo; 
        }
        else { 
            nuevo.siguiente = raiz; 
            raiz = nuevo; 
        }
    }
   
    
    public void sacar () { 
        if (raiz!=null) { 
            raiz = raiz.getSiguiente(); 
            tamanio --; 
    }
    }

    public ImplementacionElementos Top() throws Exception { 
        if(raiz!=null) { 
            return raiz.getElem();
        }
        else { 
            throw new Exception("La pila esta vacía");
        }
    }
/** 
    public imprimirPila(Pila p) { 
        
    }

    public int isEmpty(Pila p) { 
        return p == Empty();
    }
    */
} 