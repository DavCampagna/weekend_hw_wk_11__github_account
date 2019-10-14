import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class GitHubAccountTest {

    GitHubAccount gitHubAccount;
    Repository repository1;
    Repository repository2;
    Commit commit1;
    Commit commit2;
    Commit commit3;

    @Before
    public void before() {
        gitHubAccount = new GitHubAccount("Kev3000", "Kevin Spade");
        repository1 = new Repository("pyramids_lab", "", RepositoryType.PUBLIC);
        repository2 = new Repository("events_lab", "", RepositoryType.PUBLIC);
        commit1 = new Commit("refactor table", CommitType.REFACTOR, 1111);
        commit2 = new Commit("refactor datalist", CommitType.REFACTOR, 1112);
        commit3 = new Commit("update CSS", CommitType.OTHER, 1113);

        gitHubAccount.addRepo(repository1);
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

    @Test
    public void canAddRepo() {
        gitHubAccount.addRepo(repository2);
        assertEquals(2, gitHubAccount.repositoriesCount());
    }

    @Test
    public void canFindRepoByName() {
        Repository foundRepo = gitHubAccount.findRepoByName("pyramids_lab");
        assertEquals(repository1, foundRepo);
    }

    @Test
    public void cannotFindRepoByNameIfMispelled() {
        Repository foundRepo = gitHubAccount.findRepoByName("pyrams_lab");
        assertEquals(null, foundRepo);
    }

    @Test
    public void canGetRepos() {
        ArrayList<Repository> foundRepos = gitHubAccount.findRepos();
        assert(foundRepos.contains(repository1));
    }

    @Test
    public void canFindRepoWithTheMostCommits() {
        gitHubAccount.addRepo(repository2);
        repository2.addCommit(commit1);
        repository2.addCommit(commit2);
        repository2.addCommit(commit3);
        assertEquals(repository2, gitHubAccount.findRepoWithTheMostCommits());
    }


}
