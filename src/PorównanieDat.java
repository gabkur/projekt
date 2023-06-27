import java.time.LocalDate;

public class PorównanieDat {
    public static int porównaj(Data data1, Data data2) {
        LocalDate date1 = data1.getDate();
        LocalDate date2 = data2.getDate();

        return date1.compareTo(date2);
    }
}
