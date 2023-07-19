package pacotegeral;

import java.util.Scanner;

public class principal {
	
    private cofrinho cofrinho;
    private moeda Moeda = null;
    
    /* Como as classes cofrinho e moeda seriam convocadas em todo meu código, 
     * fixei as duas no inicio de meu código
     */

	public principal() {
		cofrinho = new cofrinho();
	}
	
	/*criei um método construtor para instanciar o cofrinho e alocar memória
	 * pois para as ações de adição e remoção o mesmo deve ser o primeiro a ser instanciado
	 */
	
    public void menuPrincipal() {
    	
    	//criei um método com nome "menuPrincipal" para que possa ser chamado no main e não causar confusão
		
		System.out.println("\nCOFRINHO:\n");
		System.out.println("1)Adicionar");
		System.out.println("2)Remover");
		System.out.println("3)Listar Moedas");
		System.out.println("4)Ver Total Convertido");
		System.out.println("5)Encerrar\n");
		
		
		try (Scanner numeroDeEntrada = new Scanner(System.in)) {
			int numeroEntrada = numeroDeEntrada.nextInt();
		//para evitar que o usuário entre com um valor que não seja int, criei um try, para testar o que foi inserido
			
			switch(numeroEntrada) {
			
			    case 1:
				
				  System.out.println("Qual o tipo da sua moeda?");
				  System.out.println("1)Real");
				  System.out.println("2)Dolar");
				  System.out.println("3)Euro\n");
				
				  int adicionarMoeda= numeroDeEntrada.nextInt();
				  System.out.println("Insira seu valor:\n");
				
				  String valorMoeda = numeroDeEntrada.next();
				  valorMoeda = valorMoeda.replace(",", ".");
				  Double valorMoedaDouble = Double.valueOf(valorMoeda);
				  
				  /*se caso o usuário tentar entrar com uma virgula ao invés de ponto o código faz
				   * um "replace" reescrevendo o que foi passado para a máquina
				   */
				  
				 
				  if(adicionarMoeda==1) {
					Moeda = new real(valorMoedaDouble);
					
				
				  }else if(adicionarMoeda==2) {
					Moeda = new dolar(valorMoedaDouble);
					
					
				  }else if(adicionarMoeda==3) {
					Moeda = new euro(valorMoedaDouble);
					
					
				  }else{
					System.out.println("Este modelo nao existe!\n");
					menuPrincipal();
				  }
				
				  cofrinho.adicionar(Moeda);
				  /*como o método de adicionar necessita que seja passado um tipo moeda, utilizei
				   * do polimorfismo nos meus if para adicionar valores em cada classe filha corretamente
				   */
				  menuPrincipal();
				  break;
				  
				  /*ao final de cada caso do switch convoquei o método do "menuPrincipal" para
				   * dar a possibilidade do usuário efetuar outras ações caso queira
				   */
				  
			    case 2:
			    	 System.out.println("Qual o tipo da sua moeda?");
					 System.out.println("1)Real");
					 System.out.println("2)Dolar");
					 System.out.println("3)Euro\n");
					 

					  int removerMoeda= numeroDeEntrada.nextInt();
					  System.out.println("Insira seu valor:\n");
					
					  String valorMoedaRemocao = numeroDeEntrada.next();
					  valorMoedaRemocao = valorMoedaRemocao.replace(",", ".");
					  Double valorMoedaDoubleRemocao = Double.valueOf(valorMoedaRemocao);
					  
					  if(removerMoeda==1) {
							Moeda = new real(valorMoedaDoubleRemocao);
							
						
						  }else if(removerMoeda==2) {
							Moeda = new dolar(valorMoedaDoubleRemocao);
							
							
						  }else if(removerMoeda==3) {
							Moeda = new euro(valorMoedaDoubleRemocao);
							
							
						  }else{
							System.out.println("Este modelo nao existe!\n");
							menuPrincipal();
						  }
					 /*para que cada moeda seja removida, foi necessario criar outra moeda com
					  * o mesmo valor, para ocorrer a comparação no equals que se encontra na classe
					  * mãe "moeda"
					  */
					cofrinho.remover(Moeda);
					menuPrincipal();
			    	break;
			
				
			    case 3:
				  cofrinho.listagemMoedas();
				  menuPrincipal();
				  break;
				  
			    case 4:
			    	System.out.println("Total Convertido: " + cofrinho.totalConvertido());
			    	menuPrincipal();
			    	break;
			
			    case 5:
				  System.out.println("Encerrando!\n");
				  break;
				  
				default:
				  System.out.println("Houve algum erro, retornando ao menu...\n");
				  menuPrincipal();
				  
				  /*Caso o usuário não insira nenhum dos valores do menu, o mesmo é informado
				   * de um erro e retorna ao menu
				   */

			}
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Algo deu errado, encerrando o programa...");
			/*caso o uruário insira um valor que não seja do tipo int
			 * o mesmo é informado de um erro e o programa encerra
			 */
		}
									
}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		principal p = new principal();
		p.menuPrincipal();
		
		//no main apenas efetuamos a chamada da classe principal e do menu
  

	}
}
