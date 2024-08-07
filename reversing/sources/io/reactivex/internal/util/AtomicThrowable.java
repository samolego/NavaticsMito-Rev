package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean addThrowable(Throwable th) {
        return ExceptionHelper.m3129a(this, th);
    }

    public Throwable terminate() {
        return ExceptionHelper.m3130a(this);
    }

    public boolean isTerminated() {
        return get() == ExceptionHelper.f9863a;
    }
}
