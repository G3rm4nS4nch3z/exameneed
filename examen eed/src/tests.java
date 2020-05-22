import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class tests extends TestCase {

	@Test
	@DisplayName(value = "Resultado correcto isbn10")
	public void testcheckISBN10True() {
		Libro libro = new Libro("El Quijote", "123456789X", "Cervantes", "SM");
		Boolean resultado = libro.checkISBN10();
		assertTrue(resultado);
	}

	@Test
	@DisplayName(value = "Resultado incorrecto isbn10")
	public void testcheckISBN10False() {
		Libro libro = new Libro("El Quijote", "12345676G", "Cervantes", "SM");
		Boolean resultado = libro.checkISBN10();
		assertFalse(resultado);
	}

	@Test
	@DisplayName(value = "Resultado correcto isbn13")
	public void testcheckISBN13True() {
		Libro libro = new Libro("El Quijote", "1234567890001", "Cervantes", "SM");
		Boolean resultado = libro.checkISBN10();
		assertTrue(resultado);
	}

	@Test
	@DisplayName(value = "Resultado incorrecto isbn13")
	public void testcheckISBN13False() {
		Libro libro = new Libro("El Quijote", "1234567890001", "Cervantes", "SM");
		Boolean resultado = libro.checkISBN10();
		assertFalse(resultado);
	}
}
