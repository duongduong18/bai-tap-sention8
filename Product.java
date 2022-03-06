import java.util.Scanner;

public class Product {
	private String producer;
	private int price;
	private Category category;

	public Product() {

	}

	public Product(String producer, int price, Category category) {
		super();
		this.producer = producer;
		this.price = price;
		this.category = category;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void input() {
		System.out.println("Info Product");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Producer");
		producer = sc.nextLine();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter price");
		price = sc1.nextInt();

	}
public void info () {
	System.out.println("info Product");
	System.out.println("Producer :" + producer + "Price :" + price);
}
}
