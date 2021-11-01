import java.util.ArrayList;
import java.util.Date;

public class Pesanan {
    private Date tanggalPesanan;
    private Date batasPesanan;
    private double totalPesanan;
    ArrayList<ItemKeranjang> arr = new ArrayList<ItemKeranjang>();

    Alamat a = new Alamat();
    StatusPesanan s;

    public Pesanan(Date tanggalPesanan, Date batasPesanan, double totalPesanan) {
        this.tanggalPesanan = tanggalPesanan;
        this.batasPesanan = batasPesanan;
        this.totalPesanan = totalPesanan;
    }

    public Pesanan() {

    }
    
    public void terimaArray(ArrayList<ItemKeranjang> arr2) {
        this.arr = arr2;
    }
    public Date getTanggalPesanan() {
        return tanggalPesanan;
    }
    public void setTanggalPesanan(Date tanggalPesanan) {
        this.tanggalPesanan = tanggalPesanan;
    }
    public Date getBatasPesanan() {
        return batasPesanan;
    }
    public void setBatasPesanan(Date batasPesanan) {
        this.batasPesanan = batasPesanan;
    }
    public double getTotalPesanan() {
        return totalPesanan;
    }

    public void setTotalPesanan(double totalPesanan) {
        this.totalPesanan = totalPesanan;
    }
    
    public void updateStatusPesanan(StatusPesanan status) {
        s = status;
    }
    

}
