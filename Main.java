
public class Main {

	public static void main(String[] args) {
		Product product1=new Product();
		Product product2=new Product();
		Product product3=new Product();
		
		product1.setName("Delogngi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		
		product2.setName("X marka Kahve Makinesi");
		product2.setUnitPrice(7500);
		product2.setDiscount(7);
		product2.setUnitsInStock(3);
		
		product3.setName("Y marka Kahve Makinesi");
		product3.setUnitPrice(7500);
		product3.setDiscount(7);
		product3.setUnitsInStock(3);
		
		Product[] products= {product1,product2,product3};
		
		System.out.println("<lu>");
		
		for(Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>" );
		}
		System.out.println("</lu>");
/*************************************************************************************/
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222222");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
		
		CorporoteCustomer corporoteCustomer = new CorporoteCustomer();
		
		corporoteCustomer.setId(2);
		corporoteCustomer.setCompanyName("Kodlama.io");
		corporoteCustomer.setPhone("053333333333");
		corporoteCustomer.setTaxNumber("22222222222222222");
		
		Customer[] customers= {individualCustomer,corporoteCustomer};
	
		}

}
