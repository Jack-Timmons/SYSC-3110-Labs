import java.util.*;
public class AddressBook {
    private List<BuddyInfo> information;

    public AddressBook(){
        information = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        information.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        information.remove(buddy);
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }
}
