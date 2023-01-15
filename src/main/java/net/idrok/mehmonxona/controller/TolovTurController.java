package net.idrok.mehmonxona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.idrok.mehmonxona.entity.TolovTur;
import net.idrok.mehmonxona.service.TolovTurService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/tolovtur")
@CrossOrigin(maxAge = 3600)
public class TolovTurController {
    @Autowired
    TolovTurService ts;


    @GetMapping()
    public ResponseEntity<Page<TolovTur>> getall(@RequestParam(name = "key", required = false) String key,
    Pageable pageable) {
        if (key == null)
            key = "";   
        return ResponseEntity.ok(ts.getAll(key, pageable));
    }

    @PostMapping()
    public ResponseEntity <TolovTur> create(@RequestBody
    TolovTur tolovTur) {
        //TODO: process POST request
        
        return ResponseEntity.ok(ts.create(tolovTur));
    }
    @PutMapping()
    public ResponseEntity<TolovTur> update(@RequestBody TolovTur tolovtur) {
        return ResponseEntity.ok(ts.update(tolovtur));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TolovTur> delete(@PathVariable Long id){
        ts.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
}
