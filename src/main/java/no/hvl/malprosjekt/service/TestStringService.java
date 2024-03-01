package no.hvl.malprosjekt.service;

import no.hvl.malprosjekt.entities.TestString;
import no.hvl.malprosjekt.repositories.TestStringRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestStringService {
    private final TestStringRepo testStringRepo;

    @Autowired
    public TestStringService(TestStringRepo testStringRepo) {
        this.testStringRepo = testStringRepo;
    }
    public void saveTestString(TestString testString){
        this.testStringRepo.save(testString);
    }
    public List<TestString> getAllTestStringsFromDatabase(){
        return testStringRepo.findAll();
    }
}
