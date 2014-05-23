import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D; //I did some research on some new packages. Very cool!!! 
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
import javax.imageio.ImageIO;
 
public class ASCIIArt {
 
  public static void main(String[] args) throws IOException {
 
	int width = 100;
	int height = 30;
 
        
	BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	Graphics g = image.getGraphics();
	g.setFont(new Font("SansSerif", Font.BOLD, 24)); //some of this code was adapted from here http://www.mkyong.com/java/ascii-art-java-example/
 
	Graphics2D graphics = (Graphics2D) g;
	graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
	graphics.drawString("Hello Mrs. Bartel!", 30, 20); //sadly, it won't print all of it?

 
	for (int y = 0; y < height; y++) {
		StringBuilder sb = new StringBuilder();
		for (int x = 0; x < width; x++) {
 
			sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");
 
		}
 
		if (sb.toString().trim().isEmpty()) {
			continue;
		}
 
		System.out.println(sb);
	}
 
  }
 
}


