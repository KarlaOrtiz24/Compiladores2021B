public class PilaAutomata{ 

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

    public PilaAutomata (){
        raiz = null; 
    }
    public boolean esVacia() { 
        return raiz == null;
    }
    public void insertarPA(ImplementacionElementos elem){
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
   
    
    public void sacarPA () { 
        if (raiz!=null) { 
            raiz = raiz.getSiguiente(); 
            tamanio --; 
    }
    }

    public ImplementacionElementos TopPA() throws Exception { 
        if(raiz!=null) { 
            return raiz.getElem();
        }
        else { 
            throw new Exception("La pila esta vacía");
        }
    }
}