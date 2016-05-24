package dogfight_Model;

import java.awt.Dimension;

public class Mobile implements IMobile {
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

	public Color getColor() {

	}

	public Dimension getDimension() {
		return this.dimension;
	}

	public Direction getDirection() {
		return this.direction;
	}

	public IDogfightModel getDogfightModel() {

	}

	public void getHeight() {

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

	public boolean hit() {

	}

	public boolean isPlayer(final int player) {

	}

	public boolean isWeapon() {

	}

	public void move() {

	}

	public void moveDown() {

	}

	public void moveLeft() {

	}

	public void moveRight() {

	}

	public void moveUp() {

	}

	public void placeInarea(final IArea area) {

	}

	public void setDirection(final Direction direction) {
		this.direction = direction;
	}

}
