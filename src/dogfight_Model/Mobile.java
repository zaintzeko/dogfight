package dogfight_Model;

import java.awt.Dimension;

public class Mobile {
	private final Dimension dimension;
	private Direction direction;
	private final String image;

	private final Postition position;

	private final int speed;

	public Mobile(final Direction direction, final Postition position, final Dimension dimension, final int speed,
			final String image) {
		this.speed = speed;
		this.dimension = dimension;
		this.image = image;
		this.position = position;
		this.speed = speed;
		this.direction = direction;
	}

	public Dimension getDimension() {
		return this.dimension;
	}

	public Direction getDirection() {
		return this.direction;
	}

	public String getImage() {
		return this.image;
	}

	public Postition getPosition() {
		return this.position;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void getWidth() {

	}

	public void setDirection(final Direction direction) {
		this.direction = direction;
	}

}
