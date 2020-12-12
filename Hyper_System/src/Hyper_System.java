import javax.swing.JOptionPane;

public class Hyper_System {

	public static void main(String[] args) {
		// create object from 3 classes.
		String productName;
		double price;
		boolean flag = false;
		boolean ValidSelection = false;

		Products[] product = new Products[1];

		String selection = JOptionPane.showInputDialog(null, "Welcome Please Select: \n  (+) to add product "
				+ "\n  (-) to remove product \n  (#) show all product");

		while (!flag) {
			switch (selection) {
			case "+":
				String Array_of_productstring = JOptionPane.showInputDialog("Please Enter number of products");
				int array_of_product = Integer.parseInt(Array_of_productstring);
				product = new Products[array_of_product];

				for (int i = 0; i < product.length; i++) {
					flag = true;
					String product_Selection = JOptionPane
							.showInputDialog("1-Vegetables_products    2-Electronic_Product    3-Cloth_Product");
				//	while (!ValidSelection) {

						switch (product_Selection) {
						case "1":

							productName = JOptionPane.showInputDialog("Please Enter Vegetable Name");
							String amount = JOptionPane.showInputDialog("Please Enter Amount of Vegetable ");
							int Amout_OF_Vegetables = Integer.parseInt(amount);
							String product_price = JOptionPane.showInputDialog("Price of this Amount ");
							price = Double.parseDouble(product_price);
							String ExpiryDate = JOptionPane.showInputDialog("Expiry date is ");
							int date = Integer.parseInt(ExpiryDate);
							Products vegetables = new Vegetables(date, Amout_OF_Vegetables, productName, price);
							product[i] = vegetables;

							
							break;

						case "2":

							productName = JOptionPane.showInputDialog("Please Enter Electronic Name");
							String electronic_brand = JOptionPane.showInputDialog("Please Enter Electronic brand ");
							String product_price_string = JOptionPane
									.showInputDialog("Price of this electronic product ");
							price = Double.parseDouble(product_price_string);
							String electronic_type = JOptionPane.showInputDialog("Please Enter Electronic type ");

							Products electronic = new Electronic(electronic_type, electronic_brand, productName, price);
							product[i] = electronic;

							
							break;

						case "3":
							productName = JOptionPane.showInputDialog("Please Enter Clothes Name");
							String clothes_size = JOptionPane.showInputDialog("Please Enter Clothes size ");
							String product_price_string2 = JOptionPane
									.showInputDialog("Price of this clothes is");
							price = Double.parseDouble(product_price_string2);
							String clothes_color = JOptionPane.showInputDialog("Color of this clothes ");

							Products clothes = new Clothes(clothes_size, clothes_color, productName, price);
							product[i] = clothes;
							
							break;

						default:
							ValidSelection = false;
							product_Selection = JOptionPane.showInputDialog(
									"1-Vegetables_products    2-Electronic_Product    3-Cloth_Product");
							break;
						}
					}
					
				
				selection = JOptionPane.showInputDialog(null, "Welcome Please Select: \n  (+) to add product "
						+ "\n  (-) to remove product \n  (#) show all product");
				flag = false;
				break;
				
				
			case "-":
				//flag = true;
				flag = false;
				if (product.length > 0)
					product[product.length - 1] = null;
				else
					JOptionPane.showMessageDialog(null, "there is no product");
				
				selection = JOptionPane.showInputDialog(null, "Welcome Please Select: \n  (+) to add product "
						+ "\n  (-) to remove product \n  (#) show all product");
				
				break;
				
			case "#":
				
				flag = true;
				
				if (product.length > 0){
					for(int j= 0 ; j < product.length; j++)
						product[j].print_Specification();
					
					}
				else{
						JOptionPane.showMessageDialog(null, "There is no product to print");
						
				}
				flag = false;
				break;
				
			default:
				flag = false;
				 selection = JOptionPane.showInputDialog(null, "Welcome Please Select: \n  (+) to add product "
						+ "\n  (-) to remove product \n  (#) show all product");
				break;
			}
		}

	}
}
