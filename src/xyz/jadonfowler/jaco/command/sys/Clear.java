/**
 * jaco was made by Jadon Fowler.
 * This file is licensed under the MIT License.
 */
package xyz.jadonfowler.jaco.command.sys;

import xyz.jadonfowler.jaco.Jaco;
import xyz.jadonfowler.jaco.command.Command;

/**
 * @author Jadon "Phase" Fowler on Feb 22, 2015
 */
public class Clear extends Command{

	/**
	 * @see xyz.jadonfowler.jaco.command.Command#exec(java.lang.String, java.lang.String[])
	 */
	@Override
	public void exec(String in, String[] args) {
		if(args[0].equals("clear"))
			Jaco.getConsole().clear();
	}

	/**
	 * @see xyz.jadonfowler.jaco.command.Command#getCommand()
	 */
	@Override
	public String getCommand() {
		return "clear";
	}

}