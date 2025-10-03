class Main {
    public static void main(String[] args) {
        Animal a = new Animal();

        // Gunakan setter
        a.setNama("Kucing");
        // Gunakan getter
        System.out.println("Nama hewan: " + a.getNama());

        // Panggil method
        a.makan();
    }
}