package commands;

import fluorite.commands.EHCompilationCommand;

public class ADocumentSpellcheckCommand extends EHCompilationCommand {

	@Override
	public String getCommandType() {
		return "DocumentSpellcheckCommand";
	}

	@Override
	public String getName() {
		return "Spellcheck";
	}

}
