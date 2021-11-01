public class Main {
    public static void main(String args[])
    {   
        Produk produk1 = new Produk("001", "Sisir", 10000);
        Produk produk2 = new Produk("002", "Aqua", 5000);
        Produk produk3 = new Produk("003", "Shampoo", 30000);
        Produk produk4 = new Produk("004", "Masker", 20000);
        Produk produk5 = new Produk("005", "Sanitizer", 15000);
        Produk produk6 = new Produk("006", "Tissue", 15000);
        Produk produk7 = new Produk("007", "Sosis", 8000);

        ItemKeranjang sosis = new ItemKeranjang(produk7, 10);
        ItemKeranjang tissue = new ItemKeranjang(produk6, 2);
        ItemKeranjang sisir = new ItemKeranjang(produk1, 3);



        Pelanggan p = new Pelanggan("Leo", "Rindra", "ajileo@gmail.com", "081278789467", "aji", "ganteng");
        Alamat alamatbaru = new Alamat("Bumi marina", 60111, "Surabaya", "0812345678");
        if (p.tambahAlamat(alamatbaru)) {
            System.out.println("Alamat berhasil ditambahkan");
        }
        else System.out.println("Penambahan alamat gagal");
        p.updateStatus(StatusPelanggan.baru);

        if (p.updateKeranjang(sosis)) {
            System.out.printf("%s telah berhasil ditambahkan ke keranjang", sosis.p.getDeskripsi());

        }
        else System.out.println("Penambahan gagal");

        if (p.updateKeranjang(tissue)) {
            System.out.printf("%s telah berhasil ditambahkan ke keranjang", sosis.p.getDeskripsi());

        }
        else System.out.println("Penambahan gagal");

        if (p.updateKeranjang(sisir)) {
            System.out.printf("%s telah berhasil ditambahkan ke keranjang", sosis.p.getDeskripsi());

        }
        else System.out.println("Penambahan gagal");



	}
}
