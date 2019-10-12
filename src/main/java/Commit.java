public class Commit {

    private String description;
    private CommitType commitType;
    private int uniqueId;

    public Commit( String description, CommitType commitType, int uniqueId) {
        this.description = description;
        this.commitType = commitType;
        this.uniqueId = uniqueId;
    }

    public String getDescription() {
        return this.description;
    }

    public CommitType getCommitType() {
        return this.commitType;
    }

    public int getUniqueId() {
        return this.uniqueId;
    }
}
