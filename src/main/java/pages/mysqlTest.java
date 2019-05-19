package pages;

import  mysql.mysql;


public class mysqlTest {
    public static void main(String[] args){
        mysql mysql1=new mysql();
        mysql1.mysqlConnection("jdbc:mysql://localhost:3306/testdatabase","root","root#@123");
      String result= mysql1.getData("select * from table1 inner join table2 on table1.id=table2.id and table1.name=table2.name limit 2",
"name");
        System.out.println(result);
    }


}
