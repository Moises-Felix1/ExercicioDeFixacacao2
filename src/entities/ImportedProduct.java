package entities;

public class ImportedProduct extends Product{
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public final String priceTag() {
		setPrice(totalPrice());
		return super.priceTag() + String.format(" (Customs fee: $ %.2f)", getCustomsFee());
	}
	
	public Double totalPrice() {
		return getPrice() + getCustomsFee();
	}

}
