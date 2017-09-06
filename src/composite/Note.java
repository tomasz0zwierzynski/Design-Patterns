package composite;

public class Note implements NoteComponent{

	private double length;
	
	public Note(double len){
		length = len;
	}
	
	@Override
	public double calculateNoteLength() {
		return length;
	}

	@Override
	public void add(NoteComponent... nc) throws Exception{
		throw new NoSuchMethodException();			
	}

	@Override
	public void remove(NoteComponent nc) throws Exception{
		throw new NoSuchMethodException();	
	}

	@Override
	public NoteComponent getChild(int index) throws Exception{
		throw new NoSuchMethodException();	
	}

	@Override
	public String toString(){
		return "(" + length + ")";
	}
	
}
