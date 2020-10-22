import java.util.Scanner;
public class quizteori {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		String nama;
		int tipe, meter, bayar, total, kembali; 
		
		total =(0);
		
		System.out.print("Masukkan nama anda: ");
		nama = input.nextLine();
		System.out.println();
		
		System.out.println("Opsi tipe rumah: ");
		System.out.println("1. 31");
		System.out.println("2. 32");
		System.out.println("3. 33");
		System.out.println("4. 34");
		System.out.println("5. 35");
		System.out.println("6. 40");
		System.out.print("Masukkan tipe rumahmu: ");
		tipe = input.nextInt();
		System.out.println();
		
		System.out.print("Masukkan jumlah meteran pemakaian anda (dalam KWH): ");
		meter = input.nextInt(); 
		System.out.println();
		
		  if (tipe == 31) {
			total = meter*100000;
			System.out.println("Beban per KWH adalah Rp. 100,000. Biaya kamu adalah : "+total); 
		} 
		else if (tipe == 32) {
			total = meter*125000;
			System.out.println("Beban per KWH adalah Rp. 125,000. Biaya kamu adalah : "+total);
		} 
		else if (tipe == 33) {
			total = meter*450000;
			System.out.println("Beban per KWH adalah Rp. 450,000. Biaya kamu adalah : "+total);
		} 
		else if (tipe == 34) {
			total = meter*480000;
			System.out.println("Beban per KWH adalah Rp. 480,000. Biaya kamu adalah : "+total);
		} 
		else if (tipe == 35) {
			total = meter*500000;
			System.out.println("Beban per KWH adalah Rp. 500,000. Biaya kamu adalah : "+total);
		} 
		else if (tipe == 40) {
		 	total = meter*550000;
		 	System.out.println("Beban per KWH adalah Rp. 550,000. Biaya kamu adalah : "+total);
		}
		
		System.out.print("Masukkan pembayaran disini: ");
		bayar= input.nextInt();
		System.out.println();
		
		kembali=bayar-total;
		System.out.println("Kembalian mu adalah: "+kembali);
	}
}