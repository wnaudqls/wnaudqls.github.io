package com.yozo.goods.biz;

import java.util.List;

import com.yozo.goods.dao.GoodsDao;
import com.yozo.goods.dto.AnswerDto;
import com.yozo.goods.dto.GoodsDto;

public class GoodsBiz {

	private GoodsDao  dao = new GoodsDao();
	
	public int insert(GoodsDto dto) {
		return dao.insert(dto) ;
	}
	
	public List<GoodsDto> selectList(){
		return dao.selectList();
	}
	public GoodsDto selectOne(int goods_no) {
		return dao.selectOne(goods_no);
	}
	public int update(GoodsDto dto) {
		return 0;
	}
	public int delete(int goods_dto) {
		return 0;
	}
	
	
	//detail 댓글달기 시작 
	public List<AnswerDto> answerList(int goods_no){
		return dao.answerList(goods_no);
	}
	
	public int answerinsert(AnswerDto dto) {
		return dao.answerinsert(dto);
	}
	
	//관리자 댓글 끼어서 달기
	public int rereplyinsert(AnswerDto dto) {
		return dao.rereplyinsert(dto);
	}
	
	public int rereplyupdate(int goods_re_no) {
		return dao.rereplyupdate(goods_re_no);
				
	}
	public int answerProc(AnswerDto dto) {
		
		int rereplyupdate = dao.rereplyupdate(dto.getGoods_re_no());
		int rereplyinsert = dao.rereplyinsert(dto);
		
		return rereplyupdate + rereplyinsert;
		
	}
	
}
