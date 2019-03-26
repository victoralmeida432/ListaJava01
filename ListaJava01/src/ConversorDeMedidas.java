package ListaJava01;
public class ConversorDeMedidas {
    
    // OK
    public void converterMassa(Medidas val1, Medidas val2) {
        
        double newKg;
        double newLb;
        double aux;
        

        if(val1.getUnidadeMassa().equalsIgnoreCase("kg") && 
                val2.getUnidadeMassa().equalsIgnoreCase("lb")) {
            
            aux = val1.getMassa();
            newLb = aux * 2.2046;
            
            System.out.printf("%.2f lb\n", newLb);
            
            

        } else if(val1.getUnidadeMassa().equalsIgnoreCase("lb") && 
                val2.getUnidadeMassa().equalsIgnoreCase("kg")) {
            
            aux = val1.getMassa();
            newKg = aux / 2.2046;
            
            System.out.printf("%.2f kg\n", newKg);
            
         
        } else {
            System.out.println("Não é possível realizar a conversão pois as duas medidas já estão na" +
"mesma unidade.");
        }
            
    }
    
   
    public void converterDistancia(Medidas val1, Medidas val2) {
        

        double newMi;
        double newKm;
        double aux;
        

        if(val1.getUnidadeDistancia().equalsIgnoreCase("km") && 
                val2.getUnidadeDistancia().equalsIgnoreCase("mi")) {
            
            aux = val1.getDistancia();
            newMi = aux / 1.609;
            
            System.out.printf("%.2f mi\n", newMi);
            
            
        }
        else if(val1.getUnidadeDistancia().equalsIgnoreCase("mi") && 
                val2.getUnidadeDistancia().equalsIgnoreCase("km")) {
            
            aux = val1.getDistancia();
            newKm = aux * 1.609;
            
            System.out.printf("%.2f km\n", newKm);
            
              
        } 
        else {
            System.out.println("Não é possível realizar a conversão pois as duas medidas já estão na" +
"mesma unidade.");
        }
        
    }
    
    
    public void converterTemperatura(Medidas val1, Medidas val2) {
   
        double newC;
        double newF;
        double aux;
        
        if(val1.getUnidadeTemperatura().equalsIgnoreCase("C") && 
                val2.getUnidadeTemperatura().equalsIgnoreCase("F")) {
            
            aux = val1.getTemperatura();
            newF = aux * 1.8 + 32;
            
            System.out.printf("%.2f °F\n", newF);
            
   
        } else if(val1.getUnidadeTemperatura().equalsIgnoreCase("F") && 
                val2.getUnidadeTemperatura().equalsIgnoreCase("C")) {
            
            aux = val1.getTemperatura();
            newC = (aux - 32) / 1.8;
            
            System.out.printf("%.2f °C\n", newC);
            
                
        } else {
            System.out.println("Não é possível realizar a conversão pois as duas medidas já estão na" +
"mesma unidade.");
        }
        
    }
    
}