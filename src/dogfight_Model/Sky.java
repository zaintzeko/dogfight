package dogfight_Model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sky implements IArea {

	private final Dimension dimension;
	private final Image image;

	public Sky(final Dimension dimension) throws IOException {
		this.dimension = dimension;
		this.image = ImageIO.read(new File("images/" + this.image));
	}

	public Dimension getDimension() {
		return this.dimension;
	}

	public Image getImage() {
		return this.image;
	}
}
