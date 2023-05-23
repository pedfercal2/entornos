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
    @Test
    public void Test5(){
        String r = GachamiguelV2.cata(5);
        Assertions.assertEquals("Miga", r);
    }
    @Test
    public void Test6(){
        String r = GachamiguelV2.cata(6);
        Assertions.assertEquals("Gacha", r);
    }
    @Test
    public void Test7(){
        String r = GachamiguelV2.cata(7);
        Assertions.assertEquals("7", r);
    }
    @Test
    public void Test8(){
        String r = GachamiguelV2.cata(8);
        Assertions.assertEquals("8", r);
    }
    @Test
    public void Test9(){
        String r = GachamiguelV2.cata(9);
        Assertions.assertEquals("Gacha", r);
    }
    @Test
    public void Test10(){
        String r = GachamiguelV2.cata(10);
        Assertions.assertEquals("Miga", r);
    }
    @Test
    public void Test11(){
        String r = GachamiguelV2.cata(11);
        Assertions.assertEquals("11", r);
    }
    @Test
    public void Test12(){
        String r = GachamiguelV2.cata(12);
        Assertions.assertEquals("Gacha", r);
    }
}
