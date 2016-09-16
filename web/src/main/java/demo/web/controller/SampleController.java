package demo.web.controller;

import demo.bal.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@RestController
@RequestMapping(value = "/sample/")
public class SampleController {

    @Autowired
    SampleService sampleService;

    @PostMapping("")
    public ResponseEntity add() {
        throw new  NotImplementedException();
    }

    @PutMapping("")
    public ResponseEntity list() {
        throw new  NotImplementedException();
    }

    @GetMapping("{sample_id}/")
    public ResponseEntity item() {
        throw new  NotImplementedException();
    }

    @PutMapping("{sample_id}/")
    public ResponseEntity edit() {
        throw new  NotImplementedException();
    }

    @DeleteMapping("{sample_id}/")
    public ResponseEntity delete() {
        throw new  NotImplementedException();
    }

}
