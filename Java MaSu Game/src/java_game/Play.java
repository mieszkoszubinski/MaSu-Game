package java_game;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState{
	
	Animation masu, movingUp, movingDown, movingLeft, movingRight;
	Image worldMap;
	boolean quit = false;
	int[] duration = {200,200};
	float masuPositionX = 0;
	float masuPositionY = 0;
	float shiftX = masuPositionX + 320;
	float shiftY = masuPositionY + 160;
	
	public Play(int state) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		worldMap = new Image("res/world.png");
		Image[] walkUp =  {new Image("res/masusBack.png"), new Image("res/masusBack.png")};
		Image[] walkDown =  {new Image("res/masusFront.png"), new Image("res/masusFront.png")};
		Image[] walkLeft =  {new Image("res/masusLeft.png"), new Image("res/masusLeft.png")};
		Image[] walkRight =  {new Image("res/masusRight.png"), new Image("res/masusRight.png")};
		
		movingUp = new Animation(walkUp, duration, false);
		movingDown = new Animation(walkDown, duration, false);
		movingLeft = new Animation(walkLeft, duration, false);
		movingRight = new Animation(walkRight, duration, false);
		masu = movingDown;
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		worldMap.draw(masuPositionX, masuPositionY);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
	}
	
	public int getID(){
		return 1;
	}
	
}
