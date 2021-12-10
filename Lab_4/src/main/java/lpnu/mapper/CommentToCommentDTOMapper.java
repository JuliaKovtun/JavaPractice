package lpnu.mapper;

import lpnu.dto.CommentDTO;
import lpnu.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentToCommentDTOMapper {

    @Autowired
    private UserToUserDTOMapper userMapper;

    public Comment toEntity(final CommentDTO commentDTO){
        final Comment comment = new Comment();

        comment.setId(commentDTO.getId());
        comment.setText(commentDTO.getText());
        comment.setUser(userMapper.toEntity(commentDTO.getUser()));
        comment.setArticle_id(commentDTO.getArticle_id());
        return comment;
    }

    public CommentDTO toDTO(final Comment comment){
        final CommentDTO commentDTO = new CommentDTO();

        commentDTO.setId(comment.getId());
        commentDTO.setText(comment.getText());
        commentDTO.setUser(userMapper.toDTO(comment.getUser()));
        commentDTO.setArticle_id(comment.getArticle_id());

        return commentDTO;
    }
}
