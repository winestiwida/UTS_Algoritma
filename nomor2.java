import java.util.ArrayList;

public class nomor2 {
    public static void main(String[] args) throws Exception{
        ArrayList<ZakatFitrah> zakatList = new ArrayList<>();

        String nama, alamat, jenisZakat, jawaban = "";
        int jumlahBeras = 0;
        int jumlahUang = 0;

        do {
            System.out.print("Masukkan nama: ");
            nama = System.console().readLine();

            System.out.print("Masukkan alamat: ");
            alamat = System.console().readLine();

            System.out.print("Jenis zakat (fitrah/sedekah): ");
            jenisZakat = System.console().readLine();

            if (jenisZakat.equalsIgnoreCase("fitrah")) {
                System.out.print("Jumlah beras (kg): ");
                jumlahBeras = Integer.parseInt(System.console().readLine());
            } else if (jenisZakat.equalsIgnoreCase("sedekah")) {
                System.out.print("Jumlah uang (Rp): ");
                jumlahUang = Integer.parseInt(System.console().readLine());
            } else {
                System.out.println("Jenis zakat tidak valid!");
                continue; // lanjut ke iterasi berikutnya
            }

            // Membuat objek ZakatFitri dan menambahkannya ke list
            if (jenisZakat.equalsIgnoreCase("fitrah")) {
                int jumlahZakat = jumlahBeras;

                ZakatFitrah zakatFitri = new ZakatFitrah(nama, alamat, jenisZakat, jumlahBeras, jumlahZakat);
                zakatList.add(zakatFitri);
            } else if (jenisZakat.equalsIgnoreCase("sedekah")) {
                double jumlahZakat = jumlahUang;

                ZakatFitrah zakatFitri = new ZakatFitrah(nama, alamat, jenisZakat, jumlahUang, jumlahZakat);
                zakatList.add(zakatFitri);
            }
            
            System.out.print("Tambah data lagi? (y/n): ");
            jawaban = System.console().readLine();
        } while (jawaban.equalsIgnoreCase("y"));

        // Menghitung statistik zakat fitri
        int jumlahFitrahBeras = 0;
        double jumlahFitrahUang = 0.0;
        int jumlahSedekahUang = 0;

        for (ZakatFitrah zakat : zakatList) {
            if (zakat.getJenisZakat().equalsIgnoreCase("fitrah")) {
                jumlahFitrahBeras += zakat.getJumlahBeras();
                jumlahFitrahUang += zakat.getJumlahUang();
            } else if (zakat.getJenisZakat().equalsIgnoreCase("sedekah")) {
                jumlahSedekahUang += zakat.getJumlahUang();
            }
        }

        System.out.println("Jumlah warga yang membayar zakat fitri dengan beras atau uang: " + zakatList.size());
        System.out.println("Jumlah beras zakat fitri yang terkumpul: " + jumlahFitrahBeras + " kg");
        System.out.println("Jumlah uang zakat fitri yang terkumpul: Rp" + jumlahFitrahUang);
        System.out.println("Jumlah uang sedekah yang terkumpul: Rp" + jumlahSedekahUang);
    }
}