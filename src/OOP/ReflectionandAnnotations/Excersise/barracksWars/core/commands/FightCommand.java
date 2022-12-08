package OOP.ReflectionandAnnotations.Excersise.barracksWars.core.commands;

import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.Repository;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.UnitFactory;

public class FightCommand extends Command{


    public FightCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
            return "fight";
        }
    }

