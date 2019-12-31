package coupons;

public class Coupon {
	
	private double price;
	
	public Coupon(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Coupon [price=" + price + "]";
	}
	

}
