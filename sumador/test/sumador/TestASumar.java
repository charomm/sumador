package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	@Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar();
        String resultado = sumi.sumativo("5");
        assertEquals("5 = 5",resultado );
    }

	@Test
    public void testNegativo() {
        ASumar sumi = new ASumar();
        String resultado = sumi.sumativo("-5");
        assertEquals("Negativo. Siempre negativo",resultado);
    }	

}
