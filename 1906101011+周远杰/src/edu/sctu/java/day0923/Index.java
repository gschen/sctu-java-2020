package edu.sctu.java.day0923;

public class Index implements WebFuction {

    @Override
    public void register() {
        System.out.println("用户可以在这里登录！");
    }

    @Override
    public void find() {
        System.out.println("用户正在搜索需要的！");
    }

    @Override
    public void appreciate() {
        System.out.println("用户可以欣赏热门的景点！");
    }
}
