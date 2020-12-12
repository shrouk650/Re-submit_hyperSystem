
public class Electronic extends Products {

	private String Electronic_type;
	private String Electronic_Brand;
	String result = "";
	
//Create constructor with attributes exsit in parent class
	public Electronic(String electronic_type, String electronic_Brand, String product_name , double product_price) {
		this.Electronic_type = electronic_type;
		this.Electronic_Brand = electronic_Brand;
		this.product_name = product_name;
		this.product_price = product_price;
	}

	// Creates setter and getter methods.

	public String getElectronic_type() {
		return Electronic_type;
	}

	public void setElectronic_type(String electronic_type) {
		Electronic_type = electronic_type;
	}

	public String getElectronic_Brand() {
		return Electronic_Brand;
	}

	public void setElectronic_Brand(String electronic_Brand) {
		Electronic_Brand = electronic_Brand;
	}
//Implement override method
	
	@Override
	public double Calculate_price() {

		return product_price;
	}

	@Override
	public void print_Specification() {
		System.out.println(" Electronic product name " + product_name + "\n and Brand Name is " + Electronic_Brand 
				+ "\n and Electronic type is " + Electronic_type + "\n and Price is " + product_price);
		
	}



}
