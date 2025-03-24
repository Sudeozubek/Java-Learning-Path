public class MainInstagramUser {
    public static void main(String[] args){
        InstagramUser user = new InstagramUser("sudesu", 23000);

        user.follow();
        user.follow();
        user.unfollow();
        user.unfollow();
        user.unfollow();
        user.showProfile();

    }
}
