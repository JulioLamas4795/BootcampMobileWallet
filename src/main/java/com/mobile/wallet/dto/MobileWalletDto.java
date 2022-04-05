package com.mobile.wallet.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MobileWalletDto {

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
