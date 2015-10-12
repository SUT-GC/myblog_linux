package file;

import java.io.File;

public class ImageDo {
	/*
	 * 1
	 * 功能: 查询出url下所有的图片名称
	 * 方法名:  selectImages
	 * 参数: String url
	 * 返回值: File[] files
	 */
	public static File[] selectImages(String url){
		File[] files = null;
		File parentfile = new File(url);
		files = parentfile.listFiles();
		return files;
	}
	/*
	 * 2
	 * 功能: 根据传入的url删除文件
	 * 方法名: deleteImage
	 * 参数: String url
	 * 返回值:int result
	 * -1:执行文件创建错误
	 * 1: 删除成功
	 * 0: 文件不存在
	 */
	public static int deleteImage(String url){
		int result = -1;
		File image = new File(url);
		if(image.exists()){
			image.delete();
			result = 1;
		}else{
			result = 0;
		}
		return result;
	}
}
