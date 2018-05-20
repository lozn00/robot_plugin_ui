package cn.qssq666.robot.plugin.sdk.control;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cn.qssq666.robot.plugin.sdk.interfaces.IMsgModel;
import cn.qssq666.robot.plugin.sdk.interfaces.PluginControlInterface;
import cn.qssq666.robot.plugin.sdk.interfaces.PluginInterface;
import cn.qssq666.robot.plugin.sdk.interfaces.RobotConfigInterface;

/**
 *
 * cn.qssq666.robot.plugin.sdk.control.PluginMainImpl
 * Created by qssq on 2018/5/17 qssq666@foxmail.com
 * 这是固定入口，是不能修改的
 */

public class PluginMainImpl implements PluginInterface {
    private static final String TAG = "PluginMainImpl";
    private boolean disable;
    private PluginControlInterface mControlApi;
    private Context context;
    private String mLastMsg;

    @Override

    public String getAuthorName() {
        return "情随事迁";
    }




    @Override
    public int getVersionCode() {
        return 1;
    }

    @Override
    public String getBuildTime() {
        return "不告诉你";
    }

    @Override
    public String getVersionName() {
        return "1。0";
    }

    @Override
    public String getPackageName() {
        return "cn.qssq666.plugindemo";//这个包名必须用自己的域名，否则后期开发的时候检测非法冒充官方域名，我将直接不加载机器人，没有的话随便天蝎
    }

    @Override
    public String getDescript() {
        return "管理机器人的基本配置";
    }

    @Override
    public String getPluginName() {
        return "ui修改";
    }

    /**
     * 这个以后还是得宿主维护比较靠谱一点。
     *
     * @return
     */

    @Override
    public boolean isDisable() {
        return disable;
    }

    @Override
    public void setDisable(boolean disable) {
        this.disable = disable;
    }


    @Override
    public void onCreate(Context context) {
        this.context = context;
    }


    @Override
    public boolean onReceiveOtherIntercept(IMsgModel item, int type) {
        mLastMsg=item.getMessage()+" from qq:"+item.getSenderuin();
        return false;
    }

    @Override
    public void onDestory() {

    }

    @Override
    public void onReceiveRobotConfig(RobotConfigInterface robotConfigInterface) {
        robotConfigInterface.generalQuery(0);//todo！ 这个东西用来查询机器人得配置信息

    }

    @Override
    public void onReceiveControlApi(PluginControlInterface instance) {
        mControlApi = instance;
    }

    @Override
    public View onConfigUi(ViewGroup viewGroup) {
        TextView textView = new TextView(viewGroup.getContext());
        textView.setTextColor(Color.RED);
        textView.setText("这是一个demo,本demo以后会陆续完善的。 完善具有修改机器人配置的能力。\n最后收到的消息是："+mLastMsg);
        return textView;
    }

    @Override
    public boolean onReceiveMsgIsNeedIntercept(IMsgModel item) {
        System.out.println(TAG+ "收到了消息：" + item.getSenderuin() + "");
        mLastMsg=item.getMessage()+" from qq:"+item.getSenderuin();
        return false;
    }
}
