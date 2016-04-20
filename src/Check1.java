import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;

import org.junit.Test;

public class Check1 {
	@Test
	public void test1() {
		FileSearchA t = new FileSearchA();
		ArrayList<File> test = new ArrayList<File>();
		t.printFilesWithA(test, "");
	}

	@Test
	public void test2() {
		FileSearchA t = new FileSearchA();
		ArrayList<File> test = new ArrayList<File>();
		t.printFilesWithA(test, "F://A");
	}
	

}
