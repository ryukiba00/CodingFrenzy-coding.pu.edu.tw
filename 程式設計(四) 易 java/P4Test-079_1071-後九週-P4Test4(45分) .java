import java.util.*;
abstract class Animal{ //請勿修改此抽象類別內容
	protected int legs;
	public Animal(int legs) {
		this.legs = legs;
	}
	public void walk() {
		System.out.println("Walking by "+legs+" legs.");
	}
	public abstract void eat();	
}

//insert you code here
class Spider extends Animal{
	Spider(){
		super(8);
	}
	public void eat(){
		System.out.println("Tasty.....mosquitoes.");
	}
}

interface Pet{
	public String getName();
	public void setName(String name);
	public void play();
}

class Cat extends Animal implements Pet{
	String name;
	Cat(String name){
		super(4);
		this.name = name;
	}
	Cat(){
		this("");
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void play(){
		System.out.printf("My name is %s. I like to play games with my master.\r\n", getName());
	}
	public void eat(){
		System.out.println("Tasty.....Meow!");
	}
}

class Fish extends Animal implements Pet{
	String name;
	Fish(){
		super(0);
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void play(){
		System.out.println("I like to swimming." );
	}
	public void walk(){
		System.out.println("I can't walk." );
	}
	public void eat(){
		System.out.println("Tasty.....yummy!");
	}
}

public class main { //請勿修改此類別程式內容
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Fish d = new Fish();
		Cat c = new Cat(sc.next());
		Animal a = new Fish();
		Animal e = new Spider();
		d.walk();
		c.play();
		c.eat();
		((Fish)a).play();
		a.eat();
		e.walk();
		e.eat();
	}
}

