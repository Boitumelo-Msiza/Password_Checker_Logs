import org.junit.Assert;
import org.junit.Test;


public class PasswordCheckerTest {

    PasswordChecker pc = new PasswordChecker();

    String password = "Nonk@098765";

    @Test

    public void Valid(){

        Assert.assertEquals(true, pc.PasswordIsValid(password));
    }

    @Test
    public void passwordIsOkay(){

        Assert.assertEquals(true, pc.passwordIsOk());
    }

}
