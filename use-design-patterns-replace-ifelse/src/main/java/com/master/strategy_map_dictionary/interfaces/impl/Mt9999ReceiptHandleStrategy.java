package com.master.strategy_map_dictionary.interfaces.impl;

import com.master.strategy_map_dictionary.bean.Receipt;
import com.master.strategy_map_dictionary.interfaces.IReceiptHandleStrategy;

public class Mt9999ReceiptHandleStrategy implements IReceiptHandleStrategy {

    @Override
    public void handleReceipt(Receipt receipt) {
        System.out.println("解析报文MT9999:" + receipt.getMessage());
    }

}
