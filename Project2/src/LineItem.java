import java.text.NumberFormat;
public class LineItem {
	private Product product;
	 private int quantity;
	 private double total;
	 
	 public LineItem(Product product, int quantity){
		 this.product = product;
		 this.quantity =quantity;
		 this.total =product.getPrice()*quantity;
	 }
	 public LineItem(){
		
	 }
	 
	 public void setProduct(Product product){
		 this.product= product;
	 }
	 public Product getProduct(){
		 return product;
	 }
	 public void setQuantity(int quantity){
		 this.quantity=quantity;
	 }
	 public int getQuantity(){
		 return quantity;
	 }
	 public double getTotal(){
		 this.calculateTotal();
		 return total;
	 }
	 private void calculateTotal(){
		 total = quantity*product.getPrice();
	 }
	 public String getFormattedTotal()
	 {
		 NumberFormat currency = NumberFormat.getCurrencyInstance();
		 return currency.format(this.getTotal());
	 }


}
