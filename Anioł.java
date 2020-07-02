package fabryka;

public class Anioł implements IZamek {
public Anioł(){System.out.println("Narodził się anioł.");}
public int atak=20,obrona=20;
@Override
public void atakuj(){System.out.println("Podczas szybkiego lotu zadaje "+atak+" obrażeń!");}
@Override
public void broń(){System.out.println("Potężna obrona "+obrona+" niesie nadzieję na zwycięstwo.");}
}
