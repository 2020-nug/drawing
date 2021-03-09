package square;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class GPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	Point sP = null;
	Point eP = null;

	public GPanel() {
		this.addMouseListener(new MouseEvent());
	}

	public class MouseEvent implements MouseListener {

		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
		}

		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {
			sP = e.getPoint();
		}

		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {
			eP = e.getPoint();
			Graphics g = getGraphics();
			int width;
			int height;
			if (eP.x - sP.x >= 0 && eP.y - sP.y >= 0) {
				width = eP.x - sP.x;
				height = eP.y - sP.y;
				g.drawRect(sP.x, sP.y, width, height);
			} else if (eP.x - sP.x >= 0 && eP.y - sP.y <= 0) {
				width = eP.x - sP.x;
				height = sP.y - eP.y;
				g.drawRect(sP.x, sP.y - height, width, height);
			} else if (eP.x - sP.x <= 0 && eP.y - sP.y >= 0) {
				width = sP.x - eP.x;
				height = eP.y - sP.y;
				g.drawRect(sP.x - width, sP.y, width, height);
			} else {
				width = sP.x - eP.x;
				height = sP.y - eP.y;
				g.drawRect(sP.x - width, sP.y - height, width, height);
			}
		}

		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {
		}

		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {
		}

	}

	public void paint(Graphics graphics) {
		graphics.drawRect(10, 10, 20, 20);
		graphics.drawOval(30, 30, 40, 40);

	}

}