package ProgramSuratPaket;

/**
 *
 * @author Admin
 */
public class Akun {
    private String username , passwd;

    public Akun() {
        username = "";
        passwd = "";
    }

    
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    public String getUsername() {
        return username;
    }

    public String getPasswd() {
        return passwd;
    }
    
    
}
