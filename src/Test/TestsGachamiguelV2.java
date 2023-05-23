import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import recetas.GachamiguelV2;

public class TestsGachamiguelV2 {
    @Test
    public void Test1(){
        String r = GachamiguelV2.cata(1);
        Assertions.assertEquals("1", r);
    }
}
