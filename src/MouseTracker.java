import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.jdi.event.Event;

import java.awt.BorderLayout;

public class MouseTracker extends JFrame {
private JPanel mousePanel;
private JLabel statusBar;

public MouseTracker() {
	super("Mouse Tracker Test");
	mousePanel = new JPanel();
	mousePanel.setBackground(Color.WHITE);
	add(mousePanel,BorderLayout.CENTER);
	statusBar = new JLabel("Mouse is outside JPAnel");
	statusBar.setFont(new Font("Arial", Font.PLAIN, 30));
	add(statusBar,BorderLayout.SOUTH);
	
	MouseHandler handler = new MouseHandler();
	mousePanel.addMouseListener(handler);
	mousePanel.addMouseMotionListener(handler);
	
}
private class MouseHandler implements MouseListener, MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText(String.format("Mouse dragged at [%d,%d]", e.getX(), e.getY()) );
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText(String.format("Mouse moved at [%d,%d]", e.getX(), e.getY()) );
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText(String.format("Mouse clicked at [%d,%d]", e.getX(), e.getY()) );
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText(String.format("Mouse pressed at [%d,%d]", e.getX(), e.getY()) );
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText(String.format("Mouse released at [%d,%d]", e.getX(), e.getY()) );
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText(String.format("Mouse entered at [%d,%d]", e.getX(), e.getY()) );
		mousePanel.setBackground(Color.GREEN);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText("Mouse outside JPAnel");
		mousePanel.setBackground(Color.WHITE);
	}

}

}
