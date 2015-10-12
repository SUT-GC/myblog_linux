package classtest;


import java.io.File;

import file.ImageDo;

public class ImageDoTest {
	public static void main(String[] args) {
		String url = "E:\\github\\myblog\\javaee_workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\myblog\\image\\journalcontent";
		File[] files = ImageDo.selectImages(url);
		System.out.println(files.length);
		for(File file: files){
			System.out.println(file.getName());
		}
	}
}
