// Pabrik pembuat tutup botol sesuai request customer
public class PabrikTutupBotol {
   
   public PenutupBotol buatTutupBotol(String customerRequest) {
      // Hidden proccess
      if (customerRequest.equalsIgnoreCase("metal")) {
         // outputnya
         return new BahanMetal();
      } else if (customerRequest.equalsIgnoreCase("plastik")) {
         // outputnya
         return new BahanPlastik();
      } else if (customerRequest.equalsIgnoreCase("kaca")) {
         // outputnya
         return new BahanKaca();
      }
      // contoh bikin produk baru/ubah produk lama
      else if (customerRequest.equalsIgnoreCase("karet")) {
         return new BahanKaca();
      } 

      return null;
   }
}
