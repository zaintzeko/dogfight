package DogfightView;

import java.util.Observable;

import DogfightController.IOrderPerformer;
import DogfightGameframe.GameFrame;
import dogfight_Model.IDogfightModel;

public class DogfightView implements IViewSystem {
	private EventPerformer eventPerformer;
	private GameFrame gameFrame;
	private IGraphicsBuilder graphicsBuilder;

	public DogfightView(final IOrderPerformer orderPerformer, final IDogfightModel dogfightModel,
			final Observable observable) {

	}

	@Override
	public void closeAll() {

	}

	public void displayMessage(final String Message) {

	}

	private void run() {

	}
}