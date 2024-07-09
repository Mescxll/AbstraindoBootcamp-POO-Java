package desafio;

import java.time.LocalDate;

import desafioDominio.BootCamp;
import desafioDominio.Curso;
import desafioDominio.Dev;
import desafioDominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Sintaxe Java");
		curso1.setDescricao("Aprenda a sintaxe básica");
		curso1.setCargaHoraria(4);
		
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Orientação a Objetos");
		curso2.setDescricao("Aprenda POO");
		curso2.setCargaHoraria(6);
		
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setData(LocalDate.now());
		mentoria1.setTitulo("Apoio a estruturas de repetição");
		mentoria1.setDescricao("Mentoria Java");
					
		
		 /* System.out.println(curso1); 
		  * System.out.println(curso2);
		  * System.out.println(mentoria1);
		  */
		
		BootCamp bootcamp = new BootCamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição");
		bootcamp.getConteudos().add(mentoria1);
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		
		System.out.println(" ");
		System.out.println("-------------NOVO DEV-----------");
		System.out.println(" ");
		
		Dev dev1 = new Dev();
		dev1.setNome("Maria Eduarda");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de Maria Eduarda: " + dev1.getConteudosInstritos());
		dev1.progredir();
		dev1.progredir();
		dev1.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos de Maria Eduarda: " + dev1.getConteudosInstritos());
		System.out.println("Conteúdos Concluídos de Maria Eduarda: " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		System.out.println(" ");
		System.out.println("-------------NOVO DEV-----------");
		System.out.println(" ");

		Dev dev2 = new Dev();
		dev2.setNome("Vicente Louro");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de Vicente Louro: " + dev2.getConteudosInstritos());
		dev2.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos de Vicente Louro: " + dev2.getConteudosInstritos());
		System.out.println("Conteúdos Concluídos de Vicente Louro: " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());
		
		
		
	}
}
