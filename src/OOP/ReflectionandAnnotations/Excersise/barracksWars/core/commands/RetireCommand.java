package OOP.ReflectionandAnnotations.Excersise.barracksWars.core.commands;

import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.Repository;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class RetireCommand extends Command{
    public RetireCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException {
        try {
            String unitType = getData()[1];
            getRepository().removeUnit(unitType);
            return unitType + " retired!";
        } catch (IllegalArgumentException e){
           return e.getMessage();
        }
    }
}
