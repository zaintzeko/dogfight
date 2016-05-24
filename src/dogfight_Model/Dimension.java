package dogfight_Model;

public class Dimension {
	private final int height;
	private final int width;

	Dimension(final Dimension dimension) {
		this.height = dimension.height;
		this.width = dimension.width;
	}

	Dimension(final int width, final int height) {
		this.width = width;
		this.height = height;
	}
}
