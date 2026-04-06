public class Biblioteka {

    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        } else {
            System.out.println("Brak miejsca w bibliotece.");
        }
    }

    public void wypiszDostepneKsiazki() {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                ksiazki[i].wypiszInfo();
            }
        }
    }

    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equals(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }

    public int policzDostepneKsiazki() {
        int licznik = 0;

        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                licznik++;
            }
        }

        return licznik;
    }

    public void wypozyczKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);

        if (ksiazka != null) {
            if (ksiazka.wypozycz()) {
                czytelnik.zwiekszLiczbeWypozyczen();
                System.out.println("Wypozyczono ksiazke: " + tytul);
            } else {
                System.out.println("Ksiazka jest juz wypozyczona: " + tytul);
            }
        } else {
            System.out.println("Nie znaleziono ksiazki: " + tytul);
        }
    }

    public void zwrocKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);

        if (ksiazka != null) {
            if (ksiazka.zwroc()) {
                czytelnik.zmniejszLiczbeWypozyczen();
                System.out.println("Zwrocono ksiazke: " + tytul);
            } else {
                System.out.println("Ksiazka byla juz dostepna: " + tytul);
            }
        } else {
            System.out.println("Nie znaleziono ksiazki: " + tytul);
        }
    }
}