package fabryka;

public class Feniks implements IWrota{
public Feniks(){System.out.println("Przywołano feniksa.");}
public int atak=21,obrona=18;
@Override
public void atakuj(){System.out.println("Potężny atak "+atak+" zionięciem ogniem!");}
@Override
public void broń(){System.out.println("Obrona "+obrona+", w razie porażki może nowe wcielenie?");}
}
