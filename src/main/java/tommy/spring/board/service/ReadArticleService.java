package tommy.spring.board.service;

import tommy.spring.board.vo.ArticleNotFoundException;
import tommy.spring.board.vo.ArticleVO;

//Read서비스를 제공할 인터페이스
public interface ReadArticleService {
   ArticleVO getArticleAndIncreaseReadCount(int id) throws ArticleNotFoundException;
}  