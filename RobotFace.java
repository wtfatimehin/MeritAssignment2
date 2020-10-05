
import acm.program.*;
import acm.graphics.*;
import java.awt.*;


public class RobotFace extends GraphicsProgram {
	
	//Constants sizes of each body part
	private static final int HEAD_HEIGHT = 250;
	private static final int HEAD_WIDTH = 200;
	private static final int EYE_RADIUS = 20;
	private static final int MOUTH_HEIGHT = 40;
	private static final int MOUTH_WIDTH = 120;
	

	public void run() {
		//this adds the face to the
		faceAdd(getWidth() / 2, getHeight() / 2);
	}
	
	/* Puts the whole face right in the middle of the screen */
	private void faceAdd(double centx , double centy ) {
		headAdd(centx, centy);
		eyeAdd(centx - HEAD_WIDTH / 4, centy - HEAD_HEIGHT / 4);
		eyeAdd(centx + HEAD_WIDTH / 4, centy - HEAD_HEIGHT / 4);
		mouthAdd(centx, centy + HEAD_HEIGHT / 4);
	}
	
	
	
	
	/*Adds the mouth in the center */
	private void mouthAdd(double centx, double centy) {
		double x = centx - (MOUTH_WIDTH / 2);
		double y = centy - (MOUTH_HEIGHT / 2);
		GRect mouth = new GRect(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setColor(Color.WHITE);
		add(mouth);
	}
	
	/*Adds the head in the center */
	private void headAdd(double centx, double centy) {
		double x = centx - (HEAD_WIDTH / 2);
		double y = centy - (HEAD_HEIGHT / 2);
		GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
	}
	
	/*Adds the eye in the center */
	private void eyeAdd(double centx, double centy) {
		double x = centx - EYE_RADIUS;
		double y = centy - EYE_RADIUS;
		GOval eye = new GOval(x, y, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		eye.setFilled(true);
		eye.setFillColor(Color.YELLOW);
		add(eye);
	}

}
