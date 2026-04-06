public class Main {
    public static void main(String[] args) {

        Ksiazka ksiazka0 = new Ksiazka("Mały Książę", "de Saint-Exupery Antoine", 100, true);
        Ksiazka ksiazka1 = new Ksiazka("Inspired", "Cagan Marty", 300, true);
        Ksiazka ksiazka2 = new Ksiazka("Wieża w Bazylei. Tajemnicza historia banku", "LeBor Adam", 350, true);

        Czytelnik czytelnik1 = new Czytelnik("Milosz", "Maslanka", 26485, 2);

        Biblioteka biblioteka = new Biblioteka(10);

        biblioteka.dodajKsiazke(ksiazka0);
        biblioteka.dodajKsiazke(ksiazka1);
        biblioteka.dodajKsiazke(ksiazka2);

        biblioteka.wypiszDostepneKsiazki();

        System.out.println("Liczba dostepnych ksiazek: " + biblioteka.policzDostepneKsiazki());

        Ksiazka znaleziona = biblioteka.znajdzKsiazkePoTytule("Inspired");

        if (znaleziona != null) {
            System.out.println("Znaleziono ksiazke:");
            znaleziona.wypiszInfo();
        } else {
            System.out.println("Nie znaleziono ksiazki.");
        }

        czytelnik1.wypiszDane();
    }
}