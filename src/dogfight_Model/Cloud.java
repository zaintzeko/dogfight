package dogfight_Model;

import java.io.IOException;

public class Cloud extends Mobile {
	private static int HEIGHT = 150;
	private static String IMAGE = "cloud";
	private static int SPEED = 1;
	private static int WIDTH = 300;

	public Cloud(final Direction direction, final Position position) throws IOException {
		super(direction, position, WIDTH, HEIGHT, SPEED, IMAGE);
	}
}
