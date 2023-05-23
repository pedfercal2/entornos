package recetas;

public class Gachamiguero {
    private static String mult3="Gacha", mult5="Miga",multAmbos=mult3+(mult5).toLowerCase();
    public static String catar(int i){
        if(isMultiploDe3(i)){
            if(isMultiploDe5(i)){
                return multAmbos;
            }else{
                return mult3;
            }
        }else if(isMultiploDe5(i)){
            return mult5;
        }
        return i+"";
    }
    static boolean isMultiploDe3(int i){// Comprueba si un número entero dado es múltiplo de 3.
        return i%3==0;
    }
    static boolean isMultiploDe5(int i){// Comprueba si un número dado es múltiplo de 5.
        return i%5==0;
    }
}
