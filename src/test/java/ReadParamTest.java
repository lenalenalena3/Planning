import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ReadParamTest {

    public ArrayList<TestParam> i_params = new ArrayList<TestParam>();

    @Before
    public void setUp() throws Exception {

        i_params.add(new TestParam(MyEnum.EMonth.JANUARY.toString(), 1, MyEnum.ETip.PLUS.toString(), "", "зарплата", 30000));
        i_params.add(new TestParam(MyEnum.EMonth.JANUARY.toString(), 25, MyEnum.ETip.PLUS.toString(), "", "аванс", 20000));
        i_params.add(new TestParam(MyEnum.EMonth.JANUARY.toString(), 3, MyEnum.ETip.MINUS.toString(), MyEnum.EDetail.FOOD.toString(), "молоко", 50));
        i_params.add(new TestParam(MyEnum.EMonth.JANUARY.toString(), 3, MyEnum.ETip.MINUS.toString(), MyEnum.EDetail.FOOD.toString(), "чай", 200));
        i_params.add(new TestParam(MyEnum.EMonth.JANUARY.toString(), 4, MyEnum.ETip.MINUS.toString(), MyEnum.EDetail.FOOD.toString(), "масло", 950));
        i_params.add(new TestParam(MyEnum.EMonth.JANUARY.toString(), 20, MyEnum.ETip.MINUS.toString(), MyEnum.EDetail.PAYMENT.toString(), "кварплата", 5000));
        i_params.add(new TestParam(MyEnum.EMonth.JANUARY.toString(), 3, MyEnum.ETip.MINUS.toString(), MyEnum.EDetail.PAYMENT.toString(), "телефон", 700));
        i_params.add(new TestParam(MyEnum.EMonth.JANUARY.toString(), 3, MyEnum.ETip.MINUS.toString(), MyEnum.EDetail.PAYMENT.toString(), "метро", 2000));
        i_params.add(new TestParam(MyEnum.EMonth.JANUARY.toString(), 3, MyEnum.ETip.MINUS.toString(), MyEnum.EDetail.OTHER.toString(), "средство для стирки", 250));
        i_params.add(new TestParam(MyEnum.EMonth.JANUARY.toString(), 3, MyEnum.ETip.MINUS.toString(), MyEnum.EDetail.OTHER.toString(), "мыло", 350));
        i_params.add(new TestParam(MyEnum.EMonth.JANUARY.toString(), 11, MyEnum.ETip.MINUS.toString(), MyEnum.EDetail.OTHER.toString(), "шампунь", 500));

        for (int i = 0; i < i_params.size(); i++) {
            System.out.println(i + ": " + i_params.get(i).getMonth() + " " + i_params.get(i).getDay() + " " + i_params.get(i).getTip() + " " +
                    i_params.get(i).getDetail() + " " + i_params.get(i).getName() + " " + i_params.get(i).getSum());
        }
        System.out.println("------------------------------------------------------------------");
    }

    @Test
    public void finance() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.finance();
        int expected = 50000;
        assertEquals(actual, expected);
    }

    @Test
    public void costs() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.costs();
        int expected = 10000;
        assertEquals(actual, expected);
    }

    @Test
    public void balance() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.balance();
        int expected = 40000;
        assertEquals(actual, expected);
    }

    @Test
    public void costsDay() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.costsDay(3);
        int expected = 3550;
        assertEquals(actual, expected);
    }

    @Test
    public void costsFood() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.costsFood();
        int expected = 1200;
        assertEquals(actual, expected);
    }

    @Test
    public void costsPayment() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.costsPayment();
        int expected = 7700;
        assertEquals(actual, expected);
    }

    @Test
    public void costsOther() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.costsOther();
        int expected = 1100;
        assertEquals(actual, expected);
    }

    @Test
    public void balanceFood() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.balanceFood();
        int expected = 14300;
        assertEquals(actual, expected);
    }

    @Test
    public void financeFood() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.financeFood();
        int expected = 15500;
        assertEquals(actual, expected);
    }

    @Test
    public void financePayment() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.financePayment();
        int expected = 24000;
        assertEquals(actual, expected);
    }

    @Test
    public void financeOther() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.financeOther();
        int expected = 7500;
        assertEquals(actual, expected);
    }

    @Test
    public void balancePayment() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.balancePayment();
        int expected = 16300;
        assertEquals(actual, expected);
    }

    @Test
    public void balanceOther() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.balanceOther();
        int expected = 6400;
        assertEquals(actual, expected);
    }

    @Test
    public void bigCostsOther() {
        ReadParam params = new ReadParam(i_params);
        int actual = 5;
        int expected = 6400;
        assertEquals(actual, expected);
    }

    @Test
    public void myDay01() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.myDay(MyEnum.EMonth.JANUARY.toString());
        int expected = 31;
        assertEquals(actual, expected);
    }

    @Test
    public void myDay02() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.myDay(MyEnum.EMonth.FEBRUARY.toString());
        int myYear = ReadParam.getCurrentYear();
        int expected;
        if ((myYear % 4) != 0) {
            expected = 28;
        } else {
            expected = 29;
        }
        assertEquals(actual, expected);
    }

    @Test
    public void myDay03() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.myDay(MyEnum.EMonth.MARCH.toString());
        int expected = 31;
        assertEquals(actual, expected);
    }

    @Test
    public void myDay04() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.myDay(MyEnum.EMonth.APRIL.toString());
        int expected = 30;
        assertEquals(actual, expected);
    }

    @Test
    public void myDay05() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.myDay(MyEnum.EMonth.MAY.toString());
        int expected = 31;
        assertEquals(actual, expected);
    }

    @Test
    public void myDay06() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.myDay(MyEnum.EMonth.JUNE.toString());
        int expected = 30;
        assertEquals(actual, expected);
    }

    @Test
    public void myDay07() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.myDay(MyEnum.EMonth.JULY.toString());
        int expected = 31;
        assertEquals(actual, expected);
    }

    @Test
    public void myDay08() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.myDay(MyEnum.EMonth.AUGUST.toString());
        int expected = 31;
        assertEquals(actual, expected);
    }

    @Test
    public void myDay09() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.myDay(MyEnum.EMonth.SEPTEMBER.toString());
        int expected = 30;
        assertEquals(actual, expected);
    }

    @Test
    public void myDay10() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.myDay(MyEnum.EMonth.OCTOBER.toString());
        int expected = 31;
        assertEquals(actual, expected);
    }

    @Test
    public void myDay11() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.myDay(MyEnum.EMonth.NOVEMBER.toString());
        int expected = 30;
        assertEquals(actual, expected);
    }

    @Test
    public void myDay12() {
        ReadParam params = new ReadParam(i_params);
        int actual = params.myDay(MyEnum.EMonth.DECEMBER.toString());
        int expected = 31;
        assertEquals(actual, expected);
    }
}