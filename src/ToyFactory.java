
public class ToyFactory {
	
	
	
	public static Toy getToy(String nameOfToy) throws IllegalArgumentException {
		
		
		switch(nameOfToy) {
		
		case "RubberDuck" : 
			System.out.print("RubberDuck produced");
			return new RubberDuck(); 
		
		 case "Teddybear" : System.out.print("Teddy produced");
		 System.out.print("Teddy produced");
		 return new Teddybear();
		
		  default: 
			throw new IllegalArgumentException("Cant create this");
		} 
		
		
	}
	


}
