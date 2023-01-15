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

import net.idrok.mehmonxona.entity.Status;
import net.idrok.mehmonxona.service.StatusService;

@RestController
@RequestMapping("/api/status")
@CrossOrigin(maxAge = 3600)
public class StatusController {
    @Autowired
    StatusService ss;

    @GetMapping()
    public ResponseEntity<Page<Status>> getall(@RequestParam(name = "key", required = false) String key,
            Pageable pageable) {
        if (key == null)
            key = "";
        return ResponseEntity.ok(ss.getall(key, pageable));
    }

    @PostMapping()
    public ResponseEntity<Status> create(@RequestBody Status status) {
        return ResponseEntity.ok(ss.create(status));
    }

    @PutMapping()
    public ResponseEntity<Status> update(@RequestBody Status status) {
        return ResponseEntity.ok(ss.update(status));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Status> delete(@PathVariable Long id) {
        ss.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
