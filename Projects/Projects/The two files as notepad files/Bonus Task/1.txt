package BonusTask;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Task1 {

        // 1- Get a random user (postID), print out its comments to console.
        @Test
        public void PostID() {
            Response response = given().when().get("https://jsonplaceholder.typicode.com/")
                    .then().assertThat().statusCode(200).extract().response();
            String theresponseInstring = response.asString();
            System.out.println(theresponseInstring);
            JsonPath Path = new JsonPath(theresponseInstring);
            String firstComments = Path.getString("comments");
            System.out.println(firstComments);
        }
        @Test
        public void PostID2() {
            Response response = given().contentType(ContentType.JSON).when().get("https://jsonplaceholder.typicode.com/posts?postID=2")
                    .then().assertThat().statusCode(200).extract().response();
            String responseInString = response.asString();
            System.out.println(responseInString);
            JsonPath jsonPath = new JsonPath(responseInString);
            String userPosts = jsonPath.getString("title");
            System.out.println(userPosts);
            String albumsId = response.asString();
            System.out.println(albumsId);
            response.then().assertThat().body("id", everyItem(allOf(greaterThanOrEqualTo(300))));
            JsonPath jsonPath = new JsonPath(responseInString);
            String userTitles = jsonPath.getString("todos");
            System.out.println(userTitles);

        }
    }

