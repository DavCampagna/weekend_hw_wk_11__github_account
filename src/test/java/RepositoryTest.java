import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class RepositoryTest {

    Repository repository;
    Commit commit1;
    Commit commit2;
    Commit commit3;
    Commit commit4;

    @Before
    public void before() {
        repository = new Repository("pyramids_lab", "", RepositoryType.PUBLIC);
        commit1 = new Commit("refactor table", CommitType.REFACTOR, 1111);
        commit2 = new Commit("refactor datalist", CommitType.REFACTOR, 1112);
        commit3 = new Commit("update CSS", CommitType.OTHER, 1113);
        commit4 = new Commit("fix bug in topic filter", CommitType.BUGFIX, 1113);

        repository.addCommit(commit1);
        repository.addCommit(commit2);
        repository.addCommit(commit3);
    }

    @Test
    public void hasName() {
        assertEquals("pyramids_lab", repository.getName());
    }

    @Test
    public void hasDescription() {
        assertEquals("", repository.getDescription());
    }

    @Test
    public void hasType() {
        assertEquals(RepositoryType.PUBLIC, repository.getRepositoryType());
    }

    @Test
    public void commitsStartAsEmpty() {
        repository = new Repository("pyramids_lab", "", RepositoryType.PUBLIC);
        assertEquals(0, repository.commitsCount());
    }

    @Test
    public void canAddCommit() {
        repository.addCommit(commit4);
        assertEquals(4, repository.commitsCount());
    }

    @Test
    public void canFindCommitById() {
        Commit foundCommit = repository.findCommitById(1111);
        assertEquals(commit1, foundCommit);
    }

    @Test
    public void canFindCommitsByType() {
        ArrayList<Commit> commitsByType = repository.findCommitsByType(CommitType.REFACTOR);
        assert(commitsByType.contains(commit1));
        assert(commitsByType.contains(commit2));
    }
//    How can I represent the content of the newly created ArrayList in the assertEquals to show its content?
//    assertEquals([commit1, commit2], commitsByType);

}
