package lpnu.mapper;

import lpnu.dto.ArticleDTO;
import lpnu.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArticleToArticleDTOMapper {

    @Autowired
    private UserToUserDTOMapper userMapper;

    public Article toEntity(final ArticleDTO articleDTO){
        final Article article = new Article();

        article.setId(articleDTO.getId());
        article.setTitle(articleDTO.getTitle());
        article.setText(articleDTO.getText());
        article.setWriter(userMapper.toEntity(articleDTO.getWriter()));
        return article;
    }

    public ArticleDTO toDTO(final Article article){
        final ArticleDTO articleDTO = new ArticleDTO();

        articleDTO.setId(article.getId());
        articleDTO.setTitle(article.getTitle());
        articleDTO.setText(article.getText());
        articleDTO.setWriter(userMapper.toDTO(article.getWriter()));

        return articleDTO;
    }
}
