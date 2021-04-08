package sumador;

/**
 * @author Charo
 * @version: 1.0
 *
 */
public class ASumar {

	/**
	 * Función que se le pasa una cadena formada por números y nos
	 * devuelve dicha cadena sumando los dñigitos que la componen.
	 * Ejemplo: "2654" no dará como resultado "2 + 6 + 5 + 4 = 17"
	 * @param texto que contiene la cadena de números que hay que sumar: Ej: "2654"
	 * @return cadena con el resultado de la suma. Ej: "2 + 6 + 5 + 4 = 17"
	 */
	public String sumativo(String cad) {
		String numero = cad;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        } 
        return "";
	}

}