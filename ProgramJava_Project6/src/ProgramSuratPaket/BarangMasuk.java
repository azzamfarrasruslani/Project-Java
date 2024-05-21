package ProgramSuratPaket;

/**
 *
 * @author Admin
 */
public class BarangMasuk {

//tglKedatangan, tglPenyerahanPaket, pilihan : int
    String namaPengirim, alamatPengirim,jenisPaket, noHpPengirim, namaSatpam, namaPemilikPk, noHpPemilikPk ;

    public BarangMasuk() {
        this.namaPengirim = "";
        this.alamatPengirim = "";
        this.noHpPengirim = "";
        this.namaSatpam = "";
        this.namaPemilikPk = "";
        this.noHpPemilikPk = "";
        this.jenisPaket = "";
    }

    public void setNamaPengirim(String namaPengirim) {
        this.namaPengirim = namaPengirim;
    }

    public void setAlamatPengirim(String alamatPengirim) {
        this.alamatPengirim = alamatPengirim;
    }

    public void setNoHpPengirim(String noHpPengirim) {
        this.noHpPengirim = noHpPengirim;
    }

    public void setNamaSatpam(String namaSatpam) {
        this.namaSatpam = namaSatpam;
    }

    public void setNamaPemilikPk(String namaPemilikPk) {
        this.namaPemilikPk = namaPemilikPk;
    }

    public void setNoHpPemilikPk(String noHpPemilikPk) {
        this.noHpPemilikPk = noHpPemilikPk;
    }

    public void setJenisPaket(String jenisPaket) {
        this.jenisPaket = jenisPaket;
    }

    public String getNamaPengirim() {
        return namaPengirim;
    }

    public String getAlamatPengirim() {
        return alamatPengirim;
    }

    public String getNoHpPengirim() {
        return noHpPengirim;
    }

    public String getNamaSatpam() {
        return namaSatpam;
    }

    public String getNamaPemilikPk() {
        return namaPemilikPk;
    }

    public String getNoHpPemilikPk() {
        return noHpPemilikPk;
    }

    public String getJenisPaket() {
        return jenisPaket;
    }

}
