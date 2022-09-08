import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestUnitFelineClass {


    @Test
    public void getFamilyCatPositive(){
        Feline feline = new Feline();

        String actual = "Кошачьи";
        String expected = feline.getFamily();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void felineGetKittensWithoutParameters(){
        Feline feline = new Feline();

        int actual = feline.getKittens();
        int expected = 1;

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void felineGetKittensWithParameter(){
        Feline feline = new Feline();

        int actual = feline.getKittens(10);
        int expected = 10;

        Assert.assertEquals(expected,actual);
    }

@Test
    public void eatMeatParentMethod() throws Exception {
        Feline feline = new Feline();

    List<String> actual = feline.eatMeat();
    List<String> expected = List.of("Животные", "Птицы", "Рыба");

    Assert.assertEquals(expected,actual);

}


}
