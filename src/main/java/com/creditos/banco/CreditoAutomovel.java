package com.creditos.banco;

public class CreditoAutomovel extends CreditoConsumo {

	protected CreditoAutomovel(String nomeCliente, String profissaoCliente, double valorEmprestimo, int prazoFinanciamento) {
		super(nomeCliente, profissaoCliente, valorEmprestimo, prazoFinanciamento);
	}

	private static final double TAXA_DE_JURO_ANUAL = 0.06;
	private static final double TAXA_DE_DESCONTO = 0.01;
	
	public String toString() {
		return super.toString();
	}
	

	@Override
	protected double calcularMontanteTotalJuros() {
        double emprestimo = getMontante();
        double taxaMensalJuros = TAXA_DE_JURO_ANUAL/12;
        double taxaMensalDesconto = TAXA_DE_DESCONTO/12;
        double amortizacao = emprestimo / prazoFinanciamento; 
        double montanteTotalJuros = 0;
        
        if(prazoFinanciamento<=24) {
	        for(int i = 1; i <= prazoFinanciamento; i++){
	            montanteTotalJuros += (emprestimo * (taxaMensalJuros-taxaMensalDesconto)); 
	            emprestimo -= amortizacao;
	            
	        }
	        return montanteTotalJuros;
        }
        else {
	        for(int i = 1; i <= prazoFinanciamento; i++){
	            montanteTotalJuros += (emprestimo * taxaMensalJuros); 
	            emprestimo -= amortizacao;
	            
	        }
	        return montanteTotalJuros;
        }
	}
}