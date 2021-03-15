
package square;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JPanel;

public class GPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private GMouseHandler mouseHandler;
	private static String selectedButton;

	public GPanel() {
		this.mouseHandler = new GMouseHandler();
		this.addMouseListener(this.mouseHandler);
		this.addMouseMotionListener(this.mouseHandler);
		this.addMouseWheelListener(this.mouseHandler);
	}

	public void paint(Graphics graphics) {

	}

	public String button(String name) {
		if (name == null) {
			if(this.selectedButton==null) {
				return "rectButton";
			}			
			return this.selectedButton;
		} else {
			this.selectedButton = name;
			return this.selectedButton;
		}
		
	}

	private class GMouseHandler implements MouseListener, MouseMotionListener, MouseWheelListener {

		private int x0, y0, x1, y1;

		public void mouseWheelMoved(MouseWheelEvent e) {
		}

		public void mouseMoved(MouseEvent e) {
		}

		public void mouseClicked(MouseEvent e) {
		}

		public void mousePressed(MouseEvent e) {
			x0 = e.getX();
			y0 = e.getY();
			x1 = x0;
			y1 = y0;
		}

		public void mouseDragged(MouseEvent e) {
			
			selectedButton = button(null);
			
			Graphics2D graphics2D = (Graphics2D) getGraphics();
			// exclusive or mode
			graphics2D.setXORMode(getBackground());

			if (selectedButton.equals("rectButton")) {

				graphics2D.drawRect(x0, y0, x1 - x0, y1 - y0);

				x1 = e.getX();
				y1 = e.getY();

				graphics2D.drawRect(x0, y0, x1 - x0, y1 - y0);

			} else if (selectedButton.equals("ovalButton")) {

				graphics2D.drawOval(x0, y0, x1 - x0, y1 - y0);

				x1 = e.getX();
				y1 = e.getY();

				graphics2D.drawOval(x0, y0, x1 - x0, y1 - y0);

			}

			else if (selectedButton.equals("drawingButton")) {

				graphics2D.drawLine(x0, y0, x1, y1);

				x1 = e.getX();
				y1 = e.getY();

				graphics2D.drawLine(x0, y0, x1, y1);
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {

		}

	}
}
