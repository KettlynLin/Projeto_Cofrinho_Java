package pacotegeral;

public class dolar extends moeda {
	
	public dolar(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
		this.valor=valor;
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("Dolar - " + valor);
		}

	@Override
	public double converter() {
		// TODO Auto-generated method stub
		return valor*4.9;
		
	}

	
	
}
