import java.time.LocalDate;

public class Data {
    private LocalDate date;

    public Data(int year, int month, int day) {
        date = LocalDate.of(year, month, day);
    }
    public int getYear() {
        return date.getYear();
    }

    public int getMonth() {
        return date.getMonthValue();
    }

    public int getDay() {
        return date.getDayOfMonth();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date.toString();
    }

    public void setMonth(int month) {
    }

    public void setYear(int year) {
    }

    public void setDay(int day) {
    }
}
