package simulator;

import cn.qssq666.robot.bean.MsgItem;
import cn.qssq666.robot.plugin.sdk.interfaces.PluginControlInterface;

/**
 * Created by qssq on 2018/5/17 qssq666@foxmail.com
 */
public class SimulatorControlApi  implements PluginControlInterface{
    @Override
    public void sendGroupMsg(MsgItem item) {
        System.out.println(String.format("%s发送 %s消息给%s:%s ",item.getSelfuin(),"群",item.getFrienduin(),item.getMessage()));
    }

    @Override
    public void sendQQMsg(MsgItem item) {
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
    public void sendMsg(MsgItem item) {
        System.out.println(String.format("%s发送 %s消息给%s:%s ",item.getSelfuin(),"万能消息[istoop:"+item.getIstroop()+"|type:"+item.getType()+"]",item.getFrienduin(),item.getMessage()));
    }

    @Override
    public void sendGagMsg(MsgItem item, long gagduration) {
        System.out.println(String.format("%s发送 %s消息给%s:%s 禁言时间%d ",item.getSelfuin(),"禁言",item.getFrienduin(),item.getMessage(),gagduration));
    }

    @Override
    public void sendGagMsg(MsgItem item, String group, String qq, long gagduration) {

    }

    @Override
    public void sendAtMsg(MsgItem item, String group, String qq) {

    }

    @Override
    public void sendKickMsg(MsgItem item, boolean forverKick) {

    }

    @Override
    public void sendMsgCardMsg(MsgItem item, String group, String qq, String xmlMsg) {

    }

    @Override
    public void sendKickMsg(MsgItem item, String group, String qq, boolean forverKick) {

    }

    @Override
    public boolean isGroupMsg(MsgItem item) {
        return item.getIstroop()==1;
    }

    @Override
    public boolean isPrivateMsg(MsgItem item) {
        return item.getIstroop()==0;
    }

    @Override
    public boolean isPicMsg(MsgItem item) {
        return false;
    }
}
