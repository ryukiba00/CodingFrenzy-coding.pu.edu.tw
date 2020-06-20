import java.util.*;

class Fruit{
    private String fruitName;
    private String fruitColor;
    public Fruit(String name, String color){
        this.fruitName = name;
        this.fruitColor = color;
    }
    public String getFruitName(){
        return this.fruitName;
    }
    public String getFruitColor(){
        return this.fruitColor;
    }
    public String showTaste(){
        return "Shows the taste of fruit.";
    }
}

/* 你的程式碼 */

class Lemon extends Fruit{
    Lemon(String name, String color){
    	super(name, color);
    }
    public String showTaste(){
        return "It tastes acid.";
    }
}

class Banana extends Fruit{
    Banana(String name, String color){
    	super(name, color);
    }
    public String showTaste(){
        return "It tastes fragrant and sweet.";
    }
}

public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Fruit fruit1 = new Lemon(sc.next(),sc.next());
        Fruit fruit2 = new Banana(sc.next(),sc.next());
        System.out.println(fruit1.getFruitName()+" is " +
                fruit1.getFruitColor() + "." + fruit1.showTaste());

        System.out.println(fruit2.getFruitName()+" is " +
                fruit2.getFruitColor() + "." + fruit2.showTaste());
    }
}
