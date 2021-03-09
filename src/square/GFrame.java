package square;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GFrame extends javax.swing.JFrame {


	private static final long serialVersionUID = 1L;
	private GPanel panel;
	
	public GFrame () {
		//내부의 속성을 초기화, 한번 정하면 쉽게 변하지 않음
		//initialize attribute
		this.setLocation(200, 100);
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//initialize components 자식 만들어주기
		this.panel =new GPanel(); //외부에서 선언해줌으로서 밖에서 보일 수 있도록
		this.add(panel);
	}
	
}
