package finalPacman;

public class AdvancedPacManModel extends PacManModel {
    private long startTime;
    private int highScore;
    private int rowCount;
    private int columnCount;

    public AdvancedPacManModel() {
        super(); // Memanggil konstruktor default PacManModel
        this.rowCount = 15; // Atau nilai yang Anda inginkan
        this.columnCount = 15; /// Memanggil konstruktor dari superclass (PacManModel)
        this.startTime = System.currentTimeMillis();
        this.highScore = 0;
    }

    /**
     * Mengembalikan waktu yang telah berlalu sejak permainan dimulai.
     * @return waktu dalam milidetik
     */
    public long getElapsedTime() {
        return System.currentTimeMillis() - this.startTime;
    }

    /**
     * Mengupdate skor tertinggi jika skor saat ini lebih besar dari skor tertinggi.
     * @param currentScore skor saat ini
     */
    public void updateHighScore(int currentScore) {
        if (currentScore > this.highScore) {
            this.highScore = currentScore;
        }
    }

    /**
     * Mendapatkan skor tertinggi yang tercatat.
     * @return skor tertinggi
     */
    public int getHighScore() {
        return this.highScore;
    }

    // Tambahkan fitur tambahan sesuai kebutuhan Anda
}
