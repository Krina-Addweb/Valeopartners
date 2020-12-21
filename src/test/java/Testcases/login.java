package Testcases;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

public class login extends Basecase {
    @Test(priority = 1)
    public void subjectValidation() throws IOException, InterruptedException, SQLException {
        logger = extent.createTest("Test if all the mandatory fields shows validation messages");
//        StudentInformation SI = new StudentInformation(driver, logger);
//        SI.loginWithCredentials2("addwebsolution@gmail.com", "addweb123");
//        AcademicsSubjects subjects = new AcademicsSubjects(driver, logger);
//        subjects.openNewTab();
//        subjects.SubjectValidation();
    }
}