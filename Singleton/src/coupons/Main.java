package coupons;

public class Main {

	public static void main(String[] args) {
		CouponSystem cs1 = CouponSystem.getInstance();
		CouponSystem cs2 = CouponSystem.getInstance();
		
		cs1.addCoupon(new Coupon(78.9));
		cs1.addCoupon(new Coupon(53.2));
		cs1.addCoupon(new Coupon(67.8));

		System.out.println(cs2.getCoupons());
	}

}
