public  class Czytelnik {

    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik(String imie, String nazwisko, int numerKarty, int liczbaWypozyczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;
    }

    //zwiekszLiczbeWypozyczen(), zmniejszLiczbeWypozyczen()

    public void wypiszDane(){
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("NumerKarty: " + numerKarty);
        System.out.println("liczbaWypozyczen: " +  liczbaWypozyczen);
    }

    public int zwiekszLiczbeWypozyczen(){
        liczbaWypozyczen++;
        return liczbaWypozyczen;
    }
    public int zmniejszLiczbeWypozyczen(){
        liczbaWypozyczen--;
        return liczbaWypozyczen;
    }

}