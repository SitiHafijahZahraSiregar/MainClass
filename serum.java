package mainclass;

public class Serum extends Skincare {
    public Serum () {
    }

    public Serum (String Brand, String Manfaat, int Expired) {
        super(Brand, Manfaat, Expired);
    }

    @Override
    public void menampilkan(){
        System.out.println("Brand : " + Brand);
        System.out.println("Manfaat : " + Manfaat);
        System.out.println("Expired : " + Expired);
        }
        
    public void CiriCiri(){
        System.out.println("Manfaat : Mencerahkan Kulit");
        System.out.println("----------------------------------------------");
        }

    public void tampilan() {
    }
    
}
