package lpnu.resource;

import lpnu.dto.ArticleDTO;
import lpnu.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ArticleResource {


    @Autowired
    private ArticleService articleService;

    @GetMapping("/articles")
    public List<ArticleDTO> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/articles/{id}")
    public ArticleDTO getArticleById(@PathVariable final long id) {
        return articleService.getArticleById(id);
    }


    @PostMapping("/writer/articles")
    public ArticleDTO saveArticle(@RequestBody final ArticleDTO articleDTO) {
        return articleService.saveArticle(articleDTO);
    }


    @PutMapping("/writer/articles")
    public ArticleDTO updateArticle(@RequestBody final ArticleDTO articleDTO) {
        return articleService.updateArticle(articleDTO);
    }


    @DeleteMapping("/writer/articles/{id}")
    public ResponseEntity deleteArticleById(@PathVariable final long id) {
        articleService.deleteArticleById(id);
        return ResponseEntity.ok().build();
    }

}
