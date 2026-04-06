public class Ksiazka {

    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    public void wypiszInfo() {
        System.out.println("Tytul: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Liczba stron: " + liczbaStron);
        System.out.println("Dostepna: " + dostepna);
        System.out.println("--------------------");
    }
    public boolean wypozycz() {
        if (dostepna) {
            dostepna = false;
            return true;
        }
        return false;
    }

    public boolean zwroc() {
        if (!dostepna) {
            dostepna = true;
            return true;
        }
        return false;
    }
    public boolean isDostepna() {
        return dostepna;
    }
    public String getTytul() {
        return tytul;
    }
}
