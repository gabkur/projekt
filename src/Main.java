import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Data> dataList = new ArrayList<>();

        while (true) {
            System.out.println("Wybierz operację:");
            System.out.println("1. Dodaj nową datę");
            System.out.println("2. Wyświetl listę dat");
            System.out.println("3. Aktualizuj datę");
            System.out.println("4. Usuń datę");
            System.out.println("5. Oblicz różnicę między datami");
            System.out.println("6. Przesuń datę");
            System.out.println("7. Wyświetl datę w określonym formacie");
            System.out.println("8. Sprawdź czy data jest świętem");
            System.out.println("9. Porównaj daty");
            System.out.println("0. Zakończ program i zapisz zmiany do pliku");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Program zakończony.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Wprowadź nową datę:");
                    System.out.print("Rok: ");
                    int year = scanner.nextInt();
                    System.out.print("Miesiąc: ");
                    int month = scanner.nextInt();
                    System.out.print("Dzień: ");
                    int day = scanner.nextInt();
                    scanner.nextLine();
                    Data newData = new Data(year, month, day);
                    dataList.add(newData);
                    System.out.println("Data dodana.");
                    break;

                case 2:
                    System.out.println("Lista dat:");
                    for (int i = 0; i < dataList.size(); i++) {
                        System.out.println(i + 1 + ". " + dataList.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Podaj indeks daty do aktualizacji: ");
                    int indexToUpdate = scanner.nextInt();
                    scanner.nextLine();
                    if (indexToUpdate >= 1 && indexToUpdate <= dataList.size()) {
                        Data dateToUpdate = dataList.get(indexToUpdate - 1);
                        System.out.print("Podaj nowy rok: ");
                        int newYear = scanner.nextInt();
                        System.out.print("Podaj nowy miesiąc: ");
                        int newMonth = scanner.nextInt();
                        System.out.print("Podaj nowy dzień: ");
                        int newDay = scanner.nextInt();
                        scanner.nextLine();
                        dateToUpdate.setYear(newYear);
                        dateToUpdate.setMonth(newMonth);
                        dateToUpdate.setDay(newDay);
                        System.out.println("Data została zaktualizowana.");
                    } else {
                        System.out.println("Nieprawidłowy indeks daty.");
                    }
                    break;

                case 4:
                    System.out.print("Podaj indeks daty do usunięcia: ");
                    int indexToDelete = scanner.nextInt();
                    scanner.nextLine();
                    if (indexToDelete >= 1 && indexToDelete <= dataList.size()) {
                        dataList.remove(indexToDelete - 1);
                        System.out.println("Data usunięta.");
                    } else {
                        System.out.println("Nieprawidłowy indeks daty.");
                    }
                    break;

                case 5:
                    System.out.print("Podaj indeks pierwszej daty: ");
                    int firstIndex = scanner.nextInt();
                    System.out.print("Podaj indeks drugiej daty: ");
                    int secondIndex = scanner.nextInt();
                    scanner.nextLine();
                    if (firstIndex >= 1 && firstIndex <= dataList.size() && secondIndex >= 1 && secondIndex <= dataList.size()) {
                        Data firstDate = dataList.get(firstIndex - 1);
                        Data secondDate = dataList.get(secondIndex - 1);
                        long difference = RóżnicaDat.obliczRóżnicę(firstDate, secondDate);
                        System.out.println("Różnica między datami: " + difference + " dni.");
                    } else {
                        System.out.println("Nieprawidłowy indeks daty.");
                    }
                    break;


                case 6:
                    System.out.print("Podaj indeks daty do przesunięcia: ");
                    int indexToShift = scanner.nextInt();
                    scanner.nextLine();
                    if (indexToShift >= 1 && indexToShift <= dataList.size()) {
                        Data dateToShift = dataList.get(indexToShift - 1);
                        System.out.print("Podaj liczbę dni do przesunięcia: ");
                        int daysToShift = scanner.nextInt();
                        scanner.nextLine();
                        PrzesunięcieDaty.przesuńDni(dateToShift, daysToShift);
                        System.out.println("Data przesunięta.");
                    } else {
                        System.out.println("Nieprawidłowy indeks daty.");
                    }
                    break;

                case 7:
                    System.out.print("Podaj indeks daty do sformatowania: ");
                    int indexToFormat = scanner.nextInt();
                    scanner.nextLine();
                    if (indexToFormat >= 1 && indexToFormat <= dataList.size()) {
                        Data dateToFormat = dataList.get(indexToFormat - 1);
                        System.out.print("Podaj format daty (np. yyyy-MM-dd): ");
                        String dateFormat = scanner.nextLine();
                        String formattedDate = FormatDaty.formatujDatę(dateToFormat, dateFormat);
                        System.out.println("Sformatowana data: " + formattedDate);
                    } else {
                        System.out.println("Nieprawidłowy indeks daty.");
                    }
                    break;

                case 8:
                    System.out.print("Podaj indeks daty do sprawdzenia: ");
                    int indexToCheck = scanner.nextInt();
                    scanner.nextLine();
                    if (indexToCheck >= 1 && indexToCheck <= dataList.size()) {
                        Data dateToCheck = dataList.get(indexToCheck - 1);
                        boolean isHoliday = Swieta.czySwieto(dateToCheck);
                        System.out.println("Czy data jest świętem? " + isHoliday);
                    } else {
                        System.out.println("Nieprawidłowy indeks daty.");
                    }
                    break;

                case 9:
                    System.out.print("Podaj indeks pierwszej daty: ");
                    int firstIndexToCompare = scanner.nextInt();
                    System.out.print("Podaj indeks drugiej daty: ");
                    int secondIndexToCompare = scanner.nextInt();
                    scanner.nextLine();
                    if (firstIndexToCompare >= 1 && firstIndexToCompare <= dataList.size() && secondIndexToCompare >= 1 && secondIndexToCompare <= dataList.size()) {
                        Data firstDateToCompare = dataList.get(firstIndexToCompare - 1);
                        Data secondDateToCompare = dataList.get(secondIndexToCompare - 1);
                        int comparisonResult = PorównanieDat.porównaj(firstDateToCompare, secondDateToCompare);
                        if (comparisonResult < 0) {
                            System.out.println("Data 1 jest wcześniejsza niż data 2");
                        } else if (comparisonResult > 0) {
                            System.out.println("Data 1 jest późniejsza niż data 2");
                        } else {
                            System.out.println("Data 1 jest równa data 2");
                        }
                    } else {
                        System.out.println("Nieprawidłowy indeks daty.");
                    }
                    break;

                default:
                    System.out.println("Nieprawidłowy wybór operacji.");
                    break;
            }
        }

        String fileName = "dane.csv";
        ZapisDoCSV.zapiszDoCSV(dataList, fileName);

        scanner.close();
    }
}
