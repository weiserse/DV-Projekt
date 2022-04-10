package pack1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class ImageLoader {
	
	BufferedImage image;
	//BufferedImage image2;

	public ImageLoader() {
		
		try {
		
		image = ImageIO.read(new File("resources/Gewinnerfeuerwerk.png"));
		//image2 = ImageIO.read(new File("resources/gras.jpg"));
		
	} 
	
	catch (IOException e) {
		e.printStackTrace();
	}

}
}
