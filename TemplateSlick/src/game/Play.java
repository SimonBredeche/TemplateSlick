package game;



import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;


public class Play extends BasicGameState{
	private Image img;
	@Override
	public void init(GameContainer gc, StateBasedGame arg1) throws SlickException {
		this.img = new Image("res/slime.png");
	}

	@Override
	public void render(GameContainer gc, StateBasedGame arg1, Graphics g) throws SlickException {
		g.drawImage(img, 0, 0);
	}


	@Override
	public int getID() {
		return 0;
	}


	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
		
		
	}

}
