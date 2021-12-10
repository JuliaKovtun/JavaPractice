package lpnu.dto;
import lpnu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ArticleDTO {
    private long id;
    private String title;
    private String text;
    private UserDTO writer;

    @Autowired
    private UserRepository userRepository;

    public ArticleDTO(){}

    public ArticleDTO(final long id, final String title, final String text, final UserDTO writer){
        this.id = id;
        this.title = title;
        this.text = text;
        this.writer = new UserDTO(writer.getId(), writer.getName(), writer.getEmail(), writer.getRole());
    }

    public void setId(final long id){ this.id = id; }
    public void setTitle(final String title){ this.title = title; }
    public void setText(final String text){ this.text = text; }
    public void setWriter(final UserDTO writer){
        this.writer = new UserDTO(writer.getId(), writer.getName(), writer.getEmail(), writer.getRole());
    }
    public long getId(){ return id; }
    public String getTitle(){ return title; }
    public String getText(){ return text; }
    public UserDTO getWriter(){ return writer; }

    @Override
    public String toString(){
        return "ArticleDTO{" +
                " id = " + id +
                ", title: '" + title + "\'" +
                ", text: '" + text + "\'" +
                ", writer: " + writer.getName() + "\'" +
                '}';
    }

}
