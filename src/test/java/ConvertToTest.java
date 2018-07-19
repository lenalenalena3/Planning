import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertToTest {

    @Test
    public void convertToEMonth1() {

        String actual = ConvertTo.convertToEMonth("Январь");
        String expected = MyEnum.EMonth.JANUARY.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEMonth2() {

        String actual = ConvertTo.convertToEMonth("Февраль");
        String expected = MyEnum.EMonth.FEBRUARY.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEMonth3() {

        String actual = ConvertTo.convertToEMonth("Март");
        String expected = MyEnum.EMonth.MARCH.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEMonth4() {

        String actual = ConvertTo.convertToEMonth("Апрель");
        String expected = MyEnum.EMonth.APRIL.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEMonth5() {

        String actual = ConvertTo.convertToEMonth("Май");
        String expected = MyEnum.EMonth.MAY.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEMonth6() {

        String actual = ConvertTo.convertToEMonth("Июнь");
        String expected = MyEnum.EMonth.JUNE.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEMonth7() {

        String actual = ConvertTo.convertToEMonth("Июль");
        String expected = MyEnum.EMonth.JULY.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEMonth8() {

        String actual = ConvertTo.convertToEMonth("Август");
        String expected = MyEnum.EMonth.AUGUST.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEMonth9() {

        String actual = ConvertTo.convertToEMonth("Сентябрь");
        String expected = MyEnum.EMonth.SEPTEMBER.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEMonth10() {

        String actual = ConvertTo.convertToEMonth("Октябрь");
        String expected = MyEnum.EMonth.OCTOBER.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEMonth11() {

        String actual = ConvertTo.convertToEMonth("Ноябрь");
        String expected = MyEnum.EMonth.NOVEMBER.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEMonth12() {

        String actual = ConvertTo.convertToEMonth("Декабрь");
        String expected = MyEnum.EMonth.DECEMBER.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEMonthOther() {

        String actual = ConvertTo.convertToEMonth("Адабракадабра");
        String expected = MyEnum.EMonth.UNDEF.toString();
        assertEquals(actual, expected);
    }
    @Test
    public void convertToEMonth0() {

        String actual = ConvertTo.convertToEMonth("");
        String expected = MyEnum.EMonth.UNDEF.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToETipPlus() {

        String actual = ConvertTo.convertToETip("Д");
        String expected = MyEnum.ETip.PLUS.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToETipMinus() {

        String actual = ConvertTo.convertToETip("Р");
        String expected = MyEnum.ETip.MINUS.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToETipOther() {

        String actual = ConvertTo.convertToETip("Другое");
        String expected = MyEnum.ETip.UNDEF.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToETip0() {

        String actual = ConvertTo.convertToETip("");
        String expected = MyEnum.ETip.UNDEF.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEDetailFood() {
        String actual = ConvertTo.convertToEDetail("Еда");
        String expected = MyEnum.EDetail.FOOD.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEDetailPay() {
        String actual = ConvertTo.convertToEDetail("Платежи");
        String expected = MyEnum.EDetail.PAYMENT.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEDetailNew() {
        String actual = ConvertTo.convertToEDetail("Прочее");
        String expected = MyEnum.EDetail.OTHER.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEDetailOther() {
        String actual = ConvertTo.convertToEDetail("Другое");
        String expected = MyEnum.EDetail.UNDEF.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void convertToEDetail0() {
        String actual = ConvertTo.convertToEDetail("");
        String expected = MyEnum.EDetail.UNDEF.toString();
        assertEquals(actual, expected);
    }
}