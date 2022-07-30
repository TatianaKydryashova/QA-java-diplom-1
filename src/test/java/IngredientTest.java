
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class IngredientTest {

    private final IngredientType type;
    private final String name;
    private final float price;

    public IngredientTest(IngredientType type, String name, float price){
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getType() {
        return new Object[][] {
                {IngredientType.SAUCE, "hot sauce", 100},
                {IngredientType.FILLING, "cutlet", 100},
                {IngredientType.FILLING, "sausage", 300},
        };
    }

    @Test
    public void ingredientTest() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals("Тип ингридиента не совпадает.", type, ingredient.getType());
        assertEquals("Цена ингредиента не совпадает.", price, ingredient.getPrice(), 0);
        assertEquals("Название ингридиента не совпадает", name, ingredient.getName());
    }

}
