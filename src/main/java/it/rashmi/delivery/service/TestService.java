package it.rashmi.delivery.service;

import it.rashmi.delivery.model.TestModel;
import it.rashmi.delivery.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestService
{
    @Autowired
    private TestRepository testRepository;

    public List<TestModel> getAllTests()
    {
        return this.testRepository.findAll().stream()
                                  .map( test -> new TestModel( test.getID(), test.getName() ) )
                                  .collect( Collectors.toList() );
    }
}
