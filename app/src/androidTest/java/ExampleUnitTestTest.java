import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

import io.swagger.client.api.WemediaTopApi;
import io.swagger.client.model.Post;

/**
 * Created by lifeix-101 on 2016/6/23.
 */
public class ExampleUnitTestTest extends TestCase {

    public void testMain() throws Exception {
        WemediaTopApi wemediaTopApi = new WemediaTopApi();
        List<Post> posts = wemediaTopApi.getTopPosts("visitor", Arrays.asList("coach"));
        System.out.print(posts.size());
    }
}