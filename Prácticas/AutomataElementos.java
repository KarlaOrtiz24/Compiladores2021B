public class AutomataElementos { 
    public int visitado; 
    public char transicionArriba; 
    public char transicionAbajo;
    public int otro; 
    public int id; 
    public AutomataElementos(int visitado, char transicionArriba, char transicionAbajo, int otro, int id){
        this.visitado = visitado; 
        this.transicionArriba = transicionArriba; 
        this.transicionAbajo = transicionAbajo; 
        this.otro = otro; 
        this.id = id; 

    }
    AutomataElementos nuevoElemento (){ 
        AutomataElementos automataElemento = new AutomataElementos( visitado,  transicionArriba, transicionAbajo,  otro,  id);
        automataElemento.id = -1; 
        automataElemento.otro = 0;
        automataElemento.transicionArriba = 'E'; 
        automataElemento.transicionAbajo = 'E'; 
        automataElemento.visitado = 0; 
        return automataElemento;
    }
}