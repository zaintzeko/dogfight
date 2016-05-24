package dogfight_Model;

import java.awt.Dimension;
import java.awt.Image;

public interface IMobile {
	public static Dimension getDimension() {
		return new Dimension();
	}

	public static Direction getDirection() {
		return Direction.UP;
	}

	public static int getHeigth() {
		return 1;
	}

	public static Image getImage() {
		return null;

	}

	public static int getPosition() {
		return 1;
	}

	public static int getSpeed() {
		return 1;
	}

	public static int getWidth() {
		return 1;
	}

	public static boolean hit() {
		return false;
	}

	public static boolean isPlayer(final int player) {
		return true;
	}

	public static boolean isWeapon() {
		return true;
	}

	public static void move() {

	}

	public static void placeInArea(final IArea area) {

	}

	public static void setDgfightModel(final DogfightModel dogfightModel) {

	}

	public static void setDirection(final Direction direction) {

	}
}
