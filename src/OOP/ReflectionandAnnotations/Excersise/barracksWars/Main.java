package OOP.ReflectionandAnnotations.Excersise.barracksWars;

import OOP.ReflectionandAnnotations.Excersise.barracksWars.core.commands.CommandInterpreterIMPL;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.Repository;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.Runnable;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.UnitFactory;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.core.Engine;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.core.factories.UnitFactoryImpl;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();
        CommandInterpreterIMPL commandInterpreterIMPL = new CommandInterpreterIMPL(repository,unitFactory);

        Runnable engine = new Engine(commandInterpreterIMPL);
        engine.run();
    }
}
