package desafioDominio;

public class Curso extends Conteudo{
	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		return XPPADRAO * cargaHoraria ;
	}
	
	public Curso() {
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [Título= " + getTitulo() + ", Descrição= " + getDescricao() + ", Carga Horária= " + cargaHoraria + "]";
	}
	
	
}
