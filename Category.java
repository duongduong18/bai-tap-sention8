import java.util.Scanner;

public class Category {
	private int id;
	private String name;
	private Product[] products;

	public Category() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public void input() {
		System.out.println(" Info Category !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		this.setId(sc.nextInt());

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter name: ");
		this.setName(sc1.nextLine());
	}

	public void info() {
		System.out.println("id :" + id + "name :" + name);
	}
}
