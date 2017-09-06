package composite;

import java.util.ArrayList;
import java.util.List;

public class NoteGroup implements NoteComponent{

	List<NoteComponent> children;
	
	public NoteGroup(){
		children = new ArrayList<NoteComponent>();
	}
	
	public NoteGroup(NoteComponent... notes){
		children = new ArrayList<NoteComponent>();
		for (NoteComponent note : notes){
			children.add(note);
		}
	}
	
	@Override
	public double calculateNoteLength() {
		double value = 0;
		for(NoteComponent nc : children){
			value += nc.calculateNoteLength();
		}
		return value;
	}

	@Override
	public void add(NoteComponent... ncs) throws Exception {
		for (NoteComponent nc : ncs){
			children.add(nc);	
		}				
	}

	@Override
	public void remove(NoteComponent nc) throws Exception {
		if (children.contains(nc)){
			children.remove(nc);
		}else{
			throw new Exception("Group does not contain object ordered to remove");
		}		
	}

	@Override
	public NoteComponent getChild(int index) throws Exception {
		if (index>children.size()){
			throw new Exception("There is no object with such index number");
		}else
		{
			return children.get(index);	
		}
	}

	@Override
	public String toString(){
		String value = new String();
		
		value += "[";
		for (NoteComponent nc: children){
			value += nc.toString();
			value += ",";
		}
		value = value.substring(0, value.length()-1);
		value += "]";
		return value;
	}	
}
