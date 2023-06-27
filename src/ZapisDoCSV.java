import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class ZapisDoCSV {
    public static void zapiszDoCSV(List<Data> dataList, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            // Zapis nagłówka
            String header = "Rok\tMiesiac\tDzien\n";
            fileWriter.write(header);


            fileName = "dane.csv";

            // Zapis danych
            for (Data data : dataList) {
                String row = data.getYear() + "\t" + data.getMonth() + "\t" + data.getDay() + "\n";
                fileWriter.write(row);
            }

            System.out.println("Dane zostały zapisane do pliku CSV.");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisu danych do pliku CSV: " + e.getMessage());
        }
    }
}
