package lpnu.resource;

import lpnu.dto.ArticleDTO;
import lpnu.dto.CommentDTO;
import lpnu.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CommentResource {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public List<CommentDTO> getAllComments() {
        return commentService.getAllComments();
    }

    @GetMapping("/articles/all-comments/{article_id}")
    public List<CommentDTO> getAllCommentsForArticle(@PathVariable final long article_id) {
        return commentService.getAllCommentsForArticle(article_id);
    }

    @GetMapping("/articles/comment/{id}")
    public CommentDTO getCommentById(@PathVariable final long id) {
        return commentService.getCommentById(id);
    }


    @PostMapping("/articles/comments")
    public CommentDTO saveComment(@RequestBody final CommentDTO commentDTO) {
        return commentService.saveComment(commentDTO);
    }


    @PutMapping("/articles/comments")
    public CommentDTO updateComment(@RequestBody final CommentDTO commentDTO) {
        return commentService.updateComment(commentDTO);
    }


    @DeleteMapping("/articles/comments/{id}")
    public ResponseEntity deleteCommentById(@PathVariable final long id) {
        commentService.deleteCommentById(id);
        return ResponseEntity.ok().build();
    }
}
