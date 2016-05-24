package dogfight_Model;

public class Plane extends Mobile {
	private static int HEIGHT = 30;
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private int player;

	public Plane(final int player, final Direction direction, final Position position, final String image) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), this.speed, image);
	}
}
