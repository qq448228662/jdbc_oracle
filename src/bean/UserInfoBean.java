package bean;



/**
 * 实体类映射要求：
 * 	  要求实体类的属性名和数据库的字段名，名字要一致；（可以不区分大小写，但是内容要一样）
 * @author Administrator
 *
 */
public class UserInfoBean {

    // 属性
    private Integer EMPLOYEE_ID;
    private String FIRST_NAME;
    private String LAST_NAME;
    private String EMAIL;
    private String PHONE_NUMBER;

    // 行为

    public Integer getEMPLOYEE_ID() {
        return EMPLOYEE_ID;
    }

    public void setEMPLOYEE_ID(Integer EMPLOYEE_ID) {
        this.EMPLOYEE_ID = EMPLOYEE_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public void setPHONE_NUMBER(String PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }


    // 开发方便，提供toString方法

    @Override
    public String toString() {
        return "UserInfoBean [EMPLOYEE_ID=" + EMPLOYEE_ID + ", FIRST_NAME=" + FIRST_NAME + ", LAST_NAME=" + LAST_NAME
                + ", EMAIL=" + EMAIL + ", PHONE_NUMBER=" + PHONE_NUMBER + "]";
    }

}