package mainapp;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertRow {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        String sql = "INSERT INTO user_info (name, address) VALUES (?, ?);";
        jdbcTemplate.update(sql, "Harry Potter", "England");
        jdbcTemplate.update(sql, "Vin Diesel", "USA");
        jdbcTemplate.update(sql, "Dwayne Jonhson", "USA");
        jdbcTemplate.update(sql, "Doremon", "Japan");
        ((ClassPathXmlApplicationContext) ctx).close();
        System.out.println("Inserted!");
    }
}
