package fabryka;

public class Centaur implements IBastion{
public Centaur(){System.out.println("Dodano centaura.");}
public int atak=5,obrona=3;
@Override
public void atakuj(){System.out.println("Wrogowie otrzymują "+atak+" obrażeń!");}
@Override
public void broń(){System.out.println("Obrona z całych sił, czyli z mocą "+obrona+".");}
}
