package fabryka;

import fabryka.Fabryka.EnumZamek;

public class Zamek {

    public IZamek twórzJednostki(EnumZamek typJednostki) {
        switch (typJednostki) {            
            case ŁUCZNIK:
                return new Łucznik();
            case ANIOŁ:
                return new Anioł();
            default:
                throw new IllegalArgumentException("Niestety nie ma takiego wyboru.");
        }
    }
}
