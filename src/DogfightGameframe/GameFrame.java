package DogfightGameframe;

import java.awt.event.KeyEvent;
import java.util.Observable;

public class GameFrame {

	GamePanel gamePanel = new GamePanel(null);
	private IEventPerformer iEventPerformer;

	public GameFrame(final String title, final IEventPerformer peformer, final IGraphicsBuilder graphicBuildern,
			final Observable obserbable) {

	}

	public void keyPressed(final KeyEvent keyEvent) {

	}

	public void keyReleased(final KeyEvent keyEvent) {

	}

	public void keyTyped(final KeyEvent keyEvent) {

	}
}