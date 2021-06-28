package atividade;

public class Aluno {
	private String nome;
	private double nota;
	
	public Aluno(String nome2, double nota2) {
		setNome(nome2);
		setNota(nota2);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public String toString() {
		return "Nome: "+getNome()+", Nota: "+getNota();
	}
}
