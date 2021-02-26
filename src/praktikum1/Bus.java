package praktikum1;
public class Bus {
    //membuat variabel instance
    public double penumpang;
    public double maxPenumpang;
    public double counter = 0;
    public double penumpangBaru;
    double average;
    
    //membuat nethod Bus3 untuk mengatur jumloah max penumpang
    public Bus(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    //membuat method addPenumpang untuk menambah jumlah penumpang
    public void addPenumpang(double penumpang){
        this.penumpangBaru = 0;
        double temp = this.penumpang+penumpang;  //menambah jumlah penumpang
        this.penumpangBaru = penumpang; 
        if(temp>maxPenumpang){ //jika jumlah penumpang melebihi maksimal penumpang
            System.out.println("penumpang melebihi kuota"); //akan muncul penumpang melebihi kuota
        }else{ //jika tidak
            this.penumpang = temp; //jumlah penumpang sama dengan temp
        }
    }
    //membuat method getPenumpang untuk mengatur password
    public double getPenumpang(int password){
        if(password==25){ //jika password = 25
            System.out.println("Password Benar"); //maka benar
        }else{ //jika selain 24
            System.out.println("Password Salah"); //maka salah
        }
        return password;
    }
    //method getAverage untuk mengatur rata rata berat badan penumpang
    public double getAverage(double weight){
        if(this.penumpang+penumpangBaru>maxPenumpang){ //jika jumlah penumpang mmelebihi maksimal penumpang
            System.out.println("Berat Penumpang = "+counter); //berat penumpang akan tetap 
            System.out.println("berat rata rata penumpang dalam bis sekarang = "+average); //rata rata penumpang juga akan tetap
        }else{ //jika tidak
            counter += weight*penumpangBaru; //jumlah counter akan terus menambah 
            average = counter/penumpang; //untuk menghitung rata rata
            System.out.println("Berat Penumpang = "+counter); //menampilkan hasil berat penumpanng
            System.out.println("berat rata rata penumpang dalam bis sekarang = "+average); //menampilkan hasil rata rata penumpang
        }
        return weight;
    }
    //method menampilkan hasil output
    public void cetakPenumpang(){
        System.out.println("penumpang bus sekarang = "+penumpang); //menampilkan output jumlah penumpang
        System.out.println("maksimum penumpang yang seharusnya adalah = "+maxPenumpang); //menampilkan output maksimal penumpang
    }
}