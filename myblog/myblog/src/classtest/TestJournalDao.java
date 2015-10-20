package classtest;

import java.util.ArrayList;

import Encryption.Base64;
import dao.JournalDao;
import empty.Journal;

public class TestJournalDao {
	public static void main(String[] args) {
		ArrayList<Journal> list = JournalDao.selectJournalLikeTitle(Base64.base64Encoder("注册"));
		for(Journal journal :list){
			System.out.println(journal);
		}
	}
}
