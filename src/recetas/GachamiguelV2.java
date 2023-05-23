package recetas;

public class GachamiguelV2 {
    public static String cata(int i) {
        if (i % 3 == 0) {
            return "Gacha";
        } else if (i == 5) {
            return "Miga";
        }
        return i + "";
    }
}
