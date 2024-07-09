package desafioDominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	private LocalDate data;
		
	@Override
	public double calcularXp() {
		return XPPADRAO + 20d;
	}

	public Mentoria() {
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria [Título= " + getTitulo() + ", Descrição= " + getDescricao() + ", Data= " + data + "]";
	}
	
}
