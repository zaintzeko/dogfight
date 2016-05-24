package dogfight_Model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Mobile extends Image implements IMobile {
	private final Dimension dimension;
	private Direction direction;
	// private final String image;
	private final Position position;

	private int speed;

	public Mobile(final Direction direction, final Position position, final Dimension dimension, final int speed,
			final String image) {
		this.speed = speed;
		this.dimension = dimension;

		this.position = position;
		this.speed = speed;
		this.direction = direction;
		// this.image = new Image();
	}

	public Mobile(final Direction direction, final Position position, final int width, final int height,
			final int speed, final String image) {
		this.speed = speed;
		this.dimension = new Dimension(width, height);

		this.position = position;
		this.speed = speed;
		this.direction = direction;
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

	public IDogfightModel getDogfightModel() {
		return new DogfightModel();
	}

	@Override
	public Graphics getGraphics() {
		// TODO Auto-generated method stub
		return null;
	}

	public void getHeight() {

	}

	@Override
	public int getHeight(final ImageObserver observer) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Image getImage() {
		return this;
	}

	public Position getPosition() {
		return this.position;
	}

	@Override
	public Object getProperty(final String name, final ImageObserver observer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageProducer getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void getWidth() {

	}

	@Override
	public int getWidth(final ImageObserver observer) {
		// TODO Auto-generated method stub
		return 0;
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
