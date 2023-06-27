import java.time.format.DateTimeFormatter;

public class FormatDaty {
    public static String formatujDatę(Data data, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return data.getDate().format(formatter);
    }
}
