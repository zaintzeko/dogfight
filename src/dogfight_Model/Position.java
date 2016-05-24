package dogfight_Model;

public class Position {
	private final double maxX;
	private final double maxY;
	private final double x;
	private final double y;

	public Position(final double x, final double y, final double maxX, final double maxY) {
		this.x = x;
		this.y = y;
		this.maxX = maxX;
		this.maxY = maxY;
	}

	public Position(final Position position) {
		this.x = position.x;
		this.y = position.y;
		this.maxX = position.maxX;
		this.maxY = position.maxY;
	}
}
