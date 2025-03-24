public class InstagramUser {
    String username;
    int followers;

    public InstagramUser(String username, int followers){
        this.username=username;
        this.followers=followers;
    }
    public void follow(){
        followers += 1;
    }
    public void unfollow(){
        if(followers>0){
            followers --;
        }else{
            System.out.println("Already at 0 followers");
        }
    }
    public void showProfile(){
        System.out.println("Username: "+username+", Followers: "+followers);
    }
}
