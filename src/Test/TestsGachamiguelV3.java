import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import recetas.GachamiguelV3;

public class TestsGachamiguelV3 {
    @Test
    public void Test1V2(){
        String r = GachamiguelV3.cata(1);
        Assertions.assertEquals("1", r);
    }
    @Test
    public void Test2V2(){
        String r = GachamiguelV3.cata(3);
        Assertions.assertEquals("Gacha", r);
    }
    @Test
    public void Test3V2() {
        String r = GachamiguelV3.cata(5);
        Assertions.assertEquals("Miga", r);
    }
    @Test
    public void Test4V2(){
        String r = GachamiguelV3.cata(15);
        Assertions.assertEquals("Gachamiga", r);
    }
}
