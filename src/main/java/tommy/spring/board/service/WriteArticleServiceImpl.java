package tommy.spring.board.service;

import tommy.spring.board.dao.ArticleDAO;
import tommy.spring.board.vo.ArticleVO;

//WhiteArticleService 인터페이스를 실제로 구현한 클래스 
public class WriteArticleServiceImpl implements WriteArticleService { 
	
	
	private ArticleDAO articleDao;
	
	public WriteArticleServiceImpl() {
	}
	
	
	public WriteArticleServiceImpl(ArticleDAO articleDao) {
		this.articleDao = articleDao;
	}


	@Override
	public void write(ArticleVO article) {
		System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
		articleDao.insert(article);

	}

}
