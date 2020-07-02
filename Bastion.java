package fabryka;

import fabryka.Fabryka.EnumBastion;

public class Bastion {
public IBastion twórzJednostki(EnumBastion typJednostki) {
        switch (typJednostki) {
            case CENTAUR:
                return new Centaur();
            case DRZEWIEC:
                return new Drzewiec();
            default:
                throw new IllegalArgumentException("Niestety nie ma takiego wyboru.");
        }
    }
}
