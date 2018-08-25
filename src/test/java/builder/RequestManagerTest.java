package builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test Class.
 */
public class RequestManagerTest {

    /**
     * Test.
     */
    @Test
    public void testGetRequest() {
        final String endpoint = "https://api.github.com/";
        final String expectedResult = "GET REQUEST TO https://api.github.com/";
        final String actualResult = new Builder()
                .protocolBuilder(new RequestManager(), endpoint)
                .get()
                .getProtocol()
                .getResult();
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test.
     */
    @Test
    public void testPostRequest() {
        final String endpoint = "https://api.github.com/";
        final String expectedResult = "POST WITH BODY REQUEST TO https://api.github.com/";
        final String actualResult = new Builder()
                .protocolBuilder(new RequestManager(), endpoint)
                .post()
                .setBody()
                .getProtocol()
                .getResult();
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test.
     */
    @Test
    public void testPutRequest() {
        final String endpoint = "https://api.github.com/";
        final String expectedResult = "PUT WITH BODY REQUEST TO https://api.github.com/";
        final String actualResult = new Builder()
                .protocolBuilder(new RequestManager(), endpoint)
                .put()
                .setBody()
                .getProtocol()
                .getResult();
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test.
     */
    @Test
    public void testDeleteRequest() {
        final String endpoint = "https://api.github.com/";
        final String expectedResult = "DELETE REQUEST TO https://api.github.com/";
        final String actualResult = new Builder()
                .protocolBuilder(new RequestManager(), endpoint)
                .delete()
                .getProtocol()
                .getResult();
        assertEquals(expectedResult, actualResult);
    }
}
