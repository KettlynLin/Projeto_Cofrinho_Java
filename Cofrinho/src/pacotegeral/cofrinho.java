package pacotegeral;

import java.util.ArrayList;

public class cofrinho {
	
	double somaMoedasConvertidas=0;
	
	/*Criei um objeto com nome "somaMoedasConvertidas" para ser reponsável por 
	 * armazenar a soma de meus valores convertidos
	 */
	
	private ArrayList<moeda> listaMoedas;
	
	/*Uma ArrayList do tipo moeda foi criada, pois de tal forma se torna mais
	 * simples adicionar valores nas classes filhas de "moeda", já que não teremos
	 * que repetir um código para cada uma das subclasses várias vezes
	 */

	public cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}

	/*Criei um método construtor de cofrinho como arraylist, para o array comece sem valores
	 * e para que o mesmo aloque um local na memória
	 */

	public void adicionar(moeda m) {
		this.listaMoedas.add(m);
		System.out.println("Adicionado\n");
		
	}

	public void remover(moeda m) {
		this.listaMoedas.remove(m);
	}

	public void listagemMoedas() {
		
		for (moeda m : this.listaMoedas) {
			m.info();
		}
		
	/*O método de listagem de moedas funciona da seguinte forma:
	 * Um comando for é criado com um tipo moeda percorrendo o ArrayList "listaMoedas",
	 * para cada valor encontrado o mesmo chama o comando "m.info" que percorre o tipo moeda e suas filhas
	 * chamando o info das mesmas.
	 */
		
	}
	public double totalConvertido() {
		
		for(moeda m: this.listaMoedas) {
			somaMoedasConvertidas += m.converter();
		}
		
		return somaMoedasConvertidas;

	}
	/*O método de converter valores funciona de forma semelhante ao de listagem, com a diferença que ao invés de convocar
	 * um info, ele chama nosso objeto criado no inicio da classe e armazena a soma dos valores de converter das classes filhas de moeda
	 */



}
