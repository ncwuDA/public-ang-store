package com.ang.storemanageservice.common.utils;

/**
 * 结果状态码
 *
 * @author angang
 * @date 2022/08/30
 */
public enum ResultCode {
    /* 成功状态码 */
    SUCCESS(0, "操作成功"), //操作成功

    /* 参数错误：10001-19999 */

    PARAM_IS_INVALID(10001, "参数无效"), //参数无效
    PARAM_IS_BLANK(10002, "参数为空"), //参数为空
    PARAM_TYPE_BIND_ERROR(10003, "参数为空"), //参数为空
    PARAM_NOT_COMPLETE(10004, "参数缺失"), //参数缺失
    PICTURE_IS_EMPTY(10005, "图片为空"),//图片为空
    FIN_CALCULATE_MONTH_ERROR(10006, "核算日期错误，不能在非本月月末核算本月数据，或核算月份不能超过当前月份"),
    FIN_CALCULATE_MONTH_ERROR_2(100061, "核算日期错误，仅在本月月底相隔三天内进行核算"),
    FIN_CALCULATE_MONTH_ALREADY_CALCULATE_ERROR(10007, "核算表中已有该月数据"),
    FIN_CALCULATE_DATE_PARSE_ERROR(10008, "日期格式解析错误"),
    DATE_COMPARE_ERROR(10009, "日期输入错误，检索开始日期不能大于结束日期"),


    /* 用户错误：20001-29999*/
    USER_LOGIN_SUCCESS(1, "登录成功!"), //登录成功
    USER_NOT_LOGGED_IN(20001, "用户未登录" , 0), //用户未登录

    USER_UPDATE_PASSWORD_SUCCESS(0, "修改密码成功"), //账号不存在或密码错误
    USER_UPDATE_PASSWORD_ERROR(20002, "修改密码失败"), //账号不存在或密码错误

    USER_LOGIN_ERROR(20002, "账号不存在或密码错误"), //账号不存在或密码错误
    USER_ACCOUNT_FORBIDDEN(20003, "账号已被禁用"), //账号已被禁用
    USER_NOT_EXIST(20004, "账号不存在"), //账号不存在
    USER_HAS_EXISTED(20005, "账号已存在"), //账号已存在
    USER_TOKEN_CREATE_EXCEPTION(20006, "创建token异常" , 0), //创建token异常
    USER_TOKEN_PARSE_EXCEPTION(20007, "解析token异常" , 0), //解析token异常
    USER_NOT_PWD_RULE(20008, "密码不符合规则"), //密码不符合规则
    USER_CURRENT_PWD(20009, "当前密码错"), //当前密码错
    USER_NOT_EMAIL_RULE(20010, "用户邮箱不符合规则"),//用户邮箱不符合规则
    USER_NOT_EMAIL(20011, "用户邮箱不存在"),//用户邮箱不存在
    USER_PWD_FAIL(20012, "用户密码解密失败"),//用户密码解密失败
    USER_NOT_AUTHORITY(20013, "用户没有权限"),//用户没有权限
    USER_PHONE_HAS_EXIST(20014, "用户手机号已存在"),//用户手机号已存在
    USER_PHONE_ID_CARD_EXIST(20014, "身份证号已存在"),//身份证号已存在
    USER_NOT_GET_AGED(20015, "未绑定老人"),//未绑定老人
    USER_LOGIN_ALLOCATION_NULL(200016, "登陆成功,请关联机构下的门店"), //账号不存在或密码错误
    USER_LOGIN_ORGANAZITION_NULL(200015, "登陆成功,请关联机构"), //账号不存在或密码错误
    USER_REGISTER_ALLOCATION_NULL(200017, "注册时请关联下门店"), //账号不存在或密码错误
    USER_SERVICE_STORE_ERROR(20018, "用户门店数据有误，同属第三方机构及本机构"),
    USER_ACCOUNT_FORBIDDEN_OR_NOT_EXIST(20019, "账号不存在或账号已被禁用"),


    USER_SSO_ERROR(20030, "单点登录接口调用错误" , 0),//单点登录接口调用错误
    USER_SSO_NOT_EXISTS(20031, "单点登录用户未导入系统" , 0),//单点登录用户未导入系统
    USER_SSO_RESULT_ERROR(20032, "单点登录验证接口返回数据错误" , 0),//单点登录验证接口返回数据错误
    USER_ORGANIZATION_FORBIDDEN(20033, "机构被禁用"),//机构被禁用
    USER_ORGANIZATION_EXPIRE(20034, "机构到期"),//机构到期
    /* 业务错误：30001-39999 */
    SPECIFIED_QUESTIONED_USER_NOT_EXIST(30001, "某业务出现问题" , 0), //某业务出现问题
    UPDATE_DATA_FAIL(30002, "更新出错"), //更新出错
    DELETE_DATA_FAIL(30003, "删除出错"),//删除出错
    VIP_CREDIT_LOW(30004, "用户不存在或余额不足"),
    ACTIVITY_STATUS_ERROR(30005, "当前活动状态无法操作(提交审核、删除、更新)"),
    APPROVAL_ERROR(30006, "审核失败！当前活动状态非审核中"),
    REPEAT_REGISTER(30007, "已报名，不能重复报名!"),
    OUT_CANCEL_TIME(30008, "活动开始前三个小时内，不能取消!"),
    OUT_REGISTER_TIME(30009, "活动开始前三个小时内，不能报名!"),

    //部门模块
    DEPT_NAME_EXISTS(301001, "部门名称已存在"), //部门名称已存在
    DEPT_POSN_EXISTS(301002, "部门名称已存在"), //部门下存在岗位
    DEPT_CHILD_EXISTS(301003, "子部门存在"),
    DEPT_USER_EXISTS(301004, "部门下存在人员"), //部门下存在人员

    //岗位模块
    POSN_NAME_EXISTS(302001, "岗位名称已存在"), //岗位名称已存在
    POSN_USER_EXISTS(302002, "岗位下存在人员"), //岗位下存在人员
    POSN_SUBPOSN_EXISTS(302003, "岗位存在子级岗位"), //岗位存在子级岗位

    ROLE_HAS_EXISTS(303001, "角色已存在"), //角色已存在
    USER_UNDER_ROLE(303002, "角色下存在用戶"), //角色下存在用戶

    //文档模块
    FILE_NAME_EXISTS(304001, "文件夹名称已存在"), //文件夹名称已存在
    FILE_IS_BLANK(304002, "文件为空"), //文件为空
    FILE_UPLOAD_EXCEPTION(304003, "文件上传异常" , 0), //文件上传异常
    FILE_DOWNLOAD_EXCEPTION(304004, "文件下载异常" , 0), //文件下载异常
    IMAGE_NOT_JPG_OR_PNG(304005, "图片格式不是png||jpg"), //图片格式不是png||jpg
    FILE_NOT_EXISTS(304006, "文件不存在"),
    FILE_PATH_IS_BLANK(304007, "文件路径为空"), //文件路径为空
    FILE_NAME_IS_BLANK(304008, "文件名称为空"), //文件名称为空
    FILE_TTYPE_NOT_SUPPORT(304009, "不支持的文件类型"), // 不支持的文件类型

    /* 系统错误：40001-49999 */
    SYSTEM_INNER_ERROR(40001, "系统繁忙，请稍后重试" , 0), //系统繁忙，请稍后重试

    /* 数据错误：50001-599999 */
    RESULE_DATA_NONE(50001, "数据未找到"), //数据未找到
    DATA_IS_WRONG(50002, "数据有误"), //数据有误
    DATA_ALREADY_EXISTED(50003, "数据已存在"), //数据已存在
    DATA_ACCESS_ERROR(50004, " 数据库访问错误"), //数据库访问错误
    DATA_NOT_MATCH(50005, "老人与订单不匹配"), //老人与订单不匹配
    DATA_NOT_HANDLE(50006, "订单未处理"), //订单未处理
    DATA_WORKING(50007, "订单服务中"), //订单服务中
    DATA_FINISHED(50008, "订单已结束"), //订单已结束
    DATA_NEED_SERVICE(50009, "订单待服务"), //订单待服务
    DATE_ORDER_ERROR(50010, "请假结束日期不能早于请假开始日期"),
    DATA_ALREADY_LEAVE(50011, "请假失败！该用户在给定时间段已有请假申请数据，不能重复在该时间段内申请请假"),
    DATA_ACTIVITY_ERR(50012, "签到失败！"),
    DATA_ACTIVITY_BEGIN(50013, "活动尚未开始！"),
    DATA_ACTIVITY_END(50014, "活动已结束！"),
    DATA_FINACIAL_ITEM_NULL(50015, "该老人没有缴费记录，无法获取护理费、空调费等标准"),
    DATA_FINACIAL_ITEM_NULL2(50016, "请假失败，该老人没有缴费记录"),

    /* 接口错误：60001-69999 */
    INTERFACE_INNER_INVOKE_ERROR(60001, "内部系统接口调用异常" , 0), //内部系统接口调用异常
    INTERFACE_OUTTER_INVOKE_ERROR(60002, "外部系统接口调用异常" , 0), //外部系统接口调用异常
    INTERFACE_FORBID_VISIT(60003, "该接口禁止访问" , 0), //该接口禁止访问
    INTERFACE_ADDRESS_INVALID(60004, "接口地址无效" , 0), //接口地址无效
    INTERFACE_REQUEST_TIMEOUT(60005, "接口请求超时" , 0), //接口请求超时
    INTERFACE_EXCEED_LOAD(60006, "接口负载过高" , 0), //接口负载过高

    /* 权限错误：70001-79999 */
    PERMISSION_NO_ACCESS(70001, "无访问权限"),//无访问权限

    /* 工单错误: 80001-89999*/
    ORDER_ALREADY_ACCEPTED(80001, "接单异常，该工单已被接单，请刷新后重试"),
    ORDER_SEND_REPEAT(80003, "派单失败，该工单已被派单!"),
    ORDER_SEND_ERROR(80002, "派单失败"),
    ORDER_NOT_EXIST(80002, "工单异常，该工单不存在"),
    ORDER_NOT_SEND(80002, "接单异常，该工单未指派该员工"),

    // 此房间已满，无法添加床位信息
    Room_Full(80003, "此房间已满，无法添加床位信息"),
    // 床位号重复，无法添加床位信息
    BED_REPEAT(80003, "床位号重复，无法添加床位信息"),
    // 该床位已被占用，更换失败
    BED_CHANGE_FULL(80004, "该床位已被占用，更换失败"),
    // 该床位没有老人入住，更换失败
    BED_CHANGE_NULL(80004, "该床位没有老人入住，更换失败"),

    // 项目服务中，不可评论
    SERVICE_STATUS_FAIL(80009, "项目服务中，不可评论"),

    /* 试住模块错误*/
    TRY_BED_IS_CHOOSE(80005, "请检查床位是否已选"),
    TRY_MEALCOST_IS_CHOOSE(80006, "请检查餐食类型是否选择"),
    TRY_AGE_IS_CHOOSE(80007, "请检查老人是否选择"),


    //撤回操作失败
    SAVE_MANAGE_ALLOCATION_ERROR(100054, "分配的服务项数据重复"),
    //鉴权验证失败
    AUTHENTICATION_ERROR(10100001, "Access Forbidden"),
    //
    USER_SERVICE_ALLOCATION(99854, "用户服务分配成功"),

    //提现失败
    WITHDRAWAL_ERROR(81001, "提现失败，提现金额不得大于余额"),
    ;

    private Integer code;
    private String msg;
    private int codeType;//代码类型：0-非业务异常代码 1-业务代码

    ResultCode(Integer code, String msg, int codeType) {
        this.code = code;
        this.msg = msg;
        this.codeType = codeType;
    }

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.codeType = 1; //默认为业务代码
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public int getCodeType() {
        return codeType;
    }
}
