import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RepositoryTest {

    Repository repository;
//    Commit commit1;

    @Before
    public void before() {
        repository = new Repository("pyramids_lab", "", RepositoryType.PUBLIC);
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

}
