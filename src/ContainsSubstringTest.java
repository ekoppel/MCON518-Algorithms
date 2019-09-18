import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsSubstringTest {
    @Test
    void SubstringTest(){
        String s = "Hello I am a string";
        String j = "string";

        boolean doesStringExistInsideHash = ContainsSubstring.hashMethod(s, j);
        boolean doesStringExistInsideWalk = ContainsSubstring.walkMethod(s, j);

        assertTrue(doesStringExistInsideWalk);
        assertTrue(doesStringExistInsideHash);
    }
}