/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author ASUS
 */
public class PBOIF210118062Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateTime = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss");
        String showDateTime = dateTime.format(cal.getTime());
        System.out.println("Hari ini adalah hari :" + showDateTime);
    }
    
}
