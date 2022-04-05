package com.mobile.wallet.controller;

import com.mobile.wallet.bean.MobileWallet;
import com.mobile.wallet.dto.MobileWalletDto;
import com.mobile.wallet.service.MobileWalletService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@RestController
@RequestMapping(path = "/api/mobilewallet")
public class MobileWalletController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MobileWalletController.class);

    @Resource
    private MobileWalletService mobileWalletService;

    @GetMapping("/")
    public Flux<MobileWallet> findAllMobileWallet(){
        return mobileWalletService.findAllMobileWallet();
    }

    @GetMapping("/{id}")
    public Mono<MobileWallet> findByIdMobileWallet(String id){
        return mobileWalletService.findByIdMobileWallet(id);
    }

    @PostMapping("/create")
    public Mono<MobileWallet> saveMobileWallet(MobileWallet mobileWallet){
        return mobileWalletService.saveMobileWallet(mobileWallet);
    }

    @PutMapping("/{id}")
    public Mono<MobileWalletDto> updateMobileWallet(Mono<MobileWalletDto> mobileWalletDtoMono, String id){
        return mobileWalletService.updateMobileWallet(mobileWalletDtoMono, id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteByIdMobileWallet(String id){
        return mobileWalletService.deleteByIdMobileWallet(id);
    }

}
