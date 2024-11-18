/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dailycodework.dreamshop.Model;

import jakarta.persistence.*;
import java.sql.Blob;
import lombok.*;

/**
 *
 * @author Administrator
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String fileType;
    
    @Lob
    private Blob image;
    private String downloadUrl;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
