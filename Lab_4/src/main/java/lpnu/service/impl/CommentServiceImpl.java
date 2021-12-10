package lpnu.service.impl;

import lpnu.dto.ArticleDTO;
import lpnu.dto.CommentDTO;
import lpnu.entity.Comment;
import lpnu.mapper.CommentToCommentDTOMapper;
import lpnu.repository.CommentRepository;
import lpnu.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentToCommentDTOMapper commentMapper;

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<CommentDTO> getAllComments() {
        return commentRepository.getAllComments()
                .stream()
                .map(commentMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<CommentDTO> getAllCommentsForArticle(final long article_id) {
        return commentRepository.getAllCommentsForArticle(article_id)
                .stream()
                .map(commentMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CommentDTO getCommentById(final long id) {
        return commentMapper.toDTO(commentRepository.getCommentByID(id));
    }

    @Override
    public CommentDTO saveComment(final CommentDTO commentDTO) {
        final Comment comment = commentMapper.toEntity(commentDTO);
        commentRepository.saveComment(comment);
        return commentMapper.toDTO(comment);
    }

    @Override
    public CommentDTO updateComment(final CommentDTO commentDTO) {
        final Comment comment = commentMapper.toEntity(commentDTO);
        return commentMapper.toDTO(commentRepository.updateComment(comment));
    }

    @Override
    public void deleteCommentById(final long id) {
        commentRepository.deleteCommentById(id);
    }
}
