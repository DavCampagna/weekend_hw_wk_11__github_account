import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CommitTest {

    Commit commit1;

    @Before
    public void before() {
        commit1 = new Commit("refactor data", CommitType.REFACTOR, 1111);
    }

    @Test
    public void hasDescription() {
        assertEquals("refactor data", commit1.getDescription());
    }

    @Test
    public void hasType() {
        assertEquals(CommitType.REFACTOR, commit1.getCommitType());
    }

    @Test
    public void hasUniqueId() {
        assertEquals(1111, commit1.getUniqueId());
    }

}


