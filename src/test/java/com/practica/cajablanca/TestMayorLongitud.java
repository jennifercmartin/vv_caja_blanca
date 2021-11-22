package com.practica.cajablanca;


import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajanegra.EmptyCollectionException;

public class TestMayorLongitud {
	Editor miEditor;
	
	@BeforeEach
	void setUp() throws Exception {
		miEditor = new Editor();
	}
	
	@Test
	public void mayorLongitudPath1(){
		String mayor;
		try {
			mayor=miEditor.mayorLongitud();
			assertNull(mayor);
		}
		catch(EmptyCollectionException e) {}
	}
	
	@Test
	public void mayorLongitudPath3(){
		String mayor;
		try {
			miEditor.leerFichero(".\\txtMayorLongitud\\path3.txt");
			mayor=miEditor.mayorLongitud();
			assertNull(mayor);
		}
		catch(EmptyCollectionException e) {}
	}
	
	@Test
	public void mayorLongitudPath4(){
		String mayor;
		try {
			miEditor.leerFichero(".\\txtMayorLongitud\\path4.txt");
			mayor=miEditor.mayorLongitud();
			assertEquals("A",mayor);
		}
		catch(EmptyCollectionException e) {}
	}
	
	@Test
	public void mayorLongitudPath7(){
		String mayor;
		try {
			miEditor.leerFichero(".\\txtMayorLongitud\\path7.txt");
			mayor=miEditor.mayorLongitud();
			assertEquals("Hola",mayor);
		}
		catch(EmptyCollectionException e) {}
	}
	
	@Test
	public void mayorLongitudPath8(){
		String mayor;
		try {
			miEditor.leerFichero(".\\txtMayorLongitud\\path8.txt");
			mayor=miEditor.mayorLongitud();
			assertEquals("Hola",mayor);
		}
		catch(EmptyCollectionException e) {}
	}
	
	
	
}
