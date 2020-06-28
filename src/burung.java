public class burung {
    String nama;
    String warna;
    Double panjangBurung;
    Double bentangSayap;
    int usia;

    //construktor
    burung(){

    }
    burung(String nama, String warna, double bentangSayap){
        this.nama = nama;
        this.warna = warna;
        this.bentangSayap = bentangSayap;
        System.out.println("Nama : " + this.nama);
        System.out.println("Warna : "+ this.warna);
        System.out.println("Bentang Sayap : "+this.bentangSayap);
    }
    burung(Double panjangBurung){
        this.panjangBurung = panjangBurung;
        System.out.println("Panjang Burung : " + this.panjangBurung);
    }
    burung(int umur){
        this.usia = umur;
        System.out.println("Usia : "+ this.usia +" Tahun");
    }

    //method
    void Terbang(){
        //String nama = "Merpati Karolina";
        //String warna = "Black Gray";
        //Double bentangSayap = 2.1;
        System.out.println("Nama            : "+nama);
        System.out.println("Warna           : "+warna);
        System.out.println("Bentang Sayap   : "+bentangSayap);
    }
    void Mengicau(){
        System.out.println("cuit cuit cuit ...");
    }
    void Berjalan(){
        System.out.println("Berjalan Mencari makanan");
    }
    void Makan(){
        System.out.println("Pemakan Biji-Bijian Pada Usia "+ this.usia + " Tahun");
    }
    void Istirahat(){
        System.out.println("Burung Berhinggap Diatas Pohon");
    }

    //Overloading
    public static String Berkicau(String Berkicau){
        return Berkicau;
    }
    public static double Berkicau(double b){
        return b;
    }
    public static int Berkicau(int c){
        return c;
    }
}
