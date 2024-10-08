public class AkunBank {
    private int saldo;

    public AkunBank(int saldoAwal) {
        this.saldo = saldoAwal;
    }

    public void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
        System.out.println("Saldo saat ini: Rp. " + saldo);
    }

    public void ambilUang(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
            System.out.println("Saldo saat ini: Rp. " + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }

    public void cekSaldo() {
        System.out.println("Saldo saat ini: Rp. " + saldo);
    }

    public static void main(String[] args) {
        AkunBank akun = new AkunBank(100000);
        akun.cekSaldo();
        akun.simpanUang(50000);
        akun.ambilUang(75000);
        akun.cekSaldo();
    }
}
