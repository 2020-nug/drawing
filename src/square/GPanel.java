package square;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GPanel extends JPanel {

	private static final long serialVersionUID = 1L;


	public GPanel() {
		
	}


	public void paint(Graphics graphics) {
		graphics.drawRect(10, 10, 20, 20);
		graphics.drawOval(30, 30, 40, 40);

	}

}