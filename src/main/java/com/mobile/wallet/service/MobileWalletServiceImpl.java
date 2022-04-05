package com.mobile.wallet.service;

import com.mobile.wallet.bean.MobileWallet;
import com.mobile.wallet.dto.MobileWalletDto;
import com.mobile.wallet.repository.MobileWalletRepository;
import com.mobile.wallet.util.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MobileWalletServiceImpl implements MobileWalletService{

    @Autowired
    MobileWalletRepository mobileWalletRepository;

    @Override
    public Flux<MobileWallet> findAllMobileWallet() {
        return mobileWalletRepository.findAll();
    }

    @Override
    public Mono<MobileWallet> findByIdMobileWallet(String id){
        return mobileWalletRepository.findById(id);
    }

    @Override
    public Mono<MobileWallet> saveMobileWallet(MobileWallet mobileWallet){
        return mobileWalletRepository.save(mobileWallet);
    }

    @Override
    public Mono<MobileWalletDto> updateMobileWallet(Mono<MobileWalletDto> mobileWalletDtoMono, String id){
        return mobileWalletRepository.findById(id)
                .flatMap(p -> mobileWalletDtoMono.map(AppUtils::dtoToEntity)
                        .doOnNext(e -> e.setId(id)))
                .flatMap(mobileWalletRepository::save)
                .map(AppUtils::entityToDto);
    }

    @Override
    public Mono<Void> deleteByIdMobileWallet(String id){
        return mobileWalletRepository.deleteById(id);
    }


}
