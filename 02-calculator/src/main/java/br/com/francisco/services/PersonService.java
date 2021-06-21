package br.com.francisco.services;

import br.com.francisco.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();

    public Person findById(String id) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Francisco");
        person.setLastName("Sousa");
        person.setAddress("Sobradinho - DF - Brasil");
        person.setGender("Male");
        return person;
    }
}
