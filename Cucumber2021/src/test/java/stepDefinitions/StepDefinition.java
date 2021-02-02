package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class StepDefinition {
	double num1, num2, sum;
	
	@Given("user have {double} and {double}")
	public void user_have_and(Double double1, Double double2) {
		num1 = double1;
		num2 = double2;
	}
	@When("user adds the numbers")
	public void user_adds_the_numbers() {
		sum = num1 + num2;
	}
	@Then("user gets sum as {double}")
	public void user_gets_sum_as(Double double1) {
		 Assert.assertEquals(sum, double1);
	}
	
	@Then("user print {string} as output")
	public void user_print_as_output(String string) {
	    System.out.println(string);
	}
	
	@Then("the result output is")
	public void the_result_output_is(io.cucumber.datatable.DataTable dataTable) {
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
		List<List<String>> data = dataTable.asLists();
		System.out.println(data.get(0).get(0));
		//System.out.println(data.get(1));
		//System.out.println(data.get(2));
		
		}



}


