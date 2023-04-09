import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        ArrayList<ZakatFitrah> zakatList = new ArrayList<>();

        String nama, alamat, jenisZakat, jawaban = "";
        int jumlahBeras = 0;
        double jumlahUang = 0.0;

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
                jumlahUang = Double.parseDouble(System.console().readLine());
            } else {
                System.out.println("Jenis zakat tidak valid!");
                continue; // lanjut
            }

            ZakatFitrah zakat = new ZakatFitrah(nama, alamat, jenisZakat, jumlahBeras, jumlahUang);
            zakatList.add(zakat);

            System.out.print("Tambah data? (y/n): ");
            jawaban = System.console().readLine();
        } while (jawaban.equalsIgnoreCase("y"));

        System.out.println("Data Zakat");
        System.out.println("===========================================================");
        System.out.println("No.\tNama\t\tAlamat\tJenis\t\tJumlah");
        System.out.println("===========================================================");

        for (int i = 0; i < zakatList.size(); i++) {
            System.out.print(i+1 + "\t");
            System.out.print(zakatList.get(i).getNama() + "\t");
            System.out.print(zakatList.get(i).getAlamat() + "\t"+"\t");
            System.out.print(zakatList.get(i).getJenisZakat() + "\t");

            if (zakatList.get(i).getJenisZakat().equalsIgnoreCase("fitrah")) {
                System.out.println(zakatList.get(i).getJumlahBeras() + " kg");
            } else {
                System.out.println("Rp" + zakatList.get(i).getJumlahUang());
            }
        }
    }
}