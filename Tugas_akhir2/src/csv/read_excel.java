/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.table.DefaultTableModel;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author mantaps
 */
public class read_excel {
    public static Iterable<CSVRecord> import_data(){
        BufferedReader in = null; 
        try {
            in = new BufferedReader(new FileReader("D:\\netbeansproject\\Tugas_akhir\\src\\csv\\Dataset.csv"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(read_excel.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        Iterable<CSVRecord> records = null;
        try {
            records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
        } catch (IOException ex) {
            Logger.getLogger(read_excel.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
        return records;
       
    }
}
