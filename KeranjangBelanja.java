import java.util.ArrayList;

public class KeranjangBelanja {
    ArrayList<ItemKeranjang> arr;

    public KeranjangBelanja(ArrayList<ItemKeranjang> arr) {
        this.arr = arr;
    }

    public KeranjangBelanja() {
        //constructor
    }

    public boolean update(ItemKeranjang i) {
        arr.add(i);
        if (i == arr.get(arr.size() - 1)) {
            return true;
        } else
            return false;
    }
    
    public boolean hapus(ItemKeranjang item) {
        for (int i = 0; i < arr.size(); i++) {
            if (item == arr.get(i)) {
                arr.remove(i);
            }
        }
        if (item != arr.get(arr.size() - 1)) {
            return true;
        } else
            return false;
    }
    
    public Pesanan pembelian() {
        return new Pesanan();
    }

    public ArrayList<ItemKeranjang> getArray() {
        return arr;
    }
    
}
