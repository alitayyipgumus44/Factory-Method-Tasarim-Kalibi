package factorymethodtasarimkalibi;

public class SekilFactory {
    
    public Sekil getSekil(String sekil){
      
      if(sekil == null){
        return null;
      }		
      
      if(sekil.equalsIgnoreCase("Daire")){
        return new Daire();
      } 
      
      else if(sekil.equalsIgnoreCase("Dikdörtgen")){
        return new Dikdortgen();
      } 
      
      else if(sekil.equalsIgnoreCase("Kare")){
        return new Kare();
      }
      
      return null;
   }
}
