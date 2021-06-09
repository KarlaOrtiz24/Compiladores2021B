import java.util.Stack;
public class Plantillas{
    public int visitado; 
    public char transicionArriba; 
    public char transicionAbajo;
    public int otro; 
    public int id; 
    Pila pila = new Pila();
    Lista lista = new Lista();
    AutomataElementos automatae = new AutomataElementos(visitado, transicionAbajo, transicionArriba, otro, id);
    PilaAutomata pilaA = new PilaAutomata();
    ImplementacionElementos impelemento;
    private Token type;

	Stack <String> E = new Stack <String> (); //Pila de entrada
    Stack <String> P = new Stack <String> ();

    
    public Plantillas(Pila pila,  ImplementacionElementos impelemento) {
        this.pila = pila; 
        this.impelemento = impelemento; 
        
    }

    public void setType(String value) {
		if (value.isEmpty()) {
			this.type = Token.FIN;
		} else {

			switch (value) {
            case ".":
				this.type = Token.CONCATENACION;
			break;
			case "*":
				this.type = Token.ASTERISCO;
				break;
			case "+":
				this.type = Token.POSITIVA;
				break;
			case "|":
				this.type = Token.OR;
				break;
			case "(":
				this.type = Token.PARENTESISIZQUIERDO;
				break;
			case ")":
				this.type = Token.PARENTESISDERECHO;
				break;
			default:
				this.type = Token.VALUE;
				break;
			}
		}
	}

}  

 