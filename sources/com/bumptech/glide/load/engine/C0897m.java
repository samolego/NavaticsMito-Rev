package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.m */
/* loaded from: classes.dex */
class EngineKeyFactory {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public EngineKey m12044a(Object obj, Key key, int i, int i2, Map<Class<?>, Transformation<?>> map, Class<?> cls, Class<?> cls2, Options options) {
        return new EngineKey(obj, key, i, i2, map, cls, cls2, options);
    }
}
