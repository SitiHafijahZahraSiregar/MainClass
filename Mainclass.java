package mainclass;

/**
 *
 * @author ASUS
 */
public class MainClass {

    public static void main(String[] args) {
        Skincare Serum = new Serum("Luxcrime","Mencerahkan Kulit", 2024);
        Skincare Toner = new Toner ("Emina", "Melembabkan Kulit", 2023);
        Skincare Sunscreen = new Sunscreen ("Wardah"," Melindungi Kulit dari matahari", 2025);
        
        System.out.println("Menampilkan Brand, Manfaat, Expired : ");
        System.out.println("------------------------------------------------------");

        Serum.menampilkan();
        System.out.println("------------------------------------------------------\n");
        Toner.menampilkan();
        System.out.println("------------------------------------------------------\n");
        Sunscreen.menampilkan();
    }
    
}
