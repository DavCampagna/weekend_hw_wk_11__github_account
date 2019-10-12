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
}
