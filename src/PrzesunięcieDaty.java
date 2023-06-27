public class PrzesunięcieDaty {
    public static void przesuńDni(Data data, int liczbaDni) {
        data.setDate(data.getDate().plusDays(liczbaDni));
    }

    public static void przesuńMiesiące(Data data, int liczbaMiesięcy) {
        data.setDate(data.getDate().plusMonths(liczbaMiesięcy));
    }
}
