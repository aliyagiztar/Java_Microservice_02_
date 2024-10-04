package com.aliyagiztar.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString // Nesneyi termianlde yazdirmak icin ( nesne bilgisi )
@MappedSuperclass // ust sinif icin kullanilir.
@SuperBuilder // bir sınıftan nesne turetmek icin
@Data // Sett get gerek yok
@NoArgsConstructor // bos parametreli hazirlayici yapici metodu olusturur.
@AllArgsConstructor // dolu parametreli hazirlayici yapıcı metodunu olusturur


@Entity
@Table(name = "logintbl_auth")

public class Auth extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String password;


}