package me.jessyan.mvparms.demo.mvp;

/**
 * Author：created by SugarT
 * Time：2021/1/28 19
 */
interface ILoginContract {

    interface ILoginPresenter {
        void login(String name, String password);
    }

    interface ILoginModel {
        void login(String name, String password, ResulterCallBack callBack);
    }

    interface ILoginView {
        void showDialog();

        void dismissDialog();

        void showToast(String message);

        void navigateToMain();
    }

}
