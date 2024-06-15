package modelagem_e_diagramacao;

public interface ReprodutorMusical {
	public static void tocar() {
		System.out.println("TOCANDO...");	
	}
	public static void pausar() {
		System.out.println("MÚSICA PAUSADA.");
	}
	public static void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println(musica + " selecionada. ");
	}
}
