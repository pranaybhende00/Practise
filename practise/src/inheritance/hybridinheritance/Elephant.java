package inheritance.hybridinheritance;

public class Elephant implements DomesticAnimal,WildAnimal {
public void sleep() {
	System.out.println("They sleep alot");
}
public void forest() {
	System.out.println("They leave in forest also");
}
public void homes() {
	System.out.println("They leave in home also");
}
public static void main(String[] args) {
	Elephant elephant = new Elephant();
	DomesticAnimal domesticAnimal=elephant;
	domesticAnimal.sleep();
	Animal animal=domesticAnimal;
	animal.sleep();
}
}
