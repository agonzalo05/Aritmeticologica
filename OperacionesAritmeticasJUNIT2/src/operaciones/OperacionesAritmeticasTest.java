package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperacionesAritmeticasTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		OperacionesAritmeticas op = new OperacionesAritmeticas(0,0);
		
		System.out.println("Caso prueba 1 : suma a ="+ op.getA()+" B = "+ op.getB());
		int esperado =0;
		assertEquals(esperado, op.suma());
		
		
		op.setA(-1);
		op.setB(-1);
		esperado = -2;
		System.out.println("Caso prueba 2 : suma a ="+ op.getA()+" B = "+ op.getB());
		
		assertEquals(esperado, op.suma());
		
		//negativo con positivo
		op.setA(-1);
		op.setB(1);
		esperado = 0;
		System.out.println("Caso prueba 3 : suma a ="+ op.getA()+" B = "+ op.getB());
		
		assertEquals(esperado, op.suma());
		//positivo con positivo
		
		op.setA(5);
		op.setB(5);
		esperado = 10;
		System.out.println("Caso prueba 4 : suma a ="+ op.getA()+" B = "+ op.getB());
		
		assertEquals(esperado, op.suma());
		//positivo con negativo
		op.setA(5);
		op.setB(-3);
		esperado = 2;
		System.out.println("Caso prueba 5 : suma a ="+ op.getA()+" B = "+ op.getB());
		
		assertEquals(esperado, op.suma());
	}

	@Test
	void testResta() {
OperacionesAritmeticas op = new OperacionesAritmeticas(0,0);
		
		System.out.println("Caso prueba 1 : resta a ="+ op.getA()+" B = "+ op.getB());
		int esperado =0;
		assertEquals(esperado, op.resta());
		
		
		op.setA(-1);
		op.setB(-1);
		esperado = 0;
		System.out.println("Caso prueba 2 : resta a ="+ op.getA()+" B = "+ op.getB());
		
		assertEquals(esperado, op.resta());
		
		//negativo con positivo
		op.setA(-1);
		op.setB(1);
		esperado = 0;
		System.out.println("Caso prueba 3 : resta a ="+ op.getA()+" B = "+ op.getB());
		
		assertEquals(esperado, op.resta());
		//positivo con positivo
		
		op.setA(5);
		op.setB(5);
		esperado = 0;
		System.out.println("Caso prueba 4 : resta a ="+ op.getA()+" B = "+ op.getB());
		
		assertEquals(esperado, op.resta());
		//positivo con negativo
		op.setA(5);
		op.setB(-3);
		esperado = 2;
		System.out.println("Caso prueba 5 : resta a ="+ op.getA()+" B = "+ op.getB());
		
		assertEquals(esperado, op.resta());
	}

	@Test
	void testProducto() {
		fail("Not yet implemented");
	}

	@Test
	void testDivision() {
		fail("Not yet implemented");
	}

}
