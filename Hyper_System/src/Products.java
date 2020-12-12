
public abstract class Products { //parent class

	protected String product_name;
	protected double product_price;
	
	public abstract double Calculate_price();
	//void
	public abstract  void print_Specification();
	
	
	//Create two constructor
	public Products() {
		super();
		
	}
	
	public Products(String product_name, double product_price) {
		super();
		this.product_name = product_name;
		this.product_price = product_price;
	}
	
	//create setter and getter for all attributes
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	
	
	
}
