package com.navatics.robot.protocol;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RobotMessage.java */
/* renamed from: com.navatics.robot.protocol.ap */
/* loaded from: classes.dex */
public abstract class RobotMessage {

    /* renamed from: d */
    private static final AtomicInteger atomicCounter = new AtomicInteger();

    /* renamed from: a */
    protected boolean recycled;

    /* renamed from: b */
    protected int seq = atomicCounter.getAndIncrement();

    /* renamed from: c */
    protected int msgId;

    /* renamed from: e */
    private RuntimeException exception;

    /* renamed from: c */
    public static String id2Message(int i) {
        if (i == 1) {
            return "MSG_CTRL_INFO";
        }
        if (i == 80) {
            return "MSG_CAMERA_SETTING";
        }
        switch (i) {
            case 16:
                return "MSG_CALIBRATE_GYRO";
            case 17:
                return "MSG_CALIBRATE_COMPASS";
            case 18:
                return "MSG_CALIBRATE_ACC";
            case 19:
                return "MSG_UPDATE_START";
            case 20:
                return "MSG_UPDATE_DATA";
            case 21:
                return "MSG_UPDATE_CRC";
            case 22:
                return "MSG_UPDATE_DATA_END";
            case 23:
                return "MSG_UPDATE_FINISH";
            default:
                switch (i) {
                    case 32:
                        return "MSG_CALIBRATE_PAYLOAD";
                    case 33:
                        return "MSG_RESET_MOTOR";
                    default:
                        switch (i) {
                            case 35:
                                return "MSG_STATUS";
                            case 36:
                                return "MSG_BUOY_STATUS";
                            case 37:
                                return "MSG_UPDATE_REPLY_DATA";
                            case 38:
                                return "MSG_UPDATE_REPLY_CRC";
                            default:
                                switch (i) {
                                    case 48:
                                        return "MSG_DEBUG";
                                    case 49:
                                        return "MSG_SET_PARAMETER";
                                    default:
                                        switch (i) {
                                            case 64:
                                                return "MSG_REPLY";
                                            case 65:
                                                return "MSG_START_RECORD";
                                            case 66:
                                                return "MSG_STOP_RECORD";
                                            case 67:
                                                return "MSG_TAKE_PHOTO";
                                            case 68:
                                                return "MSG_SWITCH_MODE";
                                            case 69:
                                                return "MSG_GET_CAMERA_MODE";
                                            case 70:
                                                return "MSG_GET_ROBOT_FIRMWARE_VERSION";
                                            default:
                                                switch (i) {
                                                    case 129:
                                                        return "MSG_MCM_REQ";
                                                    case 130:
                                                        return "MSG_MCM_RES";
                                                    default:
                                                        return "unknown msg";
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public void reset() {
        this.recycled = false;
        this.exception = null;
        this.seq = atomicCounter.getAndIncrement();
    }

    /* renamed from: a */
    public void recycle() {
        if (this.recycled) {
            throw new RuntimeException(toString() + "(seq=" + this.seq + ") recycled twice!");
        }
        this.recycled = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RobotMessage(int messageId) {
        this.msgId = messageId;
    }

    /* renamed from: k */
    public int getMessageId() {
        return this.msgId;
    }
}