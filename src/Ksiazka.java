public class Ksiazka {

    String tytul;
    String autor;
    int rokWydania;
    String wydawnictwo;

    public Ksiazka(String tytul, String autor, int rokWydania, String wydawnictwo) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.wydawnictwo = wydawnictwo;
    }

    public void wyswietlInformacje() {
        System.out.println("Tytuł: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Rok wydania: " + rokWydania);
        System.out.println("Wydawnictwo: " + wydawnictwo);
    }

    public static void main(String[] args) {
        Ksiazka mojaKsiazka = new Ksiazka("Władca Pierścieni", "J.R.R. Tolkien", 1954, "Allen & Unwin");

        mojaKsiazka.wyswietlInformacje();
    }
}