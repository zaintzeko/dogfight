package DogfightController;

public class UserOrder {
	private Order order;
	private int player;

	public void User(final int player, final Order order) {
		this.order = order;
	}

}
