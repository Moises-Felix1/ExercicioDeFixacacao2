package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

	static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate manufacture;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate manufacture) {
		super(name, price);
		this.manufacture = manufacture;
	}

	public LocalDate getManufacture() {
		return manufacture;
	}

	public void setManufacture(LocalDate manufacture) {
		this.manufacture = manufacture;
	}
	
	@Override
	public final String priceTag() {
		return getName()+" (used) $ "+ String.format("%.2f", getPrice())+
				" (Manufacture date: "+fmt.format(manufacture)+")";
	}
}
