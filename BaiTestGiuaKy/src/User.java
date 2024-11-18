abstract class User {
    private String userID;
    private String userAccount;
    private String name;
    private String phoneNumber;
    private String password;

    public User(){}
    public abstract void signUp();

    public String getUserID() {
        return userID;
    }

    public void setUserID(String phoneNumber) {
        this.userID = userID;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

