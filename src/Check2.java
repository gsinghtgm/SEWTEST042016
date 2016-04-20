import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;

import org.junit.Test;

public class Check2 {
	@Test
	public void test3() {
		FileSearchA t = new FileSearchA();
		ArrayList<File> test = new ArrayList<File>();
		t.printFilesWithA(test, "F://Test//Test//Test");
	}
}
