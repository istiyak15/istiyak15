package genericLibriries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Md istiyak
 *
 */

public class ExcellUtil {
	public File abspath=new File("/home/onebill/Desktop/JAVA/OneBill/src/test/resources/data/testdata.xlsx");
	public Workbook workbook = null;
	public  Row row = null;
	public  Cell cell = null;
	public Sheet sheet=null;
	public File excellpath=new File("/home/onebill/Desktop/JAVA/OneBill/src/test/resources/data/testdata.xlsx");

	public String[][] getExcelData(String sheetName){
		try {
			FileInputStream fis=new FileInputStream(excellpath);
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int phyRowCount = workbook.getSheet(sheetName).getPhysicalNumberOfRows();
		int phyCellCount = workbook.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();
		String[][] arrofData = new String[phyRowCount][phyCellCount];
		for(int i=0;i<phyRowCount;i++) {
			for(int j=0;j<phyCellCount;j++) {
				try {
					arrofData[i][j]=workbook.getSheet(sheetName).getRow(i).getCell(j).getStringCellValue();
				}catch (NullPointerException e) {
				}
			}
		} 
		return arrofData;
	}

	public String getdataFromColumn(String sheetname, String columnName, int rownum) {
		try {
			FileInputStream fis=new FileInputStream(abspath);
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int colNum=-1;
		sheet = workbook.getSheet(sheetname);
		row=sheet.getRow(rownum-1);
		for (int i = 0; i <row.getLastCellNum(); i++) {
			if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(columnName))
				colNum=i;
		}
		row=sheet.getRow(rownum);
		cell=row.getCell(colNum);
		return cell.getStringCellValue();
	}

	public String getAlldataFromColumn(String sheetname, String columnName) {
		try {
			FileInputStream fis=new FileInputStream(abspath);
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int colNum=0;
		sheet=workbook.getSheet(sheetname);
		row=sheet.getRow(0);
		for(int r = 1; r < sheet.getLastRowNum(); r++) {
			for (int i = 0; i < row.getLastCellNum(); i++) {
				if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(columnName))
					colNum=i;
			}
			String data = sheet.getRow(r).getCell(colNum).getStringCellValue();
			System.out.println(data);
		}
		return columnName;
	}

	public static void main(String[] args) {
		ExcellUtil e=new ExcellUtil();
		String data = e.getdataFromColumn("Leadssheet", "FirstName",1);
		System.out.println(data);
	}

}