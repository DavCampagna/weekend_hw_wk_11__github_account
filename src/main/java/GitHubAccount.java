import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Collections;
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

    public int repositoriesCount() {
        return this.repositories.size();
    }

    public void addRepo(Repository repository) {
        this.repositories.put(repository.getName(), repository);
    }

    public Repository findRepoByName(String repoName) {
        return this.repositories.get(repoName);
    }

    public ArrayList<Repository> findRepos() {
        ArrayList<Repository> foundRepos = new ArrayList<Repository>();
        for (Repository repository : repositories.values()) {
            foundRepos.add(repository);
            }
        return foundRepos;
    }

    public Repository findRepoWithTheMostCommits() {
//        set a variable repoWithTheMostCommits to return at the end.
//        loop through repositories and compare repository.commitsCount to find the bigger one

        int max = Collections.max(this.repositories.values()).commitsCount();






//        Repository repoWithTheMostCommits = null;
//        for (Repository repo : this.repositories.values() {
//            if (repository.commitsCount > ) {
//
//            }
//        }
//        return repoWithTheMostCommits;
//
//
//
//        ArrayList<Commit> commitsByType = new ArrayList<Commit>();
//        for (Commit commit : this.commits){
//            if(commit.getCommitType() == commitType){
//                commitsByType.add(commit);
//            }
//        }
//        return commitsByType;
//    }
//

//    public Repository findRepoWithTheMostCommits() {
//        Repository RepoWithTheMostCommits = null;
//        for(String repoName : this.repositories.keySet()) {
//            if (repository.commitsCount() > commitType){
//                foundRepo = repository;
//            }
//        }
//        return RepoWithTheMostCommits;
//
//
//
//        if repository.commitsCount() >
//    }
}
