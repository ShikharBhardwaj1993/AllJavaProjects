package practice1;

public class Inheritence {

	
	//System.out.Print("Parent");
	public void parent(){
		
		System.out.print("Parent");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Parent           Child
		Inheritence abc = new B(); //Parent()
		Inheritence abf = new A(); //Parent()
		Inheritence abj = new Inheritence(); //Parent()
		
		B wdf = new B() ; //A1,B1,Parent()
		
		
		
	}

}


class A extends Inheritence{
	public void A1(){
		
	System.out.print("Child");
	}
}



class B extends A{
	public void B1(){
		
	System.out.print("grand Child");
	}
}