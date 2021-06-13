def consumir (lista):
    lista = lista.copy()
    lista.reverse()
    lista.pop()
    lista1 = lista.copy()
    lista1.reverse()
    return lista1

def A(entrada): 
    if entrada [0] == 'a': 
        try: 
            cons1 = consumir(entrada)
            print(f'"a" es consumida en A, cadena a evaluar en B({cons1})')
            bSalida = B(cons1) 
            print(f'regreso de B en A, cadena a consumir en: {bSalida}')
            try: 
                cons2 = consumir(bSalida)
                print(f'Regla A termina')
                return cons2
            except: 
                print('La cadena no forma parte de la gramatica A')
        except: 
            print('La cadena no forma parte de la gramatica A')
    else: 
        print('La cadena no forma parte de la gramatica')
def B(entrada):
    if entrada[0] == 'a': 
        print(f'"a" consumida en B, cadena consumida{entrada}')
        return consumir(entrada)
    elif entrada[0] == 'b': 
        try: 
            cons1 = consumir(entrada)
            print(f'"b" consumida en B cadena a evaluar en A({cons1})')
            aSal = A(cons1)
            print(f'Regreso de A en B: {aSal}')
            try: 
                cons2 = consumir(aSal)
                print(f'Regreso de A en B: {aSal}')
                return cons2
            except: 
                print('La cadena no forma parte de la gramatica')
        except: 
            print('La cadena no forma parte de la gramatica')
    else: 
        print('La cadena no forma parte de la gramatica')


def main(): 
    cadena = input('Introduce la cadena a evaluar')
    Cadena = list(cadena)
    A(Cadena)

if __name__ == '__main__': 
    main()