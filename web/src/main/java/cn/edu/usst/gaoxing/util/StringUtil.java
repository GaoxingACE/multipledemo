package cn.edu.usst.gaoxing.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Date;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    //年月日时分秒字符串匹配正则表达式,
    // 包含对闰年，2月份日期与其他月份不同的严格匹配
    //格式如下：
    //yyyyy-mm-dd hh:mm:ss
    public static String timePattern="^((([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29))\\s+([0-1]?[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";


    /*
    @param value 需要被匹配的字符串
    @param regex 正则表达式字符串
    @return 返回匹配结果
    * */
    public static boolean matchRegex(String value, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    /*
    json字符串转map
    */
    public static Map json2Map(String jsonString){

        JSONObject jsonObject= JSON.parseObject(jsonString);
        Map<String,String> map=JSONObject.toJavaObject(jsonObject,Map.class);
        return map;
    }

    /*
    map转json字符串
    */
    public String map2Json(Map map){
        return JSON.toJSONString(map);
    }

    public static boolean isEmpty(String input){
        if(input==null||input==""){
            return true;
        }
        return false;
    }
    public static boolean isEmpty(Integer input){
        String temp=Integer.toString(input);
        if(temp==null||temp==""){
            return true;
        }
        return false;
    }

    public static Integer getId(){
        return new Long(new Date().getTime()/1000).intValue();
    }
}
