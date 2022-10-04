package Lecture;

import java.util.ArrayList;
import java.util.Collections;

public class FBuser implements Comparable<FBuser> {
    private String email;
    private ArrayList<FBuser> friends;

    public FBuser inRelationWith;

    public FBuser(String email) {
        this.email = email;
        friends = new ArrayList<FBuser>();
    }

    public void addFriend(FBuser friend) {
        friends.add(friend);
    }

    public String getEmail() {
        return email;
    }

    public void sortFriends() {
        Collections.sort(friends);
    }

    public void show() {
        System.out.println("User email: " + email);
        System.out.println("In relaiton with: " + inRelationWith);
        System.out.println("Friends: " + friends);
    }

    @Override
    public String toString() {
        return "id=" + email;
    }

    @Override
    public int compareTo(FBuser o) {
        return email.compareTo(o.getEmail());
    }
}
