package simulator;

import cn.qssq666.robot.plugin.sdk.interfaces.IMsgModel;

/**
 * Created by luozheng on 2017/3/5.  qssq.space
 */

public class SimulatorMsgItemX implements Cloneable,IMsgModel {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimulatorMsgItemX item = (SimulatorMsgItemX) o;

        if (senderuin != null ? !senderuin.equals(item.senderuin) : item.senderuin != null)
            return false;
        return frienduin != null ? frienduin.equals(item.frienduin) : item.frienduin == null;
    }

    @Override
    public int hashCode() {
        int result = senderuin != null ? senderuin.hashCode() : 0;
        result = 31 * result + (frienduin != null ? frienduin.hashCode() : 0);
        return result;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String nickname;

    public int getIstroop() {
        return istroop;
    }

    public SimulatorMsgItemX setIstroop(int istroop) {
        this.istroop = istroop;
        return this;
    }

    public String getSenderuin() {
        return senderuin;
    }

    public SimulatorMsgItemX setSenderuin(String senderuin) {
        this.senderuin = senderuin;
        return this;
    }

    public String getFrienduin() {
        return frienduin;
    }

    public SimulatorMsgItemX setFrienduin(String frienduin) {
        this.frienduin = frienduin;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public SimulatorMsgItemX setMessage(String message) {
        this.message = message;
        return this;
    }

    public int getType() {
        return type;
    }

    public SimulatorMsgItemX setType(int type) {
        this.type = type;
        return this;
    }

    int istroop;
    String senderuin;
    String frienduin;
    String message;

    public String getExtrajson() {
        return extrajson;
    }

    public void setExtrajson(String extrajson) {
        this.extrajson = extrajson;
    }

    String extrajson;


    public String getExtstr() {
        return extstr;
    }

    public void setExtstr(String extstr) {
        this.extstr = extstr;
    }

    String extstr;

    public String getSelfuin() {
        return selfuin == null ? "" : selfuin;
    }

    public void setSelfuin(String selfuin) {
        this.selfuin = selfuin;
    }

    String selfuin;
    int type;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    String version;

    public String getApptype() {
        return apptype;
    }

    public void setApptype(String apptype) {
        this.apptype = apptype;
    }

    private String apptype;

    public long getTime() {
        return time;
    }

    public SimulatorMsgItemX setTime(long time) {
        this.time = time;
        return this;
    }

    long time;

    public int getCode() {
        return code;
    }

    public SimulatorMsgItemX setCode(int code) {
        this.code = code;
        return this;
    }

    @Override
    public void setUniversalAction(int type, Object obj) {

    }

    @Override
    public Object getUniversalAction(int type) {
        return null;
    }


    /**
     * 如果code=0才处理 否则 忽略
     */
    int code;

    @Override
    public String toString() {
        return "{" +
                "昵称='" + nickname + '\'' +
                ", 群消息类型=" + istroop +
                ", 发送人='" + senderuin + '\'' +
                ", 朋友='" + frienduin + '\'' +
                ", 消息体='" + message + '\'' +
                ", 自己账号='" + selfuin + '\'' +
                ", 消息类型=" + type +
                ", 时间=" + time +
                ", 状态码=" + code +
                '}';

    }

    public String toSimpleString() {
        return "[" + nickname + "(" + senderuin + "):" + message + "]";
    }

    @Override
    public SimulatorMsgItemX clone() {
        SimulatorMsgItemX obj = null;
        try {
            obj = (SimulatorMsgItemX) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
