package Daryl;

public class MultiplicationTableSub {
	int fromNumber;
	int toNumber;
	public void printTable() {
		for(int i = fromNumber; i<=toNumber; i++) {
			for(int x = 1; x<=10; x++) {
				System.out.print(i*x+" ");
			}
			System.out.println();
		}
	}
	public void setFromNumber(int fromNumber) {
		this.fromNumber = fromNumber;
	}
	public void setToNumber(int toNumber) {
		this.toNumber = toNumber;
	}
	private int getFromNumber() {
		return fromNumber;
	}
	private int getToNumber() {
		return toNumber;
	}
	
}
