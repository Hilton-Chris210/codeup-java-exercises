import java.util.Date;

public class post {

    public int id;
    public String title;
    public String content;
    public String author;
    public Date created_at;
    public Date updated_at;

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }


    public static void main(String[] args) {
        post post1 = new post();
        post1.id = 1;
        post1.title = "My First Post";
        post1.content = "This is my first post";
        post1.author = "Justin";
        post1.created_at = new Date();
        post1.updated_at = new Date();
        System.out.println(post1.id);
        System.out.println(post1.title);
        System.out.println(post1.content);
        System.out.println(post1.author);
        System.out.println(post1.created_at);
        System.out.println(post1.updated_at);
        System.out.println(post1);


    }



















}
