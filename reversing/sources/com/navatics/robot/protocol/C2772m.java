package com.navatics.robot.protocol;

import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: com.navatics.robot.protocol.m */
/* loaded from: classes.dex */
public class GetCameraModeReply extends ReplyMessage {

    /* renamed from: d */
    private int f6451d;

    @Override // com.navatics.robot.protocol.ReplyMessage
    /* renamed from: a */
    void mo6355a(DataInputStream dataInputStream) throws IOException {
        this.f6451d = dataInputStream.readByte();
    }

    /* renamed from: c */
    public int m6372c() {
        return this.f6451d;
    }
}
