package desafioDominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudosInstritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp (BootCamp bootcamp) {
		this.conteudosInstritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosInstritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInstritos.remove(conteudo.get());
		}else {
			System.out.println("Você não está matriculado em nenhum conteúdo");
		}		
	}
	public double calcularTotalXp() {
		return this.conteudosConcluidos
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp())
				.sum();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Conteudo> getConteudosInstritos() {
		return conteudosInstritos;
	}
	public void setConteudosInstritos(Set<Conteudo> conteudosInstritos) {
		this.conteudosInstritos = conteudosInstritos;
	}
	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInstritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInstritos, other.conteudosInstritos) && Objects.equals(nome, other.nome);
	}
	
}
