package lesson9;

import java.util.Objects;

public class Magazines {
    private String nameOfMagazine;
    private int yearOfPublicationMagazine;
    private int numberMagazineInYear;
    private String namePublishingMagazine;

    public Magazines(){
    }

    public Magazines(String nameOfMagazine, int yearOfPublicationMagazine, int numberMagazineInYear, String namePublishingMagazine){
        this.nameOfMagazine = nameOfMagazine;
        this.yearOfPublicationMagazine = yearOfPublicationMagazine;
        this.numberMagazineInYear = numberMagazineInYear;
        this.namePublishingMagazine = namePublishingMagazine;
    }

    public String getNameOfMagazine() {
        return nameOfMagazine;
    }

    public void setNameOfMagazine(String nameOfMagazine) {
        this.nameOfMagazine = nameOfMagazine;
    }

    public int getYearOfPublicationMagazine() {
        return yearOfPublicationMagazine;
    }

    public void setYearOfPublicationMagazine(int yearOfPublicationMagazine) {
        this.yearOfPublicationMagazine = yearOfPublicationMagazine;
    }

    public int getNumberMagazineInYear() {
        return numberMagazineInYear;
    }

    public void setNumberMagazineInYear(int numberMagazineInYear) {
        this.numberMagazineInYear = numberMagazineInYear;
    }

    public String getNamePublishingMagazine() {
        return namePublishingMagazine;
    }

    public void setNamePublishingMagazine(String namePublishingMagazine) {
        this.namePublishingMagazine = namePublishingMagazine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Magazines magazines = (Magazines) o;

        if (yearOfPublicationMagazine != magazines.yearOfPublicationMagazine) return false;
        if (numberMagazineInYear != magazines.numberMagazineInYear) return false;
        if (!Objects.equals(nameOfMagazine, magazines.nameOfMagazine))
            return false;
        return Objects.equals(namePublishingMagazine, magazines.namePublishingMagazine);
    }

    @Override
    public int hashCode() {
        int result = nameOfMagazine != null ? nameOfMagazine.hashCode() : 0;
        result = 31 * result + yearOfPublicationMagazine;
        result = 31 * result + numberMagazineInYear;
        result = 31 * result + (namePublishingMagazine != null ? namePublishingMagazine.hashCode() : 0);
        return result;
    }
}
