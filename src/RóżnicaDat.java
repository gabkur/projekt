import java.time.temporal.ChronoUnit;

public class RóżnicaDat {
    public static long obliczRóżnicę(Data data1, Data data2) {
        return ChronoUnit.DAYS.between(data1.getDate(), data2.getDate());
    }
}
