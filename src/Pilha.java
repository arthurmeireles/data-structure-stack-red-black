public class Pilha {
	
	private int tamanhoPilha;
	private Peca[] pecas;
	private int indiceRubro;
	private int indiceNegro;
	
	public Pilha(int tamanhoPilha, int indiceRubro, int indiceNegro, Peca[] pecas) {
		this.tamanhoPilha = tamanhoPilha;
		this.indiceRubro = indiceRubro;
		this.indiceNegro = indiceNegro;
		this.pecas = pecas;
	}
//	===========================================
	public int getTamanhoPilha() {
		return tamanhoPilha;
	}
	public void setTamanhoPilha(int tamanhoPilha) {
		this.tamanhoPilha = tamanhoPilha;
	}
//	===========================================
	public int getIndiceRubro() {
		return indiceRubro;
	}
	public void setIndiceRubro(int indiceRubro) {
		this.indiceRubro = indiceRubro;
	}
//	===========================================
	public int getIndiceNegro() {
		return indiceNegro;
	}
	public void setIndiceNegro(int indiceNegro) {
		this.indiceNegro = indiceNegro;
	}
//	===========================================
	public void duplicaArray() {
		Peca[] novoArray = new Peca[tamanhoPilha*2];
		int cont = novoArray.length-1;
		for(int i = 0; i<=indiceRubro; i++) {
			novoArray[i] = pecas[i];
		}
		for(int i = pecas.length-1; i >= indiceNegro; i--) {			
			novoArray[cont] = pecas[i];
			cont--;
		}
		indiceNegro = cont+1;
		tamanhoPilha = tamanhoPilha*2;
		setPecas(novoArray);
		
		System.out.println("Pilha duplicada!!!");
	}
	
	public void listar() {
		for(int i = 0; i<tamanhoPilha; i++) {
			if(pecas[i]==null) {
				System.out.println("Vazio");
			}
			else {
				System.out.println(pecas[i].getCor());
			}
		}
	}
	
//	===========================================
	public void pushNegro(Peca peca) {
		if(indiceNegro - 1 == indiceRubro) {
			System.out.println("Pilha cheia");
			duplicaArray();
		}
		indiceNegro--;
		setIndiceNegro(indiceNegro);
		pecas[indiceNegro] =  peca;
	}
	public void pushRubro(Peca peca) {
		if(indiceRubro + 1 == indiceNegro) {
			System.out.println("Pilha cheia");
			duplicaArray();
		}
		indiceRubro++;
		setIndiceRubro(indiceRubro);
		pecas[indiceRubro] =  peca;
	}
	
	
	public void popNegro() {
		pecas[indiceNegro] = null;
		indiceNegro--;
	}
	
	public void popRubro() {
		pecas[indiceRubro] = null;
		indiceRubro--;
	}
//	===========================================
	public Peca[] getPecas() {
		return pecas;
	}
	public void setPecas(Peca[] pecas) {
		this.pecas = pecas;
	}
}
