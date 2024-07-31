package com.navatics.app.framework;

import android.support.p008v4.app.NotificationCompat;
import com.navatics.app.framework.divelog.Command_;
import com.navatics.app.framework.divelog.DiveLogEntry_;
import com.navatics.app.framework.divelog.DiveLog_;
import com.navatics.app.framework.divelog.LocalDiveLogRecord_;
import com.navatics.app.framework.user.NvUser_;
import com.navatics.app.framework.user.SSUsrInfo_;
import io.objectbox.BoxStoreBuilder;
import io.objectbox.EntityInfo;
import io.objectbox.ModelBuilder;

/* renamed from: com.navatics.app.framework.o */
/* loaded from: classes.dex */
public class MyObjectBox {
    /* renamed from: a */
    public static BoxStoreBuilder m7961a() {
        BoxStoreBuilder boxStoreBuilder = new BoxStoreBuilder(m7960b());
        boxStoreBuilder.m3379a((EntityInfo) Command_.__INSTANCE);
        boxStoreBuilder.m3379a((EntityInfo) DiveLog_.__INSTANCE);
        boxStoreBuilder.m3379a((EntityInfo) DiveLogEntry_.__INSTANCE);
        boxStoreBuilder.m3379a((EntityInfo) LocalDiveLogRecord_.__INSTANCE);
        boxStoreBuilder.m3379a((EntityInfo) NvUser_.__INSTANCE);
        boxStoreBuilder.m3379a((EntityInfo) SSUsrInfo_.__INSTANCE);
        return boxStoreBuilder;
    }

    /* renamed from: b */
    private static byte[] m7960b() {
        ModelBuilder modelBuilder = new ModelBuilder();
        modelBuilder.m3342a(9, 5362049181841476839L);
        modelBuilder.m3339b(4, 4026714369335807777L);
        modelBuilder.m3338c(0, 0L);
        ModelBuilder.C2830a m3341a = modelBuilder.m3341a("Command");
        m3341a.m3335a(8, 4951315510395965041L).m3330b(17, 819797248348736937L);
        m3341a.m3336a(1);
        m3341a.m3334a("command", 9).m3326a(11, 6947323974883399507L);
        m3341a.m3334a("startTime", 9).m3326a(12, 5756520576629816123L);
        m3341a.m3334a("detailIndex", 9).m3326a(13, 8276600487292327072L);
        m3341a.m3334a("version", 5).m3326a(14, 8174001077722849530L).m3327a(4);
        m3341a.m3334a("createTime", 10).m3326a(15, 1291405986874345102L);
        m3341a.m3334a("json", 9).m3326a(16, 8790457875219302721L);
        m3341a.m3334a("filedName", 9).m3326a(17, 819797248348736937L);
        m3341a.m3334a("id", 6).m3326a(1, 1547139670972282525L).m3327a(5);
        m3341a.m3332a("parentId", "LocalDiveLogRecord", "parent", 11).m3326a(10, 2857764742475883366L).m3327a(1548).m3324b(4, 4026714369335807777L);
        m3341a.m3331b();
        ModelBuilder.C2830a m3341a2 = modelBuilder.m3341a("DiveLog");
        m3341a2.m3335a(1, 2072881041396962855L).m3330b(19, 1586223490396748759L);
        m3341a2.m3336a(1);
        m3341a2.m3334a("id", 6).m3326a(1, 5288565749560203221L).m3327a(5);
        m3341a2.m3334a("email", 9).m3326a(2, 7276606695205275689L);
        m3341a2.m3334a("place", 9).m3326a(3, 2232586591829726483L);
        m3341a2.m3334a("date", 10).m3326a(4, 1245257791493081522L);
        m3341a2.m3334a("longitude", 9).m3326a(5, 4027681152014197683L);
        m3341a2.m3334a("latitude", 9).m3326a(6, 2442567960906900957L);
        m3341a2.m3334a("weather", 9).m3326a(7, 4807097592157060622L);
        m3341a2.m3334a("startTime", 6).m3326a(8, 3872718533517241526L).m3327a(4);
        m3341a2.m3334a("endTime", 6).m3326a(9, 3758465177509574514L).m3327a(4);
        m3341a2.m3334a("averageDepth", 5).m3326a(10, 2253582965312170165L).m3327a(4);
        m3341a2.m3334a("temperature", 5).m3326a(11, 6264532804157191353L).m3327a(4);
        m3341a2.m3334a("comment", 9).m3326a(12, 2585508957142104066L);
        m3341a2.m3334a("uploaded", 1).m3326a(13, 5500040296644269366L).m3327a(4);
        m3341a2.m3334a(NotificationCompat.CATEGORY_STATUS, 5).m3326a(14, 818027148707879257L).m3327a(4);
        m3341a2.m3334a("maxDepth", 5).m3326a(15, 7274943522682161966L).m3327a(4);
        m3341a2.m3334a("minDepth", 5).m3326a(16, 1383458901681626859L).m3327a(4);
        m3341a2.m3334a("maxTemp", 5).m3326a(17, 146949255902128587L).m3327a(4);
        m3341a2.m3334a("minTemp", 5).m3326a(18, 4159028443453527023L).m3327a(4);
        m3341a2.m3334a("fakeDelete", 1).m3326a(19, 1586223490396748759L).m3327a(4);
        m3341a2.m3331b();
        ModelBuilder.C2830a m3341a3 = modelBuilder.m3341a("DiveLogEntry");
        m3341a3.m3335a(2, 1770140901765286318L).m3330b(40, 4873912276244724877L);
        m3341a3.m3336a(1);
        m3341a3.m3334a("id", 6).m3326a(1, 2885914302936498222L).m3327a(5);
        m3341a3.m3334a("timestamp", 6).m3326a(2, 854441978610565748L).m3327a(4);
        m3341a3.m3334a("detailIndex", 9).m3326a(40, 4873912276244724877L);
        m3341a3.m3334a("airTemperature", 7).m3326a(3, 8380859632574008318L).m3327a(4);
        m3341a3.m3334a("waterTemperature", 7).m3326a(4, 9109761824800676351L).m3327a(4);
        m3341a3.m3334a("weather", 9).m3326a(5, 3370375387660299123L);
        m3341a3.m3334a("windVelocity", 7).m3326a(6, 1603765350881977915L).m3327a(4);
        m3341a3.m3334a("windDirection", 7).m3326a(7, 7164148469786736605L).m3327a(4);
        m3341a3.m3334a("buoyLongitude", 7).m3326a(8, 6206602613155399757L).m3327a(4);
        m3341a3.m3334a("buoyLatitude", 7).m3326a(9, 2998336624788208445L).m3327a(4);
        m3341a3.m3334a("phoneLongitude", 7).m3326a(10, 2970470046599587827L).m3327a(4);
        m3341a3.m3334a("phoneLatitude", 7).m3326a(11, 6880606575966799496L).m3327a(4);
        m3341a3.m3334a("stateQuaternionW", 3).m3326a(12, 888563457004549272L).m3327a(4);
        m3341a3.m3334a("stateQuaternionX", 3).m3326a(13, 2394361841533528115L).m3327a(4);
        m3341a3.m3334a("stateQuaternionY", 3).m3326a(14, 8302023536903868658L).m3327a(4);
        m3341a3.m3334a("stateQuaternionZ", 3).m3326a(15, 5662207018772690878L).m3327a(4);
        m3341a3.m3334a("refStateQuaternionW", 3).m3326a(16, 391335045310717647L).m3327a(4);
        m3341a3.m3334a("refStateQuaternionX", 3).m3326a(17, 8803144939406471669L).m3327a(4);
        m3341a3.m3334a("refStateQuaternionY", 3).m3326a(18, 5180425998684904741L).m3327a(4);
        m3341a3.m3334a("refStateQuaternionZ", 3).m3326a(19, 743359116891642642L).m3327a(4);
        m3341a3.m3334a("temperature", 5).m3326a(20, 8415879793315245545L).m3327a(4);
        m3341a3.m3334a("stateDepth", 5).m3326a(21, 8648945458334471401L).m3327a(4);
        m3341a3.m3334a("refStateDepth", 5).m3326a(22, 2910444841382974248L).m3327a(4);
        m3341a3.m3334a("rpmMotor0", 3).m3326a(23, 6679641860171841343L).m3327a(4);
        m3341a3.m3334a("rpmMotor1", 3).m3326a(24, 6644733573830266289L).m3327a(4);
        m3341a3.m3334a("rpmMotor2", 3).m3326a(25, 5470351423685752666L).m3327a(4);
        m3341a3.m3334a("rpmMotor3", 3).m3326a(26, 1707436210295256712L).m3327a(4);
        m3341a3.m3334a("ledState", 5).m3326a(27, 8440543797041925228L).m3327a(4);
        m3341a3.m3334a("batteryState", 5).m3326a(28, 2342917949577758296L).m3327a(4);
        m3341a3.m3334a("sensorsState", 5).m3326a(29, 5970425351712419184L).m3327a(4);
        m3341a3.m3334a("robotOperationState", 5).m3326a(30, 411682785861522931L).m3327a(4);
        m3341a3.m3334a("remoteBattery", 5).m3326a(31, 5097584090852310396L).m3327a(4);
        m3341a3.m3334a("buoyBattery", 5).m3326a(32, 5574142798614639725L).m3327a(4);
        m3341a3.m3334a("phoneBattery", 5).m3326a(33, 7475600168231984873L).m3327a(4);
        m3341a3.m3334a("remoteLinkState", 1).m3326a(34, 5268254806805605584L).m3327a(4);
        m3341a3.m3334a("remotePER", 5).m3326a(35, 5611458723150545701L).m3327a(4);
        m3341a3.m3334a("remoteRSSI", 5).m3326a(36, 3578211734203643360L).m3327a(4);
        m3341a3.m3334a("remoteSNR", 5).m3326a(37, 5171758492656951001L).m3327a(4);
        m3341a3.m3334a("photoUri", 9).m3326a(38, 8451293285491233230L);
        m3341a3.m3332a("parentId", "DiveLog", "parent", 11).m3326a(39, 4585410442717733222L).m3327a(1548).m3324b(1, 5020125437971608008L);
        m3341a3.m3331b();
        ModelBuilder.C2830a m3341a4 = modelBuilder.m3341a("LocalDiveLogRecord");
        m3341a4.m3335a(9, 5362049181841476839L).m3330b(4, 28081105017870335L);
        m3341a4.m3336a(1);
        m3341a4.m3334a("id", 6).m3326a(1, 3062417538498314946L).m3327a(5);
        m3341a4.m3334a("email", 9).m3326a(2, 8669529548977547812L);
        m3341a4.m3334a("startTime", 9).m3326a(3, 4596013315311232332L);
        m3341a4.m3334a("version", 5).m3326a(4, 28081105017870335L).m3327a(4);
        m3341a4.m3331b();
        ModelBuilder.C2830a m3341a5 = modelBuilder.m3341a("NvUser");
        m3341a5.m3335a(3, 1226356779605595515L).m3330b(10, 8779138165490273659L);
        m3341a5.m3334a("id", 6).m3326a(1, 5662758442716250209L).m3327a(5);
        m3341a5.m3334a("usrId", 9).m3326a(2, 5790891408231149315L);
        m3341a5.m3334a("email", 9).m3326a(3, 8564290259914168928L);
        m3341a5.m3334a("nickName", 9).m3326a(4, 1211737816406413966L);
        m3341a5.m3334a("gender", 5).m3326a(5, 1959215559906727843L).m3327a(4);
        m3341a5.m3334a("age", 5).m3326a(6, 1647090191846563472L).m3327a(4);
        m3341a5.m3334a("usrImgLowres", 9).m3326a(7, 3280230356158055872L);
        m3341a5.m3334a("usrImgHighres", 9).m3326a(8, 3984236994055134855L);
        m3341a5.m3334a("token", 9).m3326a(9, 2406598413392565424L);
        m3341a5.m3332a("ssUsrInfoId", "SSUsrInfo", "ssUsrInfo", 11).m3326a(10, 8779138165490273659L).m3327a(1548).m3324b(2, 1058073743610346852L);
        m3341a5.m3331b();
        ModelBuilder.C2830a m3341a6 = modelBuilder.m3341a("SSUsrInfo");
        m3341a6.m3335a(4, 2099751092683418805L).m3330b(8, 7441248030434387790L);
        m3341a6.m3336a(1);
        m3341a6.m3334a("id", 6).m3326a(1, 1839064339685187380L).m3327a(5);
        m3341a6.m3334a("openid", 9).m3326a(2, 1806471288264244963L);
        m3341a6.m3334a("uuid", 9).m3326a(3, 4910912057713948396L);
        m3341a6.m3334a("accessToken", 9).m3326a(4, 8185705398900598375L);
        m3341a6.m3334a("expiresIn", 9).m3326a(5, 4438639547849617305L);
        m3341a6.m3334a("tokenType", 9).m3326a(6, 8154254885605680501L);
        m3341a6.m3334a("scope", 9).m3326a(7, 6374635044182959346L);
        m3341a6.m3334a("refreshToken", 9).m3326a(8, 7441248030434387790L);
        m3341a6.m3331b();
        return modelBuilder.m3343a();
    }
}
