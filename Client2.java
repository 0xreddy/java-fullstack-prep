package com.lpu.client2;

import com.lpu.shape.CircleBasic;
import com.lpu.shape.Triangle;

public class Client2 {

	public static void main(String[] args) {
		CircleBasic cb = new CircleBasic(5,"MyCircle");
		Triangle tr = new Triangle(2, 3,"MyTriangle");
		
		System.out.println(cb.getName());
		System.out.println(cb.getArea());
		
		System.out.println(tr.getName());
		System.out.println(tr.getArea());
		

	}

}
