
public class Ingresso {
	private Cliente cliente;
	private SalaDeCinema sala;
	private String tipoIngresso;
	private String assento;
	
	public Ingresso(Cliente cliente, SalaDeCinema sala, String tipoIngresso, String assento) {
		this.cliente = cliente;
		this.sala = sala;
		this.tipoIngresso = tipoIngresso;
		this.assento = assento;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public SalaDeCinema getSala() {
		return sala;
	}
	
	public String getTipoIngresso() {
		return tipoIngresso;
	}
	
	public String getAssento() {
		return assento;
	}
}
