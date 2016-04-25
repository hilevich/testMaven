package resorces;

import java.util.ArrayList;
import java.util.Scanner;

import edu.cursor.FactoriTest.edu.cursor.FactoriTest.App;

public class UnionRobot extends MyHydra2 implements Factory {
	
	public UnionRobot(double weight, double speed, double height, String name, String color) {
		
		this.weight = weight;
		this.speed = speed;
		this.height = height;
		this.name = name;
		this.color = color;
	}
	
		public UnionRobot() {
		
	}

	
	public double getSpeed() {
		App ap = new App();
		
		double speedmin = 1000000000;
		
		for (Factory fa : ap.arl) {
			
		double	speednew =fa.getSpeed();
			if (speednew<speedmin){
				speedmin = speednew;
			}
			
		}
		return speedmin;
	}

	public double getWeight() {
		App ap = new App();
		double weight = 0;
		for (Factory fa : ap.arl) {
			weight +=fa.getWeight();
		}
		return weight;
	}

	
	public double getHeight() {
		App ap = new App();
		double height = 0;
		for (Factory fa : ap.arl) {
			height +=fa.getWeight();
			
		}
		return height;
	}
	public Factory addType() {
		
		double  weight = 0;
		double speed = 0;
		double height = 0;
		String name = null;
		String color = null;
		Scanner sc = new Scanner(System.in);
		
	
		
		try{
	
			System.out.println("enter name");
		name = sc.nextLine();
			System.out.println("enter color");
		color = sc.nextLine();
		
		}catch(Exception e){System.out.println("invalid input");}
		
		height = getHeight();
		weight = getWeight();
		speed = getSpeed();
		
		return new UnionRobot( weight,  speed,  height,  name,  color);
	}
	
	
}
