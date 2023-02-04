package game;



import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;


public class Launcher extends StateBasedGame{
	public static final int play = 0;
	public Launcher(String name) {
		super(name);
		this.addState(new Play());
		
	}


	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		gc.setVSync(true);
		gc.setShowFPS(false);
		gc.setTargetFrameRate(120);
		this.getState(play).init(gc, this);
		this.enterState(play);
	}
	
	public static void main(String[] args) {
		try {
			AppGameContainer container = new AppGameContainer(new Launcher("WarriorTales"));			
			container.setDisplayMode(1280, 720, false);
	 	    container.start();	 	   

		}catch(SlickException e) {
			e.printStackTrace();
		}
		
	}


}
