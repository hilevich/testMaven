package resorces;

import java.util.Scanner;

public class MyHydra2 implements Factory{
	protected double weight;
	protected double speed;
	protected double height;
	protected String name ;
	protected String color;
	
	
	@Override
	public String toString() {
		return "MyHydra2 [weight=" + weight + ", speed=" + speed + ", height=" + height + ", name=" + name + ", color="
				+ color + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(speed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyHydra2 other = (MyHydra2) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(speed) != Double.doubleToLongBits(other.speed))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public MyHydra2(double weight, double speed, double height, String name, String color) {
		super();
		this.weight = weight;
		this.speed = speed;
		this.height = height;
		this.name = name;
		this.color = color;
	}


	public MyHydra2() {
		
	}
	

	@Override
	public Factory addType() {
		
			double  weight = 0;
			double speed = 0;
			double height = 0;
			String name = null;
			String color = null;
			Scanner sc = new Scanner(System.in);
			
			try{
				System.out.println("enter weight");
			weight = sc.nextDouble();
				System.out.println("enter speed");
			speed = sc.nextDouble();
				System.out.println("enter height");
			height = sc.nextDouble();
				System.out.println("enter name");
			name = sc.nextLine();
				System.out.println("enter color");
			color = sc.nextLine();
			
			}catch(Exception e){System.out.println("invalid input");}
			return new MyHydra2(weight, speed, height, name, color);
		
	
	}
}
