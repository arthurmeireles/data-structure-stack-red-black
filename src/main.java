import java.util.*;
public class main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa da pilha iniciado! \n ");
		
		System.out.println("Digite o tamanho da sua pilha! \n");
		
		int tamanhoPilha = input.nextInt();
		Peca[] pecas = new Peca[tamanhoPilha];
		Pilha pilha = new Pilha(tamanhoPilha, -1, tamanhoPilha, pecas);

		

		while(true) {
			System.out.println("Digite a função que deseja realizar! \n");
			System.out.println("Digite [1] para realizar a inclusão de uma peça Rubro");
			System.out.println("Digite [2] para realizar a inclusão de uma peça Negra");		
			System.out.println("Digite [3] para realizar a retirada de uma peça Rubro");
			System.out.println("Digite [4] para realizar a retirada de uma peça Negra");
			System.out.println("Digite [5] para listar o Array e as pilhas");
			
			
			int entrada = input.nextInt();
			
			
			if(entrada == 1) {
				Peca peca = new Peca("Rubro");
				pilha.pushRubro(peca);
				System.out.println("Incluso");
			}
			if(entrada == 2) {
				Peca peca = new Peca("Negro");
				pilha.pushNegro(peca);
				System.out.println("Incluso");

			}
			if(entrada == 3) {
				pilha.popRubro();
				System.out.println("Retirado");

			}
			if(entrada == 4) {
				pilha.popNegro();
				System.out.println("Retirado");

			}		
			if(entrada == 5) {
				pilha.listar();
			}
		}
	}
}
