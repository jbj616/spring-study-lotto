import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringAddCalculatorTest {
    private StringAddCalculator cal;

    @Before
    public void setup() {
        cal = new StringAddCalculator();
    }

    @Test
    public void add_null() throws Exception {
        assertThat(cal.add(null), is(0));
    }

    @Test
    public void add_빈문자() throws Exception {
        assertThat(cal.add(""), is(0));
    }

    @Test
    public void add_숫자하나() throws Exception {
        assertEquals(1, cal.add("1"));
    }

    @Test
    public void add_쉼표구분자() throws Exception {
        assertEquals(3, cal.add("1,2"));
    }

    @Test
    public void add_쉼표_또는_콜론_구분자() throws Exception {
        assertEquals(6, cal.add("1,2:3"));
    }

    @Test
    public void add_custom_구분자() throws Exception {
        assertEquals(6, cal.add("//;\n1;2;3"));
    }

    @Test
    public void isCustom_커스텀인지_확인() throws Exception {
        assertThat(cal.isCustom("//;\n1;2;3"), is(true));
    }

    @Test(expected = RuntimeException.class)
    public void add_negative() throws Exception {
        cal.add("-1,2,3");
    }
}