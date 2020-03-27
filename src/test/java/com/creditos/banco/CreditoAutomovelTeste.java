package com.creditos.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class CreditoAutomovelTeste {

    public CreditoAutomovelTeste() {
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
	void testCalcularMontanteTotalJuros() {
		//Delta igual a 1 pois o cálculo é em double e, portanto, é passível de erros de precisão
		CreditoAutomovel teste = new CreditoAutomovel(null, null, 75000, 23);
        double resultadoEsperado = 3750;
        double resultado = teste.calcularMontanteTotalJuros();
        assertEquals(resultadoEsperado, resultado, 1);
	}

	@Test
	void testCalcularMontanteAReceber() {
		CreditoAutomovel teste = new CreditoAutomovel(null, null, 75000, 23);
        double resultadoEsperado = 78750;
        double resultado = teste.calcularMontanteAReceber();
        assertEquals(resultadoEsperado, resultado, 1);
	}

}