package com.practica.cajablanca;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajanegra.EmptyCollectionException;

public class TestSustituirPalabra {
	
	Editor miEditor;
	
	@BeforeEach
	void setUp() throws Exception {
		miEditor = new Editor();
	}
	
	
	@Test
	public void sustituirPalabraPath1(){
			miEditor.sustituirPalabra("any","another");
			assertEquals(0,miEditor.size());
	}
	
	@Test
	public void sustituirPalabraPath2(){
		miEditor.leerFichero(".\\txtSustituirPalabra\\path2.txt");
		miEditor.sustituirPalabra("any","another");
		assertAll("Probamos que el editor tiene una única línea de tamaño 0", 
				()-> assertEquals(1,miEditor.size()),
				()-> assertEquals(0,miEditor.getLinea(1).size())
		);
	}
	
	@Test
	public void sustituirPalabraPath3(){
		miEditor.leerFichero(".\\txtSustituirPalabra\\path3.txt");
		miEditor.sustituirPalabra("any","another");
		assertAll("Probamos que el editor tiene dos línea de tamaño 0", 
				()-> assertEquals(2,miEditor.size()),
				()-> assertEquals(0,miEditor.getLinea(1).size()),
				()-> assertEquals(0,miEditor.getLinea(2).size())
		);
	}
	
	@Test
	public void sustituirPalabraPath4(){
		miEditor.leerFichero(".\\txtSustituirPalabra\\path4.txt");
		miEditor.sustituirPalabra("B","another");
		assertAll("Probamos que el editor no se ha modificado y tiene una línea que es una sola A", 
				()-> assertEquals(1,miEditor.size()),
				()-> assertEquals(1,miEditor.getLinea(1).size()),
				()-> assertEquals("[A]",miEditor.getLinea(1).toString())
		);
		
	}
	@Test
	public void sustituirPalabraPath5(){
		miEditor.leerFichero(".\\txtSustituirPalabra\\path5.txt");
		miEditor.sustituirPalabra("A","B");
		assertAll("Probamos que el editor se ha modificado y tiene una línea que es una sola B", 
				()-> assertEquals(1,miEditor.size()),
				()-> assertEquals(1,miEditor.getLinea(1).size()),
				()-> assertEquals("[B]",miEditor.getLinea(1).toString())
		);
		
	}

}
