package OOP.WorkingwithAbstraction.Lab.HotelReservation;

public class PriceCalculator {

    public static double priceOfHoliday(double pricePerDay, int daysOfVacation, Season season, Discounttype discounttype){

        double price = pricePerDay * daysOfVacation;

        price = price * season.getCoefficient();

        price = price - (price* discounttype.getDiscount());

        return price;

    }

}
