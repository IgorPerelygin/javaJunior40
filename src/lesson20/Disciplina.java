package lesson20;

import java.util.Objects;

public class Disciplina {
    private int id;
    private String disciplina;
    private int status = 1;

    public Disciplina() {
    }

    public Disciplina(int id, String disciplina, int status) {
        this.id = id;
        this.disciplina = disciplina;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Disciplina that = (Disciplina) o;

        if (id != that.id) return false;
        if (status != that.status) return false;
        return Objects.equals(disciplina, that.disciplina);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (disciplina != null ? disciplina.hashCode() : 0);
        result = 31 * result + status;
        return result;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", disciplina='" + disciplina + '\'' +
                ", status=" + status +
                '}';
    }
}
