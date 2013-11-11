package java_game;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{
	
	public Menu(int state) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString("Are you ready to play the game?", 50, 50);
		g.drawRect(50, 100, 60, 120); //x, y, width, height
		
		// 200, 130
		
		Image face = new Image("res/happy_face.png");
		g.drawImage(face, 200, 130);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
	}
	
	public int getID(){
		return 0;
	}
	
}
