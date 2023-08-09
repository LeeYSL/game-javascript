package main;

public interface sqlStudy1 {

	/*
	 * 문제
	 * USED_GOODS_BOARD와 USED_GOODS_REPLY 테이블에서 2022년 10월에 작성된 게시글 제목, 게시글 ID, 댓글
	 * ID, 댓글 작성자 ID, 댓글 내용, 댓글 작성일을 조회하는 SQL문을 작성해주세요. 결과는 댓글 작성일을 기준으로 오름차순 정렬해주시고
	 * 댓글 작성일이 같다면 게시글 제목을 기준으로 오름차순 정렬해주세요.
	 * 
	 * 
	 * 
	 *  답
	 *  SELECT a.Title, a.BOARD_ID, a.CREATED_DATE, b.REPLY_ID, b.WRITER_ID,
	 *  b.CONTENTS, DATE_FORMAT(b.CREATED_DATE, '%Y-%m-%d')
	 *  from USED_GOODS_BOARD A
	 *  join USED_GOODS_REPLY B on a.BOARD_ID = b.BOARD_ID where
	 *  substring(a.CREATED_DATE,1,7) ='2022-10' order by b.CREATED_DATE , a.title;
	 */

}
