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

import net.idrok.mehmonxona.entity.Buyurtma;
import net.idrok.mehmonxona.service.BuyurtmaService;

@RestController
@RequestMapping("/api/buyurtma")
@CrossOrigin(maxAge = 3600)
public class BuyurtmaController {
     @Autowired
     BuyurtmaService bs;
   
     @GetMapping()
    public ResponseEntity<Page<Buyurtma>> getall(@RequestParam(name = "key", required = false) String key,
            Pageable pageable) { if (key == null) key = "";   
        return ResponseEntity.ok(bs.getall(key, pageable));
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Buyurtma> getById(@PathVariable Long id){
        return ResponseEntity.ok(bs.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Buyurtma> create(@RequestBody Buyurtma buyurtma) {
        return ResponseEntity.ok(bs.create(buyurtma));
    }

    

    @PutMapping()
    public ResponseEntity<Buyurtma> update(@RequestBody Buyurtma buyurtma) {
        return ResponseEntity.ok(bs.update(buyurtma));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Buyurtma> delete(@PathVariable Long id) {
        bs.deleteById(id);
        return ResponseEntity.noContent().build();
    }


} 
