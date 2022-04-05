package com.mobile.wallet.util;

import com.mobile.wallet.bean.MobileWallet;
import com.mobile.wallet.dto.MobileWalletDto;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static MobileWalletDto entityToDto(MobileWallet mobileWallet){
        MobileWalletDto mobileWalletDto=new MobileWalletDto();
        BeanUtils.copyProperties(mobileWallet,mobileWalletDto);
        return mobileWalletDto;
    }

    public static MobileWallet dtoToEntity(MobileWalletDto mobileWalletDto){
        MobileWallet mobileWallet=new MobileWallet();
        BeanUtils.copyProperties(mobileWalletDto,mobileWallet);
        return mobileWallet;
    }

}
