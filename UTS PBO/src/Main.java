public class Main {
    public static void main(String[] args) {
        Tendik tndk = new Tendik();
        tndk.setNama("Paijan");
        tndk.setNip(123123123);
        tndk.setTglLahir("15/07/1990");
        tndk.setAlamat("Pati");
        tndk.setJk("Laki-Laki");
        tndk.setTahunMasuk(2021);

        Dosen dsn = new Dosen();
        dsn.setJurusan("Informatika");
        dsn.setNidn(24112002);
        dsn.setNama("Paijo S.Kom");
        dsn.setNip(456456456);
        dsn.setTglLahir("10/15/1995");
        dsn.setJk("Laki-Laki");
        dsn.setAlamat("Semarang");
        dsn.setTahunMasuk(2015);

        System.out.println("-----------------------");
        System.out.println("| Total Gaji Karyawan |");
        System.out.println("-----------------------");
        System.out.println("Nama Karyawan       : "+ tndk.getNama());
        System.out.println("NIP  Karyawan       : "+ tndk.getNip());
        System.out.println("Tanggal Lahir       : "+ tndk.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ tndk.getJk());
        System.out.println("Alamat              : "+ tndk.getAlamat());
        System.out.println("Tahun masuk         : "+ tndk.getTahunMasuk());
        System.out.println("Gaji pokok          : "+tndk.gajiTotal());
        System.out.println("Upah lembur(20 jam) : "+ tndk.lembur(20));
        System.out.println("Gaji total          : "+ tndk.gajiTotal(20));

        System.out.println("\n");
        System.out.println("---------------------");
        System.out.println("| Totoal Gaji Dosen |");
        System.out.println("---------------------");
        System.out.println("Nama Dosen          : "+ dsn.getNama());
        System.out.println("NIDN                : " +dsn.getNidn());
        System.out.println("Jurusan             : " + dsn.getJurusan());
        System.out.println("NIP  Dosen          : "+ dsn.getNip());
        System.out.println("Tanggal Lahir       : "+ dsn.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ dsn.getJk());
        System.out.println("Alamat              : "+ dsn.getAlamat());
        System.out.println("Tahun masuk         : "+ dsn.getTahunMasuk());
        System.out.println("Gaji pokok          : "+ dsn.gajiTotal());
        System.out.println("Kelas lebih (6 SKS) : "+ dsn.mengajarLebih(6));
        System.out.println("Gaji total          : "+ dsn.gajiTotal(6));

    }
}