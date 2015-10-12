package other;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tool {
	
	/*
	 * 1
	 * 功能: 将日志中的classify数字转换为汉字
	 */
	public static String ClassifyNumToClassify(int classifynum){
		String result = "";
		switch (classifynum){
		case 1: result = "java"; break;
		case 2: result = "算法"; break;
		case 3: result = "Html/css/js"; break;
		case 4: result = "生活随笔"; break;
		case 5: result = "读书笔记"; break;
		case 6: result = "其他"; break;
		}
		return result;
	}
	
	/*
	 * 2
	 * 功能: 将时间yyyy-MM-dd HH:mm:ss 转换为 yyyy-MM-dd
	 */
	public static String changDateTile(Date date){
		String result = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		result = sdf.format(date);
		return result;
	}
}
