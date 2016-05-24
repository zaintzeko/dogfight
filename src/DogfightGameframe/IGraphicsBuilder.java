package DogfightGameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder implements GraphicsBuilder{
	
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer);
		
	
}
