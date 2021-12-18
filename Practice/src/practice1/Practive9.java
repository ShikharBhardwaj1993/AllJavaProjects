package practice1;

public interface Practive9 {


	public void A();
	
	public void B();


}


abstract class  c implements Practive9{

	@Override
	abstract public void A();

	@Override
	public void B() {
		// TODO Auto-generated method stub
		
	}
}
	
	class G extends c{

		@Override
		public void A() {
			// TODO Auto-generated method stub
			System.out.print("Hi Team");
		}
		

	public static void main(String[] args){
		
		G dom = new G();
		
		dom.A();
		
	}
	}