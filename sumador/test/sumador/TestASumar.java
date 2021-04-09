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

	@Test
    public void testVariasCifras() {
        ASumar sumi = new ASumar();
        String resultado = sumi.sumativo("2654");
        assertEquals("2 + 6 + 5 + 4 = 17",resultado );
    }
	
	@Test
    public void testVariasCifras2() {
        ASumar sumi = new ASumar();
        String resultado = sumi.sumativo("00");
        assertEquals("0 + 0 = 0",resultado );
    }
	
	@Test
    public void testVariasCifras3() {
        ASumar sumi = new ASumar();
        String resultado = sumi.sumativo("123456789");
        assertEquals("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45",resultado );
    }
	
}
