package com.multi.liveAlone.party.bbsParty;

public class BbsPartyDAO {
<<<<<<< HEAD
=======
	@Autowired
	SqlSessionTemplate my;


	public List<BbsPartyVO> all(PagePartyVO vo) {
		return my.selectList("bbsParty.all", vo);
	}

	public List<ChatPartyVO> chatAll(int partyBbs_num) {
		/*
		 * ChatPartyVO vo = new ChatPartyVO(); vo.setPartyBbs_num(partyBbs_num);
		 */
		return my.selectList("bbsParty.chatAll", partyBbs_num);
	}
	
	public int count() {
		return my.selectOne("bbsParty.count");
	}                                                               
	public int count2(BbsPartyVO vo) {
		return my.selectOne("bbsParty.count2", vo);
	}                                                               
	public int count3(MemberPartyVO vo) {
		return my.selectOne("bbsParty.count3", vo);
	}                                                               
	public BbsPartyVO one(BbsPartyVO vo) {
		return my.selectOne("bbsParty.one", vo);
	}                                                               
	public int one2(BbsPartyVO vo) {
		return my.selectOne("bbsParty.one2", vo);
	}                                                               
	public int insert(BbsPartyVO vo) {
		return my.insert("bbsParty.in", vo);
	}
	public int insert2(MemberPartyVO vo) {
		return my.insert("bbsParty.in2", vo);
	}
	public int insert3(ChatPartyVO vo) {
		return my.insert("bbsParty.in3", vo);
	}
	public int up(BbsPartyVO vo) {
		return my.update("bbsParty.up", vo);
	}
	public int del(BbsPartyVO vo) {
		return my.delete("bbsParty.del", vo);
	}
	public int del2(BbsPartyVO vo) {
		return my.delete("bbsParty.del2", vo);
	}
	public int del3(BbsPartyVO vo) {
		return my.delete("bbsParty.del3", vo);
	}
>>>>>>> party

}
