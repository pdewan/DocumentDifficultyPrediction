package commands;

import java.util.Map;

import org.eclipse.ui.IEditorPart;

import edu.cmu.scs.fluorite.commands.ICommand;
import fluorite.commands.EHAbstractCommand;
import fluorite.model.EHEventRecorder;

public class AWindowFocusCommand extends EHAbstractCommand {

	private long timestamp;

	@Override
	public void setTimestamp(long newTimestamp) {
		timestamp = newTimestamp;
	}

	@Override
	public void dump() {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, String> getAttributesMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getDataMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCommandType() {
		return "DocumentWindowFocusCommand";
	}

	@Override
	public String getName() {
		return "WindowFocus";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCategory() {
		return EHEventRecorder.MacroCommandCategory;
	}

	@Override
	public String getCategoryID() {
		return EHEventRecorder.MacroCommandCategoryID;
	}

	@Override
	public long getTimestamp() {
		return timestamp;
	}

	@Override
	public boolean combine(ICommand anotherCommand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean execute(IEditorPart target) {
		// TODO Auto-generated method stub
		return false;
	}

}
