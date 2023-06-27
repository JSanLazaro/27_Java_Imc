package org.factoriaf5;


public class Imc {
    public static float computeImc(float weightKg, float heigthCm) {        
        float imc = weightKg / (float) Math.pow(heigthCm / 100, 2);
        float twoDigitsImc = Math.round(imc*100)/100.0f;
        System.out.println(twoDigitsImc);
        return twoDigitsImc;
    }
    public static String getImcString(float imc){        
        String result = "";
        if(imc<16){
            result = "Delgadez severa";
        }else if(imc<17){
            result = "Delgadez moderada";
        }else if(imc<18.5){
            result = "Delgadez leve";
        }else if(imc<25){
            result = "Peso normal";
        }else if(imc<30){
            result = "Sobrepeso";
        }else if(imc<35){
            result = "Obesidad leve";
        }else if(imc<40){
            result = "Obesidad moderada";
        }else if(imc>=40){
            result = "Obesidad morbida";
        }
        return result;
    }

}
