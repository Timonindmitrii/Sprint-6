import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestUnitLionClass {

    @Mock
    Feline feline;

    @Test
    public void getFood() throws Exception {

        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Lion lion = new Lion("Самец", feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void getKittensWithoutParameters() throws Exception {

        Mockito.when(feline.getKittens()).thenReturn(10);


        Lion lion = new Lion("Самец",feline);
        int expected = 10;
        int actual = lion.getKittens();

        Assert.assertEquals(expected,actual);

    }
}
