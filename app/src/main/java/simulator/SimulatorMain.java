package simulator;

import java.util.Date;

import cn.qssq666.robot.plugin.sdk.control.PluginMainImpl;

/**
 * Created by qssq on 2018/5/17 qssq666@foxmail.com
 */
public class SimulatorMain {
    public static void startSimulate() {
        //构建模拟环境
//        SimulatorContext context=new SimulatorContext();
        SimulatorControlApi controlApi=new SimulatorControlApi();
        SimulatorRobotConfigInterface configApi=new SimulatorRobotConfigInterface();

        //调用插件入口类的一系列模拟加载
        PluginMainImpl pluginMain=new PluginMainImpl();
//java环境 用到context需要 自己构建一个context而且 把那些抛出异常的进行拦截。
//        pluginMain.onCreate(context);

        pluginMain.onReceiveControlApi(controlApi);
        pluginMain.onReceiveRobotConfig(configApi);
        //收到消息的模拟

        pluginMain.onReceiveMsgIsNeedIntercept(buildGroupMsgItem("742958038","694886526","测试一条群消息"));
        pluginMain.onReceiveMsgIsNeedIntercept(buildPrivateItem("694886526","测试一条私信消息"));

        //销毁
        pluginMain.onDestory();
    }

    public static SimulatorMsgItemX buildGroupMsgItem(String group,String qq,String message){


        SimulatorMsgItemX msgItem=new SimulatorMsgItemX();
        msgItem.setFrienduin(group);
        msgItem.setSenderuin(qq);//qq
        msgItem.setSelfuin("35068264");
        msgItem.setNickname("情随事迁");

        msgItem.setIstroop(1);//群消息
        msgItem.setMessage(message);
        return  msgItem;
    }
    public static SimulatorMsgItemX buildPrivateItem(String qq,String message){

        SimulatorMsgItemX msgItem=new SimulatorMsgItemX();
        msgItem.setTime(new Date().getTime());
        msgItem.setSenderuin(qq);//qq
        msgItem.setFrienduin(qq);
        msgItem.setSelfuin("35068264");
        msgItem.setNickname("情随事迁");
        msgItem.setIstroop(1);//群消息
        msgItem.setMessage(message);
        return  msgItem;
    }
}
