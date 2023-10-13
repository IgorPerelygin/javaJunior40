package lesson9;

import java.util.Objects;

public class Books {
    // характеристики книг
    private String nameBook;
    private String nameAuthorBook;
    private int yearOfPublicationBook;
    private int numberOfPagesBook;
    private String namePublishingBook;

    public Books() {
    }
    public Books(String nameBook, String nameAuthorBook, int yearOfPublicationBook, int numberOfPagesBook, String namePublishingBook){
        this.nameBook = nameBook;
        this.nameAuthorBook = nameAuthorBook;
        this.yearOfPublicationBook = yearOfPublicationBook;
        this.numberOfPagesBook = numberOfPagesBook;
        this.namePublishingBook = namePublishingBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameAuthorBook() {
        return nameAuthorBook;
    }

    public void setNameAuthorBook(String nameAuthorBook) {
        this.nameAuthorBook = nameAuthorBook;
    }

    public int getYearOfPublicationBook() {
        return yearOfPublicationBook;
    }

    public void setYearOfPublicationBook(int yearOfPublicationBook) {
        this.yearOfPublicationBook = yearOfPublicationBook;
    }

    public int getNumberOfPagesBook() {
        return numberOfPagesBook;
    }

    public void setNumberOfPagesBook(int numberOfPagesBook) {
        this.numberOfPagesBook = numberOfPagesBook;
    }

    public String getNamePublishingBook() {
        return namePublishingBook;
    }

    public void setNamePublishingBook(String namePublishingBook) {
        this.namePublishingBook = namePublishingBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books = (Books) o;

        if (yearOfPublicationBook != books.yearOfPublicationBook) return false;
        if (numberOfPagesBook != books.numberOfPagesBook) return false;
        if (!Objects.equals(nameBook, books.nameBook)) return false;
        if (!Objects.equals(nameAuthorBook, books.nameAuthorBook))
            return false;
        return Objects.equals(namePublishingBook, books.namePublishingBook);
    }

    @Override
    public int hashCode() {
        int result = nameBook != null ? nameBook.hashCode() : 0;
        result = 31 * result + (nameAuthorBook != null ? nameAuthorBook.hashCode() : 0);
        result = 31 * result + yearOfPublicationBook;
        result = 31 * result + numberOfPagesBook;
        result = 31 * result + (namePublishingBook != null ? namePublishingBook.hashCode() : 0);
        return result;
    }


}
