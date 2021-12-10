package lpnu.entity;

import lpnu.dto.UserDTO;

public class Article {
    private long id;
    private String title;
    private String text;
    private User writer;

    public Article(){}

    public Article(final long id, final String title, final String text, final User writer){
        this.id = id;
        this.title = title;
        this.text = text;
        this.writer = new User(writer.getId(), writer.getName(), writer.getEmail(), writer.getRole());
    }

    public void setId(final long id){ this.id = id; }
    public void setTitle(final String title){ this.title = title; }
    public void setText(final String text){ this.text = text; }
    public void setWriter(final User writer){
        this.writer = new User(writer.getId(), writer.getName(), writer.getEmail(), writer.getRole());
    }
    public long getId(){ return id; }
    public String getTitle(){ return title; }
    public String getText(){ return text; }
    public User getWriter(){ return writer; }




    @Override
    public String toString(){
        return "Article{" +
                " id = " + id +
                ", title: '" + title + "\'" +
                ", text: '" + text + "\'" +
                ", writer: " + writer.getName() + "\'" +
                '}';
    }

}
