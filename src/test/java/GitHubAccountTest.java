import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GitHubAccountTest {

    GitHubAccount gitHubAccount;

    @Before
    public void before() {
        gitHubAccount = new GitHubAccount("Kev3000", "Kevin Spade");
    }

    @Test
    public void hasUsername() {
        assertEquals("Kev3000", gitHubAccount.getUsername());
    }

    @Test
    public void hasName() {
        assertEquals("Kevin Spade", gitHubAccount.getName());
    }

    @Test
    public void accountTypeStartsAsFree() {
        assertEquals(AccountType.FREE, gitHubAccount.getAccountType());
    }

    @Test
    public void canUpgradeAccount() {
        gitHubAccount.upgrade();
        assertEquals(AccountType.PRO, gitHubAccount.getAccountType());
    }

    @Test
    public void canDowngradeAccount() {
        gitHubAccount.upgrade();
        gitHubAccount.downgrade();
        assertEquals(AccountType.FREE, gitHubAccount.getAccountType());
    }

//    @Test
//    public void canAddRepo() {
//        gitHubAccount.add(Repository repository)
//    }


}
