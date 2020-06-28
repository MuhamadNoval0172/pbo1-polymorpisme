public class burungMerpati extends burung {
    public void Istirahat(){
        String BatangPohon = "Burung Berhinggap Diatas Pohon Override";
        System.out.println(BatangPohon);
    }

    @Override
    void Terbang() {
        super.Terbang();
    }
}
