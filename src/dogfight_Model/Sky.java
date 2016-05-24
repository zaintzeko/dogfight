package dogfight_Model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Sky extends Image implements IArea {

	private final Dimension dimension;
	// private final Image image;

	public Sky(final Dimension dimension) {
		this.dimension = dimension;
		// this.image = new Image();
	}

	public Dimension getDimension() {
		return this.dimension;
	}

	@Override
	public Graphics getGraphics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHeight(final ImageObserver observer) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Image getImage() {
		return this;
	}

	@Override
	public Object getProperty(final String name, final ImageObserver observer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageProducer getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth(final ImageObserver observer) {
		// TODO Auto-generated method stub
		return 0;
	}
}
