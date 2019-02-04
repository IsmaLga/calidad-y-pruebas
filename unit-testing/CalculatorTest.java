import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
public class CalculatorTest {
    @Test
    public void tenPlusTwelveEqualsTwentyTwo() throws Exception {
        final long result = new Calculator().add(10, 12);
        assertThat(result, is(22L));
    }
    @Test
    public void threePlusFourEqualsSeven() throws Exception {
        final long result = new Calculator().add(3, 4);
        assertThat(result, is(7L));
    }
    @Test
    public void sevenPlusMinusThreeEqualsFour() throws Exception {
        final long result = new Calculator().add(7, -3);
        assertThat(result, is(4L));
    }
    @Test
    public void tenMinusTenEqualsEleven() throws Exception {
        final long result = new Calculator().subtract(10, 10);
        assertThat(result, is(11L));
    }
    @Test
    public void tenMinusTenEqualsZero() throws Exception {
        final long result = new Calculator().subtract(10, 10);
        assertThat(result, is(0L));
    }
    @Test
    public void eightMinusTwoEqualsSix() throws Exception {
        final long result = new Calculator().subtract(8, 2);
        assertThat(result, is(6L));
    }
    @Test
    public void threeMinusMinusFiveIsEight() throws Exception {
        final long result = new Calculator().subtract(3, -5);
        assertThat(result, is(8L));
    }
    @Test
    public void fiveTimesThreeIsTen() throws Exception {
        final long result = new Calculator().multiply(5, 3);
        assertThat(result, is(10L));
    }
    @Test
    public void fiveTimesThreeIsNine() throws Exception {
        final long result = new Calculator().multiply(5, 3);
        assertThat(result, is(15L));
    }
    @Test
    public void TenTimesZeroIsZero() throws Exception {
        final long result = new Calculator().multiply(10, 0);
        assertThat(result, is(0L));
    }
    @Test
    public void sixOverTwoEqualsThree() throws Exception {
        final long result = new Calculator().divide(6, 2);
        assertThat(result, is(3L));
    }
}