package exam04.dao;

import java.util.List;

import exam04.Member;

public interface DatabaseService {
	public boolean insert(Member m);
	public boolean chkId(String id);
	public String getGender(boolean gender);
	public boolean loginChk(String id, String pw);
	public List<Member> selectAll();
}