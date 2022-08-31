package it.unikey;

public class Main {
    public static void main(String[] args) {
        Statue mose = new Statue("Mose","Michelangelo","marmo", 150);
        Statue pieta = new Statue("Pietà","Michelangelo","marmo", 160);
        Statue apolloEDaf = new Statue("ApolloEDaf","Bernini","marmo", 180);
        Statue estasi = new Statue("Estasi di Santa Teresa","Bernini","marmo", 180);
        Statue david = new Statue("David","Donatello","bronzo", 110);

        Painting monna = new Painting("Monnalisa","Leonardo", "Olio su Tela");
        Painting vergine = new Painting("Vergine delle Rocce","Leonardo", "Olio su Tela");
        Painting cena = new Painting("Ultima cena","Leonardo", "Affresco");
        Painting test = new Painting("Test Negativo","Test", "Test");

        Museum museo = new Museum(6);
        museo.addArt(mose);
        museo.addArt(pieta);
        museo.addArt(apolloEDaf);
        museo.addArt(estasi);
        museo.addArt(david);
        museo.addArt(monna);
        museo.addArt(vergine);
        museo.addArt(cena);

        System.out.println(museo.printSala());
        System.out.println(museo.printDeposito());

        museo.search(cena);
        museo.move(cena);

        museo.move(monna);
        museo.move(cena);

        System.out.println(museo.printSala());
        System.out.println(museo.printDeposito());

        museo.search(test);
        museo.move(test);


    }
}
