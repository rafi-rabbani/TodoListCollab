public class Side {
    private String deskripsi;
    private boolean isSelesai;

    public Side(String deskripsi) {
        this.deskripsi = deskripsi;
        this.isSelesai = false; // Tugas baru otomatis belum selesai
    }

    // Getter untuk deskripsi
    public String getDeskripsi() {
        return deskripsi;
    }

    // Setter untuk deskripsi
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    // Getter untuk status selesai
    public boolean isSelesai() {
        return isSelesai;
    }

    // Setter untuk status selesai
    public void setSelesai(boolean isSelesai) {
        this.isSelesai = isSelesai;
    }
}