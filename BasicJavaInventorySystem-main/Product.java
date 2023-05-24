
public class Product {
	private int productId;
	private String productName, companyName;
	private double productCost;
	
	//A constructor without parameters
	public Product() {
		System.out.println("Constructor has been called");
	}
	
	//A parameterized constructor
	public Product(int productId, String productName, String companyName, double productCost) {
		this.productId = productId;
		this.productName = productName;
		this.companyName = companyName;
		this.productCost = productCost;
	}
	public Product(int productId) {
		this.productId = productId;
		
	}
	  public int getProductId() {
	        return productId;
	    }
	  
	
	
	public void displayDetails() {
		System.out.println("Product Id : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Company Name : "+companyName);
		System.out.println("Product Cost : "+productCost);
	}
}
