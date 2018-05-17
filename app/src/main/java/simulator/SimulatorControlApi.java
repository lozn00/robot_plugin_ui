package simulator;

import cn.qssq666.robot.plugin.sdk.interfaces.IMsgModel;
import cn.qssq666.robot.plugin.sdk.interfaces.PluginControlInterface;

/**
 * Created by qssq on 2018/5/17 qssq666@foxmail.com
 */
public class SimulatorControlApi  implements PluginControlInterface{
    @Override
    public void sendGroupMsg(IMsgModel item) {
        System.out.println(String.format("%s发送 %s消息给%s:%s ",item.getSelfuin(),"群",item.getFrienduin(),item.getMessage()));
    }

    @Override
    public void sendQQMsg(IMsgModel item) {
        System.out.println(String.format("%s发送 %s消息给%s:%s ",item.getSelfuin(),"qq",item.getFrienduin(),item.getMessage()));
    }

    @Override
    public void executeAction(int type, Object... arg) {


    }

    @Override
    public void executeSql(String sql) {

    }

    @Override
    public void executeShell(String shell) {

    }

    @Override
    public void executeWriteConfig(String key, String value) {

    }

    @Override
    public void sendMsg(IMsgModel item) {
        System.out.println(String.format("%s发送 %s消息给%s:%s ",item.getSelfuin(),"万能消息[istoop:"+item.getIstroop()+"|type:"+item.getType()+"]",item.getFrienduin(),item.getMessage()));
    }

    @Override
    public void sendGagMsg(IMsgModel item, long gagduration) {
        System.out.println(String.format("%s发送 %s消息给%s:%s 禁言时间%d ",item.getSelfuin(),"禁言",item.getFrienduin(),item.getMessage(),gagduration));
    }

    @Override
    public void sendGagMsg(IMsgModel item, String group, String qq, long gagduration) {

    }

    @Override
    public void sendAtMsg(IMsgModel item, String group, String qq) {

    }

    @Override
    public void sendKickMsg(IMsgModel item, boolean forverKick) {

    }

    @Override
    public void sendMsgCardMsg(IMsgModel item, String group, String qq, String xmlMsg) {

    }

    @Override
    public void sendKickMsg(IMsgModel item, String group, String qq, boolean forverKick) {

    }

    @Override
    public boolean isGroupMsg(IMsgModel item) {
        return item.getIstroop()==1;
    }

    @Override
    public boolean isPrivateMsg(IMsgModel item) {
        return item.getIstroop()==0;
    }

    @Override
    public boolean isPicMsg(IMsgModel item) {
        return false;
    }
}
