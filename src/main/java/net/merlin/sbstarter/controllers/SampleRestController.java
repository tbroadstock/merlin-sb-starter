package net.merlin.sbstarter.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.merlin.sbstarter.dtos.SamplePojo;
import net.merlin.sbstarter.services.SampleService;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class SampleRestController {
    
    private final SampleService helloService;
    
    @GetMapping("/hello")
    public ResponseEntity<SamplePojo> sayHello(@RequestParam(required=false) String name) {
        
        log.debug("Calling service method");
        SamplePojo greetingPojo = helloService.sayHello(name);

        return ResponseEntity.ok(greetingPojo);
    }
}
