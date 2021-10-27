package com.company;

public class Marketplace {
    private int noTransaksi;
    private String namaPenjual;
    private String alamatPenjual;
    private String namaPembeli;
    private String alamatPembeli;
    private double ongkosKirim;
    private String ekspedisi;
    private String noResi;
    private boolean asuransi;
    private boolean dropship;
    private double nominalAsuransi;

    Marketplace(int noTransaksi, String noResi, String ekspedisi, double ongkosKirim, String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli, boolean dropship, boolean asuransi, int nominalAsuransi){
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.ekspedisi = ekspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.dropship = dropship;
        this.asuransi = asuransi;
        this.nominalAsuransi = nominalAsuransi;
        print(this.asuransi, this.dropship);
    }

    Marketplace(int noTransaksi, String noResi, String ekspedisi, double ongkosKirim, String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli, boolean asuransi, int nominalAsuransi){
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.ekspedisi = ekspedisi;
        if(ongkosKirim>20000){
            ongkosKirim = ongkosKirim - 5000;
        }
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.asuransi = asuransi;
        this.nominalAsuransi = nominalAsuransi;
        print(this.asuransi, this.dropship);
    }

    Marketplace(int noTransaksi, String noResi, String ekspedisi, double ongkosKirim, String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli){
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.ekspedisi = ekspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        print(this.asuransi, this.dropship);
    }

    Marketplace(int noTransaksi, String noResi, String ekspedisi, double ongkosKirim, String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli, boolean dropship){
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.ekspedisi = ekspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.dropship = dropship;
        print(this.asuransi, this.dropship);
    }

    public void print(boolean asuransi, boolean Statusdropshipper){
        if (asuransi==true && dropship==true){
            System.out.println("\nAsuransi dan Dropship");
            System.out.println("\nNo Transaksi :" + this.noTransaksi
                    + "\nNo Resi : " + this.noResi
                    + "\nNama Ekspedisi : " + this.ekspedisi
                    + "\nOngkos Kirim : " + this.ongkosKirim
                    + "\nNama Pengirim : " + this.namaPenjual
                    + "\nAlamat Pengirim : " + this.alamatPenjual
                    + "\nNama Penerima : " +this.namaPembeli
                    + "\nAlamat Penerima : " + this.alamatPembeli
                    + "\nNominal Asuransi : " + this.nominalAsuransi);

        }else if (asuransi==true){
            System.out.println("\nAsuransi");
            System.out.println("\nNo Transaksi : " + this.noTransaksi
                    + "\nNo Resi : " + this.noResi
                    + "\nNama Ekspedisi : " + this.ekspedisi
                    + "\nOngkos Kirim : " + this.ongkosKirim
                    + "\nNama Pengirim : " + this.namaPenjual
                    + "\nAlamat Pengirim : " +this.alamatPenjual
                    + "\nNama Penerima : " + this.namaPembeli
                    + "\nAlamat Penerima : " + this.alamatPembeli
                    + "\nNominal Asuransi : " + this.nominalAsuransi);

        }else if (dropship==true){
            System.out.println("\nDropship");
            System.out.println("\nNo Transaksi : " + this.noTransaksi
                    + "\nNo Resi : " + this.noResi
                    + "\nNama Ekspedisi : " + this.ekspedisi
                    + "\nOngkos Kirim : " + this.ongkosKirim
                    + "\nNama Pengirim : " + this.namaPenjual
                    + "\nAlamat Pengirim : " + this.alamatPenjual
                    + "\nNama Penerima : " + this.namaPembeli
                    + "\nAlamat Penerima : " + this.alamatPembeli);

        } else {
            System.out.println("\nNormal");
            System.out.println("\nNo Transaksi : " + this.noTransaksi
                    + "\nNo Resi : " + this.noResi
                    + "\nNama Ekspedisi : " + this.ekspedisi
                    + "\nOngkos Kirim : " + this.ongkosKirim
                    + "\nNama Pengirim : " + this.namaPenjual
                    + "\nAlamat Pengirim : " + this.alamatPenjual
                    + "\nNama Penerima : " + this.namaPembeli
                    + "\nAlamat Penerima : " + this.alamatPembeli);
        }
    }
}
