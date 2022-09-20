package Uygulamalar;

public class SwitchBlockKullanımı {

	public static void main(String[] args) {
		char grade='A';
		
		switch(grade) {
		case 'A':
			System.out.print("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.print("Çok güzel : Geçtiniz");
			break;
		case 'C':
			System.out.print("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.print("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.print("Malesef kaldınız");
			break;
			default:
				System.out.println("Geçersiz bir ifade girdiniz");
		}

	}

}
