package lpnu.service.impl;
import lpnu.dto.ArticleDTO;
import lpnu.entity.Article;
import lpnu.mapper.ArticleToArticleDTOMapper;
import lpnu.repository.ArticleRepository;
import lpnu.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleToArticleDTOMapper articleMapper;

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<ArticleDTO> getAllArticles() {
        return articleRepository.getAllArticles()
                .stream()
                .map(articleMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ArticleDTO getArticleById(final long id) {
        return articleMapper.toDTO(articleRepository.getArticleByID(id));
    }

    @Override
    public ArticleDTO saveArticle(final ArticleDTO articleDTO) {
        final Article article = articleMapper.toEntity(articleDTO);
        articleRepository.saveArticle(article);
        return articleMapper.toDTO(article);
    }

    @Override
    public ArticleDTO updateArticle(final ArticleDTO articleDTO) {
        final Article article = articleMapper.toEntity(articleDTO);
        return articleMapper.toDTO(articleRepository.updateArticle(article));
    }

    @Override
    public void deleteArticleById(final long id) {
        articleRepository.deleteArticleById(id);
    }
}
