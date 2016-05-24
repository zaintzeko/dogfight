package dogfight_Model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {
	private ArrayList<Mobile> mobiles;
	private final Sky sky;

	public DogfightModel() {
		this.sky = new Sky();
	}

	public void addMobiles(final IMobile mobile) {
		this.mobiles.add(mobile);
	}

	public void buildArea(final Dimension dimension) {

	}

	public IArea getArea() {

	}

	public ArrayList<Mobile> getMobiles() {
		return this.mobiles;
	}

	public IMobile getMobilesByPlayer(final int player) {

	}

	public void removeMobiles(final IMobile mobile) {

	}

	public void setMobilesAsMoved() {

	}

}
