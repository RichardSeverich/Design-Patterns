package builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test Class.
 */
public class ResponseManagerTest {

    /**
     * Test.
     */
    @Test
    public void testGetRequest() {
        final String endpoint = "https://api.github.com";
        final String expectedResult = "GET WITH BODY RESPONSE FROM https://api.github.com";
        final String actualResult = new Builder()
                .protocolBuilder(new ResponseManager(), endpoint)
                .get()
                .setBody()
                .getProtocol()
                .getResult();
        assertEquals(actualResult, expectedResult);
    }

    /**
     * Test.
     */
    @Test
    public void testPostRequest() {
        final String endpoint = "https://api.github.com";
        final String expectedResult = "POST RESPONSE FROM https://api.github.com";
        final String actualResult = new Builder()
                .protocolBuilder(new ResponseManager(), endpoint)
                .post()
                .getProtocol()
                .getResult();
        assertEquals(actualResult, expectedResult);
    }

    /**
     * Test.
     */
    @Test
    public void testPutRequest() {
        final String endpoint = "https://api.github.com";
        final String expectedResult = "PUT WITH BODY RESPONSE FROM https://api.github.com";
        final String actualResult = new Builder()
                .protocolBuilder(new ResponseManager(), endpoint)
                .put()
                .setBody()
                .getProtocol()
                .getResult();
        assertEquals(actualResult, expectedResult);
    }

    /**
     * Test.
     */
    @Test
    public void testDeleteRequest() {
        final String endpoint = "https://api.github.com";
        final String expectedResult = "DELETE RESPONSE FROM https://api.github.com";
        final String actualResult = new Builder()
                .protocolBuilder(new ResponseManager(), endpoint)
                .delete()
                .getProtocol()
                .getResult();
        assertEquals(actualResult, expectedResult);
    }
}
