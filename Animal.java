class Animal{
	public void eat(){
		System.out.println("Animal eat");
	}
}

interface Pet{
	public abstract void beFriendly( );
}

class Dog extends Animal implements Pet{
	public void eat(){
		System.out.println("Dog eat");
	}
	public void bark(){
		System.out.println("Dog bark");
	}
	public void beFriendly(){
		System.out.println("Dog is Friendly");
	}
}

class Beagle extends Dog{
	public void eat(){
		System.out.println("Beagle eat");
	}
	public void bark(){
		System.out.println("Beagle bark");
	}
	public void beFriendly(){
		System.out.println("Beagle is Friendly");
	}
}

class CastTest{
	public static void main(String[] args){
		Animal [] a = {new Animal(), new Dog(), new Animal(), new Beagle() };
		Dog dAnimal;
		System.out.println("Various Animal behaviours");
		for(Animal aAnimal : a){
			aAnimal.eat();
			if( aAnimal instanceof Dog){
				dAnimal = (Dog) aAnimal;
				dAnimal.bark();
				dAnimal.beFriendly();
			}
		}
	}
}
