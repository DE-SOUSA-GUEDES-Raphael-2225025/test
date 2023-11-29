package TD2;

public class ThreadPrincipal extends Thread {
	
	public void run() {
		MonThread thread1 = new MonThread("MAthias");
		MonThread thread2 = new MonThread("Maxime");
		MonThread thread3 = new MonThread("Reyen");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
