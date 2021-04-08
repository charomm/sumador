package sumador;

/**
 * @author Charo
 * @version: 1.0
 *
 */
public class ASumar {

	/**
	 * Funci�n que se le pasa una cadena formada por n�meros y nos
	 * devuelve dicha cadena sumando los d�igitos que la componen.
	 * Ejemplo: "2654" no dar� como resultado "2 + 6 + 5 + 4 = 17"
	 * @param texto que contiene la cadena de n�meros que hay que sumar: Ej: "2654"
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