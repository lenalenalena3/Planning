public class TestParam {

    private String i_Month;
    private int i_Day;
    private String i_Tip;
    private String i_Detail;
    private String i_Name;
    private int i_Sum;

    public TestParam() {
        this(MyEnum.EMonth.UNDEF.toString(),0,MyEnum.ETip.UNDEF.toString(),MyEnum.EDetail.UNDEF.toString(),"",0);
    }

    public TestParam(String v_Month, int v_Day, String v_Tip, String v_Detail, String v_Name, int v_Sum) {
        i_Month = v_Month;
        i_Day = v_Day;
        i_Tip = v_Tip;
        i_Detail = v_Detail;
        i_Name = v_Name;
        i_Sum = v_Sum;
    }

    public String getMonth() {
        return i_Month;
    }

    public void setMonth(String v_month) {
        i_Month = v_month;
    }

    public int getDay() {
        return i_Day;
    }

    public void setDay(int v_Day) {
        i_Day = v_Day;
    }

    public String getTip() {
        return i_Tip;
    }

    public void setTip(String v_Tip) {
        i_Tip = v_Tip;
    }

    public String getDetail() {
        return i_Detail;
    }

    public void setDetail(String v_Datail) {
        i_Detail = v_Datail;
    }

    public String getName() {
        return i_Name;
    }

    public void setName(String v_Name) {
        i_Name = v_Name;
    }

    public int getSum() {
        return i_Sum;
    }

    public void setSum(int v_Sum) {
        i_Sum = v_Sum;
    }
}