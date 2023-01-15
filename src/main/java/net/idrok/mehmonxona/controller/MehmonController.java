package net.idrok.mehmonxona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.idrok.mehmonxona.entity.Mehmon;
import net.idrok.mehmonxona.service.MehmonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/mehmon")
@CrossOrigin(maxAge = 3600)
public class MehmonController {
    
    @Autowired
    MehmonService mehmonSVC;

    @GetMapping()
    public ResponseEntity<Page<Mehmon>> getAll(@RequestParam(name="key", required = false) String key, Pageable pageable){
        if(key==null) key = "";
        return ResponseEntity.ok(mehmonSVC.getAll(key, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mehmon> getById(@PathVariable Long id){
        return ResponseEntity.ok(mehmonSVC.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Mehmon> create(@RequestBody Mehmon m){
        return ResponseEntity.ok( mehmonSVC.create(m));
    }

    @PutMapping()
    public ResponseEntity<Mehmon> update(@RequestBody Mehmon m){
        return ResponseEntity.ok(mehmonSVC.update(m));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        mehmonSVC.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
}
