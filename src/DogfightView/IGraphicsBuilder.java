package DogfightView;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.Observer;

import dogfight_Model.IDogfightModel;
import dogfight_Model.IMobile;

public class IGraphicsBuilder {
	private IDogfightModel iDogfightModel;
	private BufferedImage bufferedImage;
	
	private int GobalWidth;
	private int GlobalHeight;
	
	public IGraphicsBuilder(IDogfightModel digfightModel){
		
	}
	
	public void applyModelToGraphic(Graphics graphics, Observer ImageObserver){
		
	}
	
	private void buildEmptySky(){
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){
		
	}

	public int getGlobalHeight() {
		return GlobalHeight;
	}

	public void setGlobalHeight(int globalHeight) {
		GlobalHeight = globalHeight;
	}

	public int getGobalWidth() {
		return GobalWidth;
	}

	public void setGobalWidth(int gobalWidth) {
		GobalWidth = gobalWidth;
	}
	
	
}