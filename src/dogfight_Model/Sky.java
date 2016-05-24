package dogfight_Model;

import java.awt.Image;

public class Sky implements IArea {

	private final Dimension dimension;
	private Image image;

	public Sky(final Dimension dimension) {
		this.dimension = dimension;
	}

	public Dimension getDimension() {
		return this.dimension;
	}

	public Image getImage() {
		return this.image;
	}
}
