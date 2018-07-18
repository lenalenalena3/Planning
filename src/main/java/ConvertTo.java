public class ConvertTo {

    public static String convertToEMonth(String v_month) {

        String i_month = MyEnum.EMonth.UNDEF.toString();

        switch (v_month.toLowerCase()) {
            case "январь":
                i_month = MyEnum.EMonth.JANUARY.toString();
                break;
            case "февраль":
                i_month = MyEnum.EMonth.FEBRUARY.toString();
                break;
            case "март":
                i_month = MyEnum.EMonth.MARCH.toString();
                break;
            case "апрель":
                i_month = MyEnum.EMonth.APRIL.toString();
                break;
            case "май":
                i_month = MyEnum.EMonth.MAY.toString();
                break;
            case "июнь":
                i_month = MyEnum.EMonth.JUNE.toString();
                break;
            case "июль":
                i_month = MyEnum.EMonth.JULY.toString();
                break;
            case "август":
                i_month = MyEnum.EMonth.AUGUST.toString();
                break;
            case "сентябрь":
                i_month = MyEnum.EMonth.SEPTEMBER.toString();
                break;
            case "октябрь":
                i_month = MyEnum.EMonth.OCTOBER.toString();
                break;
            case "ноябрь":
                i_month = MyEnum.EMonth.NOVEMBER.toString();
                break;
            case "декабрь":
                i_month = MyEnum.EMonth.DECEMBER.toString();
                break;
            default:
                i_month = MyEnum.EMonth.UNDEF.toString();
                break;
        }
        return i_month;
    }

    public static String convertToETip(String v_tip) {

        String i_tip = MyEnum.ETip.UNDEF.toString();

        switch (v_tip.toUpperCase()) {
            case "Д":
                i_tip = MyEnum.ETip.PLUS.toString();
                break;
            case "Р":
                i_tip = MyEnum.ETip.MINUS.toString();
                break;
            default:
                i_tip = MyEnum.ETip.UNDEF.toString();
                break;
        }
        return i_tip;
    }

    public static String convertToEDetail(String v_detail) {

        String i_detail = MyEnum.EDetail.UNDEF.toString();

        switch (v_detail.toLowerCase()) {
            case "еда":
                i_detail = MyEnum.EDetail.FOOD.toString();
                break;
            case "платежи":
                i_detail = MyEnum.EDetail.PAYMENT.toString();
                break;
            case "прочее":
                i_detail = MyEnum.EDetail.OTHER.toString();
                break;
            default:
                i_detail = MyEnum.EDetail.UNDEF.toString();
                break;
        }
        return i_detail;
    }
}
