package stepDefinitions.dbStepDefs.DBTests;

import org.junit.Test;
import utilities.DatabaseUtility;

import java.util.List;

public class DBTest {
    @Test
    public void test01() {
        DatabaseUtility.createConnection();
     // String query="select*from physician";
     // System.out.println(DatabaseUtility.getColumnNames(query)+"\n");
     // System.out.println(DatabaseUtility.getColumnData(query, "phone")+"\n");
     // System.out.println(DatabaseUtility.getCellValuewithRowsAndCells(query, 10, 5)+"\n");
     // //14733 id li datanin bilgileri
     // String query1="select * from physician where id =147333";
     // System.out.println(DatabaseUtility.getCellValue(query1)+"\n");
     // System.out.println(DatabaseUtility.getSecondCellValue(query1)+"\n");

     // System.out.println(DatabaseUtility.getRowMap(query1));

     // System.out.println("=========ID LIST==========");
     // List<Object> idList=DatabaseUtility.getColumnData(query,"id");
     // System.out.println(idList+"\n");
     // String fileName="src/test/resources/testData/DoktorID";

        String query3="select * from jhi_user";

        List<String>columnNames=DatabaseUtility.getColumnNames(query3);
        System.out.println("columnNames = " + columnNames); //column bilgilerini getirir

       // for (int i = 0; i <columnNames.size() ; i++) {  //butun coumn'daki bilgileri getirir
       //     List<Object> allData=DatabaseUtility.getColumnData(query3,columnNames.get(i));
       //     System.out.println(allData);
       // }

        List<Object> allData=DatabaseUtility.getColumnData(query3,"ssn");//ssn column'daki butun cell'leri getirir
        System.out.println("alldata"+allData);


        DatabaseUtility.closeConnection();
    }
}
