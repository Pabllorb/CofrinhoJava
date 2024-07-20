package project;

public class Dolar extends Moeda{

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("$"+valor);
	}

	@Override
	public double converte() {
		/*valor em Dolar multiplicado pelo valor da moeda em Real no dia 
		em que o código foi criado*/
		return valor * 5.11;
	}
	//Implementa o método equals para uso pelo método remover da classe cofrinho.
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if 	(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Dolar other = (Dolar) obj;
		return Double.compare(other.valor, valor) == 0;
	}

}