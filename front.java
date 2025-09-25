import java.util.Scanner;
public class front {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
                    System.out.println("\nLIHAT\n");
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
        }
    }
}
