/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fauzi.proyekLokasi.Controller;


import com.fauzi.proyekLokasi.Entity.Proyek;
import com.fauzi.proyekLokasi.Service.ProyekService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author USER
 */
@RestController
@RequestMapping("/api/proyek")
public class ProyekController {

    @Autowired
    private ProyekService proyekService;

    @PostMapping
    public Proyek tambahProyek(@RequestBody Proyek proyek) {
        return proyekService.saveProyek(proyek);
    }

    @GetMapping
    public List<Proyek> getAllProyek() {
        return proyekService.getAllProyek();
    }

    @PutMapping("/{id}")
    public Proyek updateProyek(@PathVariable Long id, @RequestBody Proyek proyek) {
        return proyekService.updateProyek(id, proyek);
    }

    @DeleteMapping("/{id}")
    public void deleteProyek(@PathVariable Long id) {
        proyekService.deleteProyek(id);
    }
}

