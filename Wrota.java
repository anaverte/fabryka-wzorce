package fabryka;

import fabryka.Fabryka.EnumWrota;

public class Wrota {
 public IWrota twórzJednostki(EnumWrota typJednostki) {
        switch (typJednostki) {
            case NIMFA:
                return new Nimfa();
            case FENIKS:
                return new Feniks();
            default:
                throw new IllegalArgumentException("Niestety nie ma takiego wyboru.");
        }
    }
}
