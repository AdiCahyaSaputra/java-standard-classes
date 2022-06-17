package com.jsc.app;
import java.util.Calendar;
import java.util.Date;

public class DateApp {
  public static void main(String[] args) {
    Date now = new Date();
    System.out.println(now);

    // Gunakan class Calender ketika ingin memanipulasi tanggal 
    Calendar calender = Calendar.getInstance(); // ambil waktu saat ini 

    // manipulasi
    calender.set(Calendar.YEAR, 2021);
    calender.set(Calendar.MONTH, Calendar.FEBRUARY);
    calender.set(Calendar.HOUR_OF_DAY, 0);
    calender.set(Calendar.MINUTE, 0);
    calender.set(Calendar.SECOND, 0);
    calender.set(Calendar.MILLISECOND, 0);

    // Jadikan Date 
    Date feb2021 = calender.getTime();
    System.out.println(feb2021); // Wed(sekarang sih jumat) feb 17(tanggal sekarang) 2021 jam 0:0:0

    Calendar manipulate = Calendar.getInstance();

    manipulate.add(Calendar.YEAR, -3); // mundur 3 tahun
    manipulate.add(Calendar.DAY_OF_MONTH, 10); // maju tiga hari (hari senin) tapi jangan lupa ini tahun 2022 - 3 tahun 

    Date manipulateSaatIni = manipulate.getTime();

    System.out.println(manipulateSaatIni);

  }
}
