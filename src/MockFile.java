import static org.mockito.Mockito.*;

import java.io.File;

import org.junit.Test;
import org.mockito.*;

public class MockFile {
	@Test
	public void test1() {
		FileSearchA t= new FileSearchA();
		boolean withMockObjects = true;
		if (withMockObjects) {
			FileSearchA s1Mock = Mockito.mock(FileSearchA.class);
			doThrow(new RuntimeException()).when(s1Mock.searchFile(null));

		}
	}
}
