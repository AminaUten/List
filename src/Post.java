import java.util.ArrayList;
import java.util.Arrays;

public class Post {
    private String title;
    private String content;
    private String[] tags;
    private ArrayList <PostComment> comments;

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setTags(String[] tags) {
        this.tags = tags;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", content='" + content.length() + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", comments=" + comments +
                '}';
    }
}
