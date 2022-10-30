package OOP.WorkingwithAbstraction.Lab.HotelReservation;

public enum Discounttype {
    VIP("VIP", 0.2),
    SECONDVISIT("SecondVisit", 0.1),
    NONE("None", 0)
    ;

    private String name;
    private double discount;

    Discounttype(String name, double discount) {
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
