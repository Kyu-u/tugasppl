
public class ItemKeranjang {
    private int jumlah;
    private double harga;
    Produk p;
    public ItemKeranjang(Produk p1,int jumlah ) {
        this.jumlah = jumlah;
        this.harga = this.jumlah * p1.getHarga();
        this.p = p1;
    }   
    
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}
