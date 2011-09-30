import org.specs2.mutable._
import org.openqa.selenium._
import org.openqa.selenium.firefox._
import org.openqa.selenium.htmlunit._

class IntegrationPlaceholder extends Specification {
 
  val driver = new HtmlUnitDriver     //FirefoxDriver
    driver.get("http://maps.google.com")
  	//val inputElement = driver.findElement(By.name("q"))
    //inputElement.sendKeys("San Francisco")
    //inputElement.submit
  
  "Google Maps" should { 

  "have the proper title" in {
   driver.getTitle() must startWith("Google Places")   
  }

/*
  "have the proper location title" in {
    val titleElement = driver.findElement(By.xpath("//span[@class='pp-place-title']/span"))
    titleElement.getText must startWith("San Francisco, CA")
  } */ 
  }
}
