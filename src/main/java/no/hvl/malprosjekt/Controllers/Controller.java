package no.hvl.malprosjekt.Controllers;

import no.hvl.malprosjekt.entities.TestString;
import no.hvl.malprosjekt.service.TestStringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Controller klasse for endepunkt <server-ip:port>/test
 */
@RequestMapping("/test")
@org.springframework.stereotype.Controller
public class Controller {
    /**
     * Objekt som gir databasetilgang for entitetsklassen 'TestString' vha en repository
     */
    private final TestStringService testStringService;

    /**
     *
     * @param testStringService Gir databasetilgang for 'TestString'.
     */
    @Autowired
    public Controller(TestStringService testStringService){
        this.testStringService = testStringService;
    }

    /**
     * Denne metoden kalles hvis noen klikker seg inn på websiden <server-ip:port>/test
     * Den henter ut alle TestSring objekter som er lagret i databasen, og legger dem inn i 'model''
     * @param model et objekt man kan putte inn informasjon i, slik at den kan vises i nettsiden som genereres
     * @return navnet på en .jsp fil, lokalisert i mappen webapp/WEB-INF/views
     */
    @GetMapping
    public String test(Model model){
        List<TestString> testStringList = testStringService.getAllTestStringsFromDatabase();
        model.addAttribute("testStrings", testStringList);
        return "OMG";
    }

    /**
     *Lagrer brukerinput i et TestString objekt, og lagrer dette i databasen
     * @param tekstBoksInput Det som bruker sendte inn vha tekstbokse
     * @return en streng som angir til hvilket endepunkt bruker sendes etterpå.
     */
    @PostMapping
     public String getInput(@RequestParam("NavnRequestParam")String tekstBoksInput){
        System.out.println(tekstBoksInput);
        TestString testString = new TestString(tekstBoksInput);
        testStringService.saveTestString(testString);
        return "redirect:/test";
    }
}
