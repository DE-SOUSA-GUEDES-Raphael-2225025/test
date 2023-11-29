package TD2;


public class NombreThread extends Thread{
    
    private final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public void run() {
        for(int i = 0; i < alphabet.length(); ++i) {
            System.out.println(alphabet.charAt(i));
        }
    }

}