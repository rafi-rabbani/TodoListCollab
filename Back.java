import java.util.Scanner;
import java.util.ArrayList;

public class Back {
    private ArrayList<Side> daftarTugas;

    public Back() {
        this.daftarTugas = new ArrayList<>();
    }
    public void lihatTugas() {

        if (daftarTugas.isEmpty()) {
            System.out.println("\nTidak ada tugas dalam daftar\n");

        } else {
            System.out.println("\nDaftar Tugas:");
            for (int i = 0; i < daftarTugas.size(); i++) {
                System.out.println((i + 1) + ". " + daftarTugas.get(i));
            }
        }
    }
}

// import java.util.ArrayList;

// public class Back {
//     private ArrayList<Side> daftarTugas;

//     public Back() {
//         this.daftarTugas = new ArrayList<>();
//     }

//     public void tambahTugas(String deskripsi) {
//         Side tugasBaru = new Side(deskripsi);
//         daftarTugas.add(tugasBaru);
//         System.out.println("Tugas '" + deskripsi + "' berhasil ditambahkan.");
//     }

//     public void lihatSemuaTugas() {
//         if (daftarTugas.isEmpty()) {
//             System.out.println("Belum ada tugas.");
//             return;
//         }

//         System.out.println("\n--- DAFTAR TUGAS ---");
//         for (int i = 0; i < daftarTugas.size(); i++) {
//             Side tugas = daftarTugas.get(i);
//             String status = tugas.isSelesai() ? "[X]" : "[ ]";
//             System.out.printf("[%d] %s %s%n", i + 1, status, tugas.getDeskripsi());
//         }
//     }

//     public void ubahTugas(int nomorTugas, String deskripsiBaru) {
//         if (nomorTugas > 0 && nomorTugas <= daftarTugas.size()) {
//             Side tugas = daftarTugas.get(nomorTugas - 1);
//             tugas.setDeskripsi(deskripsiBaru);
//             System.out.println("Tugas berhasil diubah.");
//         } else {
//             System.out.println("Nomor tugas tidak valid.");
//         }
//     }

//     public void hapusTugas(int nomorTugas) {
//         if (nomorTugas > 0 && nomorTugas <= daftarTugas.size()) {
//             Side tugasDihapus = daftarTugas.remove(nomorTugas - 1);
//             System.out.println("Tugas '" + tugasDihapus.getDeskripsi() + "' berhasil dihapus.");
//         } else {
//             System.out.println("Nomor tugas tidak valid.");
//         }
//     }
// }