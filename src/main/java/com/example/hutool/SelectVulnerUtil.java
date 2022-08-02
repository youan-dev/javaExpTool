package com.example.hutool;

import com.example.exploit.struts2.S2_005;
import com.example.vulnerability.VulnerInterface;

public class SelectVulnerUtil {

    public static VulnerInterface getExploit(String vulName) {
        VulnerInterface vulnerablity = null;
        if (vulName.equals("s2-005")) {
            vulnerablity = new S2_005();
        }
        /*else if(vulName.contains("S2-009")) {
            ei = new S2_009();
        } else if(vulName.contains("S2-016")) {
            ei = new S2_016();
        } else if(vulName.contains("S2-019")) {
            ei = new S2_019();
        } else if(vulName.contains("S2-032")) {
            ei = new S2_032();
        } else if(vulName.contains("S2-045")) {
            ei = new S2_045();
        } else if(vulName.contains("S2-046")) {
            ei = new S2_046();
        } else if(vulName.contains("S2-DevMode")) {
            ei = new S2_DevMode();

        } else if(vulName.contains("ThinkPHP 2.x")){
            ei = new ThinkPHP2x();
        } else if(vulName.contains("TP5_construct_code_exec_1")) {
            // 这里创建你的cve漏洞检测，注意要实现 ExploitInterface 接口
            ei = new TP5_construct_code_exec_1();
        } else if(vulName.contains("TP5_construct_code_exec_2")){
            ei = new TP5_construct_code_exec_2();
        } else if(vulName.contains("TP5_construct_code_exec_3")){
            ei = new TP5_construct_code_exec_3();
        } else if(vulName.contains("TP5_construct_code_exec_4")){
            ei = new TP5_construct_code_exec_4();
        } else if(vulName.contains("TP5_construct_debug_rce")){
            ei = new TP5_construct_debug_rce();
        } else if(vulName.contains("TP5_driver_display_rce")){
            ei = new TP5_driver_display_rce();
        } else if(vulName.contains("TP5_index_construct_rce")){
            ei = new TP5_index_construct_rce();
        } else if(vulName.contains("TP5_invoke_func_code_exec_1")){
            ei = new TP5_invoke_func_code_exec_1();
        } else if(vulName.contains("TP5_invoke_func_code_exec_2")){
            ei = new TP5_invoke_func_code_exec_2();
        } else if(vulName.contains("TP5_method_filter_code_exec")){
            ei = new TP5_method_filter_code_exec();
        } else if(vulName.contains("TP5_request_input_rce")){
            ei = new TP5_request_input_rce();
        } else if(vulName.contains("TP5_templalte_driver_rce")){
            ei = new TP5_templalte_driver_rce();
        } else if(vulName.contains("TP6_session_file_write")){
            ei = new TP6_session_file_write();
        } else if(vulName.contains("TP_cache")){
            ei = new TP_cache();
        } else if(vulName.contains("TP5_index_showid_rce")){
            ei = new TP5_index_showid_rce();
        } else if(vulName.contains("TP5_debug_index_ids_sqli")){
            ei = new TP5_debug_index_ids_sqli();
        } else if(vulName.contains("TP_checkcode_time_sqli")){
            ei = new TP_checkcode_time_sqli();
        } else if(vulName.contains("TP_multi_sql_leak")){
            ei = new TP_multi_sql_leak();
        } else if(vulName.contains("TP_pay_orderid_sqli")){
            ei = new TP_pay_orderid_sqli();
        } else if(vulName.contains("TP_update_sql")){
            ei = new TP_update_sql();
        } else if(vulName.contains("TP_view_recent_xff_sqli")) {
            ei = new TP_view_recent_xff_sqli();


        } else if (vulName.contains("CVE-2017-10271 Weblogic10")) {
            ei = new CVE_2017_10271_10();
        } else if (vulName.contains("CVE-2017-10271 Weblogic12")) {
            ei = new CVE_2017_10271_12();
        } else if (vulName.contains("CVE-2019-2725 Weblogic10")) {
            ei = new CVE_2019_2725_10();
        } else if (vulName.contains("CVE-2019-2725 Weblogic12")) {
            ei = new CVE_2019_2725_12();
        } else if (vulName.contains("CVE-2019-2725-Bypass Weblogic10")) {
            ei = new CVE_2019_2725_10_bypass();


        } else if(vulName.contains("CVE-2021-22986")) {
            // 这里创建你的cve漏洞检测，注意要实现 ExploitInterface 接口
            ei = new CVE_2021_22986();
        } else if(vulName.contains("CNVD-2021-30167")){
            ei = new CNVD_2021_30167();
        }*/

        return (VulnerInterface) vulnerablity;
    }

}
