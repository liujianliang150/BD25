package cn.edu.pojo;

public class SysRoleFunction {
    private Integer roleid;

    private Integer functionid;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getFunctionid() {
        return functionid;
    }

    public void setFunctionid(Integer functionid) {
        this.functionid = functionid;
    }

    @Override
    public String toString() {
        return "SysRoleFunction{" +
                "roleid=" + roleid +
                ", functionid=" + functionid +
                '}';
    }
}