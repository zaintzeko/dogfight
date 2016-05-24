package dogfight_Model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {
	private final ArrayList<IMobile> mobiles;
	private final Sky sky;

	public DogfightModel() {
		this.sky = new Sky(null);
		this.mobiles = new ArrayList<IMobile>();
	}

	public void addMobiles(final IMobile mobile) {
		this.mobiles.add(mobile);
	}

	public void buildArea(final Dimension dimension) {

	}

	public IArea getArea() {
		return new Sky(null);
	}

	public ArrayList<IMobile> getMobiles() {
		return this.mobiles;
	}

	public IMobile getMobilesByPlayer(final int player) {
		return new Mobile(null, null, null, player, null);
	}

	public Sky getSky() {
		return this.sky;
	}

	public void removeMobiles(final IMobile mobile) {

	}

	public void setMobilesAsMoved() {

	}

}
