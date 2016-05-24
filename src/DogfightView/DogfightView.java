package DogfightView;

import java.util.Observable;

import DogfightController.IOrderPerformer;
import DogfightGameframe.GameFrame;
import dogfight_Model.IDogfightModel;

public class DogfightView implements IViewSytem{
	private IGraphicsBuilder graphicsBuilder;
	private EventPerformer eventPerformer;
	private GameFrame gameFrame;
	
	public void DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable){
		
	}
	
	private void run(){
		
	}
	
	public void displayMessage(String Message){
		
	}
	
	public void closeAll(){
		
	}
}