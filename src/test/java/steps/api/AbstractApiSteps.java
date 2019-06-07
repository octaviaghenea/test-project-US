package steps.api;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;

import net.thucydides.core.steps.ScenarioSteps;
import tools.constants.Constants;

public class AbstractApiSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	public static RequestSpecification tokenSpec = null;
	public static Map<String, String> extraHeaders = new HashMap<String, String>();
	public static String URL = Constants.URL_MAGENTO;
	public static Map<String, String> parametersMap = new HashMap<>();

	public static RequestSpecification getSpecWithExtraHeaders() {

		tokenSpec = new RequestSpecBuilder().setContentType(ContentType.JSON).setBaseUri(URL)
				.addHeader("Content-Type", "application/json").addHeaders(extraHeaders).build();
		return tokenSpec;
	}

	protected String getResource(String path) {
		return given().relaxedHTTPSValidation().spec(getSpecWithExtraHeaders()).when().get(path).then().assertThat()
				.statusCode(anyOf(is(201), is(200), is(302))).extract().asString();
	}

	protected <T> T getResource(String path, Class<T> responseClass) {
		return given().relaxedHTTPSValidation().spec(getSpecWithExtraHeaders()).when().get(path).then().assertThat()
				.statusCode(anyOf(is(201), is(200), is(302))).extract().as(responseClass);
	}

	protected static <T> T createResource(String path, Object requestBody, Class<T> responseClass) {
		return given().relaxedHTTPSValidation().spec(getSpecWithExtraHeaders()).body(requestBody).when().post(path)
				.then().assertThat().statusCode(anyOf(is(201), is(200), is(302))).extract().as(responseClass);
	}

	protected static String createResource(String path, Object requestBody) {
		return given().relaxedHTTPSValidation().spec(getSpecWithExtraHeaders()).body(requestBody).when().post(path).then()
				.assertThat().statusCode(anyOf(is(201), is(200), is(302))).extract().asString();
	}

	protected static void deleteResource(String path) {
		given().relaxedHTTPSValidation().spec(getSpecWithExtraHeaders()).when().delete(path).then().assertThat()
				.statusCode(anyOf(is(201), is(200), is(301))).extract().response().asString();
	}

	protected static <T> T updateResourse(String path, Object requestBody, Class<T> responseClass) {
		return given().relaxedHTTPSValidation().spec(getSpecWithExtraHeaders()).body(requestBody)
				.queryParams(parametersMap).when().put(path).then().assertThat()
				.statusCode(anyOf(is(201), is(200), is(302))).extract().as(responseClass);
	}

	protected static void updateResourse(String path, Object requestBody, Map<String, String> query) {
		given().relaxedHTTPSValidation().spec(getSpecWithExtraHeaders()).body(requestBody).queryParams(query).when()
				.put(path).then().assertThat().statusCode(anyOf(is(201), is(200), is(302)));
	}
}
