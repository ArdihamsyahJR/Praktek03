package praktek03;

public class kulkasAksi {
    public static void main(String[] args) {
        kulkas k = new kulkas();
      
        k.setMerek("Toshiba");
        k.setWarna("silver");
        k.setHarga("500");
        
        
   k.cetakInfo();
 
   System.out.println("Mereknya \t: ");
   System.out.println(k.getMerek());
   System.out.println("Warnaknya \t: ");
   System.out.println(k.getWarna());
   System.out.println("Harganya \t: ");
   System.out.println(k.getHarga());
    
    kulkas2pintu sm = new kulkas2pintu();
    sm.setMerek("TOSHIBA");
    sm.setWarna("merah");
    sm.setHarga("600");
    sm.setJeniskulkas("Listrik");
    sm.cetakInfo();
    System.out.println("Jenis \t:"+sm.getJeniskulkas());
    sm.throttle();
    }
    
 
}