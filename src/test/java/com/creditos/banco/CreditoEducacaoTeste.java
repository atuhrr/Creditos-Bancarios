package com.creditos.banco;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 
 */
public class CreditoEducacaoTeste {
    
    public CreditoEducacaoTeste() {
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
    
    /**
     * Test of calcularMontanteAReceberPorCadaCredito method, of class CreditoEducacao.
     */
    @Test
    public void testCalcularMontanteAReceberPorCadaCredito() {
        CreditoEducacao teste = new CreditoEducacao(null, null, 50000, 40, 15);
        double resultadoEsperado = 51489.583333333336;
        double resultado = teste.calcularMontanteAReceber();
        assertEquals(resultadoEsperado, resultado, 1);
    }
    
        /**
     * Test of calcularMontanteTotalJuros method, of class CreditoEducacao.
     */
    @Test
    public void testCalcularMontanteTotalJuros() {
        CreditoEducacao teste = new CreditoEducacao(null, null, 50000, 40, 15);
        double resultadoEsperado = 1489.58;
        double resultado = teste.calcularMontanteTotalJuros();	
        assertEquals(resultadoEsperado, resultado, 1);
    }
    
    /**
	 * Test of calcularMontanteTotalJuros method, of class CreditoEducacao.
	 */
    @Test
    public void testCalcularMontanteTotalJurosSemCarencia() {
        CreditoEducacao teste = new CreditoEducacao(null, null, 50000, 40, 0);
        double resultadoEsperado = 1708.33;
        double resultado = teste.calcularMontanteTotalJuros();
        assertEquals(resultadoEsperado, resultado, 1);
    }
}