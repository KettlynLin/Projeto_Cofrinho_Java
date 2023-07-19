package pacotegeral;

public class real extends moeda{
	
public real(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
		this.valor=valor;
	}
	
    @Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.printf("Real - " + valor);
	}
/*Como pedido no exercicio um método nomeado como "info" foi criado de forma abstrata
 * na classe mãe, nas classes filhas o mesmo surge para mostrar a moeda armazenada
 */

	public double converter() {
		// TODO Auto-generated method stub		
		return valor;
			
	}
/*Como pedido no diagrama UML um método nomeado como "converter" foi criado para transformar todos os valores
 * em reais, nesta classe(real) o mesmo não retorna o valor multiplicado pois não há necessidade
 */

	


}
