/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fauzi.proyekLokasi.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "proyek_lokasi")
public class ProyekLokasi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "proyek_id")
    private Proyek proyek;
    @ManyToOne
    @JoinColumn(name = "lokasi_id")
    private Lokasi lokasi;

    // Getter dan Setter

    public ProyekLokasi(Long id, Proyek proyek, Lokasi lokasi) {
        this.id = id;
        this.proyek = proyek;
        this.lokasi = lokasi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Proyek getProyek() {
        return proyek;
    }

    public void setProyek(Proyek proyek) {
        this.proyek = proyek;
    }

    public Lokasi getLokasi() {
        return lokasi;
    }

    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }

    @Override
    public String toString() {
        return "ProyekLokasi{" + "id=" + id + ", proyek=" + proyek + ", lokasi=" + lokasi + '}';
    }
    
    
}
