**# MiniBiblioteka**



**Projekt wykonany w ramach ćwiczenia 2 z przedmiotu PGO.**



**## Opis projektu**

**Aplikacja przedstawiająca prosty model biblioteki.**

**Projekt został rozwinięty etapami zgodnie z treścią ćwiczenia.**



**## Zaimplementowane klasy**



**### Ksiazka**

**Przechowuje informacje o książce:**

**- tytul**

**- autor**

**- liczbaStron**

**- dostepna**



**Metody:**

**- wypiszInfo()**

**- wypozycz()**

**- zwroc()**

**- isDostepna()**

**- getTytul()**



**### Czytelnik**

**Przechowuje informacje o czytelniku:**

**- imie**

**- nazwisko**

**- numerKarty**

**- liczbaWypozyczen**



**Metody:**

**- wypiszDane()**

**- zwiekszLiczbeWypozyczen()**

**- zmniejszLiczbeWypozyczen()**



**### Biblioteka**

**Przechowuje tablicę książek i realizuje operacje biblioteczne.**



**Metody:**

**- dodajKsiazke(Ksiazka ksiazka)**

**- wypiszDostepneKsiazki()**

**- znajdzKsiazkePoTytule(String tytul)**

**- policzDostepneKsiazki()**

**- wypozyczKsiazke(String tytul, Czytelnik czytelnik)**

**- zwrocKsiazke(String tytul, Czytelnik czytelnik)**



**## Zrealizowane etapy**

**1. Dodanie klasy Ksiazka i pierwszych obiektów testowych**

**2. Dodanie klasy Czytelnik i metod pomocniczych**

**3. Dodanie klasy Biblioteka z tablicą książek**

**4. Obsługa wypożyczeń i scenariusz testowy aplikacji**



**## Scenariusz testowy**

**Program:**

**- tworzy książki i czytelnika**

**- dodaje książki do biblioteki**

**- wypisuje dostępne książki**

**- wypożycza książkę**

**- ponownie wypisuje dostępne książki**

**- zwraca książkę**

**- sprawdza liczbę dostępnych książek i stan czytelnika**



**## Uruchomienie**

**Uruchom klasę `Main.java`.**

