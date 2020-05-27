package com.bestbuy.bestbuy.testbase;

import com.bestbuy.bestbuy.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created By Nikita
 */
public class TestBase {

    public static PropertyReader propertyReader;

    @BeforeClass

    public static void init(){

        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
    }

}
