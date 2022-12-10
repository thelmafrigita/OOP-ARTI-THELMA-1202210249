

public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int layar, int jumlahKursi, int biaya){
        super(jumlahKursi,biaya);

        this.layar = layar;
    }

    public void informasi(){
        System.out.println("Transportasi air jenis Sampan dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sebesar Rp. "+ biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi air jenis Sampan sedang berlayar menggunakan " + layar + "layar");
    }

    public void berlabuh(){
        System.out.println("Transportasi air jenis Sampan berlabuh di pantai tanpa jangkar");
    }

    public void berlabuh(int jangkar){
        System.out.println("Transportasi air jenis Sampan berlabuh di pantai menggunakan " + jangkar + " Jangkar");
    }

}

