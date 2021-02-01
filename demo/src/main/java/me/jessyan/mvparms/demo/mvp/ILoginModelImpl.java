package me.jessyan.mvparms.demo.mvp;


/**
 * Author：created by SugarT
 * Time：2021/1/28 19
 */
public class ILoginModelImpl implements ILoginContract.ILoginModel {

    @Override
    public void login(String name, String password, ResulterCallBack callBack) {
        //模拟网络请求
        callBack.receive(true);
    }
}