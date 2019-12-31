package coupons;

import java.util.ArrayList;
import java.util.List;

public class CouponSystem {
	
	private static CouponSystem instance = null;
	
	private List<Coupon> coupons;
	
	private CouponSystem() {
		coupons = new ArrayList<>();
	}
	
	public void addCoupon(Coupon coupon) {
		if(coupon == null) {
			System.out.println("Why null :(");
			return;
		}
		coupons.add(coupon);
	}
	
	public static CouponSystem getInstance() {
		if(instance == null) {
			instance = new CouponSystem();
		}
		return instance;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}
	
	
	

}
