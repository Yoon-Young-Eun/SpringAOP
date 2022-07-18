package tommy.spring.board.dao;

import tommy.spring.board.vo.ArticleVO;

public class OracleArticleDAO implements ArticleDAO { //데이터베이스 처리 구현 클래스

	@Override
	public void insert(ArticleVO article) {
		System.out.println("MyOracleArticleDAO.insert() 실행");
	}

	@Override
	public void updateReadCount(int id) {
		System.out.println("MyOracleArticleDAO.updateReadCount() 실행");
	}
}
