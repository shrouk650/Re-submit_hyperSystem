
//Class vegetables extend from class product
public class Vegetables extends Products {

	//string
	private int Expiry_date;
	private double Amout_of_Vegetables;
	String result = "";
	// create constructor

	public Vegetables(int expiry_date, double amout_of_Vegetables, String product_name , double product_price) {
		this.Expiry_date = expiry_date;
		this.Amout_of_Vegetables = amout_of_Vegetables;
		this.product_name = product_name;
		this.product_price = product_price;
	}

	public int getExpiry_date() {
		return Expiry_date;
	}

	public void setExpiry_date(int expiry_date) {
		Expiry_date = expiry_date;
	}

	public double getAmout_of_Vegetables() {
		return Amout_of_Vegetables;
	}

	public void setAmout_of_Vegetables(double amout_of_Vegetables) {
		Amout_of_Vegetables = amout_of_Vegetables;
	}

	// should implement method exsists in product class.

	@Override
	public double Calculate_price() {
		product_price = Amout_of_Vegetables * product_price;
		return product_price;
	}

	@Override
	public void print_Specification() {
		System.out.println(" Vegetable name is" + product_name + "\n and Expiry date is " + Expiry_date
				+ "\n and Amout of vegetables is " + Amout_of_Vegetables + "\n and Price is " + Calculate_price());
		
	}

	




}
