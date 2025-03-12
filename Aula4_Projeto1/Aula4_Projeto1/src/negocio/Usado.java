package negocio;

public class Usado extends Imovel {//IMPORANTE! "extends" -> Diz que a classe Usado é FILHA da outra classe, no caso, Imovel, que nesse caso, imovel é classe abstrata.

	
	
	//Propriedades da classe
	private double depreciacao = 0;

	
	
	
	//Metodos construturoes da classs
	public Usado() {//Construtor vazio
		super();
	}

	
	public Usado(String endereco, double metragem, double valor, double depreciacao) {//Construtor Cheio
		super(endereco, metragem, valor);
		this.depreciacao = depreciacao;
	}

	
	
	
	
	//Metodos de acesso da classe
	public double getDepreciacao() {
		return depreciacao;
	}

	public void setDepreciacao(double depreciacao) {
		this.depreciacao = depreciacao;
	}
	
	
	
	
	
	//Metodos sobrescritos da hierarquia
	public double getValor() {
		return(super.getValor() - this.getDepreciacao()); //Valor do pai menos a depreciação do filho
	}
}
