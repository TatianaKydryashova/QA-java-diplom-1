
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;



@RunWith(Parameterized.class)
public class BunTest {

    private final String name;
    private final float price;

    public BunTest(String name, float price){
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getType() {
        return new Object[][] {
                {"Флюоресцентная булка R2-D3", 988},
        };
    }

    @Test
    public void bunTest() {
        Bun bun = new Bun( name, price);
        assertEquals("Название булочки не совпадает.", name, bun.getName());
        assertEquals("Цена булочки не совпадает.", price, bun.getPrice(), 0);
    }

}
