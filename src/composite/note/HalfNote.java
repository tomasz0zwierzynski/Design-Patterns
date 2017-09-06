package composite.note;

import composite.Note;

public class HalfNote extends Note{

	public HalfNote() {
		super(2);
	}
	
	@Override
	public String toString(){
		return "o";
	}
	
}
