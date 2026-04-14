package com.oasisfeng.condom;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IContentProvider;
import android.content.OperationApplicationException;
import android.content.UriPermission;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class ContentResolverWrapper extends ContentResolver {
    private final ContentResolver mBase;

    ContentResolverWrapper(Context context, ContentResolver contentResolver) {
    }

    public IContentProvider acquireExistingProvider(Context context, String str) {
    }

    public IContentProvider acquireProvider(Context context, String str) {
    }

    public IContentProvider acquireUnstableProvider(Context context, String str) {
    }

    @Override // android.content.ContentResolver
    public ContentProviderResult[] applyBatch(String str, ArrayList<ContentProviderOperation> arrayList) throws RemoteException, OperationApplicationException {
    }

    @Override // android.content.ContentResolver
    public void cancelSync(Uri uri) {
    }

    @Override // android.content.ContentResolver
    public List<UriPermission> getOutgoingPersistedUriPermissions() {
    }

    @Override // android.content.ContentResolver
    public List<UriPermission> getPersistedUriPermissions() {
    }

    @Override // android.content.ContentResolver
    public String[] getStreamTypes(Uri uri, String str) {
    }

    @Override // android.content.ContentResolver
    public void notifyChange(Uri uri, ContentObserver contentObserver) {
    }

    @Override // android.content.ContentResolver
    public void releasePersistableUriPermission(Uri uri, int i) {
    }

    public boolean releaseProvider(IContentProvider iContentProvider) {
    }

    public boolean releaseUnstableProvider(IContentProvider iContentProvider) {
    }

    @Override // android.content.ContentResolver
    public void startSync(Uri uri, Bundle bundle) {
    }

    @Override // android.content.ContentResolver
    public void takePersistableUriPermission(Uri uri, int i) {
    }

    public void unstableProviderDied(IContentProvider iContentProvider) {
    }

    @Override // android.content.ContentResolver
    public void notifyChange(Uri uri, ContentObserver contentObserver, boolean z) {
    }

    @Override // android.content.ContentResolver
    public void notifyChange(Uri uri, ContentObserver contentObserver, int i) {
    }
}
