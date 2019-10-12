import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private RepositoryType repositoryType;
    private ArrayList<Commit> commits;

    public Repository( String name, String description, RepositoryType repositoryType) {
        this.name = name;
        this.description = description;
        this.repositoryType = repositoryType;
        this.commits = new ArrayList<Commit>();
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public RepositoryType getRepositoryType() {
        return this.repositoryType;
    }

    public int commitsCount() {
        return this.commits.size();
    }

    public void addCommit(Commit commit) {
        this.commits.add(commit);
    }

    public Commit findCommitById(int uniqueId) {
        Commit foundCommit = null;
        for(Commit commit : this.commits) {
            if (commit.getUniqueId() == uniqueId){
                foundCommit = commit;
            }
        }
        return foundCommit;
    }

    public Commit findCommitByType(CommitType commitType) {
        Commit foundCommit = null;
        for(Commit commit : this.commits) {
            if (commit.getCommitType() == commitType){
                foundCommit = commit;
            }
        }
        return foundCommit;
    }

}
