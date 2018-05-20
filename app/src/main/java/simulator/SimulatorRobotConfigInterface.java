package simulator;

import cn.qssq666.robot.plugin.sdk.interfaces.IGroupConfig;
import cn.qssq666.robot.plugin.sdk.interfaces.IMsgModel;
import cn.qssq666.robot.plugin.sdk.interfaces.RobotConfigInterface;

/**
 * Created by qssq on 2018/5/17 qssq666@foxmail.com
 */
public class SimulatorRobotConfigInterface  implements RobotConfigInterface{
    @Override
    public boolean isEnableGroupMsg() {
        return false;
    }

    @Override
    public boolean isReplyAiteUser(IGroupConfig config) {
        return false;
    }

    @Override
    public boolean isReplyAiteUser(String group) {
        return false;
    }

    @Override
    public boolean isNeedAiteReply(IGroupConfig config) {
        return false;
    }

    @Override
    public boolean isNeedAiteReply(String group) {
        return false;
    }


    @Override
    public boolean isEnablePrivateReply() {
        return false;
    }

    @Override
    public IGroupConfig queryGroupConfig(String group) {
        return null;
    }

    @Override
    public boolean isEnableGroupWhilteName() {
        return false;
    }

    @Override
    public boolean currentGroupRobotIsShouldReply() {
        return false;
    }

    @Override
    public boolean generalQuery(int typeConfig) {
        return false;
    }

    @Override
    public boolean generalQueryItem(int type, IMsgModel item) {
        return false;
    }

    @Override
    public boolean isAtGroupWhiteNames(IMsgModel item) {
        return false;
    }

    @Override
    public int getRobotVersion() {
        return 0;
    }
}
