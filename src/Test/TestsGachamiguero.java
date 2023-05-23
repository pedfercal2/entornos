import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import recetas.Gachamiguero;

public class TestsGachamiguero {
    @Test
    public void Test1V2(){
        String r = Gachamiguero.catar(1);
        Assertions.assertEquals("1", r);
    }
    @Test
    public void Test2V2(){
        String r = Gachamiguero.catar(3);
        Assertions.assertEquals("Gacha", r);
    }
    @Test
    public void Test3V2() {
        String r = Gachamiguero.catar(5);
        Assertions.assertEquals("Miga", r);
    }
    @Test
    public void Test4V2(){
        String r = Gachamiguero.catar(15);
        Assertions.assertEquals("Gachamiga", r);
    }
}
