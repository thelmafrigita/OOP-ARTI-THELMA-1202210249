import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database db = new Database();

        // TODO Create Menu
        Menu menu1 = new Menu ()
        menu1.setnama (nama : "Bakso")
        menu1.setcategory (category : "(Makanan)");
        menu1.setPrice(price : "Rp. 1000)")


        Menu menu2 = new Menu ()
        menu1.setnama (nama : "Es Teh")
        menu1.setcategory (category : "(Minuman)");
        menu1.setPrice(price : "Rp. 5000)")

        Menu menu3 = new Menu ()
        menu1.setnama (nama : "Brownies")
        menu1.setcategory (category : "(Dessert)");
        menu1.setPrice(price : "Rp. 15000)")

        // TODO Insert Menu to Database
        db.insertMenu(menu1);
        db.insertMenu(menu2);
        db.insertMenu(menu3);

        // TODO Display Main Menu
        Scanner scanner = new Scanner (System.in);
        System.out.println("Selamat datang di Restoran EAD");
        System.out.println("\nSilahkan Register Terlebih Dahulu");
        System.out.println("\n=============================");
        Scanner input = new Scanner(System.in);
        System.out.println("Nama:");
        System.out.println("No.Handphone:");
        String oop = input.nextLine();
    
        // TODO Create User

        // Display Menu
    }
}