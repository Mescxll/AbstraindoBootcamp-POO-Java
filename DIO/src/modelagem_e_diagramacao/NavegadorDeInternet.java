package modelagem_e_diagramacao;

public interface NavegadorDeInternet {
	public static void exibirPagina(String url) {
		System.out.println("Acessando a url: " + url);
		System.out.println("Página aberta.");
	}
	public static void adicionarNovaAba() {
		System.out.println("ABA ABERTA");
	}
	public static void atualizarPagina() {
		System.out.println("RECARREGANDO...");
		System.out.println("Página atualiada.");
	}
}

