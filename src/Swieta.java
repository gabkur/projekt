import java.time.DayOfWeek;

public class Swieta {
    public static boolean czySwieto(Data data) {
        DayOfWeek dayOfWeek = data.getDate().getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }
}
