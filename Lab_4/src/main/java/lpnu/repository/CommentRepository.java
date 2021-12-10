package lpnu.repository;

import lpnu.entity.Article;
import lpnu.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CommentRepository {
    public List<Comment> comments = new ArrayList<>();
    private long id = 1;

    public List<Comment> getAllComments() {
        return comments;
    }

    public List<Comment> getAllCommentsForArticle(final long article_id) {
        return comments.stream()
                .filter(e -> e.getArticle_id() == article_id)
                .collect(Collectors.toList());
    }

    public Comment getCommentByID(long id) {
        return comments.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Comment saveComment(Comment comment){
        comment.setId(id);
        id++;
        comments.add(comment);
        return comment;
    }

    public Comment updateComment(Comment comment){
        final Comment savedComment = getCommentByID(comment.getId());

        savedComment.setText(comment.getText());
        savedComment.setUser(comment.getUser());
        return savedComment;
    }

    public void deleteCommentById(long id) {
        comments = comments.stream()
                .filter(e -> e.getId() != id)
                .collect(Collectors.toList());

    }
}
