package clickityClack;
import wheels.users.Frame;

public class App extends Frame {
	
	private Worm worm;
	
	public App() {
		worm = new Worm(220, 180);
	}
	
	public static void main(String[] args) {
		new App();
	}

}
