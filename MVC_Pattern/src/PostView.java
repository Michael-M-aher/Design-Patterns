import java.util.*;
import java.util.Scanner;

public class PostView {
    Scanner sc=new Scanner(System.in);
    PostController c;
    public PostView(PostController c){
        this.c=c;

    }
    public void takePostData()
    {
        String content;
        int id;
        System.out.print("Enter your post content: ");
        content=sc.next();
        System.out.print("Enter your post ID: ");
        id=sc.nextInt();
        c.addPosts(id,content);
    }

    public void viewPostByID(int id)
    {
        Post p;
        p=c.getPostByID(id);
        System.out.print("Post Content: "+p.getPostContent()+"\n\n"+"Post comments: \n\n");
        for(int i=0;i<p.getComments().size();i++)
        {
            System.out.print("comment "+i+": "+p.getComments().get(i));
        }


    }

    public void takeCommentContent(int postID)
    {
        String cContent;
        System.out.print("Enter your post comment content: \n");
        cContent=sc.next();
        c.addComment(cContent,postID);
    }
}
