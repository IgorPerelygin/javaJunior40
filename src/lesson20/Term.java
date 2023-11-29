package lesson20;

import java.util.ArrayList;
import java.util.Objects;

public class Term {
    private int id;
    private String term;
    private String duration;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Term() {
    }

    public void addDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Term term1 = (Term) o;

        if (id != term1.id) return false;
        if (!Objects.equals(term, term1.term)) return false;
        if (!Objects.equals(duration, term1.duration)) return false;
        return Objects.equals(disciplinas, term1.disciplinas);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (term != null ? term.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (disciplinas != null ? disciplinas.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Term{" +
                "id=" + id +
                ", term='" + term + '\'' +
                ", duration='" + duration + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
