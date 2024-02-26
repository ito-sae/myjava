package myjava;

public class MyJava4 {

	public static void main(String[] args) {
		
		Dog dog = new Dog("ワンワン");
		dog.sound();
		
		Cat cat = new Cat("ニャー");
		cat.sound();
		
		Lion lion = new Lion("ガオー");
		lion.sound();
		

	}

}


class Animal {
	
	public String name;
	
	public Animal(String x) {
		name=x;
	}
	
	void sound() {
		System.out.println(name);
		
	}
}

class Dog extends Animal {
	
	public Dog (String name) {
		super(name);
	}
	
}

class Cat extends Animal {
	
	public Cat (String name) {
		super(name);
	}
	
}

class Lion extends Animal {
	
	public Lion (String name) {
		super(name);
	}
}