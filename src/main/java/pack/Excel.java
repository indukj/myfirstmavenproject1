package pack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excel {

    XSSFSheet sh;

    public Excel() throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\SujithMohanan\\Documents\\Book1.xlsx");
        XSSFWorkbook w = new XSSFWorkbook(file);
        sh = w.getSheet("Sheet1");
    }

    public String readData(int i, int j) {
        XSSFRow r = sh.getRow(i);
        Cell c = r.getCell(j);
        switch (c.getCellType()) {
            case Cell.CELL_TYPE_NUMERIC: {
                double a = c.getNumericCellValue();
                return String.valueOf(a);
            }
            case Cell.CELL_TYPE_STRING: {
                return c.getStringCellValue();
            }
        }
        return null;
    }
}