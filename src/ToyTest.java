
public class ToyTest {
	
	
	
	public static void main(String[] args) throws IllegalArgumentException {
		
		Teddybear t1 = new Teddybear();  
		t1.print();
		
		RubberDuck rd1 = new RubberDuck(); 
		rd1.print();
		
		
		Toy t3 = ToyFactory.getToy("RubberDuck");
		t3.print();
		Toy t4 = ToyFactory.getToy("WoodenDinosaur");
		
	}
	

}
