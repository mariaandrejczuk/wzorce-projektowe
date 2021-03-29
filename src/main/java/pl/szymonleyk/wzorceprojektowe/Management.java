package pl.szymonleyk.wzorceprojektowe;

public class Management {
    private static Management management; // 2. przygotować pole, które będzie przechowywało jedyną instancję

    private Management() {  // 1. ustawić konstruktor jako prywatny
    }

    public static Management getInstance() { // 3. przygotować metodę getInstance ktra będzie zwracać ten jedyny obiekt
        if (management == null) {  // metoda ta towrzy jeden raz management,
            management = new Management();
        }
        return management;  //a za każdym następnym razem zwraca istniejący obiekt
    }
}
