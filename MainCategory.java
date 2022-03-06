import java.util.Scanner;

public class MainCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Category category = new Category();
		category.input();

		Product[] products = new Product[3];
		for (int i = 0; i < products.length; i++) {
			products[i] = new Product();
			products[i].input();
			products[i].setCategory(category);
		}

		for (Product product : products) {
			product.info();
			product.getCategory().info();
		}
	}
}
