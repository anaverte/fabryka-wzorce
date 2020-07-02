package fabryka;

public class Drzewiec implements IBastion{
public Drzewiec(){System.out.println("Pojawił się drzewiec.");}
public int atak=9,obrona=12;
@Override
public void atakuj(){System.out.println("Atak "+atak+", przeciwnicy uwięzieni w korzeniach.");}
@Override
public void broń(){System.out.println("Obrona "+obrona+", aż do końca.");}
}
