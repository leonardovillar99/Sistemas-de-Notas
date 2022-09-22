package classejava_principal;

import java.util.ArrayList;
import java.util.List;

import classejava_alunos.Aluno;

public class Principal {
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Leonardo");
		aluno1.setCpf("475.570.858-33");
		aluno1.setMatricula("F343AJ-0");
		aluno1.setIdade(23);
		aluno1.setNota1(10);
		aluno1.setNota2(8);
		aluno1.setNota3(5.5);
		aluno1.setNota4(6);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Thiago");
		aluno2.setCpf("885.970.658-13");
		aluno2.setMatricula("G45HSD-8");
		aluno2.setIdade(21);
		aluno2.setNota1(4);
		aluno2.setNota2(6.6);
		aluno2.setNota3(2);
		aluno2.setNota4(9.8);
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Paulo");
		aluno3.setCpf("087.427.188-64");
		aluno3.setMatricula("G234J8-5");
		aluno3.setIdade(19);
		aluno3.setNota1(7.7);
		aluno3.setNota2(5);
		aluno3.setNota2(6);
		aluno3.setNota2(7);
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
	
		for (Aluno aluno : alunos) {
			System.out.println("Nome do aluno: " + aluno.getNome() + "\nCPF do aluno: " + aluno.getCpf()
			+ "\nMatrícula do aluno: " + aluno.getMatricula() + "\nIdade do aluno: " + aluno.getIdade()
			+ "\nMédia Final: " + aluno.calcMediaFinal() + "\nSituação: " + aluno.Status());
			
			System.out.println("----------------------------------------------------------");
		}
	}
}
