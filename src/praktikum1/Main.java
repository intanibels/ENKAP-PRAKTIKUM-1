package praktikum1;
public class Main {
    public static void main(String[] args) {
        //membuat objek Bus dari class Bus
        Bus Bus = new Bus(5);
        
        //memanggil method getPenumpang serta memasukkan password
        Bus.getPenumpang(17);
        Bus.getPenumpang(25);
        //memanggil method cetak
        Bus.cetakPenumpang();
        System.out.println(); //untuk meberi jarak
        
        //penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.getAverage(50); //mengisi berat badan
        //memanggil method cetak
        Bus.cetakPenumpang();
        System.out.println(); //memberi jarak
        
        //penambahan penumpang
        Bus.addPenumpang(1); //tambah 1 penumpang
        Bus.getAverage(45); //mengisi berat badan
        //memanggil method cetak
        Bus.cetakPenumpang();
        System.out.println(); //memberi jarak
        
        //penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.getAverage(52); //mengisi berat badan
        //memanggil method cetak
        Bus.cetakPenumpang();
        System.out.println(); //memberi jarak
        
        // penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.getAverage(47); //mengisi berat badan
        //memanggil method cetak
        Bus.cetakPenumpang();
    }
}