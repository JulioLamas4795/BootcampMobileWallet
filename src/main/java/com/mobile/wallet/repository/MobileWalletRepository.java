package com.mobile.wallet.repository;

import com.mobile.wallet.bean.MobileWallet;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

@Configuration
public interface MobileWalletRepository extends ReactiveMongoRepository<MobileWallet, String> {



}
