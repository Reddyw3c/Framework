package com.hrms.lib1;

import org.openqa.selenium.WebDriver;

public class Global {
WebDriver driver; 

//TEST DATA----------

public String url ="http://183.82.103.245/nareshit/login.php";
public String un  ="nareshit";
public String ps  ="nareshit";
public String eminf ="rightMenu";
public String searchby="loc_code";
public String fname ="reddy";
public String lname ="putturu";
public String fname1="Reddy";
public String lname1 ="putturu";
public String search="1582";


// OBJECTSSS-------

public String txt_loginame ="txtUserName";
public String txt_password ="txtPassword";
public String click_login ="Submit";
public String click_Addnew ="//input[@value='Add']";
public String txt_fname ="txtEmpFirstName";
public String txt_lastname ="txtEmpLastName";
public String click_savebtn ="btnEdit";
public String txt_searchfor ="loc_name";
public String click_search ="//input[@value='Search']";
public String click_empname ="//*[@id='standardView']/table/tbody/tr[1]/td[3]//a";
public String edit_btn ="EditMain";
public String txt_lname1 ="txtEmpLastName";
public String txt_fname1 ="txtEmpFirstName";
public String click_save ="EditMain";
public String visible_text ="Emp. ID";
public String click_logout ="Logout";
public String click_delete ="//input[@value='Delete']";
public String click_back ="//input[@value='Back']";
public String click_checkbox ="allCheck";




}

