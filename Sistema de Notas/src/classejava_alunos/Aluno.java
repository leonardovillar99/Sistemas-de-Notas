package classejava_alunos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import classejava_status.StatusAluno;

public class Aluno {
	private String nome;
	private String cpf;
	private String matricula;
	private int idade;
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private double media;
	
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	public double calcMediaFinal() {
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		return media;
	}
	
	public String Status() {
		if(media >= 5) {
			if(media >= 7) {
				return StatusAluno.APROVADO;
			}
			return StatusAluno.RECUPERACAO;
		}else {
			return StatusAluno.REPROVADO;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(alunos, cpf, idade, matricula, media, nome, nota1, nota2, nota3, nota4);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(alunos, other.alunos) && Objects.equals(cpf, other.cpf) && idade == other.idade
				&& Objects.equals(matricula, other.matricula)
				&& Double.doubleToLongBits(media) == Double.doubleToLongBits(other.media)
				&& Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3)
				&& Double.doubleToLongBits(nota4) == Double.doubleToLongBits(other.nota4);
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cpf=" + cpf + ", matricula=" + matricula + ", idade=" + idade + ", nota1="
				+ nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4 + ", media=" + media
				+ ", alunos=" + alunos + "]";
	}
	
}
