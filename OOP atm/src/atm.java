import java.util.Scanner;

public class atm {

	
	public void calis(Hesap hesap) {
		
		
		login login1 = new login();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bankamıza hoşgeldiniz ... ");
		
		System.out.println("*****************************");
		System.out.println("Kullanıcı Girişi");
		System.out.println("*****************************");
		
		
		 int giris_hakkı = 3 ;
		 
		 while(true) {
			 
			 if(login1.login(hesap)) {
				 System.out.println("Kullanıcı girişi başarılı ....");
				 break ;
				 
				 
			 }
			 else {
				 System.out.println("Giriş Başarısız...");
				 
				 giris_hakkı -= 1 ;
				 System.out.println("Kalan giriş hakkı : " +giris_hakkı);
				 
				 
			 }
			 if(giris_hakkı == 0 ) {
				 System.out.println("Giriş hakkınız bitti ...");
				 
				 return ;
				 
			 }
		 }
		 
		 
		 System.out.println("*****************************");
		 String ıslemler = "1.Bakiye Görüntüle \n"
		 		         + "2.Para Yatırma\n"
		 		         + "3.Para Çekme\n"
		 		         + "Çıkış için q ya basınız..." ;
		 System.out.println(ıslemler);
		 System.out.println("*****************************");
		
		 
		 while(true) {
			 System.out.println("İşlemi Seçiniz : ");
			 String ıslem = scanner.nextLine();
			 
			 if(ıslem.equals("q") ){
				 
				 
				 System.out.println("Programdan Çıkılıyor ....");
				 break ;
				 
			 }
			 
			 else if(ıslem.equals("1")){
				 System.out.println("Bakiyeniz : " +hesap.getBakiye());
				 
			 } 
			 else	if(ıslem.equals("2")) {
					 System.out.println("Yatırmak istediğiniz tutar : ");
					 int tutar = scanner.nextInt();
					 scanner.nextLine();
					 hesap.parayatır(tutar);
					 
					 
				 }
				 else if(ıslem.equals("3")) {
					 System.out.println("Çekmek istediğiniz tutar : ");
					 int tutar = scanner.nextInt();
					 scanner.nextLine();
					 hesap.paraçek(tutar);
					 
				 }
				 else {
					 System.out.println("Geçersiz İşlem ....");
				 }
			}
		 }
	}

