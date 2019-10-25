package Daryl;

public class InterestCalculatorSub {
	String itemName;
	double itemPrice;
	int interestPercent;
	public void printInterest() {
		System.out.println("Item: "+ getItemName());
		System.out.println("Price: "+ getItemPrice());
		System.out.println("Interest Percentage: "+ getInterestPercent() + "%");
		double interestPrice = getItemPrice() * (getInterestPercent() * 0.01);
		System.out.println("Interest Price: "+ interestPrice);
		double priceWithInterest = getItemPrice() + interestPrice;
		System.out.println("Price with Interest: "+ priceWithInterest);
	}
	private String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	private double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	private int getInterestPercent() {
		return interestPercent;
	}
	public void setInterestPercent(int interestPercent) {
		this.interestPercent = interestPercent;
	}
}
