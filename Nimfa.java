package fabryka;

public class Nimfa implements IWrota{
public Nimfa(){System.out.println("Zrekrutowano nimfę.");}
public int atak=2,obrona=2;
@Override
public void atakuj(){System.out.println("Wrogowie otzymują "+atak+" obrażeń!");}
@Override
public void broń(){System.out.println("Mimo obrony "+obrona+", poddanie się nie istnieje.");}
}
