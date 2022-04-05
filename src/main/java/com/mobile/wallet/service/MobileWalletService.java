package com.mobile.wallet.service;

import com.mobile.wallet.bean.MobileWallet;
import com.mobile.wallet.dto.MobileWalletDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MobileWalletService {

    public Flux<MobileWallet> findAllMobileWallet();

    public Mono<MobileWallet> findByIdMobileWallet(String id);

    public Mono<MobileWallet> saveMobileWallet(MobileWallet mobileWallet);

    public Mono<MobileWalletDto> updateMobileWallet(Mono<MobileWalletDto> mobileWalletDtoMono, String id);

    public Mono<Void> deleteByIdMobileWallet(String id);

}
