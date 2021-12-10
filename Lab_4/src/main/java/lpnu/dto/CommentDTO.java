package lpnu.dto;

import lpnu.entity.User;

public class CommentDTO {
    private long id;
    private String text;
    private UserDTO user;
    private long article_id;

    public CommentDTO(){}

    public CommentDTO(final long id, final String text, final User user, final long article_id){
        this.id = id;
        this.text = text;
        this.user = new UserDTO(user.getId(), user.getName(), user.getEmail(), user.getRole());
        this.article_id = article_id;
    }

    public void setId(final long id){ this.id = id; }
    public void setText(final String text){ this.text = text; }
    public void setUser(final UserDTO user){
        this.user = new UserDTO(user.getId(), user.getName(), user.getEmail(), user.getRole());
    }
    public void setArticle_id(final long article_id){ this.article_id = article_id; }
    public long getId(){ return id; }
    public String getText(){ return text; }
    public UserDTO getUser(){ return user; }
    public long getArticle_id(){ return article_id; }

    @Override
    public String toString(){
        return "CommentDTO{" +
                " id = " + id +
                ", user: " + user.getName() + "\'" +
                ", comment: '" + text + "\'" +
                ", article_id: '" + article_id + "\'" +
                '}';
    }
}
