package commands;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ui.IEditorPart;

import edu.cmu.scs.fluorite.commands.ICommand;
import fluorite.commands.EHAbstractCommand;
import fluorite.commands.EHICommand;
import fluorite.model.EHEventRecorder;

public class ADocumentIdCommand extends EHAbstractCommand {

	private long timestamp;
	private String documentId;
	private long documentIdNumber;

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
		Map<String, String> attrMap = new HashMap<String, String>();
		attrMap.put("documentID", documentId);
		attrMap.put("documentIdNumber", Long.toString(documentIdNumber));
		return attrMap;
	}

	@Override
	public Map<String, String> getDataMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCommandType() {
		return "DocumentIdCommand";
	}

	@Override
	public String getName() {
		return "DocumentId";
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
//
//	@Override
//	public boolean combine(EHICommand anotherCommand) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public boolean execute(IEditorPart target) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setDocumentIdLong(long docId) {
		documentIdNumber = docId;
	}

	public void setDocumentIdString(String docId) {
		documentId = docId;
	}

	public long getDocumentIdLong() {
		return documentIdNumber;
	}

	public String getDocumentIdString() {
		return documentId;
	}

	@Override
	public boolean combine(ICommand arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
