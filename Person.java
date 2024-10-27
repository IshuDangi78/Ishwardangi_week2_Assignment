package Week2;

public class Person 
{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void displayName()
	{
		System.out.println("Name : "+name);
	}
	public void displayAge()
	{
		System.out.println("Age : "+ age);
	}
	public void displayDetails()
	{
		displayName();
		displayAge();
	}
	public static void main(String[] args) 
	{
		Person p=new Person("Ishwar",24);
		
		p.displayDetails();

	}

}
