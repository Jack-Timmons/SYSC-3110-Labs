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
        BuddyInfo buddy = new BuddyInfo("Dave", "Carleton", "654");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
