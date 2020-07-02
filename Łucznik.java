package fabryka;

public class Łucznik implements IZamek {
public Łucznik(){System.out.println("Powołano łucznika.");}
public int atak=6,obrona=3;
@Override
public void atakuj(){System.out.println("Strzał niosący "+atak+" obrażeń!");}
@Override
public void broń(){System.out.println("Mimo obrony "+obrona+", poddanie się nie istnieje.");}
}
