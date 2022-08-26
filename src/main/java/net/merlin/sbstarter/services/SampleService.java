package net.merlin.sbstarter.services;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.merlin.sbstarter.dtos.SamplePojo;

@Slf4j
@Service
public class SampleService {

    public SamplePojo sayHello(String name) {

        log.debug("Saying hello");

        String greeting;

        if (null != name) {
            greeting = "Hello, " + name + "!";
        } else {
            greeting = "Howdy, stranger!";
        }
        return new SamplePojo(greeting);
    }
}
