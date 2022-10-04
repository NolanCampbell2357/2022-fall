package Lecture;

public class FBuserApp {
    public static void main(String[] args) {
        FBuser user1 = new FBuser("ipark@ucmo.edu");
        FBuser user2 = new FBuser("xyz@gmail.com");
        FBuser user3 = new FBuser("abc@ucmo.edu");

        user1.inRelationWith = user2;
        user1.addFriend(user2);
        user1.addFriend(user3);

        System.out.println(user1);

        user1.show();
    }
}