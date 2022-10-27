package pages;

public class GitHubPage extends BasePage{

    private String userTextField = "/html/body/div[3]/div/div/div[2]/form/div[1]/input";
    private String passwordTextField = "/html/body/div[3]/div/div/div[2]/form/div[2]/input";
    private String sigInButton =  "/html/body/nav/div[1]/ul/li[5]/a";
    private String logInButton =  "/html/body/div[3]/div/div/div[3]/button[2]";
    private String signOutButton = "/html/body/nav/div[1]/ul/li[6]/a";


    public GitHubPage() {
        super(driver);
    }

    public void navigateToGithub() {

        navigateTo("https://www.demoblaze.com/index.html");
    }

    public void enterUser(String user) {

        write(userTextField, user);
    }

    public void enterPassword(String pass){

        write(passwordTextField,pass);
    }

    public void clickSigInButton(){

        clickElement(sigInButton);
    }
    public void clickLogInButton(){

        clickElement(logInButton);
    }

    public void closeSession(){
        clickElement(signOutButton);
    }

}
