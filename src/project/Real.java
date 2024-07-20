package project;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
	}
	
	@Override
	public void info() {	
		System.out.println("R$"+ valor);
	}

	@Override
	public double converte() {
		return valor;
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
		Real other = (Real) obj;
		return Double.compare(other.valor, valor) == 0;
		
	}
	
}