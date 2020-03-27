package com.creditos.banco;
public class CreditoHabitacao extends Credito {

	private static final double TAXA_EURIBOR_12_MESES = 0.01;
	private static int qteContas = 0;
	
	private double spread;
	private double taxaAnualJuros;
	
	protected CreditoHabitacao(String nomeCliente, String profissaoCliente, double montante, int prazoFinanciamento, double spread) {
		super(nomeCliente, profissaoCliente, montante, prazoFinanciamento);
		this.spread = spread;
		this.taxaAnualJuros = spread + CreditoHabitacao.TAXA_EURIBOR_12_MESES;
		setQteContas(getQteContas() + 1);
	}
	
	public String toString() {
		return super.toString() + "Spread: " + spread + "\nTaxa anual de juros: " + taxaAnualJuros + "\n";
	}
	
	@Override
	public double calcularMontanteTotalJuros() {
        double emprestimo = getMontante();
        double taxaMensalJuros = taxaAnualJuros/12;
        double amortizacao = emprestimo / prazoFinanciamento; 
        double montanteTotalJuros = 0;
        
        for(int i = 1; i <= prazoFinanciamento; i++){
            montanteTotalJuros += (emprestimo * taxaMensalJuros); 
            emprestimo -= amortizacao;
            
        }
        return montanteTotalJuros;
	}

	/**
	 * 
	 * @return retorna a quantidade de contas de credito para habitação criadas
	 */
	public static int getQteContas() {
		return qteContas;
	}

	public static void setQteContas(int qteContas) {
		CreditoHabitacao.qteContas = qteContas;
	}
	
}