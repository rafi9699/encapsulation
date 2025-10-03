public class Animal {
    // Encapsulation: atribut private
    private String nama;

    // Setter (untuk memberi nilai ke 'nama')
    public void setNama(String n) {
        if (n != null && !n.isEmpty()) {
            this.nama = n;
        } else {
            System.out.println("Nama tidak boleh kosong!");
        }
    }

    // Getter (untuk membaca nilai 'nama')
    public String getNama() {
        return this.nama;
    }

    // Method biasa
    public void makan() {
        System.out.println(nama + " sedang makan.");
    }
}