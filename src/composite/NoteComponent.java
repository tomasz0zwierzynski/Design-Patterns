package composite;

public interface NoteComponent {
	
	double calculateNoteLength();
	String toString();
	void add(NoteComponent... nc) throws Exception;
	void remove(NoteComponent nc) throws Exception;
	NoteComponent getChild(int index) throws Exception;
	
}
