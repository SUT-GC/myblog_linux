package classtest;

import java.util.ArrayList;
import java.util.Date;

import dao.MessDao;
import empty.Message;

public class TestMessDao {

	public static void main(String[] args) {
//		int sum = MessDao.countFirstMess();
//		System.out.println(sum);
		
		/*
		 * 测试MessDao.selectMessByLimit
		 */
		ArrayList<Message> list = new ArrayList<>();
		list = MessDao.selectMessByLimit(10, 10);
		for(Message message: list){
			System.out.println(message);
		}
		/*
		 * 测试MessDao.selectFirstMessByFloor
		 */
//		ArrayList<Message> list = new ArrayList<>();
//		list = MessDao.selectSecoundMessByFloor(3);
//		for(Message message: list){
//			System.out.println(message);
//		}
		/*
		 * 测试selectMessTouseridIsFloor
		 */
//		ArrayList<Message> list = new ArrayList<>();
//		list = MessDao.selectMessTouseridIsFloor();
//		for(Message message: list){
//			System.out.println(message);
//		}
		/*
		 * 测试selectSecoundMessByFloor
		 */
//		ArrayList<Message> list = new ArrayList<>();
//		list = MessDao.selectSecoundMessByFloor(3);
//		for(Message message: list){
//			System.out.println(message);
//		}
		/*
		 * 测试:insertMess
		 */
//		Message message = new Message();
//		message.setFloor_id(16);
//		message.setUser_id(17);
//		message.setTouser_id(0);
//		message.setMessbox_reply("你哈奥");
//		message.setMessbox_date(new Date());
//		System.out.println(MessDao.insertMess(message));
	}

}
