import java.util.Vector;

public class PostController {
    private Vector<Post> posts=new Vector<>();

    public void addPosts(int id,String content)
    {
        Post newPost=new Post(id,content);
        posts.add(newPost);
    }
    public Post getPostByID(int id)
    {
        for(int i=0;i<posts.size();i++)
        {
          if(posts.get(i).getPostID()==id)
          {
              return posts.get(i);
          }
        }
        return null;
    }
    public void addComment(String cContent, int postID)
    {
        for(int i=0;i<posts.size();i++)
        {
            if(posts.get(i).getPostID()==postID)
            {
                posts.get(i).pushComment(cContent);
            }
        }
    }

}
