package OOP.WorkingwithAbstraction.Lab.HotelReservation;

public enum Season {
    SUMMER("Summer", 4),
    AUTUMN("Autumn", 1),
    WINTER("Winter", 3),
    SPRING("Spring", 2);

    private String name;
    private int coefficient;


    Season(String name, int coefficient) {
        this.name = name;
        this.coefficient = coefficient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
}
