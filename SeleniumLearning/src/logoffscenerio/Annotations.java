package logoffscenerio;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	//00:38
	
	@BeforeSuite
	public void opet(){
		
		System.out.println("Open IT company for Project");
		
	}
	
	
	
	
	
	
	@BeforeTest
	public void oper(){
		
		System.out.println("Open Project");
		
	}
	
	
	@BeforeClass
	public void openwindow2(){
		
		System.out.println("Purchased Laptop");
		//System.out.println("login");
		//System.out.print("Enter A");
	}
	
	
	@BeforeMethod  //Annotation
	public void openwindow(){
		
		System.out.println("open app");
		System.out.println("login");
		//System.out.print("Enter A");
	}
	
	
	
	
	
	@Test //Annotation
	public void window1(){
		
		//System.out.print("open app");
		//System.out.print("login");
		System.out.println("Enter A");
	
	}
	
	
	@Test //Annotation
	public void window2(){
		
		//System.out.print("open app");
		//System.out.print("login");
		System.out.println("Enter B");
	
	}
	
	@AfterMethod //Annotation
	public void closedwindow(){
		
		//System.out.print("open app");
		//System.out.print("login");
		System.out.println("Closed URL");
		System.out.println("Closed App");
	}
	
	@AfterClass
	public void openwindow23(){
		
		System.out.println("Sold Laptop");
		//System.out.println("login");
		//System.out.print("Enter A");
	}
	
	
	@AfterTest
	public void oper2(){
		
		System.out.println("Close Project");
		
	}
	
	@AfterSuite
	public void opev(){
		
		System.out.println("Close IT company for Project");
		
	}
	
	
	
}
