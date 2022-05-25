package Java2Class;

public class UseCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(2,2,4);
		c.showCircleInfo();

	}

}
class Point{
	
	   int xPos, yPos;
	   public Point(int x, int y) {

		xPos = x;
		yPos = y;

	}
		public void showPointInfo() {
			System.out.println("[" + xPos+","+yPos+"]");

		}

	}
class Circle {
	int rad;
	Point center;
	
	public Circle (int x, int y, int r) {
		center = new Point(x,y);
		rad = r;
	}
	public void showCircleInfo() {
		System.out.println("radius:"+rad);
		   center.showPointInfo();
	}

}