import java.util.Scanner;

public class House {

	private int numberHouse;
	private String address;
	private int floor;
	private Person owner;

	public House() {

	}

	public House(int numberHouse, String address, int floor, Person owner) {
		super();

		this.numberHouse = numberHouse;
		this.address = address;
		this.floor = floor;
		this.owner = owner;
	}

	public int getNumberHouse() {
		return numberHouse;
	}

	public void setNumber_House(int numberHouse) {
		this.numberHouse = numberHouse;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor_House(int floor_House) {
		this.floor = floor;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	// input
	public void input() {
		System.out.println("thong tin nha");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number_House: ");
		numberHouse = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter address_House: ");
		address = sc1.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter floor_House: ");
		floor = sc2.nextInt();
	}


	public void info() {
		System.out.println("--------");
		System.out.println("thông tin nhà");
		System.out.println("số nhà " + numberHouse + "địa chỉ " + address + "số tầng " + floor);
	}
}