package br.cursojava.aula006.lojinha;

public class Vendedor extends Funcionario{
	private double percentualComissao;
	private double totalVendasMes;

	
	public double getPercentualComissao() {
		return percentualComissao;
	}
	public void setPercentualComissao(double percentualComissao) {
		if(percentualComissao > 1){
			percentualComissao /= 100;
		}
		if(percentualComissao >= 0){
			this.percentualComissao = percentualComissao;
		}
	}
	public double getTotalVendasMes() {
		return totalVendasMes;
	}
	public void setTotalVendasMes(double totalVendasMes) {
		this.totalVendasMes = totalVendasMes;
	}
	
	@Override
	public double getSalarioLiquido(){
		double comissao = totalVendasMes * percentualComissao;
		double salarioBruto = this.getSalarioBase() + comissao;
		return salarioBruto * (1 - 0.11);
	}
	
	public double getSalarioLiquido(double abono){
		return this.getSalarioLiquido() + abono;
	}
	
	public double getSalarioLiquido(float percentual){
		return this.getSalarioLiquido() * (1+ percentual);
	}
	
	

}







