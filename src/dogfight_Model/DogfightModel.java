package dogfight_Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {
	private final ArrayList<IMobile> mobiles;
	private final Sky sky;

	public DogfightModel() throws IOException {
		this.sky = new Sky(null, "sky");
		this.mobiles = new ArrayList<IMobile>();
	}

	public void addMobiles(final IMobile mobile) {
		this.mobiles.add(mobile);
	}

	public void buildArea(final Dimension dimension) {

	}

	@Override
	public void closeAll() {
		// TODO Auto-generated method stub

	}

	public IArea getArea() throws IOException {
		return new Sky(null, "sky");
	}

	public ArrayList<IMobile> getMobiles() {
		return this.mobiles;
	}

	public IMobile getMobilesByPlayer(final int player) throws IOException {
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
