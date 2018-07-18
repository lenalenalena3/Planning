import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ReadParam {

    ArrayList<TestParam> i_param;

    public ReadParam(ArrayList<TestParam> v_param) {

        i_param = v_param;
    }

    public static int getCurrentYear() {

        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        return calendar.get(java.util.Calendar.YEAR);
    }

    //доходы всего за месяц
    public int finance() {
        int fin = 0;
        for (int i = 0; i < i_param.size(); i++) {
            if (i_param.get(i).getTip() == MyEnum.ETip.PLUS.toString()) {
                fin = fin + Integer.valueOf(i_param.get(i).getSum());
            }
        }
        return fin;
    }

    //расходы всего за мес¤ц
    public int costs() {
        int cos = 0;
        for (int i = 0; i < i_param.size(); i++) {
            if (i_param.get(i).getTip() == MyEnum.ETip.MINUS.toString()) {
                cos = cos + Integer.valueOf(i_param.get(i).getSum());
            }
        }
        return cos;
    }

    //остаток всего за мес¤ц
    public int balance() {
        int bal = 0;
        bal = finance() - costs();
        return bal;
    }

    //расходы за день
    public int costsDay(int Day) {
        int cosDay = 0;
        int myDay = Day;
        for (int i = 0; i < i_param.size(); i++) {
            if ((i_param.get(i).getTip() == MyEnum.ETip.MINUS.toString()) && (Integer.valueOf(i_param.get(i).getDay()) == myDay)) {
                cosDay = cosDay + Integer.valueOf(i_param.get(i).getSum());
            }
        }
        return cosDay;
    }

    //расходы на еду
    public int costsFood() {
        int cosFood = 0;
        for (int i = 0; i < i_param.size(); i++) {
            if (i_param.get(i).getDetail() == MyEnum.EDetail.FOOD.toString()) {
                cosFood = cosFood + Integer.valueOf(i_param.get(i).getSum());
            }
        }
        return cosFood;
    }

    //расходы на платежи
    public int costsPayment() {
        int cosPayment = 0;
        for (int i = 0; i < i_param.size(); i++) {
            if (i_param.get(i).getDetail() == MyEnum.EDetail.PAYMENT.toString()) {
                cosPayment = cosPayment + Integer.valueOf(i_param.get(i).getSum());
            }
        }
        return cosPayment;
    }

    //расходы на прочее
    public int costsOther() {
        int cosOther = 0;
        for (int i = 0; i < i_param.size(); i++) {
            if (i_param.get(i).getDetail() == MyEnum.EDetail.OTHER.toString()) {
                cosOther = cosOther + Integer.valueOf(i_param.get(i).getSum());
            }
        }
        return cosOther;
    }

    //остаток на еду
    public int balanceFood() {
        int balFood = 0;
        balFood = financeFood() - costsFood();
        return balFood;
    }

    // количество дней в месяце
    public int myDay (String v_Month) {
        int i_year = getCurrentYear();
        int i_day = 1;
        int i_month = MyEnum.EMonth.valueOf(v_Month).ordinal();
        Calendar i_calendar = new GregorianCalendar(i_year,i_month-1,i_day);
        return i_calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    //лимит на еду
    public int financeFood() {

        return myDay(i_param.get(0).getMonth().toString())*500;
    }

    //лимит на платежи
    public int financePayment() {
        int leaseMos = 15000;       //аренда в Москве
        int servicesMos = 1000;     //коммунальные в Москве
        int servicesBr = 5000;      //коммунальные в Брянске
        int internetMos = 200;      //за интернет в Москве
        int internetBr = 400;       //за интернет в Брянске
        int mobileConnection = 500; //телефонная связь
        int metro = 1800;           //метро
        int mobileBankMos = 100;     //мобильный банк за московскую карту
        int finPayment = leaseMos + servicesMos + servicesBr + internetMos + internetBr + mobileConnection + metro + mobileBankMos;
        return finPayment;
    }

    //лимит на прочее
    public int financeOther() {
        int finOther = 7500;
	/*уборка лична¤ гигиена одежда косметика
	 средство дл¤ стирки 300,
	 средство дл¤ посуды 70,
	 мешки дл¤ мусора 150,
	 прокладки 100+100+100
	 туалетна¤ бумага 100
	 жидкое мыло 100+50
	 зубна¤ паста - 200
	 губки дл¤ посуды - 100/3
	 брит станок - 100
	 гель дл¤ душа - 150
	 шампунь - 200
	 лак дл¤ волос - 200
	 мусс дл¤ волос -200
	 */
        return finOther;
    }

    //остаток на платежи
    public int balancePayment() {
        int balPayment = 0;
        balPayment = financePayment() - costsPayment();
        return balPayment;
    }

    //остаток на прочее
    public int balanceOther() {
        int balOther = 0;
        balOther = financeOther() - costsOther();
        return balOther;
    }

    //крупные покупки
    public void bigCostsOther(int BigCosts) {
        System.out.print("Крупная покупка:" + "\t" + "сумма:\n");
        for (int i = 0; i < i_param.size(); i++) {
            if ((i_param.get(i).getDetail() == MyEnum.EDetail.OTHER.toString()) && (Integer.valueOf(i_param.get(i).getSum()) > BigCosts)) {
                System.out.printf("%15s", i_param.get(i).getName());
                System.out.printf("\t\t" + i_param.get(i).getSum() + "\n");
            }
        }
    }
}
