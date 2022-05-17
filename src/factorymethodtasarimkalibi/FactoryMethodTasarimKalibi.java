package factorymethodtasarimkalibi;

public class FactoryMethodTasarimKalibi {

    public static void main(String[] args) {

      SekilFactory sekilFactory = new SekilFactory();

      Sekil sekil1 = sekilFactory.getSekil("Daire");
      sekil1.Ciz();

      Sekil sekil2 = sekilFactory.getSekil("Dikdörtgen");
      sekil2.Ciz();

      Sekil sekil3 = sekilFactory.getSekil("Kare");
      sekil3.Ciz();
    }
    
}
