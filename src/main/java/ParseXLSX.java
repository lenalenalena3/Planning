import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ParseXLSX implements ParseFile {

    String i_filename, i_month, i_fileXLSX;

    public ParseXLSX(String v_filename, String v_month) {
        i_filename = v_filename;
        i_month = v_month;
    }

    @Override
    public ArrayList<TestParam> parse() {
        ArrayList<TestParam> i_params = new ArrayList<TestParam>();
        try {
            File i_fileXLSX = new File(i_filename);
            XSSFWorkbook i_workbook = new XSSFWorkbook(new FileInputStream(i_fileXLSX));
            XSSFSheet i_sheet = i_workbook.getSheetAt(0);
            for (int i = 1; i < i_sheet.getLastRowNum() + 1; i++) {
                XSSFRow i_row = i_sheet.getRow(i);
                if (i_row.toString() == i_month) {
                    i_params.add( new TestParam(
                            i_row.getCell(1).toString(),
                            Integer.parseInt(i_row.getCell(2).toString()),
                            i_row.getCell(3).toString(),
                            i_row.getCell(4).toString(),
                            i_row.getCell(5).toString(),
                            Integer.parseInt(i_row.getCell(6).toString()))
                    );
                }
            }
            i_workbook.close();
        } catch (Exception e) {
            System.out.println("ParseError: " + e.getMessage());
        }
        return i_params;
    }
}
