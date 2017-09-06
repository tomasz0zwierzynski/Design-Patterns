

import composite.*;
import composite.note.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		NoteGroup bar1 = new NoteGroup();

		try {
			bar1.add(new NoteGroup(new Note(2), new Note(3)),new NoteGroup(new Note(1)));
			bar1.add(new NoteGroup(new Note(4), new Note(1.5)), new WholeNote());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(bar1.toString());
		System.out.println(bar1.calculateNoteLength());
		
	}

}
