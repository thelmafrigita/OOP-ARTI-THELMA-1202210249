public class Kapal extends TransportasiAir {
    protected String mesin;

    public Kapal(String mesin, int jumlahKursi, int biaya){
        super(jumlahKursi,biaya);

        this.mesin = mesin;
    }

    public void informasi(){
        System.out.println("Transportasi air jenis Kapal dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sebesar Rp. "+ biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi air jenis Kapal sedang berlayar menggunakan mesin " + mesin + "dengan kecepatan tidak stabil");
    }

    public void berlayar(int kecepatan){
        System.out.println("Transportasi air jenis Kapal sedang berlayar menggunakan mesin " + mesin + "dengan kecepatan stabil di kisaran " + kecepatan + " knot");
    }

    public void berlabuh(){
        System.out.println("Transportasi air jenis Kapal sedang berlabuh di pantai");
    }
}
