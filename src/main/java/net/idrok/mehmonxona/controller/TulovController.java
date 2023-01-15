package net.idrok.mehmonxona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.idrok.mehmonxona.service.TulovService;
import org.springframework.http.ResponseEntity;
import net.idrok.mehmonxona.entity.Tulov;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RequestMapping("api/tulov")
@RestController
public class TulovController{
    @Autowired
    TulovService tulovservice;

    @GetMapping()
    public ResponseEntity<Page<Tulov>> getall(@RequestParam(name = "key", required = false) String key, Pageable pageable) {
        if (key == null)
            key = "";
        return ResponseEntity.ok(tulovservice.getall(key, pageable));
    }
    @PostMapping()
    public ResponseEntity<Tulov> create(@RequestBody Tulov tulov) {
        return ResponseEntity.ok(tulovservice.create(tulov));
    }
    @PutMapping()
    public ResponseEntity<Tulov> update(@RequestBody Tulov tulov) {
        return ResponseEntity.ok(tulovservice.update(tulov));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Tulov> delete(@PathVariable Long id) {
        tulovservice.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    
}