package OOP.WorkingwithAbstraction.Excersise.Lights;

public class TrafficLight {

    private Color colour;

    public TrafficLight(Color colour) {
        this.colour = colour;
    }

    public void changeColor() {
        switch (this.colour) {
            case RED:
                this.colour = Color.GREEN;
                break;
            case GREEN:
                this.colour = Color.YELLOW;
                break;
            case YELLOW:
                this.colour = Color.RED;
                break;

        }

    }

    public String getColour() {
        return colour.name();
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }
}
