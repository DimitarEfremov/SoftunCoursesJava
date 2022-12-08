package OOP.ReflectionandAnnotations.Excersise.barracksWars.core.commands;

import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.CommandInterpreter;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.Executable;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.Repository;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CommandInterpreterIMPL implements CommandInterpreter {

    private final static String COMMAND_PACKAGE = "OOP.ReflectionandAnnotations.Excersise.barracksWars.core.commands.";
    private Repository repository;
    private UnitFactory unitFactory;

    public CommandInterpreterIMPL(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) {

        String commandClassName = parseCommandToClassName(commandName);
        Executable command = null;

        try {
            Class commandClass = Class.forName(commandClassName);
            Constructor<Command> constructor = commandClass.getDeclaredConstructor(String[].class, Repository.class, UnitFactory.class);
            command = constructor.newInstance(data, repository, unitFactory);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return command;

    }

    private String parseCommandToClassName(String command){
        return COMMAND_PACKAGE + command.substring(0,1).toUpperCase() + command.substring(1) + "Command";

    }
}
