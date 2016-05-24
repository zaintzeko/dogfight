package dogfight_Model;

import java.io.IOException;

public class Missile extends Mobile {
	private static int HEIGHT = 10;
	private static String IMAGE = "missile";
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static int SPEED = 4;
	private static int WIDTH = 30;
	int distanceTraveled = 0;

	public Missile(final Direction direction, final Position position) throws IOException {
		super(direction, position, WIDTH, HEIGHT, SPEED, IMAGE);
	}

	public int getHeightWithADirection(final Direction direction) {
		return 1;
	}

	public int getWidthWithADirection(final Direction direction) {
		return 1;
	}

	@Override
	public boolean isWeapon() {
		return true;
	}

	@Override
	public void move() {

	}
}
