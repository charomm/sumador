package sumador;

public class ASumar {

	/**
	 * Funci�n que se le pasa una cadena formada por n�meros y nos
	 * devuelve dicha cadena sumando los digitos que la componen.
	 * Ejemplo: "2654" no dar� como resultado "2 + 6 + 5 + 4 = 17"
	 * Si el n�mero es negativo devolver� la cadena  "Negativo. Siempre negativo"
	 * 
	 * @param texto que contiene la cadena de n�meros que hay que sumar: Ej: "2654"
	 * @return cadena con el resultado de la suma. Ej: "2 + 6 + 5 + 4 = 17".
	 */
	public String sumativo(String numero) {
		String cadena = "";
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        } else if (numero.length() > 1) {
        	if (numero.substring(0,1).equals("-")) {
        		return "Negativo. Siempre negativo";
        	} else {
        		int suma = 0;
        		for (int i = 0; i < numero.length(); i++) {
        			String c = numero.substring(i, i+1);
        			if (i > 0) {
        				cadena += " + ";
        			}
        			cadena += c;
        			suma += Integer.valueOf(c).intValue();
        		}
        		cadena += " = " + suma;
        	}
        }
        return cadena;
	}

}