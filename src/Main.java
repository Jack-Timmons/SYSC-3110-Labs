public class Main {
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Dave", "Carleton", "654");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}