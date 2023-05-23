package recetas;

public class GachamiguelV2 {
    public static String cata(int i) {
        if(isMultiploDe3(i)){
            if(isMultiploDe5(i)){
                return "Gachamiga";
            }else{
                return "Gacha";
            }
        }else if(isMultiploDe5(i)){
            return "Miga";
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
