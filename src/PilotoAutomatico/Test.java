package PilotoAutomatico;


public class Test {

	public static void main(String[] args) {
		
		// Strategy
		
		Stop stop = new Stop();
		Normal normal = new Normal();
		Fast fast = new Fast();
		
		Piloto robo = new Piloto();
		robo.setComportamento(normal);
		robo.mover();	
		
		robo.setComportamento(stop);
		robo.mover();
			
		robo.setComportamento(fast);
		robo.mover();
		
								}

}
