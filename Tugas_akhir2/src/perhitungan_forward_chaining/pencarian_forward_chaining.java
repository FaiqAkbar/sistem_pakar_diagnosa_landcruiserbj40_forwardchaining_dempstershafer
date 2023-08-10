/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package perhitungan_forward_chaining;

import tugas_akhir.*;

/**
 *
 * @author mantaps
 */
public class pencarian_forward_chaining {
    public static String pencarian_forward_chaining(int kerusakansementara [], String kerusakan[]){ 
                
        int gejalasementara [] = new int [100];
        int diagnosakerusakan = 0;
        
            if(kerusakansementara[0] == 1 && kerusakansementara[1] == 3 && kerusakansementara[2] == 6 && kerusakansementara[3] == 7){
                diagnosakerusakan = 1;
            }
            if(kerusakansementara[0] == 1 && kerusakansementara[1] == 6 && kerusakansementara[2] == 7){
                diagnosakerusakan = 1;
            }
            if(kerusakansementara[0] == 1 && kerusakansementara[1] == 3 && kerusakansementara[2] == 7){
                diagnosakerusakan = 1;
            }
            if(kerusakansementara[0] == 3 && kerusakansementara[1] == 6){
                diagnosakerusakan = 1;
            }
            if(kerusakansementara[0] == 7 && kerusakansementara[1] == 8){
                diagnosakerusakan = 2;
            }
            if(kerusakansementara[0] == 1 && kerusakansementara[1] == 2 && kerusakansementara[2] == 3 && kerusakansementara[3] == 4 && kerusakansementara[4] == 7){
                diagnosakerusakan = 3;
            }
            if(kerusakansementara[0] == 2 && kerusakansementara[1] == 4){
                diagnosakerusakan = 3;
            }
            if(kerusakansementara[0] == 2 && kerusakansementara[1] == 3){
                diagnosakerusakan = 3;
            }
            if(kerusakansementara[0] == 2 && kerusakansementara[1] == 3 && kerusakansementara[2] == 7){
                diagnosakerusakan = 3;
            }
            if(kerusakansementara[0] == 2 && kerusakansementara[1] == 7){
                diagnosakerusakan = 3;
            }
            if(kerusakansementara[0] == 1 && kerusakansementara[1] == 7){
                diagnosakerusakan = 4;
            }
            if(kerusakansementara[0] == 1 && kerusakansementara[1] == 5 && kerusakansementara[2] == 7){
                diagnosakerusakan = 5;
            }
            if(kerusakansementara[0] == 1 && kerusakansementara[1] == 5){
                diagnosakerusakan = 5;
            }
            if(kerusakansementara[0] == 5 && kerusakansementara[1] == 7){
                diagnosakerusakan = 5;
            }
            if(kerusakansementara[0] == 7 && kerusakansementara[1] == 10 && kerusakansementara[2] == 21){
                diagnosakerusakan = 6;
            }
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 9 && kerusakansementara[2] == 11 && kerusakansementara[3] == 15 ){
                diagnosakerusakan = 7;
            }            
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 15){
                diagnosakerusakan = 7;
            }
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 7 && kerusakansementara[2] == 9 && kerusakansementara[3] == 11 && kerusakansementara[4] == 12
            && kerusakansementara[5] == 13 && kerusakansementara[6] == 22){
                diagnosakerusakan = 8;
            }
            if(kerusakansementara[0] == 12 && kerusakansementara[1] == 13 && kerusakansementara[2] == 22){
                diagnosakerusakan = 8;
            }
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 9 && kerusakansementara[2] == 12 && kerusakansementara[3] == 22){
                diagnosakerusakan = 8;
            }         
            if(kerusakansementara[0] == 7 && kerusakansementara[1] == 9 && kerusakansementara[2] == 10 && kerusakansementara[3] == 11 && kerusakansementara[4] == 12
            && kerusakansementara[5] == 13 && kerusakansementara[6] == 14 && kerusakansementara[7] == 25){
                diagnosakerusakan = 9;
            }
            if(kerusakansementara[0] == 7 && kerusakansementara[1] == 10 && kerusakansementara[2] == 13 && kerusakansementara[3] == 14){
                diagnosakerusakan = 9;
            }
            if(kerusakansementara[0] == 7 && kerusakansementara[1] == 12 && kerusakansementara[2] == 14 && kerusakansementara[3] == 25){
                diagnosakerusakan = 9;
            }    
            if(kerusakansementara[0] == 7 && kerusakansementara[1] == 9 && kerusakansementara[2] == 10 && kerusakansementara[3] == 11 && kerusakansementara[4] == 12
            && kerusakansementara[5] == 25){
                diagnosakerusakan = 10;
            }
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 9 && kerusakansementara[2] == 10 && kerusakansementara[3] == 11 && kerusakansementara[4] == 12
            && kerusakansementara[5] == 25){
                diagnosakerusakan = 11;
            }
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 9 && kerusakansementara[2] == 11 && kerusakansementara[3] == 25){
                diagnosakerusakan = 11;
            }
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 9 && kerusakansementara[2] == 10 && kerusakansementara[3] == 11 && kerusakansementara[4] == 25){
                diagnosakerusakan = 11;
            }
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 10 && kerusakansementara[2] == 12 && kerusakansementara[3] == 25){
                diagnosakerusakan = 11;
            }
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 10 && kerusakansementara[2] == 11 && kerusakansementara[3] == 25){
                diagnosakerusakan = 11;
            }
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 9 && kerusakansementara[2] == 10 && kerusakansementara[3] == 11 && kerusakansementara[4] == 12
            && kerusakansementara[5] == 13 && kerusakansementara[6] == 14){
                diagnosakerusakan = 12;
            }
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 11 && kerusakansementara[2] == 13 && kerusakansementara[3] == 14){
                diagnosakerusakan = 12;
            }
            if(kerusakansementara[0] == 12 && kerusakansementara[1] == 13 && kerusakansementara[2] == 14){
                diagnosakerusakan = 12;
            }            
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 9 && kerusakansementara[2] == 12 && kerusakansementara[3] == 14){
                diagnosakerusakan = 12;
            }
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 10 && kerusakansementara[2] == 11 && kerusakansementara[3] == 14){
                diagnosakerusakan = 12;
            }  
            if(kerusakansementara[0] == 9 && kerusakansementara[1] == 11 && kerusakansementara[2] == 12 && kerusakansementara[3] == 26){
                diagnosakerusakan = 13;
            }
            if(kerusakansementara[0] == 9 && kerusakansementara[1] == 11 && kerusakansementara[2] == 26){
                diagnosakerusakan = 13;
            }
            if(kerusakansementara[0] == 11 && kerusakansementara[1] == 12 && kerusakansementara[2] == 26){
                diagnosakerusakan = 13;
            }
            if(kerusakansementara[0] == 9 && kerusakansementara[1] == 26){
                diagnosakerusakan = 13;
            }  
            if(kerusakansementara[0] == 7 && kerusakansementara[1] == 9 && kerusakansementara[2] == 11 && kerusakansementara[3] == 13 && kerusakansementara[4] == 14 && kerusakansementara[5] == 22){
                diagnosakerusakan = 14;
            }
            if(kerusakansementara[0] == 7 && kerusakansementara[1] == 9 && kerusakansementara[2] == 13 && kerusakansementara[3] == 14 && kerusakansementara[4] == 22){
                diagnosakerusakan = 14;
            }
            if(kerusakansementara[0] == 11 && kerusakansementara[1] == 13 && kerusakansementara[2] == 14 && kerusakansementara[3] == 22){
                diagnosakerusakan = 14;
            }
            if(kerusakansementara[0] == 9 && kerusakansementara[1] == 10 && kerusakansementara[2] == 20 && kerusakansementara[3] == 24){
                diagnosakerusakan = 15;
            }
            if(kerusakansementara[0] == 9 && kerusakansementara[1] == 10 && kerusakansementara[2] == 11  && kerusakansementara[3] == 16 && kerusakansementara[4] == 20 && kerusakansementara[5] == 24){
                diagnosakerusakan = 16;
            }            
            if(kerusakansementara[0] == 10 && kerusakansementara[1] == 16 && kerusakansementara[2] == 20  && kerusakansementara[3] == 24){
                diagnosakerusakan = 16;
            }
            if(kerusakansementara[0] == 9 && kerusakansementara[1] == 11 && kerusakansementara[2] == 16  && kerusakansementara[3] == 24){
                diagnosakerusakan = 16;
            }         
            if(kerusakansementara[0] == 10 && kerusakansementara[1] == 20 && kerusakansementara[2] == 24  && kerusakansementara[3] == 27 && kerusakansementara[4] == 28 && kerusakansementara[5] == 29){
                diagnosakerusakan = 17;
            }
            if(kerusakansementara[0] == 10 && kerusakansementara[1] == 20 && kerusakansementara[2] == 24  && kerusakansementara[3] == 29){
                diagnosakerusakan = 17;
            }          
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 9 && kerusakansementara[2] == 11  && kerusakansementara[3] == 12 && kerusakansementara[4] == 13 && kerusakansementara[5] == 23){
                diagnosakerusakan = 18;
            }
            if(kerusakansementara[0] == 9 && kerusakansementara[1] == 11 && kerusakansementara[2] == 12  && kerusakansementara[3] == 23){
                diagnosakerusakan = 18;
            }       
            if(kerusakansementara[0] == 2 && kerusakansementara[1] == 4 && kerusakansementara[2] == 9  && kerusakansementara[3] == 10 && kerusakansementara[4] == 11 && kerusakansementara[5] == 18
            && kerusakansementara[6] == 20){
                diagnosakerusakan = 19;
            }
            if(kerusakansementara[0] == 2 && kerusakansementara[1] == 4){
                diagnosakerusakan = 19;
            }
            if(kerusakansementara[0] == 2 && kerusakansementara[1] == 4 && kerusakansementara[2] == 9  && kerusakansementara[3] == 18){
                diagnosakerusakan = 19;
            }           
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 9 && kerusakansementara[2] == 10  && kerusakansementara[3] == 11 && kerusakansementara[4] == 12 && kerusakansementara[5] ==17){
                diagnosakerusakan = 20;
            }
            if(kerusakansementara[0] == 10 && kerusakansementara[1] == 12 && kerusakansementara[2] == 17){
                diagnosakerusakan = 20;
            }   
            if(kerusakansementara[0] == 9 && kerusakansementara[1] == 10 && kerusakansementara[2] == 11  && kerusakansementara[3] == 17 && kerusakansementara[4] == 19){
                diagnosakerusakan = 21;
            }
            if(kerusakansementara[0] == 9 && kerusakansementara[1] == 10 && kerusakansementara[2] == 11  && kerusakansementara[3] == 19){
                diagnosakerusakan = 21;
            }
            if(kerusakansementara[0] == 10 && kerusakansementara[1] == 17 && kerusakansementara[2] == 19){
                diagnosakerusakan = 21;
            }            
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 7 && kerusakansementara[2] == 9  && kerusakansementara[3] == 11 && kerusakansementara[4] == 13){
                diagnosakerusakan = 22;
            }
            if(kerusakansementara[0] == 6 && kerusakansementara[1] == 7 && kerusakansementara[2] == 9 && kerusakansementara[3] == 11 && kerusakansementara[4] == 13){
                diagnosakerusakan = 22;
            }
            if(kerusakansementara[0] == 14 && kerusakansementara[1] == 33 && kerusakansementara[2] == 34){
                diagnosakerusakan = 23;
            }
            if(kerusakansementara[0] == 9 && kerusakansementara[1] == 10 && kerusakansementara[2] == 11 && kerusakansementara[3] == 33 && kerusakansementara[4] == 37 && kerusakansementara[5] == 39){
                diagnosakerusakan = 24;
            }
            if(kerusakansementara[0] == 33 && kerusakansementara[1] == 37 && kerusakansementara[2] == 39){
                diagnosakerusakan = 24;
            }
            if(kerusakansementara[0] == 11 && kerusakansementara[1] == 33 && kerusakansementara[2] == 37 && kerusakansementara[3] == 39){
                diagnosakerusakan = 24;
            }       
            if(kerusakansementara[0] == 33 && kerusakansementara[1] == 38 && kerusakansementara[2] == 39){
                diagnosakerusakan = 25;
            }
            if(kerusakansementara[0] == 38 && kerusakansementara[1] == 39){
                diagnosakerusakan = 25;
            }            
            if(kerusakansementara[0] == 30 && kerusakansementara[1] == 31 && kerusakansementara[2] == 32){
                diagnosakerusakan = 26;
            }
            if(kerusakansementara[0] == 30 && kerusakansementara[1] == 32){
                diagnosakerusakan = 26;
            }            
            if(kerusakansementara[0] == 33 && kerusakansementara[1] == 34 && kerusakansementara[2] == 35 && kerusakansementara[3] == 36){
                diagnosakerusakan = 27;
            }
            if(kerusakansementara[0] == 33 && kerusakansementara[1] == 34 && kerusakansementara[2] == 35){
                diagnosakerusakan = 27;
            }            
            if(kerusakansementara[0] == 31 && kerusakansementara[1] == 33 && kerusakansementara[2] == 36){
                diagnosakerusakan= 28;
            }
            if(kerusakansementara[0] == 31 && kerusakansementara[1] == 33){
                diagnosakerusakan = 28;
            }            
            if(kerusakansementara[0] == 9 && kerusakansementara[1] == 11 && kerusakansementara[2] == 36 && kerusakansementara[3] == 39){
                diagnosakerusakan = 29;
            }
            if(kerusakansementara[0] == 9 && kerusakansementara[1] == 11 && kerusakansementara[2] == 36){
                diagnosakerusakan = 29;
            }            
            if(kerusakansementara[0] == 35 && kerusakansementara[1] == 36 && kerusakansementara[2] == 40){
                diagnosakerusakan = 30;
            }
            if(kerusakansementara[0] == 35 && kerusakansementara[1] == 40){
                diagnosakerusakan = 30;
            }            
            if(kerusakansementara[0] == 42 && kerusakansementara[1] == 43 && kerusakansementara[2] == 44 && kerusakansementara[3] == 45 && kerusakansementara[4] == 46 && kerusakansementara[5] == 47){
                diagnosakerusakan = 31;
            }
            if(kerusakansementara[0] == 43 && kerusakansementara[1] == 44 && kerusakansementara[2] == 45){
                diagnosakerusakan = 31;
            }
            if(kerusakansementara[0] == 44 && kerusakansementara[1] == 45 && kerusakansementara[2] == 46 && kerusakansementara[3] == 47){
                diagnosakerusakan = 31;
            }            
            if(kerusakansementara[0] == 41 && kerusakansementara[1] == 42 && kerusakansementara[2] == 43 && kerusakansementara[3] == 45 && kerusakansementara[4] == 48){
                diagnosakerusakan = 32;
            }
            if(kerusakansementara[0] == 41 && kerusakansementara[1] == 43 && kerusakansementara[2] == 45 && kerusakansementara[3] == 48){
                diagnosakerusakan = 32;
            }
            if(kerusakansementara[0] == 41 && kerusakansementara[1] == 45 && kerusakansementara[2] == 48){
                diagnosakerusakan = 32;
            }            
            if(kerusakansementara[0] == 41 && kerusakansementara[1] == 45 && kerusakansementara[2] == 50){
                diagnosakerusakan = 33;
            }
            if(kerusakansementara[0] == 45 && kerusakansementara[1] == 50){
                diagnosakerusakan = 33;
            }            
            if(kerusakansementara[0] == 42 && kerusakansementara[1] == 46 && kerusakansementara[2] == 47 && kerusakansementara[3] == 48){
                diagnosakerusakan = 34;
            }
            if(kerusakansementara[0] == 42 && kerusakansementara[1] == 46 && kerusakansementara[2] == 48){
                diagnosakerusakan = 34;
            }            
            if(kerusakansementara[0] == 41 && kerusakansementara[1] == 46 && kerusakansementara[2] == 48 && kerusakansementara[3] == 49){
                diagnosakerusakan = 35;
            }
            if(kerusakansementara[0] == 41 && kerusakansementara[1] == 48 && kerusakansementara[2] == 49){
                diagnosakerusakan = 35;
            } 
            if(kerusakansementara[0] == 41 && kerusakansementara[1] == 46 && kerusakansementara[2] == 48){
                diagnosakerusakan = 35;
            }            
            if(kerusakansementara[0] == 51 && kerusakansementara[1] == 52 && kerusakansementara[2] == 53 && kerusakansementara[3] == 54){
                diagnosakerusakan = 36;
            }
            if(kerusakansementara[0] == 53 && kerusakansementara[1] == 54){
                diagnosakerusakan = 36;
            }
            if(kerusakansementara[0] == 51 && kerusakansementara[1] == 52){
                diagnosakerusakan = 36;
            }            
            if(kerusakansementara[0] == 55 && kerusakansementara[1] == 56 && kerusakansementara[2] == 57 && kerusakansementara[3] == 58){
                diagnosakerusakan = 37;
            }
            if(kerusakansementara[0] == 55 && kerusakansementara[1] == 57 && kerusakansementara[2] == 58){
                diagnosakerusakan = 37;
            }
            if(kerusakansementara[0] == 55 && kerusakansementara[1] == 56 && kerusakansementara[2] == 58){
                diagnosakerusakan = 37;
            }            
            if(kerusakansementara[0] == 57 && kerusakansementara[1] == 58 && kerusakansementara[2] == 59 && kerusakansementara[3] == 60){
                diagnosakerusakan = 38;
            }
            if(kerusakansementara[0] == 58 && kerusakansementara[1] == 59 && kerusakansementara[2] == 60){
                diagnosakerusakan = 38;
            }            
            if(kerusakansementara[0] == 57 && kerusakansementara[1] == 58 && kerusakansementara[2] == 59 && kerusakansementara[3] == 61){
                diagnosakerusakan = 39;
            }
            if(kerusakansementara[0] == 58 && kerusakansementara[1] == 59 && kerusakansementara[2] == 61){
                diagnosakerusakan = 39;
            }            
            if(kerusakansementara[0] == 55 && kerusakansementara[1] == 57 && kerusakansementara[2] == 62){
                diagnosakerusakan = 40;
            }
            if(kerusakansementara[0] == 63 && kerusakansementara[1] == 64){
                diagnosakerusakan = 41;
            }
            
            //convert dari integer ke string diagnosa
            String diagnosa_gejala = null;
            
            if(diagnosakerusakan != 0){
                diagnosa_gejala = kerusakan[diagnosakerusakan - 1];
            }
            else if(diagnosakerusakan == 0){
                diagnosa_gejala = null;
            }
                    
        return diagnosa_gejala;
    }
}
