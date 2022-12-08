package OOP.ReflectionandAnnotations.Excersise.barracksWars.core;

import OOP.ReflectionandAnnotations.Excersise.barracksWars.core.commands.CommandInterpreterIMPL;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.*;
import OOP.ReflectionandAnnotations.Excersise.barracksWars.interfaces.Runnable;
import jdk.jshell.spi.ExecutionControl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Engine implements Runnable {


	private CommandInterpreterIMPL commandInterpreterIMPL;

	public Engine(CommandInterpreterIMPL commandInterpreterIMPL) {

		this.commandInterpreterIMPL = commandInterpreterIMPL;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				String[] data = input.split("\\s+");
				String commandName = data[0];
				Executable executable = commandInterpreterIMPL.interpretCommand(data,commandName);
				String result = executable.execute();
				if (result.equals("fight")) {
					break;
				}
				System.out.println(result);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException | ExecutionControl.NotImplementedException e) {
				e.printStackTrace();
			}
		}
	}

}
