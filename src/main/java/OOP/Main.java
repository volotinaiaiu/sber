package OOP;

public class Main {
    static private void testCircle1(){
        Circle1 circle = new Circle1(5.0, "красный");
        System.out.println(circle);
    }

    static private void testBook(){
        Author author = new Author("Lermontov", "male", "yanavolotina111@mail.ru");
        Book book = new Book("Mtsiri", author, 1840);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getYear());
        System.out.println(book.getAuthor().getName());
        System.out.println(book.getAuthor().getEmail());
        System.out.println(book.getAuthor().getGender());
        System.out.println(book);
    }

    static private  void testPhone(){
        Phone myPhone = new Phone("123456789", "ModelX", 150.0);

        myPhone.receiveCall("Алексей");
        myPhone.receiveCall("Мария", "987654321");
        System.out.println(myPhone.getNumber());
        myPhone.sendMessage("111222333", "444555666", "777888999");
        System.out.println(myPhone);
    }

    static private void testPizza(){
        PizzaOrder order = new PizzaOrder("Аль-Капчоне", Size.BIG, true, "Ярославская 101");
        order.order();
        order.order();
        order.cancel();
    }
    static private void testMatrix(){
        Matrix matrix1 = new Matrix(2, 3);
        matrix1.setValue(0, 0, 1.0);
        matrix1.setValue(0, 1, 2.0);
        matrix1.setValue(0, 2, 3.0);
        matrix1.setValue(1, 0, 4.0);
        matrix1.setValue(1, 1, 5.0);
        matrix1.setValue(1, 2, 6.0);

        Matrix matrix2 = new Matrix(2, 3);
        matrix2.setValue(0, 0, 7.0);
        matrix2.setValue(0, 1, 8.0);
        matrix2.setValue(0, 2, 9.0);
        matrix2.setValue(1, 0, 10.0);
        matrix2.setValue(1, 1, 11.0);
        matrix2.setValue(1, 2, 12.0);

        Matrix sumMatrix = matrix1.add(matrix2);
        Matrix productMatrix = matrix1.multiply(2.0);

        System.out.println("Сумма матриц:");
        sumMatrix.print();

        System.out.println("Произведение матрицы на число:");
        productMatrix.print();
    }

    public static void main(String[] args) {
        testCircle1();
        testMatrix();
        testPhone();
        testPizza();
        testBook();
    }
}
