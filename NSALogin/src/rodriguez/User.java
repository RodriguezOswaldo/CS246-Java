package rodriguez;

public class User {
    private String password;
    private String salt;
    private String hashedPassword;

    public User(String password){
        this.password = password;
        this.salt = "";
        this.hashedPassword = "";
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getSalt(){
        return salt;
    }
    public void setSalt(String salt){
        this.salt = salt;
    }
    public String getHashedPassword(){
        return hashedPassword;
    }
    public void setHashedPassword(String hashedPassword){
        this.hashedPassword = hashedPassword;
    }


}
