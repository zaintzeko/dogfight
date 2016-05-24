package dogfight_Model;

import java.io.IOException;
import java.util.ArrayList;

public interface IDogfightModel {
	public static void addMobile(final IMobile Mobile) {

	}

	public static void buildArea(final Dimension dimension) {

	}

	public static IArea getArea() {
		return null;
	}

	public static IMobile getMobileByPlayer(final int player) throws IOException {
		return new Mobile(null, null, null, player, null);
	}

	public static ArrayList<IMobile> getMobiles() {
		return null;
	}

	public static void removeMobile(final IMobile Mobile) {

	}

	public static void setMobilesHavesMoved() {

	}

	void closeAll();

}
