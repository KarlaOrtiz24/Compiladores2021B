public class Aristas { 
    public int origen; 
    public int destino; 
    public char simbolo; 
    public Aristas(int origen, int destino, char simbolo){
        this.origen = origen; 
        this.destino = destino; 
        this.simbolo = simbolo; 

    }
    Aristas nuevoMov(){
        Aristas a = new Aristas(origen, destino, simbolo);
        a.origen = origen;
        a.destino = destino; 
        a.simbolo = simbolo; 
        return a; 
    }
    @Override
    public String toString() { 
        return "Aristas [Origen =" + origen + "Destino" + destino + "Simbolo" + simbolo + "]";
    }

}