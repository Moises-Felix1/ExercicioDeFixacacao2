package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		List<Product> listap = new ArrayList<>();
		
		System.out.println("--------------------------------------------------");
		System.out.println("EXERCICIO DE FIXAÇÃO SOBRE HERANACA & POLIMORFISMO");
		System.out.println("--------------------------------------------------");
		
		System.out.print("Enter the number of products: ");
		int number = sc.nextInt();
		
		for(int i = 0; i < number; i++) {
			System.out.println("Product #"+(i+1)+" data:");
			System.out.print("Common, used or imported(c/u/i)? ");
			char answer = sc.next().charAt(0);
			if(answer == 'c') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.next();
				System.out.print("Price: ");
			    double price = sc.nextDouble();
				listap.add(new Product(name, price));
				System.out.println();
			}else {
				if(answer == 'u') {
					System.out.print("Name: ");
					sc.nextLine();
					String name = sc.next();
					System.out.print("Price: ");
				    double price = sc.nextDouble();
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					sc.nextLine();
					String data = sc.nextLine();
					LocalDate dte = LocalDate.parse(data, fmt);
					listap.add(new UsedProduct(name, price, dte));
					System.out.println();
				}else {
					if(answer == 'i') {
						System.out.print("Name: ");
						sc.nextLine();
						String name = sc.next();
						System.out.print("Price: ");
						double price = sc.nextDouble();
						System.out.print("Customs fee: ");
						double tax = sc.nextDouble();
						listap.add(new ImportedProduct(name, price, tax));
						System.out.println();
					}
				}
			}
		}
		
		System.out.println();
		
		System.out.println("PRICE TAGS:");
		for(Product p : listap) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
		
	}
	
}