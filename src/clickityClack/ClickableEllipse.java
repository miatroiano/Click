package clickityClack;

import java.awt.Color;
import java.awt.event.MouseEvent;
import wheels.users.Ellipse;


public class ClickableEllipse extends Ellipse {
	private Head head;
	private Body body;
	
	public ClickableEllipse() {
		
		head = new Head(100, 100);
		head.setColor(Color.RED);
		
		body = new Body(100, 100);

	}
	
	public void mouseClicked(MouseEvent e) {
		 
			this.updateColor(e.getX());
	}
	
	public ClickableEllipse(Body body) {
		 
		this.body = body;
		setColor(Color.GREEN );
		
	}
	
	private void updateColor(int mouseX){
		
		if (this.getColor() == Color.GREEN) {
			int mx = mouseX - getXLocation();
			double v = (double)mx / getWidth();
			body.setColor(Color.BLUE);
		}
		
		else if (this.getColor() == Color.BLUE) {
			int mx = mouseX - getXLocation();
			double v = (double)mx / getWidth();
			body.setColor(Color.GREEN);
		}
    }
}
