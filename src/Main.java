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

        System.out.println("=== Dostepne ksiazki na start ===");
        biblioteka.wypiszDostepneKsiazki();
        System.out.println("Liczba dostepnych ksiazek: " + biblioteka.policzDostepneKsiazki());

        System.out.println("=== Dane czytelnika przed wypozyczeniem ===");
        czytelnik1.wypiszDane();

        System.out.println("=== Wypozyczenie ksiazki ===");
        biblioteka.wypozyczKsiazke("Inspired", czytelnik1);

        System.out.println("=== Dostepne ksiazki po wypozyczeniu ===");
        biblioteka.wypiszDostepneKsiazki();
        System.out.println("Liczba dostepnych ksiazek: " + biblioteka.policzDostepneKsiazki());

        System.out.println("=== Dane czytelnika po wypozyczeniu ===");
        czytelnik1.wypiszDane();

        System.out.println("=== Zwrot ksiazki ===");
        biblioteka.zwrocKsiazke("Inspired", czytelnik1);

        System.out.println("=== Dostepne ksiazki po zwrocie ===");
        biblioteka.wypiszDostepneKsiazki();
        System.out.println("Liczba dostepnych ksiazek: " + biblioteka.policzDostepneKsiazki());

        System.out.println("=== Dane czytelnika po zwrocie ===");
        czytelnik1.wypiszDane();
    }
}