import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import recetas.GachamiguelV2;

public class TestsGachamiguelV2 {
    @Test
    public void Test1(){
        String r = GachamiguelV2.cata(1);
        Assertions.assertEquals("1", r);
    }
    @Test
    public void Test2(){
        String r = GachamiguelV2.cata(2);
        Assertions.assertEquals("2", r);
    }
    @Test
    public void Test3(){
        String r = GachamiguelV2.cata(3);
        Assertions.assertEquals("Gacha", r);
    }
    @Test
    public void Test4(){
        String r = GachamiguelV2.cata(4);
        Assertions.assertEquals("4", r);
    }
}
