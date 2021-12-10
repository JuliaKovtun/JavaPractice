package lpnu.service;
import lpnu.dto.ArticleDTO;

import java.util.List;

public interface ArticleService {
    List<ArticleDTO> getAllArticles();

    ArticleDTO getArticleById(long id);

    ArticleDTO saveArticle(ArticleDTO articleDTO);

    ArticleDTO updateArticle(ArticleDTO articleDTO);

    void deleteArticleById(final long id);
}
