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

import net.idrok.mehmonxona.entity.XonaTur;

import net.idrok.mehmonxona.service.XonaturService;

@RestController
@RequestMapping("/api/xonatur")
@CrossOrigin(maxAge = 3600)
public class XonaTurController {
    @Autowired
    XonaturService xt;

    @GetMapping()
    public ResponseEntity<Page<XonaTur>> getall(@RequestParam(name = "key", required = false) String key,
            Pageable pageable) {
        if (key == null)
            key = "";
        return ResponseEntity.ok(xt.getAll(key, pageable));
    }

    @PostMapping()
    public ResponseEntity<XonaTur> create(@RequestBody XonaTur x) {
        return ResponseEntity.ok(xt.create(x));
    }

    @PutMapping()
    public ResponseEntity<XonaTur> update(@RequestBody XonaTur Xonatur) {
        return ResponseEntity.ok(xt.update(Xonatur));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<XonaTur> delete(@PathVariable Long id) {
        xt.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}