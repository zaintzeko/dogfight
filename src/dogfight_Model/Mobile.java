package dogfight_Model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Mobile implements IMobile {
	private final Dimension dimension;
	private Direction direction;
	private final Image image;
	private final Position position;

	private int speed;

	public Mobile(final Direction direction, final Position position, final Dimension dimension, final int speed,
			final String image) throws IOException {
		this.speed = speed;
		this.dimension = dimension;

		this.position = position;
		this.speed = speed;
		this.direction = direction;
		this.image = ImageIO.read(new File("images/" + image));
		// this.image = new Image();
	}

	public Mobile(final Direction direction, final Position position, final int width, final int height,
			final int speed, final String image) throws IOException {
		this.speed = speed;
		this.dimension = new Dimension(width, height);

		this.position = position;
		this.speed = speed;
		this.direction = direction;
		this.image = ImageIO.read(new File("images/" + image));
	}

	public Color getColor() {
		return new Color(1);
	}

	public Dimension getDimension() {
		return this.dimension;
	}

	public Direction getDirection() {
		return this.direction;
	}

	public IDogfightModel getDogfightModel() throws IOException {
		return new DogfightModel();
	}

	public int getHeight() {
		return 1;
	}

	public Image getImage() {
		return this.image;
	}

	public Position getPosition() {
		return this.position;
	}

	public int getSpeed() {
		return this.speed;
	}

	public int getWidth() {
		return 1;
	}

	public boolean hit() {
		return false;
	}

	public boolean isPlayer(final int player) {
		return true;
	}

	public boolean isWeapon() {
		return true;
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
