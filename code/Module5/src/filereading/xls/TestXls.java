package filereading.xls;

public class TestXls {

	public static void main(String[] args) {
		ReadingXLSFile xls = new ReadingXLSFile();
		System.out.println(xls.xlsLocation);
		xls.readCellData();
		

	}

}
