package org.apache.ftpserver.p110a.p111a;

import java.io.IOException;
import org.apache.ftpserver.ftplet.FtpException;
import org.apache.ftpserver.ftplet.FtpFile;
import org.apache.ftpserver.ftplet.FtpRequest;
import org.apache.ftpserver.p110a.AbstractCommand;
import org.apache.ftpserver.p118d.FtpIoSession;
import org.apache.ftpserver.p118d.FtpServerContext;
import org.apache.ftpserver.p118d.LocalizedFtpReply;
import org.slf4j.C3154c;
import org.slf4j.InterfaceC3153b;

/* renamed from: org.apache.ftpserver.a.a.al */
/* loaded from: classes2.dex */
public class RNFR extends AbstractCommand {

    /* renamed from: a */
    private final InterfaceC3153b f10883a = C3154c.m262a(RNFR.class);

    @Override // org.apache.ftpserver.p110a.Command
    /* renamed from: a */
    public void mo1971a(FtpIoSession ftpIoSession, FtpServerContext ftpServerContext, FtpRequest ftpRequest) throws IOException, FtpException {
        ftpIoSession.m1879r();
        String mo1748c = ftpRequest.mo1748c();
        if (mo1748c == null) {
            ftpIoSession.mo1001e(LocalizedFtpReply.m1839a(ftpIoSession, ftpRequest, ftpServerContext, 501, "RNFR", null));
            return;
        }
        FtpFile ftpFile = null;
        try {
            ftpFile = ftpIoSession.m1877t().mo1774a(mo1748c);
        } catch (Exception e) {
            this.f10883a.debug("Exception getting file object", (Throwable) e);
        }
        if (ftpFile == null) {
            ftpIoSession.mo1001e(LocalizedFtpReply.m1839a(ftpIoSession, ftpRequest, ftpServerContext, 550, "RNFR", mo1748c));
            return;
        }
        ftpIoSession.m1884a(ftpFile);
        ftpIoSession.mo1001e(LocalizedFtpReply.m1839a(ftpIoSession, ftpRequest, ftpServerContext, 350, "RNFR", ftpFile.mo1771a()));
    }
}