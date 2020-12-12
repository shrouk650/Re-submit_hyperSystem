
public class Clothes extends Products {

	private String Clothes_size;
	private String Clothes_color;
	String result = "";

	public Clothes(String clothes_size, String clothes_color, String product_name , double product_price) {
		super();
		this.Clothes_size = clothes_size;
		this.Clothes_color = clothes_color;
		this.product_name = product_name;
		this.product_price = product_price;
	}

	public String getClothes_size() {
		return Clothes_size;
	}

	public void setClothes_size(String clothes_size) {
		Clothes_size = clothes_size;
	}

	public String getClothes_color() {
		return Clothes_color;
	}

	public void setClothes_color(String clothes_color) {
		Clothes_color = clothes_color;
	}

	@Override
	public double Calculate_price(){
		if (Clothes_size.toLowerCase() == "xxl" || Clothes_size.toLowerCase() == "xxxl") {
			product_price = product_price * 1.4;
		}
		else{
			return product_price;
		}
		return product_price;
	}

	@Override
	public void print_Specification() {
		System.out.println(" Clothes name " + product_name + "\n "
				+ "and size is " + Clothes_size 
				+ "\n "
				+ "and color is " + Clothes_color + "\n "
						+ "and Price is " + Calculate_price());
		
	}

}
