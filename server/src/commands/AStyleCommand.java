package commands;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ui.IEditorPart;

import edu.cmu.scs.fluorite.commands.ICommand;
import fluorite.commands.EHAbstractCommand;
import fluorite.model.EHEventRecorder;

public abstract class AStyleCommand extends EHAbstractCommand implements StyleCommand {

	private int startIndex;
	private int endIndex;

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int newStartIndex) {
		startIndex = newStartIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(int newEndIndex) {
		endIndex = newEndIndex;
	}

	@Override
	public void dump() {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, String> getAttributesMap() {
		Map<String, String> attrMap = new HashMap<String, String>();
		attrMap.put("startIndex", Integer.toString(startIndex));
		attrMap.put("endIndex", Integer.toString(endIndex));
		return attrMap;
	}

	@Override
	public Map<String, String> getDataMap() {
		return null;
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
	public boolean combine (ICommand anotherCommand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean execute(IEditorPart target) {
		// TODO Auto-generated method stub
		return false;
	}

}
