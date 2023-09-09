import java.util.Vector;

public class Post {
    private int postID;
    private String postContent;
    private Vector<String> comments= new Vector<>();
    public Post(int id,String content)
    {
        this.postID=id;
        this.postContent=content;

    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public int getPostID() {
        return postID;
    }

    public String getPostContent() {
        return postContent;
    }

    public Vector<String> getComments() {
        return comments;
    }
    public void pushComment(String cContent)
    {
        comments.add(cContent);
    }
}
