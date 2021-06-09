enum PlantillasR {
    CONCATENACION("."), OR("|"), ASTERISCO("*"), POSITIVA("+"), PARENTESISIZQUIERDO("("), PARENTESISDERECHO(")");
    private String valor;
    PlantillasR(String valor) { 
        this.valor = valor; 
    }

    public String getValor() { 
        return this.valor; 
    }
    public static boolean esValida(String valor) { 
        if(valor != null) { 
            for (PlantillasR p : PlantillasR.values()) { 
                if(valor.equalsIgnoreCase(p.valor)) { 
                    return true; 
                }
            }
        }
        return false; 
    }
}
