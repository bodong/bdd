package xyz.pakwo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import xyz.pakwo.model.Customer;
import xyz.pakwo.service.GenderFilterService;
import xyz.pakwo.service.GenerateCertificate;
import xyz.pakwo.service.impl.GenderFilterServiceImpl;
import xyz.pakwo.service.impl.GenerateCertificateImpl;

/**
 * @author sarwo.wibowo
 **/
public class GenderFilterTest {

    Customer customer = null;
    GenderFilterService genderFilterService = new GenderFilterServiceImpl();
    GenerateCertificate generateCertificate = new GenerateCertificateImpl();
    @Given("user enter is {string}")
    public void user_enter_is(String string) {
        customer = genderFilterService.getByName(string);
        Assert.assertEquals(string, customer.getName());
    }

    @Given("gender is  {string}")
    public void gender_is(String string) {
        Assert.assertEquals(string, customer.getGender());
    }

    @Given("marital status is {string}")
    public void marital_status_is(String string) {
        Assert.assertEquals(string, customer.getStatus());
    }
    @When("generate certificate")
    public void generate_certificate() {
        generateCertificate.generate(customer);
    }
    @Then("title {string} must be present before name")
    public void title_must_be_present_before_name(String string) {
        Assert.assertEquals(string, customer.getTitle());
    }
}
