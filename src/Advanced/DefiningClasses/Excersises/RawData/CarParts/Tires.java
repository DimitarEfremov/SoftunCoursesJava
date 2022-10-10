package Advanced.DefiningClasses.Excersises.RawData.CarParts;

import java.util.ArrayList;
import java.util.List;

public class Tires {


    private List<Double> tirePressureList;
    private List<Integer> tireAgeList;



    public Tires(double tire1Pressure, int tire1Age, double tire2Pressure, int tire2Age, double tire3Pressure, int tire3Age, double tire4Pressure, int tire4Age) {
        this.tirePressureList = new ArrayList<>();
        this.tirePressureList.add(tire1Pressure);
        this.tirePressureList.add(tire2Pressure);
        this.tirePressureList.add(tire3Pressure);
        this.tirePressureList.add(tire4Pressure);

        this.tireAgeList = new ArrayList<>();
        this.tireAgeList.add(tire1Age);
        this.tireAgeList.add(tire2Age);
        this.tireAgeList.add(tire3Age);
        this.tireAgeList.add(tire4Age);
    }

    public boolean tirePressureTest(){

        int flatTires = 0;
        for (Double d : tirePressureList) {
            if (d < 1){
                flatTires++;
            }
        }
          return flatTires > 1;
    }

    public List<Double> getTirePressureList() {
        return tirePressureList;
    }

    public void setTirePressureList(List<Double> tirePressureList) {
        this.tirePressureList = tirePressureList;
    }

    public List<Integer> getTireAgeList() {
        return tireAgeList;
    }

    public void setTireAgeList(List<Integer> tireAgeList) {
        this.tireAgeList = tireAgeList;
    }
}
