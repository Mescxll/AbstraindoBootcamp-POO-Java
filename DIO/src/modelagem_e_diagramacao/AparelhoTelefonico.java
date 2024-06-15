package modelagem_e_diagramacao;

public interface AparelhoTelefonico {
	public static void ligar(String numero) {
		System.out.println("Contato selecionado, ligando para " + numero + "...");
		System.out.println(" ");
	}
	public static void atender() {
		System.out.println("Ligação atendida com sucesso");
	}
	public static void iniciarCorreioDeVoz() {
		System.out.println("OUVINDO CORREIO DE VOZ...");
	}
}
