package clickityClack;

public class Worm {
	private Head head;
	private Body body;
	
	public Worm(int x, int y) {
		head = new Head(x, y);
		body = new Body(x, y);
	}
	
    public void setLocation(int x, int y) {
        head.setLocation(x, y);
        body.setLocation(x, y);
    }


}
