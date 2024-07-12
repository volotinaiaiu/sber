package OOP;

class Book {
    private String title; // Название книги
    private Author author; // Автор книги
    private int year; // Год издания

    // Конструктор класса Book
    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    // Геттеры и сеттеры для переменных класса Book
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Метод toString для класса Book
    @Override
    public String toString() {
        return "Book[title=" + title + ", author=" + author + ", year=" + year + "]";
    }
}