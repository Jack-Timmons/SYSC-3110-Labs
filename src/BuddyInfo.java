public class BuddyInfo {


    private String name;
    private String address;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public BuddyInfo(){
        name = "Dave";
        address = "99 Place Street";
        phoneNumber = "613-000-0000";
    }
    public BuddyInfo(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo Jim = new BuddyInfo("Jim", "45 av.","234-456-7890" );
        System.out.println("Hello "+Jim.getName());
    }
}

