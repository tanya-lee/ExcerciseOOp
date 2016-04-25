
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("Space War");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 650);
		frame.getContentPane().setLayout(new BorderLayout());
		
		SpaceShip v = new SpaceShip(0 , 0 , 0 , 0);
		GamePanel gp = new GamePanel();
		GameEngine eng = new GameEngine(gp , v);
		
		
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		eng.start();
		frame.setVisible(true);
		
		
	}
}