package com.multi.liveAlone;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
<<<<<<< HEAD
	MemberVO bag = new MemberVO();

	public int certi(String member_id) {
		int result = my.update("member.upcerti", member_id);
		return result;
	}
	
	public MemberVO getaddress(String member_id) {
		bag = my.selectOne("member.one", member_id);
		return bag;
=======
	// 유저 정보를 가지고 옵니다.
	public MemberVO selectOne(String memberID) {
		MemberVO memberInfo= my.selectOne("member.one", memberID);
		
		return memberInfo;
	}


	public void updateUserMileage(MemberVO member) {
		my.update("member.updateUserMileage", member);
		
>>>>>>> order
	}
}
=======
import org.springframework.stereotype.Component;

//스프링에 dao는 싱글톤으로 하나만 만들어서 사용할게! 라고 설정해야함.
// 1) 어노테이션방법, 2) XML방법

@Component // -> 램에 객체를 하나만 만들어 놓음 : MemberDAO d = new MemberDAO();
public class MemberDAO { // CRUD

	@Autowired
	SqlSessionTemplate my;
	
	public int login(MemberVO bag) {
		int result = my.selectOne("member_test.login", bag.getid());
		System.out.println("로그인 결과는?! : " + result);
		return result;
	}
}
>>>>>>> shareChat
