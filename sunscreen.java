package mainclass;

/**
 *
 * @author ASUS
 */
public class Sunscreen extends Skincare {
    public Sunscreen () {
    }

    public Sunscreen (String Brand, String Manfaat, int Expired) {
        super(Brand, Manfaat, Expired);
    }

    @Override
    public void menampilkan(){
        System.out.println("Brand : " + Brand);
        System.out.println("Manfaat : " + Manfaat);
        System.out.println("Expired : " + Expired);
        }
        
    public void CiriCiri(){
        System.out.println("Manfaat : Melindungi Kulit dari matahari");
        System.out.println("----------------------------------------------");
        }

    public void tampilan() {
    }
    
}
