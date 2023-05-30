// Demoin aplikasi Pabrik Tutup Botol
public class App {
    public static void main(String[] args) throws Exception {
        // 1. Buat/panggil pabriknya dulu
        PabrikTutupBotol pabrikAlya = new PabrikTutupBotol();

        // 2. Minta request pesanan user
        // Lalu panggil method tutupBotol() di setiap pesanan
        // Pesanan 1
        PenutupBotol penutupBotol1 = pabrikAlya.buatTutupBotol("metal");
        penutupBotol1.tutupBotol();
        
        // Pesanan 1
        PenutupBotol penutupBotol2 = pabrikAlya.buatTutupBotol("plaStik");
        penutupBotol2.tutupBotol();
        
        // Pesanan 1
        PenutupBotol penutupBotol3 = pabrikAlya.buatTutupBotol("kaca");
        penutupBotol3.tutupBotol();
        
        
        
        // Notes:
        // PenutupBotol foo = new BahanKaca(); // ini buat bikin tutupBotol langsung, bukan di pabrik

        /* 
        Studi kasus 1
        Ada customer yang udah pesan 100 tutup botol bahan metal.
        Terus dia minta ubah pesanan jadi bahan alumunium.
        (-) Kalo kita ga pake, design pattern factory, kita harus ubah manual 
        di 100 line tadi.
        (+) Kali kita pake design pattern factory, kita cuma harus ubah
        pembuatan produk yang dipabrik aja
        */ 

        
    }
}
