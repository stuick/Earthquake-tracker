package pratice;
import processing.core.*;

public class Core__Using_PApplet extends PApplet{
	private String url = "https://colormadehappy.com/wp-content/uploads/2018/08/Painted-Sea-Shell-Art.jpg";
	private PImage backgroundImg; 
	
	public void setup() {
		size(200,200);
		backgroundImg = loadImage(url, "jpg");
	}
	
	public void draw() {
		backgroundImg.resize(width, height);
		image(backgroundImg,0,0);
		//drawing circle
		int[]color = colorBySeconds(second());
		fill( color[0], color[1], color[2] );
		ellipse(4*width/5, height/5,width/7, height/7);	
		color = colorBySeconds(second());
		fill( color[0], color[1], color[2] );
		ellipse(width/5, height/5,width/7, height/7);
	}
	
	public int[] colorBySeconds(int time) {
		int [] colorCode = new int[3];
		float halfMinute = Math.abs(time-30);
		float ratio = halfMinute/30;
		colorCode[0]=(int)(ratio*255);
		colorCode[1]=(int)(ratio*255);
		colorCode[2]=0;
		return colorCode;
	}
}
