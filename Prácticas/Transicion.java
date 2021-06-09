public class Transicion { 
    public String dato;
    private int origenT;
    private int destinoT; 
    private String simboloT;  
    public Transicion(int origenT, int destinoT, String simboloT) { 
        super(); 
        this.origenT = origenT; 
        this.destinoT = destinoT; 
        this.simboloT = simboloT; 
    }
    public int getOrigenT() { 
        return origenT;
    }
    public void setOrigenT(int origenT) { 
        this.origenT = origenT; 
    }
    public int getDestinoT() { 
        return destinoT; 
    }
    public void setDestinoT(int destinoT) { 
        this.destinoT = destinoT; 
    }
    public String getSimboloT(){ 
        return simboloT;
    }
    public void setSimboloT(String simboloT) { 
        this.simboloT = simboloT; 
    }
}


