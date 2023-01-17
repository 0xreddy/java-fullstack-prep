package com.lpu.shape;

public class ArrayClient {

	public static void main(String[] args) {
		CircleBasic cb = new CircleBasic(5,"MyCircle");
		Triangle tr = new Triangle(2, 3,"MyTriangle");
		
		Shape s = new CircleBasic(5,"MyCircle");
		Shape s2 =  new Triangle2(2, 3,"MyTriangle");
		Triangle t1 = new Triangle(2, 3,"MyTriangle");
		Triangle t2 = new Triangle(2, 3,"MyTriangle");
		
		Shape [] trArr = new Shape[3];
		trArr[0] = t1;
		trArr[1] = t2;
		trArr[2] = s2;
		
		for(int i =0; i < trArr.length; ++i ) {
			System.out.println(trArr[i].getName());
		}
		
		
		String[] strArr = new String[5];
		
		for(int i =0; i < trArr.length; ++i ) {
			strArr[i] = "number "+ i;
		}
		
		for(int i = trArr.length; i>-1; --i ) {
			System.out.println(strArr[i]);
		}

	}

}
