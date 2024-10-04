package com.aliyagiztar.model;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@MappedSuperclass // ust sinif icin kullanilir.
@SuperBuilder // bir sınıftan nesne turetmek icin
@Data // Sett get gerek yok
@NoArgsConstructor // bos parametreli hazirlayici yapici metodu olusturur.
@AllArgsConstructor // dolu parametreli hazirlayici yapıcı metodunu olusturur





public class BaseEntity {

    Long createAt;
    Long updateAt;

    boolean stateİ;
}
