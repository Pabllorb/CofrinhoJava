package project;

public class Euro extends Moeda{

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public void info() {	
		System.out.println("Є" + valor);
	}

	@Override
	public double converte() {
		/*valor em Euro multiplicado pelo valor da moeda em Real no dia 
		em que o código foi criado*/
		return valor * 5.47;
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
		Euro other = (Euro) obj;
		return Double.compare(other.valor, valor) == 0;
	}

}