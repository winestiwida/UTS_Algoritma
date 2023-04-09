public class ZakatFitrah {
    private String nama;
    private String alamat;
    private String jenisZakat;
    private int jumlahBeras;
    private double jumlahUang;

    public ZakatFitrah(String nama, String alamat, String jenisZakat, int jumlahBeras, double jumlahUang) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisZakat = jenisZakat;
        this.jumlahBeras = jumlahBeras;
        this.jumlahUang = jumlahUang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisZakat() {
        return jenisZakat;
    }

    public void setJenisZakat(String jenisZakat) {
        this.jenisZakat = jenisZakat;
    }

    public int getJumlahBeras() {
        return jumlahBeras;
    }

    public void setJumlahBeras(int jumlahBeras) {
        this.jumlahBeras = jumlahBeras;
    }

    public double getJumlahUang() {
        return jumlahUang;
    }

    public void setJumlahUang(double jumlahUang) {
        this.jumlahUang = jumlahUang;
    }

    public double getJumlah(){
        if (jenisZakat.equalsIgnoreCase("fitrah")){
            return jumlahBeras;            
        } else {
            return jumlahUang;
        }
    }
}
