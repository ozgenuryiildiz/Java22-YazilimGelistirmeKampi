package Uygulamalar;

public class stringlerleCalismalar {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel";
		
		String yeniMesaj=mesaj.replace(' ','-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));
	}

}
