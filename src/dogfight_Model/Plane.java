package dogfight_Model;

import java.io.IOException;

public class Plane extends Mobile {
	private static int HEIGHT = 30;
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private int player;

	public Plane(final int player, final Direction direction, final Position position, final String image)
			throws IOException {
		super(direction, position, WIDTH, HEIGHT, SPEED, image);
	}

	@Override
	public boolean hit() {
		return false;
	}

	@Override
	public boolean isPlayer(final int player) {
		return this.player == player;
	}
}
