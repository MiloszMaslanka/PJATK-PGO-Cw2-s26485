public class Main {
    public static void main(String[] args) {

        Ksiazka ksiazka0 = new Ksiazka("Mały Książę", "de Saint-Exupery Antoine",
                100, true);

        Ksiazka ksiazka1 = new Ksiazka("Inspired", "Cagan Marty",
                300, true);

        Ksiazka ksiazka2 = new Ksiazka("Wieża w Bazylei. Tajemnicza historia banku", "LeBor Adam",
                350, true);

        ksiazka0.wypiszInfo();
        ksiazka1.wypiszInfo();
        ksiazka2.wypiszInfo();

        ksiazka0.wypozycz();
        ksiazka0.wypiszInfo();

        ksiazka0.zwroc();
        ksiazka0.wypiszInfo();
    }
}