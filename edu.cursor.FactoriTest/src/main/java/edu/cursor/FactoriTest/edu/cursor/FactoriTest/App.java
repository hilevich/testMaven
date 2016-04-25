package edu.cursor.FactoriTest.edu.cursor.FactoriTest;

import java.util.ArrayList;
import java.util.Scanner;
import resorces.Factory;
import resorces.MyHydra1;
import resorces.MyHydra2;
import resorces.UnionRobot;

public class App 
{
	public static ArrayList<Factory> arl = new ArrayList<>();
    public static void main( String[] args )
    {
       
    
    
    	Scanner sc = new Scanner(System.in);
    	boolean flag = true; 
    	
    	arl.add(new MyHydra1(12, 13, 14, "yura"));
    	arl.add(new MyHydra1(15, 121, 1, "andriy"));
    	arl.add(new MyHydra1(14, 143, 10, "sergiy"));
    	
    	System.out.println("enter what u want create 1 - Create (Hydra1) or 2 - Create (Hydra2) or 3 - unionRobot 4 -see list");
    	
    	while (flag){
    	String re=sc.nextLine();
    	
    	
    	switch (re){
    	case "1":{
    		System.out.println("1");
    		Factory fc1 = new MyHydra1();
    		arl.add(fc1.addType());
    		break;
    	}
    	
    	case "2":{
    		System.out.println("2");
    		Factory fc2 = new MyHydra2();
    		arl.add(fc2.addType());
    		break;
    	}
    	case "3":{
    		System.out.println("3");
    		Factory fc3 = new UnionRobot();
    		arl.add(fc3.addType());
    		break;
    		}
    	case "4":{
    		for (Factory fa : arl) {
    			System.out.println(fa);
    		}
    		break;
    		}
    	default:{
    		System.out.println("exit");
    		flag = false;
			break;
    	}
    	}    	
    	}
}
}