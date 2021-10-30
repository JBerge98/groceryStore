package GroceryStore;

import java.time.LocalDate;
import java.util.ArrayList;

public class Transaction {
	private static int idCounter = 1;
	private int transactionID;
	private int memeberID;
	private ArrayList<Product> productList;
	private ArrayList<Integer> quantityList;
	private double total;
	private LocalDate date;

	public Transaction(int memeberID, double total, LocalDate date) {
		this.transactionID = idCounter++;
		this.memeberID = memeberID;
		this.total = total;
		this.date = date;
		this.productList = new ArrayList<Product>();
	}

	public void addProduct(Product product, int qunatity) {
		productList.add(product);
		quantityList.add(qunatity);
	}

	public static int getIdCounter() {
		return idCounter;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public int getMemberID() {
		return memeberID;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public int getQuantity(int index) {
		return quantityList.get(index);
	}

	public double getTotal() {
		return total;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return " "; // TODO: format string
	}

}
