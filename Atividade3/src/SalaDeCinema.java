
public class SalaDeCinema {
	private int NumSala;
	private int capacidade;
	private Filme filmeEmExibicao;
	
	public SalaDeCinema(int NumSala, int capacidade, Filme filmeEmExibicao) {
		this.NumSala = NumSala;
		this.capacidade = capacidade;
		this.filmeEmExibicao = filmeEmExibicao;
	}
	
	public int getNumSala() {
		return NumSala;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public Filme getFilmeEmExibicao() {
		return filmeEmExibicao;
	}
	
	public void setFilmeEmExibicao(Filme filmeEmExibicao) {
		this.filmeEmExibicao = filmeEmExibicao;
	}
}
