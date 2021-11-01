public class Produk {
    private String id;
    private String deskripsi;
    private double harga;

    public Produk(String id, String deskripsi, double harga) {
        this.id = id;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }
    
    public Produk() {
        //constructor
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }


}
