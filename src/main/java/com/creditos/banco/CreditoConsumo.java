package com.creditos.banco;

/**
 * 
 * Classe abstrada para créditos do tipo consumo. As classes CreditoAutomovel e CreditoEducacao são suas filhas.
 */
public abstract class CreditoConsumo extends Credito {

	protected CreditoConsumo(String nomeCliente, String profissaoCliente, double montante, int prazoFinanciamento) {
		super(nomeCliente, profissaoCliente, montante, prazoFinanciamento);
		qteContas++;
	}
	
	private static int qteContas = 0;
	
	/**
	 * 
	 * @return retorna a quantidade de contas de credito para consumo criadas. Isso inclui CreditoAutomovel e CreditoEducacao.
	 */
	public static int getQteContas() {
		return qteContas;
	}

}