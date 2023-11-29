package TD2;

import java.util.Random;

class MonThread extends Thread {
	private String nom;
	
	public MonThread(String nom) {
		this.nom = nom;
	}

	public void run () {
		for ( int i = 0; i < 10; i ++) {
			affichenom();
		}
	
	}
	public void affichenom() {
		Random random = new Random();
		try {
			Thread.sleep(random.nextInt(2000));}
		catch ( InterruptedException e ) { return ;}
		
		System.out.println(nom);
	}
}