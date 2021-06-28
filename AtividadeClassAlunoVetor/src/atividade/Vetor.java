package atividade;

public class Vetor {
	private Aluno[] aluno = new Aluno[10];
	private int cont;
	
	public Vetor() {
		cont=0;
	}
	
	public boolean adiciona(Aluno alu) {
		if (cont<10) {
			aluno[cont]=alu;
			cont++;
			return true;
		}
		return false;
	}
	
	public boolean busca(int posicao) {
		if (posicao>=0&&posicao<cont) {
			return true;
		}
		return false;
	}
	
	public String remove(int posicao) {
		if (posicao>=0&&posicao<cont) {
			for (int i=posicao;i<cont-1;i++) {
				aluno[i]=aluno[i+1];
			}
			aluno[cont]=null;
			cont--;
			return "Posição deletada";
		}
		return "Posição inválida";
	}
	
	public void getLista() {
		for (int i=0;i<cont;i++) {
			System.out.println(aluno[i]);
		}
	}
	
	public Aluno getAlunoP(int posicao) {
		if (busca(posicao)) {
			return aluno[posicao];
		}
		return null;
		
	}

}
