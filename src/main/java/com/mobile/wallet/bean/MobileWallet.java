package com.mobile.wallet.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "mobilewallet")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MobileWallet {

    @Id
    private String id;
    private String identificationNumber;
    private String cellphoneNumber;
    private String imeiCellphone;
    private String email;

    private Double balance;

    private String idClient;
    private Boolean accountAssociate;
    private String idAccount;
}
