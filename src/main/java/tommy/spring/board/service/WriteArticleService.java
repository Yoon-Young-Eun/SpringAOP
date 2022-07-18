package tommy.spring.board.service;

import tommy.spring.board.vo.ArticleVO;

public interface WriteArticleService {//게시판에 글쓰기 서비스를 제공할 인터페이스 
	void write(ArticleVO article);
}
