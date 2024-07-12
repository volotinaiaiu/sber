package OOP;



public class PizzaOrder {
    private String name;
    private Size size;
    private boolean sauce;
    private String address;
    private boolean orderAccepted;


    public PizzaOrder(String name, Size size, boolean sauce, String address) {
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.address = address;
        this.orderAccepted = false;
    }

    public void order() {
        if (!orderAccepted) {
            orderAccepted = true;
            System.out.println("Заказ принят. " + this.toString());
        } else {
            System.out.println("Заказ уже принят.");
        }
    }

    public void cancel() {
        if (orderAccepted) {
            orderAccepted = false;
            System.out.println("Заказ отменен.");
        } else {
            System.out.println("Заказ не был принят.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isSauce() {
        return sauce;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String sauceText = sauce ? "с соусом" : "без соуса";
        return size + " пицца «" + name + "» " + sauceText + " на адрес " + address + ".";
    }


}
