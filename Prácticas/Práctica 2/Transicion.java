public class Transicion { 
    public String simbolos; 
    public int estadoInicial; 
    public int estadoFinal; 


    public Transicion(int estadoA, int estadoB, String simbolos){ 
        this.estadoA = estadoA; 
        this.estadoB = estadoB; 
        this.simbolos = simbolos;
    }

    public String toString() { 
        return "Transicion: " + "estadoA" + estadoA + "estadoB" + estadoB + "simbolos" + simbolos; 
        
    }
}