import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {

  @Test
  public void contact_initializesContactFullName_true() {
    Contact myContact = new Contact("John Doe");
    assertEquals(true, myContact instanceof Contact);
  }

  @Test
  public void contact_hasName_JohnDoe() {
    Contact myContact = new Contact("John Doe");
    String expected = "John Doe";
    assertEquals(expected, myContact.getName());
  }
}
