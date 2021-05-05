
public class attributes {

 	public static void main(String[] args) {
 		
 		laptop lap1 = new laptop();
 		System.out.println(lap1.ram);
 		System.out.println(lap1.price);
 	}

}

class laptop {

	static int ram = 16;
	static int price = 60000;
	
	void setRam(int ram) {
		this.ram = ram;
	}

	void setPrice(int price) {
		this.price = price;
	}

	int getRam() {
		return ram;
	}

	int getPrice() {
		return price;
	}

}

