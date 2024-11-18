public abstract class User {
   protected String userId, name,phoneNumber;
    public User(){}

    public User(String userId, String phoneNumber, String name) {
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}