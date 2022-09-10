package com.ang.storemanageservice.config;

import com.alibaba.druid.filter.config.ConfigTools;

public class DruidConfig {

    public static void main(String[] args) throws Exception {
        // 需要加密的明文命名
        String password = "da.529529";
        // 调用 druid 生成私钥、公钥、密文
        ConfigTools.main(new String[]{password});
    }

}
