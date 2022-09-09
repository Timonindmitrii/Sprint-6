import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestUnitCatClass {
    @Mock
    Feline feline;

    @Test
    public void getSoundMeowPositive(){
        Cat cat = new Cat(feline);
        String expected  = "Мяу";
        String actual = cat.getSound();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFoodPredatorPositive() throws Exception {

        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Cat cat = new Cat(feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = cat.getFood();

        Assert.assertEquals(expected,actual);
        }




}
