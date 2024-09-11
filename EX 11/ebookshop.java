package javadbms;
import java.sql.*;
public class Javadbms {
    public static void main(String[] args) throws SQLException{
        Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/ebookshop");
        Statement st=c.createStatement();
        st.executeUpdate("insert into books values(8001, 'Java ABC', 'Kevin Jones', 15.55, 55)");
        st.executeUpdate("insert into books values(8002, 'Java XYZ', 'Kevin Jones',25.55, 55)");
        ResultSet rs=st.executeQuery("select * from books");
        while(rs.next())
        {
            System.out.print(" id "+rs.getInt(1));
            System.out.print(" title "+rs.getString(2));
            System.out.print(" author "+rs.getString(3));
            System.out.print(" price "+rs.getFloat(4));
            System.out.print(" qty "+rs.getInt(5)+"\n");
        }
        ResultSet rs1=st.executeQuery("select title, author, price, qty from books where author='Tan Ah Teck'");
        while(rs1.next())
        {
            System.out.print(" title "+rs1.getString(1));
            System.out.print(" author "+rs1.getString(2));
            System.out.print(" price "+rs1.getFloat(3));
            System.out.print(" qty "+rs1.getInt(4)+"\n");
        }
        st.executeUpdate("update books set price=((0.5*price)+price) where title='A Cup of Java'");
        st.executeUpdate("update set qty=0 ehere author='A Teaspoon of Java'");
        st.executeUpdate("delete from books where id=8001");
       
    }
}