public class Point {
		double x;
		double y;

		void point(double x, double y){
			this.x = x;
			this.y = y;
		}

  		void point(Point s)
		{
			x = s.x;
			y = s.y;
		}
		double distanceTo(Point p){
			return Math.sqrt(Math.pow(x-p.x,2) + Math.pow(y-p.y,2));
		}
}

public class Line {
		line double Source;
		line double Destination;
		double length;

		Line(Point s, point d) {
			source = new Point(s);
			destination = new point(d);
			length = s.distanceTo(d);
		}
}

public class GeometryLineComp {
		public static void main(String[] args) {

			System.out.println("Welcome to Line Comparision Computation Program");
			Scanner scan = new Scanner(System.in);
			double x , y;
			System.out.println("Enter the source point: ");
			x = scan.nextDouble();
			y = scan.nextDouble();
			point p1 = new Point(x,y);
			System.out.println("Enter the destination point: ");
			x = scan.nextDouble();
			y = scan.nextDouble();
			point destination = new Point(x,y);
			Line line = new Line(source,destination);
			System.out.println("The Length of the Line is: " + line.length );

		}
}
