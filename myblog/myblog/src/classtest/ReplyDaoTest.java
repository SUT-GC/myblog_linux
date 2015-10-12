package classtest;

import java.util.ArrayList;

import dao.ReplyDao;
import empty.Reply;

public class ReplyDaoTest {

	public static void main(String[] args) {
		System.out.println(ReplyDao.selectReplyByReplyID(1));
	}

}
