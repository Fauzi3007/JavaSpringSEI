/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fauzi.proyekLokasi.Entity;

import com.fauzi.proyekLokasi.ProyekLokasiApplication;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author USER
 */
@Entity
public class Lokasi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namaLokasi;
    private String negara;
    private String provinsi;
    private String kota;
    @CreationTimestamp
    private LocalDateTime createdAt;

    @ManyToMany(mappedBy = "lokasis")
    private Set<Proyek> proyeks = new HashSet<>();

    public Lokasi(Long id, String namaLokasi, String negara, String provinsi, String kota, LocalDateTime createdAt) {
        this.id = id;
        this.namaLokasi = namaLokasi;
        this.negara = negara;
        this.provinsi = provinsi;
        this.kota = kota;
        this.createdAt = createdAt;
    }

    // Getter dan Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Set<Proyek> getProyeks() {
        return proyeks;
    }

    public void setProyeks(Set<Proyek> proyeks) {
        this.proyeks = proyeks;
    }

    @Override
    public String toString() {
        return "Lokasi{" + "id=" + id + ", namaLokasi=" + namaLokasi + ", negara=" + negara + ", provinsi=" + provinsi + ", kota=" + kota + ", createdAt=" + createdAt + ", proyeks=" + proyeks + '}';
    }
    
}
