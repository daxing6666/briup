package com.briup.utils;

import android.os.Environment;
import com.briup.utils.file.FileUtils;
import java.io.File;

/**
 * [description about this class]
 * 整个apk静态变量的设置
 * @author jack
 */

public class Constants {

    //=============================缓存数据=================================
    public static int CACHE_SIZE = 10 * 1024 * 1024;//10MB
    //=============================文件操作相关==============================

    /**
     * 整个应用程序文件夹创建的根目录位置(直接暴露在手机目录下,用户很容易可见)
     */
    public static String ROOT_FILE_PATH = Environment.getExternalStorageDirectory().getPath() + File.separator +
            ApkUtils.getInstance().getApkName();
    /**
     * 整个应用程序文件夹创建的缓存根目录位置(直接暴露在手机目录下,用户不易可见)
     * /storage/emulated/0/Android/data/包名/cache/包名
     */
    public static String CACHE_ROOT_FILE_PATH = ApkUtils.getInstance().getDiskCacheDirPath() + File.separator +
            ApkUtils.getInstance().getApkPackageName();

    //图片的根目录
    public static String DEFAULT_PHOTO_IMAGE_DIR = FileUtils.getInstance().getRootDirectory() +
            File.separator + "photo_image";

    //=============================网络相关==============================
    /***
     * HTTP头部写的token的值
     */
    public static final String TOKEN = "X-Token";
    private static final int readTimeOut = 30;//数据读取超时时间，默认为30s
    private static final int writeTimeOut = 30; //写超时时间，默认为15s
    private static final int connectTimeOut = 25; //连接超时时间，默认为25s

    //=============================项目配置=================================
    /***
     * http请求中添加的header key
     */
    public static final String SESSION_ID = "sessionId";
    /**
     * HTTP header中的cookie值KEY
     */
    public static final String COOKIE = "cookie";
    /***
     * http请求中添加的header key
     */
    public static final String USER_AGENT_KEY = "user-agent";
    /***
     * HTTP头部写的user_agent的值
     */
    public static final String USER_AGENT_VALUE = "UA_HKWY";
    /**
     * HTTP header中的cookie值VALUE的前缀
     */
    public static final String SID = "sid=";
    /***
     * http请求中添加的header key
     */
    public static final String USER_ID = "userId";

    /***
     * 字符串使用到的分隔符
     */
    public static final String SPLIT = "~";

    /**
     * 框架基本常量设置
     */
    public static final int NO_NET_NUMBER = -1000;
    public static final int DEFAULT_NUMBER = 10;
    public static String IP_PORT_DEFAULT = "https://www.iumer.cn";
    public static String BASE_API_URL = IP_PORT_DEFAULT +"/ymg/webService/personnel";
    public static String IP_PORT_DEFAULT_PICTURE = "https://www.iumer.cn";

    /*public static String BASE_API_URL = "https://192.168.0.32:8080/ymg/webService/personnel";
    public static String IP_PORT_DEFAULT_PICTURE = "http://192.168.0.32:8081";*/

    /**
     * 用户中心
     */
    public static String editUserInfo = BASE_API_URL + "/sys/user/editUserInfo";
    public static String USER_REGISTER = BASE_API_URL + "/sys/user/register";
    public static String selectUserInfo = BASE_API_URL + "/sys/user/selectUserInfo";
    public static String USER_LOGIN = BASE_API_URL + "/sys/user/login";
    public static String USER_UPDATE_PASSWORD = BASE_API_URL + "/sys/user/updatePassword";
    public static String customerMapList = BASE_API_URL + "/biz/customer/customerMapList";

    /**
     * 意向
     */
    public static String addIntention = BASE_API_URL + "/biz/customer/addIntention";
    public static String selectCustomerInfoList = BASE_API_URL + "/biz/customer/selectCustomerInfoList";
    public static String updateCustomerResourceInfo = BASE_API_URL + "/biz/customer/updateCustomerResourceInfo";

    /**
     * 会员
     */
    public static String addMember = BASE_API_URL + "/biz/customer/addMember";
    public static String updateCustomerInfo = BASE_API_URL + "/biz/customer/updateCustomerInfo";

    /**
     * 资源
     */
    public static String addRescource = BASE_API_URL + "/biz/customer/addRescource";
    public static String selectCustomerResourceList = BASE_API_URL + "/biz/customer/selectCustomerResourceList";
    public static String customerCollect = BASE_API_URL + "/biz/customer/customerCollect";

    /**
     * 其他
     */
    public static String customerTailRecordList = BASE_API_URL + "/biz/customer/customerTailRecordList";
    public static String customerTailRecord = BASE_API_URL + "/biz/customer/customerTailRecord";
    public static String selectCustomerInfo = BASE_API_URL + "/biz/customer/selectCustomerInfo";
    public static String selectMarketPersonnelList = BASE_API_URL + "/sys/user/selectMarketPersonnelList";
    public static String attendRecordList = BASE_API_URL + "/biz/customer/attendRecordList";
    public static String attendRecord = BASE_API_URL + "/biz/customer/attendRecord";
    public static String updateCustomerType = BASE_API_URL + "/biz/customer/updateCustomerType";
    public static String portRoleList = BASE_API_URL + "/sys/user/portRoleList";
}