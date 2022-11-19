package mainclass;

/**
 *
 * @author ASUS
 */
public class Toner extends Skincare {
    public Toner () {
    }

    public Toner (String Brand, String Manfaat, int Expired) {
        super(Brand, Manfaat, Expired);
    }

    @Override
    public void menampilkan(){
        System.out.println("Brand : " + Brand);
        System.out.println("Manfaat : " + Manfaat);
        System.out.println("Expired : " + Expired);
        }
        
    public void CiriCiri(){
        System.out.println("Manfaat : Melembabkan Kulit");
        System.out.println("----------------------------------------------");
        }

    public void tampilan() {
    }
    
}
