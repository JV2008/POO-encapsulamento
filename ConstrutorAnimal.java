package pessoa;

public class ConstrutorAnimal {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal(10,"Vermelho");
		
		System.out.println(animal1.getTamanho());
		System.out.println(animal1.getCor());
		
	}
}
