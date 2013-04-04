import org.specs2.mutable._
import org.openqa.selenium._
import org.openqa.selenium.firefox._
import org.openqa.selenium.htmlunit._
import org.openqa.selenium.By.ByTagName

class FFIntegrationPlaceholder extends Specification {

  val driver = new FirefoxDriver
  driver.get("http://localhost")

  "Page" should {
    "have an h1 elem containing the text" in {
      val inputElement = driver.findElement(By.tagName("h1"))
      inputElement.getText must startWith("Ta")
    }
  }

  //inputElement.sendKeys("San Francisco")
  //inputElement.submit
  /*  
  "Google Maps" should { 

  "have the proper title" in {
   driver.getTitle() must startWith("Google Places")   
  }


  "have the proper location title" in {
    val titleElement = driver.findElement(By.xpath("//span[@class='pp-place-title']/span"))
    titleElement.getText must startWith("San Francisco, CA")
  }  
  }*/
}
