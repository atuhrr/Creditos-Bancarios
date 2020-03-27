package com.creditos.banco;

/**
 * 
 * 
 * Classe mãe do projeto. As classes CreditoHabitacao e CreditoConsumo são suas filhas.
 */
public abstract class Credito 
{
	protected String nomeCliente;
	protected String profissaoCliente;
	protected double montante;
	protected int prazoFinanciamento;
	
	/**
	 * 
	 * Construtor da classe
	 * @param nomeCliente
	 * @param profissaoCliente
	 * @param montante
	 * @param prazoFinanciamento
	 * 
	 */
	protected Credito(String nomeCliente, String profissaoCliente, double montante, int prazoFinanciamento) {
		this.nomeCliente = nomeCliente;
		this.profissaoCliente = profissaoCliente;
		this.montante = montante;
		this.prazoFinanciamento = prazoFinanciamento;
	}

	/**
	 * 
	 * @return Double Retorna o montante total a ser recebido pelo banco após o pagamento do empréstimo
	 */
	protected double calcularMontanteAReceber() {
		return montante + calcularMontanteTotalJuros();
	}
	
	/**
	 * 
	 * @return Double Retorna o total de juros a serem recebidos pelo banco ao final do pagamento do empréstimo
	 */
	protected abstract double calcularMontanteTotalJuros();
	
	/**
	 * @return String Retorna as informações do cliente em forma de uma string de dados
	 */
	@Override
	public String toString() {
		return "Nome:" + nomeCliente + "\nProfissão: " + profissaoCliente + "\nMontante: "
				+ montante + "\nPrazo do financiamento: " + prazoFinanciamento + " meses\n";
	}
	
	/**
	 * 
	 * @return String Retorna o nome do cliente
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	/**
	 * 
	 * @param nomeCliente
	 * Edita o nome do cliente
	 */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	/**
	 * 
	 * @return String Retorna a profissão do cliente
	 */
	public String getProfissaoCliente() {
		return profissaoCliente;
	}
	
	/**
	 * 
	 * @param profissaoCliente
	 * Edita a profissão do cliente
	 */
	public void setProfissaoCliente(String profissaoCliente) {
		this.profissaoCliente = profissaoCliente;
	}
	
	/**
	 * 
	 * @return Double Retorna o montante emprestado
	 */
	public double getMontante() {
		return montante;
	}
	
	/**
	 * 
	 * @param montante
	 * Configura o montante emprestado
	 */
	public void setMontante(double montante) {
		this.montante = montante;
	}
	
	/**
	 * 
	 * @return Int Retorna o prazo de financiamento
	 */
	public int getPrazoFinanciamento() {
		return prazoFinanciamento;
	}
	
	/**
	 * 
	 * @param prazoFinanciamento
	 * Configura o prazo de financiamento
	 */
	public void setPrazoFinanciamento(int prazoFinanciamento) {
		this.prazoFinanciamento = prazoFinanciamento;
	}
}