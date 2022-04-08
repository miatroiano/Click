package clickityClack;

import java.awt.Color;

import wheels.users.Ellipse;

public class Body {

	private ClickableEllipse segment1;
	private ClickableEllipse segment2;
	
	public Body(int x, int y) {
		segment1 = new ClickableEllipse(this);
		segment1.setSize(80, 80);
		
		
		segment2 = new ClickableEllipse(this);
		segment2.setSize(80, 80);
		
		
		this.setLocation(x, y);
		this.setColor(Color.green);
	}
	
	public void setLocation(int x, int y) {
		segment1.setLocation(x + 90, y + 20);
        segment2.setLocation(x + 160, y + 20);
	}
	public void setColor(Color color){
        segment1.setColor(color);
        segment2.setColor(color);
        
        
        
    }
}
