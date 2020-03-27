package com.creditos.banco;

public class Main {

	public static void main(String[] args) {

		double montanteTotalHab = 0;
		double montanteTotalEdu = 0;
		double montanteTotalAuto = 0;
		
		double jurosTotalHab = 0;
		double jurosTotalEdu = 0;
		double jurosTotalAuto = 0;

		
		CreditoHabitacao hab1 = new CreditoHabitacao("João da Silva", "Engenheiro", 100000, 120, 0.03);
		CreditoHabitacao hab2 = new CreditoHabitacao("José Oliveira", "Médico", 170000, 300, 0.02);
		
		CreditoEducacao edu1 = new CreditoEducacao("Claudia Amorim", "Advogada", 80000, 60, 20);
		CreditoEducacao edu2 = new CreditoEducacao("Manuel Carvalho", "Veterinário", 62000, 48, 15);
		
		CreditoAutomovel auto1 = new CreditoAutomovel("Jotaro Kujoh", "Biólogo marinho", 130000, 18);
		CreditoAutomovel auto2 = new CreditoAutomovel("Miranda Priesley", "Estilista", 200000, 48);

		CreditoHabitacao[] arrHab = {hab1, hab2};
		CreditoEducacao[] arrEdu = {edu1, edu2};
		CreditoAutomovel[] arrAuto = {auto1, auto2};
		
		System.out.println("Créditos de habitação: " + CreditoHabitacao.getQteContas() + "\n");
		for(int i = 0; i<2; i++) {
			System.out.println(arrHab[i].toString());
			montanteTotalHab += arrHab[i].calcularMontanteAReceber();
			jurosTotalHab += arrHab[i].calcularMontanteTotalJuros();
		}
		System.out.format("Montante total a receber: %.2f \n", montanteTotalHab);
		System.out.format("Juros totais a receber: %.2f \n\n", jurosTotalHab);
		
		System.out.println("Créditos de consumo: " + CreditoConsumo.getQteContas() + "\n\nCréditos de educação: \n");
		for(int i = 0; i<2; i++) {
			System.out.println(arrEdu[i].toString());
			montanteTotalEdu += arrEdu[i].calcularMontanteAReceber();
			jurosTotalEdu += arrEdu[i].calcularMontanteTotalJuros();
		}
		System.out.format("Montante total a receber: %.2f \n", montanteTotalEdu);
		System.out.format("Juros totais a receber: %.2f \n\n", jurosTotalEdu);
		
		System.out.println("Créditos de automóvel: \n");
		for(int i = 0; i<2; i++) {
			System.out.println(arrAuto[i].toString());
			montanteTotalAuto += arrAuto[i].calcularMontanteAReceber();
			jurosTotalAuto += arrAuto[i].calcularMontanteTotalJuros();
		}
		System.out.format("Montante total a receber: %.2f \n", montanteTotalAuto);
		System.out.format("Juros totais a receber: %.2f \n\n", jurosTotalAuto);

	}

}