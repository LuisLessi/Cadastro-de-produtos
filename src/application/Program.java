package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import products.ImportedProduct;
import products.Product;
import products.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Product> pro = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int products = sc.nextInt();
		
		for(int i = 0; i < products; i++) {
			i++;
			System.out.println("Product #"+i+" data: ");
			i--;
			
			System.out.print("Common used or imported (c/u/i)?: ");
			sc.nextLine();
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			
			if(type == 'c') {
				pro.add(new Product(name, price));
			}
		
			else if (type == 'u'){
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				pro.add(new UsedProduct(name, price, date));
				
			} else {
				
				System.out.print("Customs fee: ");
				pro.add(new ImportedProduct(name, price, sc.nextDouble()));
			}
			}
				System.out.println("\nPRICE TAGS:");
				for(Product x : pro) {
				System.out.println(x.priceTag());
			}
		}

	}


