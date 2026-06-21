public class Lagu {
    private String judul;
    private String artis;
    private double durasi;

    // Constructor untuk mengisi data lagu saat objek dibuat
    public Lagu(String judul, String artis, double durasi) {
        this.judul = judul;
        this.artis = artis;
        this.durasi = durasi;
    }

    // Mengambil nilai judul lagu
    public String getJudul() {
        return judul;
    }

    // Mengubah nilai judul lagu
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Mengambil nama artis
    public String getArtis() {
        return artis;
    }

    // Mengubah nama artis
    public void setArtis(String artis) {
        this.artis = artis;
    }

    // Mengambil durasi lagu
    public double getDurasi() {
        return durasi;
    }

    // Mengubah durasi lagu
    public void setDurasi(double durasi) {
        this.durasi = durasi;
    }

    // Menampilkan informasi lagu
    public void tampilkanInfo() {
        System.out.println("Judul  : " + judul);
        System.out.println("Artis  : " + artis);
        System.out.printf("Durasi : %.2f menit%n", durasi);
        System.out.println();
    }
}
