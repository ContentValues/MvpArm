package me.jessyan.mvparms.demo.mvp;

/**
 * Author：created by SugarT
 * Time：2021/1/28 19
 */
public class ILoginPresenterImpl implements ILoginPresenter,ResulterCallBack {

    private ILoginContract.ILoginView loginView;

    private ILoginContract.ILoginModel loginModel;

    public ILoginPresenterImpl(ILoginContract.ILoginView loginView) {
        this.loginView = loginView;
        this.loginModel = new ILoginModelImpl();
    }

    @Override
    public void receive(boolean success) {
        if(success){
            this.loginView.navigateToMain();
        }else{
            this.loginView.showToast("登录失败");
        }
    }

    @Override
    public void login(String name, String password) {
        loginModel.login(name,password,this);
    }
}