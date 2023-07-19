package pacotegeral;

import java.util.Objects;

public abstract class moeda {

    double valor;
    
    /*Um variavel do tipo double com o nome "valor" é criada para armazenar os valores
     * das moedas
     */
    
	public abstract void info();
	public abstract double converter();
	
	/*Duas classes abstratas foram criadas conforme pedia o exercicio,
	 * como as duas não possuiam necessidade de serem preenchidas na mãe
	 * e possuem métodos diferentes de manuseio nas classes filhas
	 */
	
	public moeda(double valor){}
	
	/*Como cada classe filha iria precisar de um método construtor, criei o mesmo pela classe mãe
	 * assim as filhas podem apenas herda-lo.
	 */
	
	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		moeda other = (moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
/*O método de remoção do ArrayList necessita de um método de comparação para identificar o valor e compara-lo com outro valor,
 * caso não houvesse sido transcrito o modelo equals o mesmo iria comparar a memoria alocada e não os valores.
 * Por tal motivo transcrevi o método na classe mãe com um tipo objeto que por sua vez irá comparar os valores para o método de remoção.
 */
	
	
}
