package practice1;

public abstract class Practice8 {

	public abstract void sum();
	
	public void sum2(){
		
		int a;
	}
	
	
	
	class B extends Practice8{
		
		public void sum(){
			
			System.out.print("Hi");
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Practice8 sdf = new Practice8();
		B ser = new B();
		
		ser.sum();
		
		
		
		
		
		
		
	}

}
