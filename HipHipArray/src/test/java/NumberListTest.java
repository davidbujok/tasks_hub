import org.example.NumberList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class NumberListTest {
    private NumberList myNumbers;
    @Before
    public void before(){
        myNumbers = new NumberList();
    }
    @Test
    public void hasNoNumbers(){
        Assert.assertEquals(0, myNumbers.getSize());
    }
    @Test
    public void canAddNumber() {
        this.myNumbers.addNumber(7);
        Assert.assertEquals(1, myNumbers.getSize());
    }
    @Test
    public void canFindAtIndex(){
        myNumbers.addNumber(15);
        Assert.assertEquals(15, myNumbers.getNumberAtIndex(0));
    }
    @Test
    public void canMultiplyArrayByTwo(){
        myNumbers.addNumber(1);
        myNumbers.addNumber(2);
        myNumbers.addNumber(3);
        myNumbers.addNumber(4);
        ArrayList<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(2);
        testNumbers.add(4);
        testNumbers.add(6);
        testNumbers.add(8); // fail the test to show the swaet deatils
        this.myNumbers.multiplyNumbersBy2();
        //Assert.assertEquals(true, testNumbers.equals(this.myNumbers.getNumbers()));
        //Assert.assertArrayEquals(testNumbers.toArray(), this.myNumbers.getNumbers().toArray());
        Assert.assertEquals(testNumbers, this.myNumbers.getNumbers());
    }
}
