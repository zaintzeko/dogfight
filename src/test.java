import java.io.IOException;

import DogfightController.DogfightController;
import DogfightView.DogfightView;
import dogfight_Model.DogfightModel;

public class test {

	public static void main(final String[] args) throws IOException {
		final DogfightModel dogfightModel = new DogfightModel();
		final DogfightController dogfightController = new DogfightController(dogfightModel);
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel, dogfightModel);
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play();

	}

}
