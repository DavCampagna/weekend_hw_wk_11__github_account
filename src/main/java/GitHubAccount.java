import java.util.HashMap;

public class GitHubAccount {

    private String username;
    private String name;
    private HashMap<String, Repository> repositories;
    private AccountType accountType;

    public GitHubAccount(String username, String name) {
        this.username = username;
        this.name = name;
        this.repositories = new HashMap<String, Repository>();
        this.accountType = accountType.FREE;
    }

    public String getUsername() {
        return this.username;
    }

    public String getName() {
        return this.name;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public void upgrade() {
        this.accountType = accountType.PRO;
    }

    public void downgrade() {
        this.accountType = accountType.FREE;
    }
}
