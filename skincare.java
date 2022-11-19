package mainclass;

/**
 *
 * @author ASUS
 */
public class Skincare {
    
    String  Brand;
    String Manfaat;
    int Expired;
    
    public Skincare(){
    
    }
    public Skincare(String brand, String manfaat, int expired) {
        this.Brand = brand;
        this.Manfaat = manfaat;
        this.Expired = expired;
    }
    
    public void menampilkan(){
    System.out.println("Brand : " + Brand);
    }
    public void tampilan() {
        
    }
}
