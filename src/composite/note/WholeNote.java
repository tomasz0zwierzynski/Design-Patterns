package composite.note;

import composite.Note;

public class WholeNote extends Note{

	public WholeNote() {
		super(4);
	}
	
	@Override
	public String toString(){
		return "O";
	}
}
