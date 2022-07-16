package tommy.spring.board.service;

import tommy.spring.board.dao.ArticleDAO;
import tommy.spring.board.vo.ArticleVO;

public class WhiteArticleServiceImpl implements WhiteArticleService {
	
	
	private ArticleDAO articleDao;
	
	public WhiteArticleServiceImpl() {
	}
	
	
	public WhiteArticleServiceImpl(ArticleDAO articleDao) {
		this.articleDao = articleDao;
	}


	@Override
	public void write(ArticleVO article) {
		System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
		articleDao.insert(article);

	}

}
