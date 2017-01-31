
public class Dog {
	public int age;
	public String color;
	public boolean tail;
	
	public Dog (int age, String color, boolean tail) {
		this.age = age;
		this.color = color;
		this.tail = tail;
	} 
	
	public void bark (){
		System.out.printf("%d\n",this.age);
		System.out.printf("%s\n",this.color);
		System.out.printf("%s", this.tail)
	}
}
