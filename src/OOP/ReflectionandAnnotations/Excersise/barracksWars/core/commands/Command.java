package OOP.ReflectionandAnnotations.Excersise.barracksWars.core.commands;


import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.Executable;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.Repository;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable {

    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    public Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    public String[] getData() {
        return data;
    }

    public Repository getRepository() {
        return repository;
    }

    public UnitFactory getUnitFactory() {
        return unitFactory;
    }
}
