public class App {
    public static void main(String[] args) {
        PostController pController = new PostController();
        PostView pView=new PostView(pController);

        pView.takePostData();

        pView.viewPostByID(1);

        pView.takeCommentContent(1);
        pView.viewPostByID(1);
    }
}
