import java.util.Scanner;

public class Person {

	private String name;
	private int age;
	private House[] houses;

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public House[] getHouses() {
		return houses;
	}

	public void setHouses(House[] houses) {
		this.houses = houses;
	}

	public void input() {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("----------");
		System.out.println("nhập tên người ");
		name = sc.nextLine();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("nhập tuổi ");
		age = sc1.nextInt();

	}

	public void info() {
		System.out.println("----------------");
		System.out.println("thông tin");
		System.out.println("name: " + name +  "age: " + age);
	}
}