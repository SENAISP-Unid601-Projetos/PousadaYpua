package pousadaYpua.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataUtils {
	
	public static String dateToString(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }

    // Converte String no formato yyyy-MM-dd para LocalDate
    public static LocalDate stringToDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dateStr, formatter);
    }


}
