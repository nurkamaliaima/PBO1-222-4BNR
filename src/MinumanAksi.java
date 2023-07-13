public class MinumanAksi {
    public static void main(String[] args) {
        Minuman milkShake = new Minuman();
        milkShake.nama = "Milk shake meja 1";
        milkShake.harga = 10000;
        milkShake.kategori = "Milk Shake";

        Minuman milkShakeVanila = new Minuman();
        milkShakeVanila.nama = "Milk Shake Vanila meja 2";
        milkShakeVanila.harga = 10000;
        milkShakeVanila.kategori = "Milk Shake";

        Minuman milkShakeCoklat = new Minuman();
        milkShakeCoklat.nama = "Milk Shake Coklat meja 3";
        milkShakeCoklat.harga = 12000;
        milkShakeCoklat.kategori = "Milk Shake";

        System.out.println(milkShakeVanila.harga);

        milkShake.mendapatkanDiskon();
        System.out.println(milkShakeVanila.harga + milkShake.harga);
    }
}
