package lesson20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_40?user=root&password=DomoVeno4ek");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT t.id, t.name_of_tern as nameTerm, t.duration, d.id as id_disc, d.disciplina from tern_disciplina as td\n" +
                    "left join term as t on td.id_term = t.id\n" +
                    "left join disciplina as d on td.id_disciplina = d.id\n" +
                    "where td.id_term = 1 and d.status = '1'");
            Term term = null;
            while (rs.next()){
                if(term == null){
                    term = new Term();
                    term.setId(rs.getInt("id"));
                    term.setTerm(rs.getString("nameTerm"));
                    term.setDuration(rs.getString("duration"));
                }
                Disciplina disciplina = new Disciplina();
                disciplina.setId(rs.getInt("id_disc"));
                disciplina.setDisciplina(rs.getString("disciplina"));
                term.addDisciplina(disciplina);
            }
            System.out.println(term);
            for (Disciplina d: term.getDisciplinas()){
                System.out.println(d);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
