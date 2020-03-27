package com.creditos.banco;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CreditoHabitacaoTeste {
	
    public CreditoHabitacaoTeste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
	@Test
	public void testCalcularMontanteTotalJuros() {
		CreditoHabitacao teste = new CreditoHabitacao(null, null,  120000, 240, 0.01);
        double resultadoEsperado = 24100;
        double resultado = teste.calcularMontanteTotalJuros();
        assertEquals(resultadoEsperado, resultado, 1);
	}

	@Test
	public void testCalcularMontanteAReceber() {
		CreditoHabitacao teste = new CreditoHabitacao(null, null,  120000, 240, 0.01);
        double resultadoEsperado = 144100;
        double resultado = teste.calcularMontanteAReceber();
        assertEquals(resultadoEsperado, resultado, 1);
	}

    
}