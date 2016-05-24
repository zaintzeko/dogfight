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

	public int getHeightWithAPosition(final Position position) {
		if (this.getPosition() == position) {
			return HEIGHT;
		} else {
			return 0;
		}
	}

	public int getWidthWithAPosition(final Position position) {
		if (this.getPosition() == position) {
			return WIDTH;
		} else {
			return 0;
		}
	}

	@Override
	public boolean isWeapon() {
		return true;
	}

	@Override
	public void move() {
		if (this.getDirection() == Direction.UP) {
			this.moveUp();
		} else if (this.getDirection() == Direction.DOWN) {
			this.moveDown();
		} else if (this.getDirection() == Direction.RIGHT) {
			this.moveRight();
		} else if (this.getDirection() == Direction.LEFT) {
			this.moveLeft();
		}
		this.distanceTraveled++;
	}
}
