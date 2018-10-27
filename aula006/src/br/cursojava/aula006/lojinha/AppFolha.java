package br.cursojava.aula006.lojinha;

public class AppFolha {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		func.setNome("Bagrinho");
		func.setSalarioBase(1000);
		
		Vendedor vend = new Vendedor();
		vend.setNome("José");
		vend.setPercentualComissao(0.05);
		vend.setTotalVendasMes(50000);
		vend.setSalarioBase(1000);
		
		FolhaPagamento folha = new FolhaPagamento();
		folha.imprimir(func);
		folha.imprimir(vend);
		
		Funcionario funcVend = new Vendedor();
		//Vendedor vendFunc = new Funcionario();
	}
}










