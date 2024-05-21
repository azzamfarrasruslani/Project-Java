package ProgramSuratPaket;

import javax.swing.JOptionPane;

public class TestSuratPaket {

    public static void main(String[] args) {
        Akun user = new Akun();
        boolean kondisi;
        do {
            user.setUsername(JOptionPane.showInputDialog("Masukan username"));
            user.setPasswd(JOptionPane.showInputDialog("Masukan password"));

            if (user.getUsername().equals("admin00") && user.getPasswd().equals("admin00")) {
                JOptionPane.showMessageDialog(null, "Anda Berhasil Login");
                kondisi = true;

                BarangMasuk[] sp = null;
                BarangKeluar[] bk = null;

                boolean kondisiMenu;
                do {
                    int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilihan Menu \n1. Barang Masuk \n2. Barang Keluar \n3.Edit data \n4. Keluar"));

                    switch (pilihan) {
                        case 1:
                            int jmlPaketMasuk = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah paket"));
                            sp = new BarangMasuk[jmlPaketMasuk];
                            for (int i = 0; i < sp.length; i++) {
                                sp[i] = new BarangMasuk();
                                sp[i].setNamaPengirim(JOptionPane.showInputDialog("Masukan nama pengirim"));
                                sp[i].setAlamatPengirim(JOptionPane.showInputDialog("Masukan alamat pengirim"));
                                sp[i].setJenisPaket(JOptionPane.showInputDialog("Masukan jenis paket"));
                                sp[i].setNoHpPengirim(JOptionPane.showInputDialog("Masukan nomor hp pengirim"));
                                sp[i].setNamaPemilikPk(JOptionPane.showInputDialog("Masukan nama pemilik paket"));
                                sp[i].setNoHpPemilikPk(JOptionPane.showInputDialog("Masukan nomor hp pemilik paket"));
                                sp[i].setNamaSatpam(JOptionPane.showInputDialog("Masukan nama satpam penerima"));
                            }
                            printBarangMasuk(sp);
                            break;
                        case 2:
                            int jmlPaketKeluar = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah paket"));
                            bk = new BarangKeluar[jmlPaketKeluar];
                            for (int i = 0; i < bk.length; i++) {
                                bk[i] = new BarangKeluar();
                                bk[i].setNamaPenerima(JOptionPane.showInputDialog("Masukan nama penerima"));
                                bk[i].setAlamatPenerima(JOptionPane.showInputDialog("Masukan alamat penerima"));
                                bk[i].setJenisPaket(JOptionPane.showInputDialog("Masukan jenis paket"));
                                bk[i].setNoHpPenerima(JOptionPane.showInputDialog("Masukan nomor hp penerima"));
                                bk[i].setNamaPengirim(JOptionPane.showInputDialog("Masukan nama pengirim"));
                                bk[i].setNoHpPengirim(JOptionPane.showInputDialog("Masukan nomor hp pengirim"));
                                bk[i].setNamaSatpam(JOptionPane.showInputDialog("Masukan nama satpam penerima"));
                            }
                            printBarangKeluar(bk);
                            break;
                        case 3:
                            String editMenu = JOptionPane.showInputDialog("Pilih jenis paket yang ingin di-edit: \n1. Barang Masuk \n2. Barang Keluar");
                            if (editMenu.equals("1") && sp != null) {
                                for (int i = 0; i < sp.length; i++) {
                                    sp[i].setNamaPengirim(JOptionPane.showInputDialog("Masukan nama pengirim", sp[i].getNamaPengirim()));
                                    sp[i].setAlamatPengirim(JOptionPane.showInputDialog("Masukan alamat pengirim", sp[i].getAlamatPengirim()));
                                    sp[i].setJenisPaket(JOptionPane.showInputDialog("Masukan jenis paket", sp[i].getJenisPaket()));
                                    sp[i].setNoHpPengirim(JOptionPane.showInputDialog("Masukan nomor hp pengirim", sp[i].getNoHpPengirim()));
                                    sp[i].setNamaPemilikPk(JOptionPane.showInputDialog("Masukan nama pemilik paket", sp[i].getNamaPemilikPk()));
                                    sp[i].setNoHpPemilikPk(JOptionPane.showInputDialog("Masukan nomor hp pemilik paket", sp[i].getNoHpPemilikPk()));
                                    sp[i].setNamaSatpam(JOptionPane.showInputDialog("Masukan nama satpam penerima", sp[i].getNamaSatpam()));
                                }
                                printBarangMasuk(sp);
                            } else if (editMenu.equals("2") && bk != null) {
                                for (int i = 0; i < bk.length; i++) {
                                    bk[i].setNamaPenerima(JOptionPane.showInputDialog("Masukan nama penerima", bk[i].getNamaPenerima()));
                                    bk[i].setAlamatPenerima(JOptionPane.showInputDialog("Masukan alamat penerima", bk[i].getAlamatPenerima()));
                                    bk[i].setJenisPaket(JOptionPane.showInputDialog("Masukan jenis paket", bk[i].getJenisPaket()));
                                    bk[i].setNoHpPenerima(JOptionPane.showInputDialog("Masukan nomor hp penerima", bk[i].getNoHpPenerima()));
                                    bk[i].setNamaPengirim(JOptionPane.showInputDialog("Masukan nama pengirim", bk[i].getNamaPengirim()));
                                    bk[i].setNoHpPengirim(JOptionPane.showInputDialog("Masukan nomor hp pengirim", bk[i].getNoHpPengirim()));
                                    bk[i].setNamaSatpam(JOptionPane.showInputDialog("Masukan nama satpam penerima", bk[i].getNamaSatpam()));
                                }
                                printBarangKeluar(bk);
                            } else {
                                JOptionPane.showMessageDialog(null, "Data tidak ditemukan atau pilihan tidak valid");
                            }
                            break;
                        case 4:
                            kondisiMenu = true;
                            System.exit(0);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Menu tidak tersedia");
                            break;
                    }
                } while (true);

            } else {
                JOptionPane.showMessageDialog(null, "Anda gagal login");
                kondisi = false;
            }
        } while (!kondisi);
    }

    private static void printBarangMasuk(BarangMasuk[] sp) {
        System.out.println("============================================================================================================================="
                + "==================================================================================================");
        System.out.printf("|%-5s|%-35s|%-35s|%-35s|%-35s|%-35s|%-35s|\n", "No", "Nama Pengirim",
                "Alamat Pengirim", "Jenis Paket", "No Hp pengirim",
                "Nama Pemilik Paket", "No Hp pemilik paket", "Nama Satpam");
        System.out.println("============================================================================================================================="
                + "==================================================================================================");
        for (int i = 0; i < sp.length; i++) {
            System.out.printf("|%-5s|%-35s|%-35s|%-35s|%-35s|%-35s|%-35s|\n", (i + 1), sp[i].getNamaPengirim(),
                    sp[i].getAlamatPengirim(), sp[i].getJenisPaket(), sp[i].getNoHpPengirim(),
                    sp[i].getNamaPemilikPk(), sp[i].getNoHpPemilikPk(), sp[i].getNamaSatpam());
        }
        System.out.println("============================================================================================================================="
                + "==================================================================================================");
    }

    private static void printBarangKeluar(BarangKeluar[] bk) {
        System.out.println("============================================================================================================================="
                + "==================================================================================================");
        System.out.printf("|%-5s|%-35s|%-35s|%-35s|%-35s|%-35s|%-35s|\n", "No", "Nama Penerima",
                "Alamat Penerima", "Jenis Paket", "No Hp penerima",
                "Nama Pengirim", "No Hp pengirim", "Nama Satpam");
        System.out.println("============================================================================================================================="
                + "==================================================================================================");
        for (int i = 0; i < bk.length; i++) {
            System.out.printf("|%-5s|%-35s|%-35s|%-35s|%-35s|%-35s|%-35s|\n", (i + 1), bk[i].getNamaPenerima(),
                    bk[i].getAlamatPenerima(), bk[i].getJenisPaket(), bk[i].getNoHpPenerima(),
                    bk[i].getNamaPengirim(), bk[i].getNoHpPengirim(), bk[i].getNamaSatpam());
        }
        System.out.println("============================================================================================================================="
                + "==================================================================================================");
    }
}
