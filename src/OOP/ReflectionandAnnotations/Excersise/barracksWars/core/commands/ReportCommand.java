package OOP.ReflectionandAnnotations.Excersise.barracksWars.core.commands;

import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.Repository;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class ReportCommand extends Command{
    public ReportCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException {

        return getRepository().getStatistics();

    }
}
