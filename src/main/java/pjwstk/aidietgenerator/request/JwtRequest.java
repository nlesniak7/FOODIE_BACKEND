package pjwstk.aidietgenerator.request;

import java.io.Serializable;

public class JwtRequest implements Serializable{
    private String email;
    private String password;

    public JwtRequest(){}

    public JwtRequest(String email, String password){
        this.setEmail(email);
        this.setPassword(password);
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
