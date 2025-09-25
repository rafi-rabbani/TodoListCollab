import java.util.Scanner;
public class front {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Back brain = new Back();

        while (true) {
            System.out.println("\n");

            System.out.println("=".repeat(10) + " To - Do List " + "=".repeat(10) + "\n");

            System.out.print(
                            "1. Lihat\n" + //
                            "2. Tambah\n" + //
                            "3. Ubah\n" + //
                            "4. Hapus\n" + //
                            "Silahkan pilih nomor opsi (1-4) : ");
            int pilihan = input.nextInt();
        
            switch (pilihan) {
                case 1:
                    brain.lihatTugas();
                    break;
                case 2:
                    System.out.println("\nTAMBAH\n");
                    break;
                case 3:
                    System.out.println("\nUBAH\n");
                    break;
                case 4:
                    System.out.println("\nHAPUS\n");
                    break;
            
                default:
                    System.out.println("\ninput anda tidak tersedia\n");
                    break;
            }
            input.nextLine();

            System.out.print("lanjut kagak (y/n) : ");
            String lanjut = input.nextLine();

            if (lanjut.equals("n")) {
                break;
            }
            input.close();

        }
    }
}

// import java.util.Scanner;
// public class front {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         // Tambahkan inisialisasi objek ManajerTugas di sini
//         Back manajer = new Back();

//         while (true) {
//             System.out.println("\n" + "=".repeat(10) + " To - Do List " + "=".repeat(10) + "\n");
//             manajer.lihatSemuaTugas(); // Tampilkan daftar setiap kali menu muncul
//             System.out.print(
//                 "1. Lihat\n" +
//                 "2. Tambah\n" +
//                 "3. Ubah\n" +
//                 "4. Hapus\n" +
//                 "5. Keluar\n" + // Tambahkan opsi Keluar
//                 "Silahkan pilih nomor opsi (1-5) : "); // Ubah pesan
            
//             int pilihan = input.nextInt();
//             input.nextLine(); // Tambahkan ini untuk membersihkan buffer

//             switch (pilihan) {
//                 case 1:
//                     // Logika lihat sudah ditangani oleh manajer.lihatSemuaTugas() di atas
//                     break;
//                 case 2:
//                     System.out.print("Masukkan deskripsi tugas baru: ");
//                     String deskripsiTambah = input.nextLine();
//                     manajer.tambahTugas(deskripsiTambah);
//                     break;
//                 case 3:
//                     System.out.print("Masukkan nomor tugas yang ingin diubah: ");
//                     int nomorUbah = input.nextInt();
//                     input.nextLine();
//                     System.out.print("Masukkan deskripsi baru: ");
//                     String deskripsiUbah = input.nextLine();
//                     manajer.ubahTugas(nomorUbah, deskripsiUbah);
//                     break;
//                 case 4:
//                     System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
//                     int nomorHapus = input.nextInt();
//                     manajer.hapusTugas(nomorHapus);
//                     break;
//                 case 5: // Tambahkan case untuk keluar
//                     System.out.println("Terima kasih telah menggunakan aplikasi To-Do List!");
//                     return; // Menghentikan program
//                 default:
//                     System.out.println("\nInput tidak valid.");
//                     break;
//             }
//             // Hapus blok "lanjut kagak" dan input.close() yang ada di kode teman Anda.
//             // Loop while(true) dan opsi 5 sudah cukup.
//         }
//     }
// }