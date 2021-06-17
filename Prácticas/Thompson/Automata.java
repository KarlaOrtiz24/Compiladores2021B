/**
*@Auhtor Karla Ortiz
*Compiladores 
*/import java.io.*;  
import java.util.ArrayList; 
//Pila para introducir la cadena
class Stack{  
    /**
    Arreglo para la cadena 
    int top que inicia en -1 
    */
    char a[]=new char[100];  
    int top=-1; 
    /**
    *@param char c
    Funcion para hacer push a la pila o sea meter elementos a la pila
    Se intentan meter los elementos y si no es posible entonces imprime el mensaje de que
    la pila esta llena. 
    */ 
    void push(char c) {  
        try {  
            a[++top]= c;  
        }  
        catch(StringIndexOutOfBoundsException e) {  
            System.out.println("Pila llena, tamaño=100");  
            System.exit(0);  
        }  
    } 
    /**
    Función para hacer pop a la pila o sea sacar elementos de la pila */ 
    char pop()  {  
        return a[top--];  
    }  
    /**Verifica si la pila está vacía */
    boolean isEmpty() {  
        return (top==-1)?true:false;  
    }  
    /**Lee el último elemento de la pila */
    char peek() {  
        return a[top];  
    }  
} 



/**Clase principal Automata
se crea un nuevo objeto de tipo pila 
 */    
public class Automata {  
    static Stack operadores = new Stack();         
    public static void main(String argv[]) throws IOException {  
        String infijo;
        String simbolo1, simbolo2;   
        //Crea un objeto de flujo de entrada
        BufferedReader keyboard = new BufferedReader (new InputStreamReader(System.in));  
        //Para obtener la expresión dada por el usuario  
        System.out.print("\nExpresion infija: ");  
        infijo = keyboard.readLine();  
        //Retorna la expresión en postfijo 
        System.out.println("Resultado de la expresion, a postfija:" + A_Posfijo(infijo));  
    } 
    public void concatenacion(String simbolo1, String simbolo2) { 
        ArrayList<String> estados = new ArrayList<String>();
        String ultimo_estado = estados.get(estados.size() -1 );
        System.out.println("Estado"+ ultimo_estado);
        ultimo_estado +=1; 
        estados.add(ultimo_estado);
        String resultado = new String("Ultimo estado" + ultimo_estado + "-(" + simbolo1 + ") ->");
        System.out.println(resultado.toString());
        //String resultado = String((ultimo_estado) +  " - (" + simbolo1 + ") -> ");
        ultimo_estado += 1; 
        estados.add(ultimo_estado); 
        String resultado2 = new String("Ultimo estado" + ultimo_estado +  "- (" + simbolo2 + ")->");
        System.out.println(resultado2.toString());
        ultimo_estado += 1; 
        estados.add(ultimo_estado);
        String resultado3 = new String("Ultimo estado" + ultimo_estado);
        System.out.println(resultado2.toString());      
    }
    public void Construir_automata(String cadena){
        String automata; 
        Stack operadores = new Stack();
        int i =0; 
        String[] estados = new String[i]; 
        for(char caracter : cadena.toCharArray()){
            if(caracter.equals('*')){
                System.out.println("El ciclo: "); 
            }
            else if(caracter.equals('|')) {
                char simbolo1, simbolo2; 
                simbolo1 = operadores.pop();
                simbolo2 = operadores.pop(); 

            }
        }


    }
   /**  public void Construir_automata(String cadena){


    } */
    /**Metodo que convierte a posfijo
    *@param String infix */
    private static String A_Posfijo(String infijo)  {
    //convierte una expresión infijo a postfijo    
        char symbol;  
        String posfijo = "";  
        for(int i=0;i<infijo.length();++i) { 
            //mientras haya algo dentro se leerá
            symbol = infijo.charAt(i);  
            //Si es un operador se agrega a la cadena 
            if (Character.isLetter(symbol))  
                posfijo = posfijo + symbol;  
            else if (symbol=='(') {  
                operadores.push(symbol);  
            }  
            else if (symbol==')')  {
                //Se introduce todo antes (  
                while (operadores.peek() != '(')  {  
                    posfijo = posfijo + operadores.pop();  
                }  
            operadores.pop();        //remueve '('  
            }  
            else { 
            //imprime los operadores de acuerdo a la precedencia  
                while (!operadores.isEmpty() && !(operadores.peek()=='(') && precedencia(symbol) <= precedencia(operadores.peek()))  
                    posfijo = posfijo + operadores.pop();  
                operadores.push(symbol);  
            }  
        }  
        while (!operadores.isEmpty())  
            posfijo = posfijo + operadores.pop();  
        return posfijo;  
    }
    static int precedencia(char x) {  
        if (x == '*')  
    return 1;  
        if (x == '.' || x == '|')  
        return 2;  
    return 0;  
}  
}