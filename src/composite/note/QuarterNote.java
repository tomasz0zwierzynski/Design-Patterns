package composite.note;

import composite.Note;

public class QuarterNote extends Note{

	public QuarterNote() {
		super(1);
	}
	
	@Override
	public String toString(){
		return "q";
	}
	
}
