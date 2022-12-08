package OOP.ReflectionandAnnotations.Excersise.barracksWars.core.commands;

import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.Repository;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.Unit;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class AddCommand extends Command{


    public AddCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException {
        String unitType = this.getData()[1];
        Unit unitToAdd = getUnitFactory().createUnit(unitType);
        getRepository().addUnit(unitToAdd);
        return unitType + " added!";
    }
}
