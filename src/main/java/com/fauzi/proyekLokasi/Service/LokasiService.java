/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fauzi.proyekLokasi.Service;

import com.fauzi.proyekLokasi.Entity.Lokasi;
import com.fauzi.proyekLokasi.Repository.LokasiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class LokasiService {
    @Autowired
    private LokasiRepository lokasiRepository;

    public Lokasi saveLokasi(Lokasi lokasi) {
        return lokasiRepository.save(lokasi);
    }

    public List<Lokasi> getAllLokasi() {
        return lokasiRepository.findAll();
    }

    public Lokasi updateLokasi(Long id, Lokasi lokasi) {
        Lokasi existingLokasi = lokasiRepository.findById(id).orElseThrow(() -> new RuntimeException("Lokasi not found"));
        existingLokasi.setNamaLokasi(lokasi.getNamaLokasi());
        existingLokasi.setNegara(lokasi.getNegara());
        existingLokasi.setProvinsi(lokasi.getProvinsi());
        existingLokasi.setKota(lokasi.getKota());
        return lokasiRepository.save(existingLokasi);
    }

    public void deleteLokasi(Long id) {
        lokasiRepository.deleteById(id);
    }
}

