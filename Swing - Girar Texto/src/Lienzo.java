import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Lienzo extends JPanel {

	private String texto = "Texto de prueba";
		
	public Lienzo(int ancho, int alto) {
		setPreferredSize(new Dimension(ancho, alto));
		setFocusable(true);
		setFont(getFont().deriveFont((float)(getFont().getSize() * 4)));
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		FontMetrics fm = g.getFontMetrics();
		int x = (getWidth() - fm.stringWidth(texto)) / 2;
		int y = (getHeight() / 2) + ((fm.getAscent() - fm.getDescent()) / 2);
		g.setColor(Color.BLACK);
		g.drawString(texto, x, y);
	}
	
}
