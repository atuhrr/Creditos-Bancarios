package com.creditos.banco;

public class CreditoEducacao extends CreditoConsumo {

	private static final double TAXA_ANUAL_DE_JUROS = 0.02;
	private int periodoCarencia;
	
	protected CreditoEducacao(String nomeCliente, String profissaoCliente, double montante, int prazoFinanciamento, int periodoCarencia) {
		super(nomeCliente, profissaoCliente, montante, prazoFinanciamento);
		this.periodoCarencia = periodoCarencia;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Periodo de carência: " + periodoCarencia + " meses\n";
	}
	public int getPeriodoCarencia() {
		return periodoCarencia;
	}
	public void setPeriodoCarencia(int periodoCarencia) {
		this.periodoCarencia = periodoCarencia;
	}

	@Override
	public double calcularMontanteTotalJuros() {
		int n = periodoCarencia;
        double emprestimo = getMontante();
        double taxaMensalJuros = TAXA_ANUAL_DE_JUROS/12;
        double amortizacao = emprestimo / prazoFinanciamento; 
        double montanteTotalJuros = 0;
        
        for(int i = n; i <= prazoFinanciamento; i++){
            montanteTotalJuros += (emprestimo * taxaMensalJuros); 
            emprestimo -= amortizacao;
            
        }
        return montanteTotalJuros;
	}

}