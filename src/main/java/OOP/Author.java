package OOP;

public class Author {
    private String name;
    private String gender; // Пол автора
    private String email; // Электронная почта автора

    public Author(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author[name=" + name + ", gender=" + gender + ", email=" + email + "]";
    }
}






// Класс Main с методом main для демонстрации работы классов Author и Book

