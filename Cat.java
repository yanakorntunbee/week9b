package week9b;

public class Cat{    // Class Method small
	String breed;   // Object
	
	String size;
	
	String color;
	
	int age;
	
	String eat;
	
	String run;
	
	String sleep;
	
	String look;
	
		public void data() {
			System.out.println(breed);
			System.out.println(size);
			System.out.println(color);
			System.out.println(age);			
		}
	
		public void eat() {
			System.out.println(eat);
		}
		public void run() {
			System.out.println(size);
		}
		public void sleep() {
			System.out.println(sleep);
		}
		public void look() {
			System.out.println(look);
		}
		
		public static void main(String[]args) {   // Class Method Big
			Cat Luca = new Cat ();
			
			Luca.breed = "thailand";
			Luca.size  = "small";
			Luca.color = "white";
			Luca.age = 5;
			
			Luca.eat = "cat eat Fish";
			
			Luca.run = "Cat run kill rab0";
			
			Luca.sleep = "Cat sleep";
			
			Luca.look  = "Cat look lisa";
			
			Luca.data();
			
			Luca.eat();
			
			Luca.run();
			
			Luca.sleep();
			
			Luca.look();
				
		}
}