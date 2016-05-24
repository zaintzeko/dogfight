package dogfight_Model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sky implements IArea {

	private final Dimension dimension;
	private final Image image;

	public Sky(final Dimension dimension, final String image) throws IOException {
		this.dimension = dimension;
		this.image = ImageIO.read(new File("images/" + image + ".png"));
	}

	public Dimension getDimension() {
		return this.dimension;
	}

	public Image getImage() {
		return this.image;
	}
}
