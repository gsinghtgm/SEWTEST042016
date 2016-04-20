import java.io.File;
import java.util.ArrayList;

public class FileSearchA {
	ArrayList<File> matches;
	public ArrayList<File> searchFile(String pfad) {
		File dir=new File(pfad);
		String find = "a";
		File[] files = dir.listFiles();
		ArrayList<File> matches = new ArrayList<File>();
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				if (files[i].getName().toLowerCase().contains(find)) {
					matches.add(files[i]);

				}
				if (files[i].isDirectory()) {
					String d=files[i].toString();
					matches.addAll(searchFile(d));
				}
			}
		}
		return matches;
	}

	public void printFilesWithA(ArrayList array, String f) {
		array = searchFile(f);
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
			String s = array.get(i).toString();
			}
		}
	}

