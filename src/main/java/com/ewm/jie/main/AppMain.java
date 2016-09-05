package com.ewm.jie.main;

import com.alibaba.fastjson.JSONObject;
import com.ewm.jie.util.MatrixHelper;

/**
 * Created by jackie.chen on 2016/8/26.
 */
public class AppMain {

    public static void main(String[] args) {
        // 生成二维码
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("auther","jackie.chen");
        jsonObject.put("url","http://www.baidu.com");
        MatrixHelper.str2Ewm(jsonObject.toJSONString());
        // 解析二维码
        MatrixHelper.ewm2Str(null);
    }
}
