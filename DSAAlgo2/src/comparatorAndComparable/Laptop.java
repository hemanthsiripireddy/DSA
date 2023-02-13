package comparatorAndComparable;

public class Laptop implements Comparable<Laptop>{
	private String brand;
	private double price;
	private int ram;
	
	public Laptop(String brand, double price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	@Override
	public int compareTo(Laptop o) {
		// TODO Auto-generated method stub
		if(this.price<o.price)
			return 1;
		return -1;
	}
	public String toString() {
		return "brand: "+this.brand+" price:  "+this.price+" ram:  "+this.ram;
	}
	

}
