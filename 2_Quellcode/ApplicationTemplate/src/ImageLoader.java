import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Reads images from stored data and makes them accessible for further usage.
 * @author Peukert
 *
 */
public class ImageLoader {
	
	BufferedImage imagegras;
	BufferedImage imagefeuer;
	BufferedImage imagespielfeld;
	

	public ImageLoader() {
		
		try {
		
		imagegras = ImageIO.read(new File("resources/gras.jpg"));	
		imagefeuer = ImageIO.read(new File("resources/Gewinnerfeuerwerk.png"));
		imagespielfeld = ImageIO.read(new File("resources/spielfeld.png"));
	
		
		
	} 
	
	catch (IOException e) {
		e.printStackTrace();
	}

}
}
