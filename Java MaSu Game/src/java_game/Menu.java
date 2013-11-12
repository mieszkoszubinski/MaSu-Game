package java_game;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{
	
	public String mouse = "No input yet!";
	
	
	Image face;
	int faceX = 200;
	int faceY = 200;
	
	
	public Menu(int state) {
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		face = new Image("res/happy_face.png");
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawImage(face, faceX, faceY);
		g.fillOval(75, 100, 100, 100);
		g.drawString("Play Now!", 80, 70);
		
		
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
		
//		Input input = gc.getInput();
//		if(input.isKeyDown(Input.KEY_UP)) {faceY -= 1;}
//		if(input.isKeyDown(Input.KEY_DOWN)) {faceY += 1;}
//		if(input.isKeyDown(Input.KEY_RIGHT)) {faceX += 1;}
//		if(input.isKeyDown(Input.KEY_LEFT)) {faceX -= 1;}
		
		Input input = gc.getInput();
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		if((xpos>75 && xpos < 175)&&(ypos >160 && ypos < 260)) {
			if (input.isMouseButtonDown(0)) {
				sbg.enterState(1);
			}
		}
	}
	
	public int getID(){
		return 0;
	}
	
}
