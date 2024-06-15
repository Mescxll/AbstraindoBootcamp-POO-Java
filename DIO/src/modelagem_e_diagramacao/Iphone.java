package modelagem_e_diagramacao;
import java.util.Scanner;
public class Iphone implements Sistema, AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical{
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		Sistema.ligarAparelho();
		System.out.println("O que deseja executar?");
		System.out.println("1- Reprodutor Musical");
	    System.out.println("2- Telefone");
		System.out.println("3- Internet");	
		System.out.println(" ");
		System.out.print("");
		String Resposta = ler.nextLine();
		int resposta = Integer.parseInt(Resposta);
		if (resposta == 1) {
			System.out.println("REPRODUTOR MUSICAL EM ACESSO");	
			System.out.println("Selecione a música que deseja reproduzir:");			
			String musica = ler.nextLine();
			ReprodutorMusical.selecionarMusica (musica);
			System.out.println(" ");
			ReprodutorMusical.tocar();
			System.out.println(" ");
			System.out.println("Para pausar, selecione a opção");
			String vazia0 = ler.nextLine();
			ReprodutorMusical.pausar();
		}
		if(resposta == 2) {
			System.out.println("TELEFONE EM ACESSO");				
			System.out.println("Digite o número para qual deseja ligar:");			
			String contato = ler.nextLine();
			AparelhoTelefonico.ligar(contato);
			System.out.println(" ");
			System.out.println("Tecle ENTER, para ouvir seu correio de voz.");
			String vazia1 = ler.nextLine();
			AparelhoTelefonico.iniciarCorreioDeVoz();
			System.out.println("Você está recebendo uma ligação, tecle ENTER para atender.");
			String vazia2 = ler.nextLine();
			AparelhoTelefonico.atender();
		}
		if (resposta == 3) {
			System.out.println("INTERNET EM ACESSO");	
			System.out.println("Tecle ENTER para abrir uma nova Aba.");
			NavegadorDeInternet.adicionarNovaAba();
			System.out.print("Digite a URL do site que deseja exibir: ");
			String url = ler.nextLine();
			NavegadorDeInternet.exibirPagina(url);
			System.out.println("Tecle ENTER para recarregar a página");
			String vazia3 = ler.nextLine();
			NavegadorDeInternet.atualizarPagina();		
		}
		if (resposta != 1 && resposta != 2 && resposta != 3){
			System.out.println("Número não correspondente, reinicie o aparelho para recomeçar!");
		}
		ler.close();
	}
}
