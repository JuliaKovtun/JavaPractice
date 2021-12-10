package lpnu.service;

import lpnu.dto.ArticleDTO;
import lpnu.dto.CommentDTO;

import java.util.List;

public interface CommentService {
    List<CommentDTO> getAllComments();

    List<CommentDTO> getAllCommentsForArticle(final long article_id);

    CommentDTO getCommentById(long id);

    CommentDTO saveComment(CommentDTO commentDTO);

    CommentDTO updateComment(CommentDTO commentDTO);

    void deleteCommentById(final long id);
}
