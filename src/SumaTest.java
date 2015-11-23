import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SumaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		System.out.println("Inicio pruebas");
		System.out.println("-----------------------------------------------------");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		System.out.println("------------------------------------------------");
		System.out.println("Fin pruebas");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Comienza el test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Termina el test");
		
	}

	@Test
	   public void sumaPositivos() {
	      System.out.println("Sumando dos números positivos ...");
	       Suma Sum = new Suma(2, 3);
	       assertTrue(Sum.sumar() == 5);
	   }

	   @Test
	   public void sumaNegativos() {
	       System.out.println("Sumando dos números negativos ...");
	       Suma Sum = new Suma(-2, -3);
	       assertTrue(Sum.sumar() == -5);
	   }

	   @Test
	   public void sumaPositivoNegativo() {
	       System.out.println("Sumando un número positivo y un número negativo ...");
	       Suma Sum = new Suma(2, -3);
	       assertTrue(Sum.sumar() == -1);
	   }

	
}
