public class main {
    public static void main(String[] args){
        burung Burung1 = new burung("Merpati Karang","White Gray", 2.5);
        burung Burung2 = new burung(3.4);
        burung Burung3 = new burung(4);
        System.out.println("===============================");

        burung Burung = new burung();
        Burung.nama = "Burung Merpati";
        Burung.warna = "Black white";
        Burung.panjangBurung = 3.5;
        Burung.bentangSayap = 2.1;
        Burung.usia = 3;


        Burung1.Terbang();
        Burung2.Mengicau();
        Burung3.Makan();
        //Burung3.Istirahat();
        Burung3.Berjalan();

        //Overloading Method
        System.out.println("===============================");
        String Berkicau = burung.Berkicau("Burung Berkicau Dengan Indah");
        System.out.println(Berkicau);
        double b = burung.Berkicau(4.5);
        System.out.println("Berkicau Diketinggian "+b +" Meter");
        int c = burung.Berkicau(3);
        System.out.println("Dengan Jarak Antar Burung "+ c + " cm");

        //override
        System.out.println("===============================");
        burungMerpati BurungMerpati = new burungMerpati();
        BurungMerpati.nama = "Burung Karolina";
        BurungMerpati.warna = "white Gray";
        BurungMerpati.bentangSayap = 2.1;

        BurungMerpati.Istirahat();
        Burung3.Istirahat();

        Burung.Terbang();
        BurungMerpati.Terbang();
        System.out.println("===============================");
    }
}
