package org.apache.dubbo.demo.provider;

import org.apache.dubbo.rpc.service.GenericException;
import org.apache.dubbo.rpc.service.GenericService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericServiceImpl implements GenericService {

    @Override
    public Object $invoke(String method, String[] parameterTypes, Object[] args) throws GenericException {
        Map<String, Object> result = new HashMap<>();
        result.put("acctName", "账户名");


        List<Map<String, Object>> accounts = new ArrayList<>();
        Map<String, Object> card1 = new HashMap<>();
        card1.put("cardNo", "卡号1");
        card1.put("cardDate", "有效期1");
        accounts.add(card1);

        Map<String, Object> card2 = new HashMap<>();
        card2.put("cardNo", "卡号1");
        card2.put("cardDate", "有效期1");
        accounts.add(card2);

        result.put("accounts", accounts);


        return result;
    }
}
