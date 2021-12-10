package lpnu.repository;
import lpnu.entity.Article;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ArticleRepository {
        public List<Article> articles = new ArrayList<>();
        private long id = 1;

        public List<Article> getAllArticles() {
            return articles;
        }

        public Article getArticleByID(long id) {
            return articles.stream()
                    .filter(e -> e.getId() == id)
                    .findFirst()
                    .orElse(null);
        }

        public Article saveArticle(Article article){
            article.setId(id);
            id++;
            articles.add(article);
            return article;
        }

        public Article updateArticle(Article article){
            final Article savedArticle = getArticleByID(article.getId());

            savedArticle.setTitle(article.getTitle());
            savedArticle.setText(article.getText());
            savedArticle.setWriter(article.getWriter());
            return savedArticle;
        }

        public void deleteArticleById(long id) {
            articles = articles.stream()
                    .filter(e -> e.getId() != id)
                    .collect(Collectors.toList());

        }

    }


