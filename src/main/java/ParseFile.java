import java.io.File;
import java.util.ArrayList;

public class ParseFile {
    String m_filename, m_myMonth;

    public ParseFile(String a_filename, String a_myMonth) {
        m_filename = a_filename;
        m_myMonth = a_myMonth;
    }

    public ArrayList<TestParam> Parse() {
        ArrayList<TestParam> ret_params = new ArrayList<TestParam>();
        try {
           // File m_file=new File(m_filename);
           // Workbook myExcelBook = Workbook.getWorkbook(m_file);
           // Shell myExcelSheet = myExcelBook.getSheet(0);
           // for (int i=1;i<myExcelSheet.getRows();i++) {
           //     Cell mycellMonth=myExcelSheet.getCell(0, i);
           //     if (mycellMonth.getContents().equals(m_myMonth)){
            //        TestParameter ret_param = new TestParameter();
            //        String cellMonth=myExcelSheet.getCell(0, i).getContents();
              //      ret_param.m_Month=ConvertTo.ConvertToEMonth(cellMonth);
                //    int cellDay=Integer.valueOf(myExcelSheet.getCell(1, i).getContents());
                  //  ret_param.m_Day=cellDay;
                 //   String cellTip=myExcelSheet.getCell(2, i).getContents();
                  //  ret_param.m_Tip=ConvertTo.ConvertToETip(cellTip);
                  //  String cellDetail=myExcelSheet.getCell(3, i).getContents();
                  //  ret_param.m_Detail=ConvertTo.ConvertToEDetail(cellDetail);
                   // String cellName=myExcelSheet.getCell(4, i).getContents();
                    //ret_param.m_Name=cellName;
                    //int cellSum=Integer.valueOf(myExcelSheet.getCell(5, i).getContents());
                    //ret_param.m_Sum=cellSum;
                   // ret_params.add(ret_param);
          //      }
          //  }
        }
        catch (Exception e) {
            System.out.println("ParserError: " + e.getMessage());
        }
        return ret_params;
    }
}
