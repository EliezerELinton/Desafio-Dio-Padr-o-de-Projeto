package PilotoAutomatico;

public class Piloto {
	
	private Acao comportamento;

	public void setComportamento(Acao comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
}
