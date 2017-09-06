package composite;

import static org.junit.Assert.*;

import org.junit.*;

import composite.note.*;

public class CompositeTest {

	//I know there's no sense to test such simple thing, but it's my first JUnit test method
	@Test
	public void testThrowNoSuchMethodException(){
		Note note = new Note(1);
		int exceptionsCounter = 0;
		
		try{
			note.add(new Note(1));
			fail("Exception did not thrown: Note.add() ");
		}catch(Exception ex){
			if (ex instanceof NoSuchMethodException){
				exceptionsCounter++;
			}
		}
		try{
			note.remove(new Note(1));
			fail("Exception did not thrown: Note.remove() ");
		}catch(Exception ex){
			if (ex instanceof NoSuchMethodException){
				exceptionsCounter++;
			}
		}
		try{
			note.getChild(0);
			fail("Exception did not thrown: Note.remove() ");
		}catch(Exception ex){
			if (ex instanceof NoSuchMethodException){
				exceptionsCounter++;
			}
		}
		
		if (exceptionsCounter != 3){
			fail("Wrong exceptions thrown");
		}else{
			assertTrue(true);
		}
	}
	
	@Test
	public void testSingleLayerNoteGroup(){
		
		Note firstNote = new QuarterNote();
		Note secondNote = new EighthNote();
		Note thirdNote = new Note(0.33);
		
		NoteGroup notes = new NoteGroup();
		
		try{
			notes.add(firstNote);
			notes.add(secondNote);
			notes.add(thirdNote);
		}catch (Exception ex){
			fail("Exception message: [" + ex.getMessage() + "] shown at operation NoteGroup.add() ");
		}
		
		assertEquals("Notes value wrongly calculated by NoteGroup.calculateLenght()",1.83,notes.calculateNoteLength(),0);
		
		try{
			notes.remove(thirdNote);
		}catch(Exception ex){
			fail("Note.remove thrown exception where it should not: [" + ex.getMessage() + "]");
		}
		
		assertEquals("NoteGroup did not properly removed object",1.5,notes.calculateNoteLength(),0);
		
		try{
			Note fakeNote = new Note(1);
			notes.remove(fakeNote);
			fail("Note.remove should throw an exception!");
		}catch(Exception ex){
			assertTrue(true);
		}
		
		assertEquals("NoteGroup did not properly removed object",1.5,notes.calculateNoteLength(),0);
		
		
		
	}
	
}
