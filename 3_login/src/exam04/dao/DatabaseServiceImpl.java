package exam04.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import exam04.service.CommonService;
import exam04.service.CommonServiceImpl;
import exam04.Member;

public class DatabaseServiceImpl implements DatabaseService{
	Connection con;
	ResultSet rs;
	PreparedStatement pstmt;
	CommonService cs;
	
	public DatabaseServiceImpl() {
		// TODO Auto-generated constructor stub
		cs = new CommonServiceImpl();
		
		// 데이터연결 하기 위한 객체 처리
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String pass = "oracle";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("오라클 연결 성공");
		} catch(Exception e) {
			System.out.println("오라클 연결 실패");
			e.printStackTrace();
		}
	}
	@Override
	public boolean insert(Member m) {
		// TODO Auto-generated method stub
		// 아이디가 없으면 true, 있으면 false
		if (chkId(m.getId())) {
			String sql = "insert into member values(?,?,?,?,?,?)";
			
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, m.getId());
				pstmt.setString(2, m.getPw());
				pstmt.setString(3, m.getName());
				pstmt.setString(4, getGender(m.isGender()));
				pstmt.setInt(5, m.getAge());
				pstmt.setInt(6, m.getHobby());
				
				int result = pstmt.executeUpdate();
				
				if(result == 1) {
					cs.errorMsg("회원가입", "회원가입여부", "회원가입에 성공하셨습니다.");
					return true;
				}
				
				pstmt.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} else {
			cs.errorMsg("회원가입",	 "회원가입여부", "같은 아이디가 존재합니다.");
		}
		return false;
	}
	@Override
	public boolean chkId(String id) {
		// TODO Auto-generated method stub
		boolean result = false;
		
		String sql = "select decode(count(*), 1, 'false', 'true')"
				+ " from member where id=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			// 문자열 true 와 false 를 boolean 자료형으로 바꿀 수 있다.
			result = Boolean.parseBoolean(rs.getString(1));
			
			pstmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public String getGender(boolean gender) {
		// TODO Auto-generated method stub
		if(gender) {
			return "남성";
		} 
		return "여성";
	}
	@Override
	public boolean loginChk(String id, String pw) {
		// TODO Auto-generated method stub
		String sql = "select count(*) from member where id=? and pw=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			int result = rs.getInt(1);
			
			if(result >= 1) {
				return true;
			}
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public List<Member> selectAll() {
		// TODO Auto-generated method stub
		String sql = "select * from member";
		List<Member> memberList = new ArrayList<Member>();
		try {
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Member m = new Member();
				m.setId(rs.getString(1));
				m.setPw(rs.getString(2));
				m.setName(rs.getString(3));
				String g = rs.getString(4);
				if(g.equals("남성")) {
					m.setGender(true);
				} else {
					m.setGender(false);
				}
				m.setAge(rs.getInt(5));
				m.setHobby(rs.getInt(6));
				memberList.add(m);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return memberList;
	}
	

}
