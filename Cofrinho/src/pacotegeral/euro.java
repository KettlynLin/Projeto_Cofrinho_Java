package pacotegeral;

public class euro extends moeda {
	
	public euro(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
		this.valor=valor;
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub	
		System.out.println("Euro - " + valor);
	}

	@Override
	public double converter() {
		// TODO Auto-generated method stub
		return valor*5.37;
				
	}

	
}
