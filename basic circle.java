class CircleBasicJava{
double radius = 10.5;
	double getArea()
	{
		double area = 0;
		area = 3.14*radius*radius;
		return area;
	}
public static void main(String[] args){
CircleBasicJava cb = new CircleBasicJava();

double area = cb.getArea();
System.out.println("Area is" + area);
}

}