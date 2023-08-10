/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package perhitungan_dempster;

import form_tampilan.*;

/**
 *
 * @author mantaps
 */
public class perhitungan_dempster_shafer {
    public static double perhitungan_gejala(int gejalaawal[][],double bobotawal[][]){                
        //cari indeks kerusakan terbesar pada gejala
        int indeksterbesarkerusakan = 0;       
        int indeksmatriks2terbesar=0;
        for(int i=0;i<gejalaawal.length;i++){
            for(int j=0;j<gejalaawal[i].length;j++){
                if(gejalaawal[i][j] != 0){
                    indeksmatriks2terbesar++;
                }
            }
            if(indeksmatriks2terbesar>indeksterbesarkerusakan){
                indeksterbesarkerusakan = indeksmatriks2terbesar;
            }
            indeksmatriks2terbesar = 0;
        }
        
        //membuat array gejala terbatas sampai indeksterbesar
        int [][] gejala = new int [gejalaawal.length][indeksterbesarkerusakan];
        for(int i=0;i<gejalaawal.length;i++){
            for(int j=0;j<gejala[i].length;j++){
                if(gejalaawal[i][j] != 0){
                    gejala[i][j] = gejalaawal[i][j];
                }
            }
        }
        
        //hitung indeks gejala terbesar
        int gejalaterbesar = 0;
        for(int i=0;i<gejala.length;i++){
            if(gejala[i][0] != 0){
                gejalaterbesar ++;
            }
        }
        
        //hitung nilai total bobot tiap gejala
        double [] bobot = new double [gejala.length];
        int nilai0bobotawal = 0;
        int nilaiindeksbobotawal = 0;
        for(int i=0;i<bobotawal.length;i++){
            for(int j=0;j<indeksterbesarkerusakan;j++){
                if(nilaiindeksbobotawal < bobotawal[i].length && bobotawal[i][j]!=0){
                bobot[i] = bobotawal[i][j]+bobot[i];
                nilaiindeksbobotawal++;
                }
            }
            bobot[i] = bobot[i] / nilaiindeksbobotawal;
            //System.out.println(bobot[i]);
            nilaiindeksbobotawal = 0;
        }
        
        //membuat indeks gejala menjadi 50 array
        int hasilkerusakandengan50array [][] = new int [50][indeksterbesarkerusakan];        
        for(int i=0;i<1;i++){
            for(int j=0;j<indeksterbesarkerusakan;j++){
                if(j < gejala[0].length){
                hasilkerusakandengan50array[i][j] = gejala[0][j];
                }
            }
        }
        
        //membuat indeks bobot menjadi 50 array      
        double nilaibobotbarudengan50array [] = new double [50];
        nilaibobotbarudengan50array[0] = bobot[0]; 
        
        boolean gejalaberhubungan = true;
        //hitung densitas       
        int densitasbaru = 1;             
            while(densitasbaru < gejalaterbesar){
                //menghitung panjang densitas baru tanpa null
                int panjangnilaibobotdensitasbarutanpa50 = 0;

                for(int i=0;i<nilaibobotbarudengan50array.length;i++){
                    if(nilaibobotbarudengan50array[i] != 0){
                        panjangnilaibobotdensitasbarutanpa50++;
                    }
                }
                
                // menentukan nilai bobot densitas baru tanpa 0
                double nilaibobotdensitasbarutanpa50array [] = new double [panjangnilaibobotdensitasbarutanpa50];
                int indeksbarupadadensitasbobotbarutanpa50 =0;
                for(int i=0;i<nilaibobotbarudengan50array.length;i++){
                    if(nilaibobotbarudengan50array[i] != 0){
                        nilaibobotdensitasbarutanpa50array[indeksbarupadadensitasbobotbarutanpa50] = nilaibobotbarudengan50array[i];
                        indeksbarupadadensitasbobotbarutanpa50++;
                    }
                }
                                      
                // menentukan kerusakan densitas baru tanpa null
                int hasilkerusakantandensitasbarutanpa50array [][] = new int [panjangnilaibobotdensitasbarutanpa50][indeksterbesarkerusakan];

                int indeksbarupadakerusakandensitasbarubarutanpa50 =0;
                int indeksyangnulldensitasbarutanpa50 = 0;
                for(int i=0;i<hasilkerusakandengan50array.length;i++){
                    for(int j=0;j<indeksterbesarkerusakan;j++){
                        if(hasilkerusakandengan50array[i][0]!=0){
                            hasilkerusakantandensitasbarutanpa50array[indeksbarupadakerusakandensitasbarubarutanpa50][j] = hasilkerusakandengan50array[i][j];
                        }
                    }
                    if(hasilkerusakandengan50array[i][0]!=0){
                        indeksbarupadakerusakandensitasbarubarutanpa50++;
                    }
                    indeksyangnulldensitasbarutanpa50 = 0;
                }
                
                // cari nilai hitung sementara
                int panjangarraybaru = 0;
                if(densitasbaru == 1){
                    panjangarraybaru = 4;
                }
                else{
                    panjangarraybaru = nilaibobotdensitasbarutanpa50array.length*2;
                }                
                double nilaibobotdensitasbaru [] = new double [panjangarraybaru];
                if(densitasbaru == 1){
                    int nilaipasti = 0;
                    int nilaitambahan = 1;
                    for(int i=0;i<4;i++){
                        if(i == 0){
                            nilaibobotdensitasbaru[i] = bobot[i] *  bobot[i+1];
                        }
                        if(i > 0 && i < nilaibobotdensitasbaru.length-1){
                            nilaibobotdensitasbaru[i] = bobot[nilaipasti] * (1 - bobot[nilaitambahan]);
                            nilaipasti++;
                            nilaitambahan = 0;    
                        }
                        if(i == nilaibobotdensitasbaru.length-1){
                            nilaitambahan ++;
                            nilaibobotdensitasbaru[i] = (1 - bobot[0]) * (1 - bobot[1]);
                        }
                    }
                }
                if(densitasbaru > 1){
                    int nilaitambahanbaru = 0;
                    for(int i=0;i<nilaibobotdensitasbarutanpa50array.length*2;i++){
                        if(i == 0){
                            nilaibobotdensitasbaru[i] = bobot[densitasbaru] *  nilaibobotdensitasbarutanpa50array[i];
                        }
                        if(i > 0 && i <= nilaibobotdensitasbarutanpa50array.length-1){
                            nilaibobotdensitasbaru[i] = bobot[densitasbaru] * nilaibobotdensitasbarutanpa50array[i];
                        }
                        if(i >= nilaibobotdensitasbaru.length/2 && i < nilaibobotdensitasbaru.length-1){
                            nilaibobotdensitasbaru[i] = nilaibobotdensitasbarutanpa50array[nilaitambahanbaru] * (1 - bobot[densitasbaru]);
                            nilaitambahanbaru++;
                        }
                        if(i == nilaibobotdensitasbaru.length-1){
                            nilaibobotdensitasbaru[i] = nilaibobotdensitasbarutanpa50array[nilaibobotdensitasbarutanpa50array.length-1] * (1 - bobot[densitasbaru]);
                        }
                    }
                }
                
                //mencari kerusakan yang sama
                int panjangaindeksgejalabaru = 0;
                if(densitasbaru==1){
                    panjangaindeksgejalabaru = 0;
                }
                else{
                    panjangaindeksgejalabaru = 1;
                }
                int Gtambahanbaru [][] = new int [hasilkerusakantandensitasbarutanpa50array.length-panjangaindeksgejalabaru][indeksterbesarkerusakan];
                int indeksGtambahandalamforbaru = 0;
                int indeksarrayjbarubaru = 0;
                int indeksarraybaru = 0;
                for(int i=0;i<hasilkerusakantandensitasbarutanpa50array.length-panjangaindeksgejalabaru;i++){
                    for(int j=0;j<indeksterbesarkerusakan;j++){
                        while(indeksarrayjbarubaru < gejala[densitasbaru].length){
                            if(gejala[densitasbaru][indeksarrayjbarubaru] == (hasilkerusakantandensitasbarutanpa50array[i][j]) && gejala[densitasbaru][indeksarrayjbarubaru] != 0){                            
                                Gtambahanbaru[indeksGtambahandalamforbaru][indeksarraybaru] = gejala[densitasbaru][indeksarrayjbarubaru];  
                                indeksarraybaru++;
                            }
                            indeksarrayjbarubaru++;
                        }
                        indeksarrayjbarubaru=0;
                    }
                    if(indeksGtambahandalamforbaru < hasilkerusakantandensitasbarutanpa50array.length){                       
                        indeksGtambahandalamforbaru++;
                    }
                    indeksarraybaru = 0;
                }
                
                //memeriksa gejala yang berhubungan dengan gejala baru
                for(int i=0;i<Gtambahanbaru.length;i++){
                    if(Gtambahanbaru[i][0] == 0){
                        gejalaberhubungan = false;
                    }                    
                }                
                if(gejalaberhubungan == true){
                    //menambahkan gejala asli ke dalam array pada gejala 1 dan 2
                    int hasilkerusakandensitasbaru [][] = new int [panjangarraybaru][indeksterbesarkerusakan];
                    if(densitasbaru == 1){
                        int indeksfordensitas = 1;
                        int indikatordensitasloop = 0;
                        int indikatorstringgejala = 2;

                        for(int i=0;i<Gtambahanbaru.length;i++){
                            for(int j=0;j<indeksterbesarkerusakan;j++){
                                hasilkerusakandensitasbaru[0][j] = Gtambahanbaru[i][j];
                            }
                        }

                        while(indeksfordensitas < hasilkerusakandensitasbaru.length){
                            for(int i=indeksfordensitas;i<=indeksfordensitas;i++){
                                for(int j=0;j<indeksterbesarkerusakan;j++){
                                        if(indeksfordensitas <= gejala.length && indikatordensitasloop < gejala[i-1].length  && indeksfordensitas != hasilkerusakandensitasbaru.length-1){
                                            hasilkerusakandensitasbaru[i][j] = gejala[i-1][j];
                                            indikatordensitasloop ++;                        
                                        }
                                    //menambahkan gejala mteta ke dalam array                                  
                                    if(indeksfordensitas == hasilkerusakandensitasbaru.length-1 && indikatordensitasloop < 1){
                                        hasilkerusakandensitasbaru[i][j] = 0;
                                        indikatordensitasloop ++;
                                    }
                                }
                            }
                            indikatordensitasloop = 0;
                            indeksfordensitas ++;
                        }
                    }
                    if(densitasbaru > 1){
                        int indeksfordensitasbaru = 0;
                        int indikatordensitasbaru = 0;
                        while(indeksfordensitasbaru < hasilkerusakandensitasbaru.length){
                            for(int i=indeksfordensitasbaru;i<=indeksfordensitasbaru;i++){
                                for(int j=0;j<indeksterbesarkerusakan;j++){
                                    if(i < hasilkerusakantandensitasbarutanpa50array.length-1){
                                        hasilkerusakandensitasbaru[i][j] = Gtambahanbaru[i][j];
                                    }
                                    if(i == hasilkerusakantandensitasbarutanpa50array.length-1 && j < gejala[densitasbaru].length){
                                        hasilkerusakandensitasbaru[i][j] = gejala[densitasbaru][j];
                                    }
                                    if(i >= hasilkerusakantandensitasbarutanpa50array.length && i < hasilkerusakandensitasbaru.length-1){
                                        hasilkerusakandensitasbaru[i][j] = hasilkerusakantandensitasbarutanpa50array[indikatordensitasbaru][j];
                                    }
                                    if(i == hasilkerusakandensitasbaru.length-1 && j < gejala[densitasbaru].length){
                                        hasilkerusakandensitasbaru[i][0] = 0;
                                    }
                                }
                                if(i >= hasilkerusakantandensitasbarutanpa50array.length && i < hasilkerusakandensitasbaru.length-1){
                                    indikatordensitasbaru++;
                                }
                            }
                            indeksfordensitasbaru ++;
                        }
                    }
                    
                    
                    //mencari indeks pada kerusakan yang sama 
                    int indekskerusakanyangsamabaru [][] = new int [Gtambahanbaru.length][hasilkerusakandensitasbaru.length];
                    int indekskerusakanyangsamabaru1 [] = new int [100];
                    int indekstertinggitotalkerusakanseluruhsementarabaru = 0;
                    int indeksibaru =0;   
                    int whilecariyangsama = 0;
                    int pengulangandalamfor = 0;
                    int indekskerusakanyangsama =0;
                    int indeksstart =1;
                    while(whilecariyangsama < Gtambahanbaru.length){
                        for(int i=indeksstart;i<hasilkerusakandensitasbaru.length;i++){
                            for(int j=0;j<indeksterbesarkerusakan;j++){
                                if(Gtambahanbaru[whilecariyangsama][j] == hasilkerusakandensitasbaru[i][j]){
                                    indekstertinggitotalkerusakanseluruhsementarabaru ++;
                                    if( indekstertinggitotalkerusakanseluruhsementarabaru == indeksterbesarkerusakan){
                                        indekskerusakanyangsamabaru[whilecariyangsama][indeksibaru] = i;
                                        indekskerusakanyangsamabaru1[indekskerusakanyangsama] = i;
                                        indeksibaru++;
                                        indekskerusakanyangsama++;
                                        indeksstart++;                   
                                    }
                                }
                            }

                            indekstertinggitotalkerusakanseluruhsementarabaru = 0;
                        }
                    pengulangandalamfor = 0;
                    indeksibaru = 0;
                    whilecariyangsama ++;
                    indeksstart = whilecariyangsama + 1;
                    }
                    
                    
                    //menjumlahkan bobot kerusakan yang sama pada densitas baru
                    for(int i=0;i<indekskerusakanyangsamabaru.length;i++){
                        for(int j=0;j<nilaibobotdensitasbaru.length;j++){
                            if(indekskerusakanyangsamabaru[i][j] != 0){
                                nilaibobotdensitasbaru[i] = nilaibobotdensitasbaru[i] + nilaibobotdensitasbaru[indekskerusakanyangsamabaru[i][j]];
                                nilaibobotdensitasbaru[indekskerusakanyangsamabaru[i][j]] = 0;
                            }
                        }
                    }

                    //mencari kerusakan yang sama pada densitas baru
                    int carikerusakansama = 0;
                    int whilecariangkayangsama = 0;
                    for(int i=1;i<hasilkerusakandensitasbaru.length;i++){
                        for(int j=0;j<indekskerusakanyangsamabaru1.length;j++){
                                if(i == indekskerusakanyangsamabaru1[j]){
                                    while(whilecariangkayangsama < indeksterbesarkerusakan){
                                    hasilkerusakandensitasbaru[i][whilecariangkayangsama] = 0;
                                    whilecariangkayangsama++;
                                    }
                            }    
                        }
                        carikerusakansama++;
                        whilecariangkayangsama = 0;
                    }   

                    // mengembalikangejaladanbobotkearray50                        
                    int panjangnilaibobotdensitasbarutanpa0 = 0;
                    for(int i=0;i<nilaibobotdensitasbaru.length;i++){
                            if(nilaibobotdensitasbaru[i] != 0){
                                panjangnilaibobotdensitasbarutanpa0++;
                            }
                        }
                    
                    // mengembalikan array nilaibobotbarudengan50array tanpa bobot 0 pada densitas baru dengan array 50
                    double nilaibobotdensitasbarutanpa0 [] = new double [panjangnilaibobotdensitasbarutanpa0];
                    int indeksbarupadadensitasbobotbarutanpa0 =0;
                    for(int i=0;i<nilaibobotdensitasbaru.length;i++){
                        if(nilaibobotdensitasbaru[i] != 0){
                            nilaibobotdensitasbarutanpa0[indeksbarupadadensitasbobotbarutanpa0] = nilaibobotdensitasbaru[i];
                            indeksbarupadadensitasbobotbarutanpa0++;
                        }
                    }
                    for(int i=0;i<nilaibobotdensitasbarutanpa0.length;i++){
                         nilaibobotbarudengan50array[i] = nilaibobotdensitasbarutanpa0[i];
                    }

                    // mengembalikan array hasilkerusakandengan50array tanpa kerusakan null pada densitas baru dengan array 50
                    int hasilkerusakantandensitasbarutanpa0 [][] = new int [panjangnilaibobotdensitasbarutanpa0][indeksterbesarkerusakan];
                    int indeksbarupadakerusakandensitasbarubarutanpa0 =0;
                    int indeksyangnulldensitasbarutanpa0 = 0;
                    for(int i=0;i<hasilkerusakandensitasbaru.length;i++){
                        for(int j=0;j<indeksterbesarkerusakan;j++){
                            if(hasilkerusakandensitasbaru[i][0]!=0){
                                hasilkerusakantandensitasbarutanpa0[indeksbarupadakerusakandensitasbarubarutanpa0][j] = hasilkerusakandensitasbaru[i][j];
                            }
                        }
                        if(hasilkerusakandensitasbaru[i][0]!=0){
                            indeksbarupadakerusakandensitasbarubarutanpa0++;
                        }
                        indeksyangnulldensitasbarutanpa0 = 0;
                    }
                    for(int i=0;i<hasilkerusakantandensitasbarutanpa0.length;i++){
                        for(int j=0;j<indeksterbesarkerusakan;j++){
                            hasilkerusakandengan50array[i][j] = hasilkerusakantandensitasbarutanpa0[i][j];
                        }
                    }  
                }
                if(gejalaberhubungan == false){
                    densitasbaru = gejalaterbesar;
                }                
            
            densitasbaru++;    
            }
        
        //hitung akhir
        int panjangnilaibobotdensitasbarutanpa50 = 0;

            for(int i=0;i<nilaibobotbarudengan50array.length;i++){
                if(nilaibobotbarudengan50array[i] != 0){
                    panjangnilaibobotdensitasbarutanpa50++;
                }
            }
        
        double nilaibobotdensitasbarutanpa50array [] = new double [panjangnilaibobotdensitasbarutanpa50];
        int indeksbarupadadensitasbobotbarutanpa50 =0;
        for(int i=0;i<nilaibobotbarudengan50array.length;i++){
            if(nilaibobotbarudengan50array[i] != 0){
                nilaibobotdensitasbarutanpa50array[indeksbarupadadensitasbobotbarutanpa50] = nilaibobotbarudengan50array[i];
                indeksbarupadadensitasbobotbarutanpa50++;
            }
        }        
        
        int hasilkerusakantandensitasbarutanpa50array [][] = new int [panjangnilaibobotdensitasbarutanpa50][indeksterbesarkerusakan];

        int indeksbarupadakerusakandensitasbarubarutanpa50 =0;
        int indeksyangnulldensitasbarutanpa50 = 0;
        for(int i=0;i<hasilkerusakandengan50array.length;i++){
            for(int j=0;j<indeksterbesarkerusakan;j++){
                if(hasilkerusakandengan50array[i][0]!=0){
                    hasilkerusakantandensitasbarutanpa50array[indeksbarupadakerusakandensitasbarubarutanpa50][j] = hasilkerusakandengan50array[i][j];
                }
            }
            if(hasilkerusakandengan50array[i][0]!=0){
                indeksbarupadakerusakandensitasbarubarutanpa50++;
            }
            indeksyangnulldensitasbarutanpa50 = 0;
        }     

        //diagnosa akhir gejala
        int diagnosaakhirgejala [][] = new int [1][indeksterbesarkerusakan]; 
        
        if(gejalaberhubungan == true){
            int indekskerusakanterbesar = 0;        
            double diagnosaakhirbobot = 0;  

            for(int i=0;i<nilaibobotdensitasbarutanpa50array.length;i++){
                if(nilaibobotdensitasbarutanpa50array[i]>diagnosaakhirbobot){
                    diagnosaakhirbobot = nilaibobotdensitasbarutanpa50array[i];
                    indekskerusakanterbesar = i;
                }
            }
            for(int i=0;i<1;i++){
                for(int j=0;j<indeksterbesarkerusakan;j++){
                    diagnosaakhirgejala[i][j] = hasilkerusakantandensitasbarutanpa50array[indekskerusakanterbesar][j];
                }
            } 
            
            if(gejalaberhubungan == false){
                for(int i=0;i<1;i++){
                    for(int j=0;j<indeksterbesarkerusakan;j++){
                        diagnosaakhirgejala[i][j] = 0;
                    }
                } 
            }
        }    
        
        //diagnosa akhir bobot
        double perhitungan_bobot = 0;  
        if(gejalaberhubungan == true){
            for(int i=0;i<nilaibobotdensitasbarutanpa50array.length;i++){
                if(nilaibobotdensitasbarutanpa50array[i]>perhitungan_bobot){
                    perhitungan_bobot = nilaibobotdensitasbarutanpa50array[i];
                }
            }
        }
        if(gejalaberhubungan == false){
            perhitungan_bobot = 0;
        }
        
        return perhitungan_bobot;
        
    }
}
