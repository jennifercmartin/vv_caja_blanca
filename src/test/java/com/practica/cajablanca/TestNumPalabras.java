package com.practica.cajablanca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestNumPalabras {
	Editor miEditor;
	
	@BeforeEach
	void setUp() throws Exception {
		miEditor = new Editor();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/** Comprueba que inicio es menor o igual que cero y sino da excepcion */
	@Test
	public void numPalabrasPath1(){
	  assertThrows(IllegalArgumentException.class, () -> {
	    miEditor.numPalabras(-1,3,"prueba");
	  });
	}
	
	/** Comprueba que la variable fin no tiene un tamaño mayor que el tamaño de editor */
	@Test
	public void numPalabrasPath2(){
	  miEditor.leerFichero(".\\txtNumPalabras\\path2.txt");
	  assertThrows(IllegalArgumentException.class, () -> {
	    miEditor.numPalabras(1,2,"prueba");
	  });
	}
	
	/** Cuando el tamaño del editor es menor o igual a 0 sale del programa */
	/** Caso posible de ejecución pero no tiene sentido que inicio sea mayor que final */
	@Test
	public void numPalabrasPath3(){
	  assertEquals(0, miEditor.numPalabras(1,0,"prueba"));
	}
	
	/** Camino que sale del primer bucle while cuando el inicio es menor que fin */
	/** problema ya que no entra a mirar la linea 1 al tener el while un menor estricto*/
	@Test
	public void numPalabrasPath4(){
	  miEditor.leerFichero(".\\txtNumPalabras\\path4.txt");
	  assertEquals(0, miEditor.numPalabras(1,1,"linea"));
	}
	
	/** Camino que sale del segundo bucle while cuando pos <= this.lista.size() */
	/** No es posible en una primera pasada del bucle */
	@Test
	public void numPalabrasPath5(){
	  miEditor.leerFichero(".\\txtNumPalabras\\path5.txt");
	  assertEquals(0, miEditor.numPalabras(1,2,"prueba"));
	}
	
	/** Camino que no encuentra la palabra */
	@Test
	public void numPalabrasPath6(){
	  miEditor.leerFichero(".\\txtNumPalabras\\path6y7.txt");
	  assertEquals(0, miEditor.numPalabras(1,2,"otro"));
	}
	
	/** Camino que encuentra la palabra */
	@Test
	public void numPalabrasPath7(){
	  miEditor.leerFichero(".\\txtNumPalabras\\path6y7.txt");
	  assertEquals(1, miEditor.numPalabras(1,2,"uno"));
	}
	

}
