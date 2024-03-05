package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		

		/*ImportedProduct p = new ImportedProduct("Tablet", 260.00, 20.00);
		System.out.println(p.priceTag());*/
		
		/*Product p = new Product("Tablet", 260.00);
		System.out.println(p.priceTag());*/
		
		String d = "18/07/2022";
		LocalDate data = LocalDate.parse(d, fmt);
		
		UsedProduct p = new UsedProduct("Iphone", 400.00, data);
		System.out.println(p.priceTag());
	}

}
