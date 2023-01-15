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

import net.idrok.mehmonxona.entity.*;
// import net.idrok.mehmonxona.controller.*;
import net.idrok.mehmonxona.service.*;
@RestController
@RequestMapping("/api/xodim")
@CrossOrigin(value = "http://localhost:4200", maxAge = 3600)
public class XodimController {
    @Autowired
    XodimService xodimService;

    @GetMapping()
    public ResponseEntity<Page<Xodim>> getAll(@RequestParam(name = "key", required = false)String key,  Pageable pageable) {
        if (key == null)
            key = "";
        return ResponseEntity.ok(xodimService.getAll(key,  pageable));
    }


   

    @GetMapping("/{id}")
    public ResponseEntity<Xodim> getById(@PathVariable Long id) {
        return ResponseEntity.ok(xodimService.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Xodim> create(@RequestBody Xodim xodim) {
        return ResponseEntity.ok(xodimService.create(xodim));
    }

    @PutMapping()
    public ResponseEntity<Xodim> update(@RequestBody Xodim xodim) {
        return ResponseEntity.ok(xodimService.update(xodim));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        xodimService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
