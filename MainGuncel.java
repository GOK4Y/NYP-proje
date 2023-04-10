import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class GenelUye extends Main {
    private static final String FILE_NAME = "Kullanıcılar.txt";
	public String genelUye;
	String[][] arr = new String[3][3];
    public void add() {
        Scanner scanner = new Scanner(System.in);

        
        
        for(int i =0; i<arr.length; i++) {
      	  
      		  System.out.print("İsim: ");
      	        String name = scanner.nextLine();
      	        arr[i][0] =name;
      	        System.out.print("Soyisim: ");
      	        String surname = scanner.nextLine();
      	        arr[i][1] = surname;
      	        System.out.print("E-posta: ");
      	        String email = scanner.nextLine();
      	        arr[i][2] = email;
      	        String deneme = name +"\t"+ surname +"\t"+ email +"\n";
      	  }
        
        try {
       	 File file = new File("Kullanıcılar.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
           FileWriter writer = new FileWriter(file,true);
           BufferedWriter bWriter = new BufferedWriter(writer);
           bWriter.write("#GENEL ÜYELER#\n");
           for(int i = 0;i<arr.length;i++) {
        		   bWriter.write(arr[i][0]+"\t"+arr[i][1]+"\t"+arr[i][2]+"\n");
        	   }
           
          
           bWriter.close();
           System.out.println("Genel üye eklendi.");
       } catch (IOException e) {
           System.out.println("Dosya yazma hatası: "+e.getMessage());
       }
    }
}
class ElitUye extends Main {
    private static final String FILE_NAME = "Kullanıcılar.txt";
	private String elitUye;
	 String[][] arr = new String[3][3];
    public void add() {
        Scanner scanner = new Scanner(System.in);

      for(int i =0; i<arr.length; i++) {
    	 
    		  System.out.print("İsim: ");
    	        String name = scanner.nextLine();
    	        arr[i][0]=name;
    	        System.out.print("Soyisim: ");
    	        String surname = scanner.nextLine();
    	        arr[i][1]=surname;
    	        System.out.print("E-posta: ");
    	        String email = scanner.nextLine();
    	        arr[i][2]=email;
    	        String elitUye = name +"\t"+ surname +"\t"+ email +"\n";
    	         
    	  }
      
        try {
        	 File file = new File("Kullanıcılar.txt");
             if (!file.exists()) {
                 file.createNewFile();
             }
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bWriter = new BufferedWriter(writer);
            bWriter.write("#ELİT üYELER#\n");
            for(int i=0; i<arr.length;i++) {
            bWriter.write(arr[i][0]+"\t"+arr[i][0]+"\t"+arr[i][2]+"\n");
            }
            bWriter.close();
            System.out.println("Elit üye eklendi.");
        } catch (IOException e) {
            System.out.println("Dosya yazma hatası: "+e.getMessage());
        }
    }
}
public class Main {
	
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 ElitUye elituye = new ElitUye();
		 GenelUye geneluye = new GenelUye();
		 
while(true) {
	        System.out.println("\nMENÜ");
	        System.out.println("1-Elit üye ekleme");
	        System.out.println("2-Genel Üye ekleme");
	        System.out.println("3-Mail Gönderme");
	        System.out.println("4-Çıkış");
	        int secim = s.nextInt();
	        switch (secim) {
	        
	        case 1: 
	            elituye.add();
	            break;
	        case 2:
	        	geneluye.add();
	        	break;
	        case 3:
	        	 System.out.println("Mail gönderme");
	                System.out.println("1- Elit üyelere mail gönderme");
	                System.out.println("2- Genel üyelere mail gönderme");
	                System.out.println("3- Tüm üyelere mail gönderme");
	                int mailsecim = s.nextInt();
	                s.nextLine(); 
	                if (mailsecim < 1 || mailsecim > 3) {
	                    System.out.println("Geçersiz seçim.");
	                    continue;
	                }
	                System.out.print("Mailinizi girin: ");
	                String mail = s.nextLine();// E mailin konusunu yazmak için ekstra boşluk
	                
	                switch (mailsecim) {
	                    case 1:
	                    	//sendEmailTo.sendEmailTo("Elit üyeler için mail gönderimi.",1);
	                    	break;
	                    case 2:
	                    	 //sendEmailTo.sendEmailTo("Genel üyeler için mail gönderimi.",2); 
	                        break;
	                    case 3:
	                    	// sendEmailTo.sendEmailTo("Tüm üyelere mail gönderimi.",3);
	                    	 break;
	                    default:
	                        System.out.println("Geçersiz seçim...");
	                        break;
	                }
	                break;
	        case 4:
	        	System.out.println("Çıkış yapılıyor...");
	        	 System.exit(0); // programı sonlandır.
	        	break;
	        default:
                System.out.println("Geçersiz seçim, tekrar deneyiniz...");
                break;
              
	}
}
	}
	
}
