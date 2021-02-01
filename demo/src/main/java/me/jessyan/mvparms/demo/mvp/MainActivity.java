package me.jessyan.mvparms.demo.mvp;

/**
 * Author：created by SugarT
 * Time：2021/1/28 18
 */
public class MainActivity implements ILoginContract.ILoginView {

    public MainActivity() {
        ILoginPresenter loginPresenter = new ILoginPresenterImpl(this);
        loginPresenter.login("admin", "admin");
    }

    @Override
    public void showDialog() {
      //显示一个转圈的dialog;
    }

    @Override
    public void dismissDialog() {
        //隐藏转圈的dialog;
    }

    @Override
    public void showToast(String message) {
//        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
        System.out.println(message);
    }

    @Override
    public void navigateToMain() {
        System.out.println("navigateToMain");
//        startActivity(new Intent(this,MainActivity.class));
//        finish();
    }
}