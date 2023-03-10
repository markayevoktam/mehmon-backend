package net.idrok.mehmonxona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.idrok.mehmonxona.entity.Bino;
import net.idrok.mehmonxona.service.BinoService;

@RestController
@RequestMapping("/api/bino")
@CrossOrigin(maxAge = 3600)
public class BinoController {
    @Autowired
    BinoService bs;

    @GetMapping()
    public ResponseEntity<Page<Bino>> getall(@RequestParam(name = "key", required = false) String key,
            Pageable pageable) {
        if (key == null)
            key = "";   
        return ResponseEntity.ok(bs.getall(key, pageable));
    }

    @PostMapping()
    public ResponseEntity<Bino> create(@RequestBody Bino bino) {
        return ResponseEntity.ok(bs.create(bino));
    }

    @PutMapping()
    public ResponseEntity<Bino> update(@RequestBody Bino bino) {
        return ResponseEntity.ok(bs.update(bino));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Bino> delete(@PathVariable Long id) {
        bs.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
